(ns core
  (:require [clojure.edn :as edn]
            [clojure.data.json :as json]
            [data :as d]))

(defn spell [t data]
  (let [stats (-> (dissoc data :name :description)
                  (assoc :Type t))]
    {:type "Spells"
     :name (:name data)
     :description (:description data)
     :rulesets [{:system "TORG"
                 :implementation {:spellStats {:Stats stats}}}]}))

(defn perk [data]
  (let [stats (-> (dissoc data :name :description))]
    {:type "Perks"
     :name (:name data)
     :description (:description data)
     :rulesets [{:system "TORG"
                 :implementation {:perkStats {:Stats stats}}}]}))

(defn item [type type-kw data]
  (let [stats (-> (dissoc data :name :description))]
    {:type type
     :name (:name data)
     :description (:description data)
     :rulesets [{:system "TORG"
                 :implementation {type-kw {:Stats stats}}}]}))

(defn assign-attributes [stats]
  (let [[cha dex mind spi str] (:Attributes stats)]
    (assoc stats :Attributes {:Charisma {:Score cha}
                              :Dexterity {:Score dex}
                              :Mind {:Score mind}
                              :Spirit {:Score spi}
                              :Strength {:Score str}})))



;; (defn fix-combat-skills [stats]
;;   (let [combat (:combat stats)]
;;     (-> (dissoc stats :combat)
;;         (assoc "Combat skills"
;;                {"Energy Weapons" {:Modifier (get combat :energy 0)}
;;                 "Fire Combat" {:Modifier (get combat :fire 0)}
;;                 "Heavy Weapons" {:Modifier (get combat :heavy 0)}
;;                 "Melee Weapons" {:Modifier (get combat :melee 0)}
;;                 "Missile Weapons" {:Modifier (get combat :missile 0)}
;;                 "Unarmed Combat" {:Modifier (get combat :unarmed 0)}}))))

(defn fix-combat-skills [stats]
  (let [combat (:combat stats)]
    (-> (dissoc stats :combat)
        (assoc "Combat skills"
               (reduce (fn [res [n kw]]
                         (assoc res n {:Modifier (get combat kw 0)}))
                       {}
                       [["Energy Weapons" :energy]
                        ["Fire Combat" :fire]
                        ["Heawy Weapons" :heavy]
                        ["Melee Weapons" :melee]
                        ["Missile Weapons" :missile]
                        ["Unarmed Combat" :unarmed]])))))

(defn fix-skills [stats]
  (let [combat (:skills stats)]
    (-> (dissoc stats :skills)
        (assoc "Skills"
               (reduce (fn [res [n kw]]
                         (assoc res n {:Modifier (get combat kw 0)}))
                       {}
                       [["Air Vehicles" :air]
                        [:Alteration :alter]
                        [:Apportation :apportation]
                        ["Beast Riding" :riding]
                        [:Computers :computers]
                        [:Conjuration :conjure]
                        [:Divination :divination]
                        [:Dodge :dodge]
                        ["Evidence Analysis" :evidence]
                        [:Faith :faith]
                        [:Find :find]
                        ["First Aid" :firstaid]
                        [:Kinesis :kinesis]
                        ["Land Vehicles" :land]
                        [:Language :language]
                        [:Lockpicking :lockpicking]
                        [:Medicine :medicine]
                        [:Persuasion :persuasion]
                        [:Profession :profession]
                        [:Reality :reality]
                        [:Scholar :scholar]
                        [:Science :science]
                        [:Stealth :stealth]
                        [:Streetwise :streetwise]
                        [:Survival :survival]
                        [:Telepathy :telepathy]
                        [:Tracking :tracking]
                        ["Water Vehicles" :water]
                        [:Willpower :willpower]])))))

(defn fix-interaction-skills [stats]
  (let [combat (:interaction stats)]
    (-> (dissoc stats :interaction)
        (assoc "Interaction skills"
               (reduce (fn [res [n kw]]
                         (assoc res n {:Modifier (first (get combat kw [0]))}))
                       {}
                       [[:Intimidation :intimidation]
                        [:Maneuver :maneuver]
                        [:Taunt :taunt]
                        [:Trick :trick]])))))

(defn fix-basics [stats]
  (-> (dissoc stats :Move :Tough :Shock :Wounds)
      (assoc :Basics {:Move (:Move stats)
                      :Tough (:Tough stats)
                      :Shock (:Shock stats)
                      :Wounds (:Wounds stats)})))

(defn prepare-creature-stats [stats]
  (-> (assign-attributes stats)
      (fix-combat-skills)
      (fix-interaction-skills)
      (fix-skills)
      (fix-basics)))

(defn creature [data]
  (let [stats (dissoc data :name :description)]
    {:type "Creature"
     :name (:name data)
     :description (:description data)
     :rulesets [{:system "TORG"
                 :implementation
                 {:creatureTable (prepare-creature-stats stats)}}]}))

(defn spells-to-edn [n t edn-data]
  (let [entities (into [] (map #(spell t %) edn-data))]
    {:name n
     :description n
     :entities entities}))

(defn perks-to-edn [name edn-data]
  (let [entities (into [] (map perk edn-data))]
    {:name name
     :description name
     :entities entities}))

(defn items-to-edn [n t t-kw edn-data]
  (let [entities (into [] (map #(item t t-kw %) edn-data))]
    {:name n
     :description n
     :entities entities}))

(defn creatures-to-edn [name edn-data]
  (let [entities (into [] (map creature edn-data))]
    {:name name
     :description name
     :entities entities}))


(defn create-melee [[name description tech damage price notes]]
  {:name name :description description :Tech tech :Damage damage :Price price :Notes notes})

(defn create-ranged [[name description tech damage ammo range price notes]]
  {:name name :description description
   :Tech tech :Damage damage :Ammo ammo
   :Range range :Price price :Notes notes})

(defn create-armor [[name description tech bonus price notes]]
  {:name name :description description :Tech tech :Bonus bonus :Price price :Notes notes})



(defn weapon [[name description cost range damage shots wound special]]
  {:type "Weapons" :name name :description description
   :rulesets [{:system "mothership" 
               :implementation 
               {:weaponStats 
                {:Stats {:Cost cost
                         :Range range
                         :Damage damage
                         :Shots shots
                         :Wound wound
                         :Special special}}}}]})

(def weapons [["Boarding Axe" "" "150cr" "Adjacent" "2d10" "N/A" "Gore [+]" ""]
              ["Combat Shotgun" "" "1,400cr" "Close" "4d10" "4" "Gunshot" "1d10 DMG at Long Range or greater"]
              ["Crowbar" "" "25cr" "Adjacent" "1d5" "N/A" "Blunt Force [+]" "Grants [+] on Strength Checks to open jammed airlocks, lift heavy objects, etc."]
              ["Flamethrower" "" "4kcr" "Close" "2d10" "4" "Fire/Explosives [+]" "Body Save [-] or be set of fire (2d10 DMG / round)"]
              ["Flare Gun" "" "25cr" "Long" "1d5" "2" "Fire/Explosives [-]" "High intensity flare visible day and night from Long Range"]
              ["Foam Gun" "" "500cr" "Close" "1" "3" "Blunt Force" "Body Save or become stuck. Strength Check [-] to escape"]
              ["Frag Grenade" "" "400cr" "Close" "3d10" "1" "Fire/Explosive" "On a hit, damages all Adjacent to enemy"]
              ["General-Purpose Machine Gun" "" "450cr" "Long" "4d10" "5" "Gunshot [+]" "Two-handed. Heavy. Barrel can be maneuvered to fire around corners"]
              ["Hand Welder" "" "250cr" "Adjacent" "1d10" "N/A" "Bleeding" "Can cut through airlock doors"]
              ["Laser Cutter" "" "1,200cr" "Long" "1d100" "6" "Bleeding [+] or Gore [+]" "Two-handed. Heavy. 1 round recharge between shots."]
              ["Nail Gun" "" "150cr" "Close" "1d5" "32" "Bleeding" ""]
              ["Pulse Rifle" "" "2.4kcr" "Long" "3d10" "5" "Gunshot" ""]
              ["Revolver" "" "750cr" "Close" "1d10+1" "6" "Gunshot" ""]
              ["Rigging Gun" "" "350cr" "Close" "1d10 DMG + 2d10 DMG when removed" "1" "Bleeding [+]" "100m micro-filament. Body Save or become entangled."]
              ["Scalpel" "" "50cr" "Adjacent" "1d5" "N/A" "Bleeding [+]" ""]
              ["Smart Rifle" "" "5kcr" "Extreme" "4d10 (AA)" "3" "Gunshot [+]" "[-] on Combat Check when fired at Close Range"]
              ["SMG" "" "1kcr" "Long" "2d10" "5" "Gunshot" "Can be fired one-handed"]
              ["Stun Baton" "" "150cr" "Adjacent" "1d5" "N/A" "Blunt Force" "Body Save or stunned 1 round"]
              ["Tranq Pistol" "" "250cr" "Close" "1d5" "6" "Blunt Force" "If DMG dealt: enemy must Body Save or be unconscious 1d10 rounds"]
              ["Unarmed" "" "Free" "Adjacent" "Str/10 DMG" "N/A" "Blunt Force" ""]
              ["Vibechete" "" "1kcr" "Adjacent" "3d10 (AA)" "N/A" "Bleeding + Gore" "When dealing a Wound, roll on BOTH the Bleeding AND Gore columns."]])

(defn trait [[name description adjust trauma skills]]
  {:type "Traits" :name name :description description
   :rulesets [{:system "mothership"
               :implementation
               {:traitStats
                {:Stats {:Adjust adjust
                         :Skills skills
                         "Trauma response" trauma}}}}]})

(def traits [["Marine" 
              "are handy in a fight, but whenever they Panic it may cause problems for the rest of the crew."
              "+10 combat, +10 body save, +20 fear save, +1 max wounds"
              "Whenever you panic, every close friendly player must make a fear save."
              "Military training, Athletics. Bonus: 1 Expert Skill OR 2 Trained Skills."]
             ["Android"
              "are a terrifying and exciting addition to any crew. They tend to unnerve other crewmembers with their cold inhumanity."
              "+20 intellect, -10 to one stat, +60 fear save, +1 max wounds"
              "Fear saves made by close friendly players are at a disadvantage"
              "Linguistic, Computers, Mathematics. Bonus: 1 Expert Skill OR 2 Trained Skills."]
             ["Scientist"
              "are doctors, researchers, or anyone who wants to slice open creatures (or infected crewmembers) with a scalpel."
              "+10 intellect, +5 to one stat, +30 sanity save"
              "Whenever you fail a sanity save, all close friendly players gain 1 stress"
              "1 Master Skill, and an Expert and Trained Skill prerequisite. Bonus: 1 Trained Skill"]
             ["Teamster"
              "are rough and tumble blue-collar space workers, mechanics, engineers, miners, and pilots"
              "+5 to all stats, +10 to all saves"
              "Once per session, you may take advantage on a panic check"
              "Industrial Equipment, Zero-G. Bonus: 1 Trained Skill and 1 Expert Skill"]])

(defn armor [[name description cost ap o2 speed special]]
  {:type "Armor" :name name :description description
   :rulesets [{:system "mothership"
               :implementation
               {:armorStats
                {:Stats {:Cost cost
                         :AP ap
                         :O2 o2
                         :Speed speed
                         :Special special}}}}]})

(def armors [["Vaccsuit" "Designed for outer space operation." "10kcr" 3 "12 hrs" "[-]" "Includes short-range comms, headlamp, and radiation shielding. Decompression within 1d5 rounds if punctured."]
             ["Standard Crew Attire" "Basic clothing." "100cr" 1 "None" "Normal" ""]
             ["Hazard Suit" "Environmental protection while exploring unknown planets." "4kcr" 5 "1 hr" "Normal" "Includes air filter, extreme heat/cold protection,hydration reclamation (1 L of water lasts 4 days), short-range comms, headlamp, and radiation shielding."]
             ["Standard Battle Dress" "Lightly-plated armor worn by most marines." "2kcr" 7 "None" "Normal" "Includes short-range comms."]
             ["Advanced Battle Dress" "Heavy armor for marines deployed in high combat offworld engagements." "12kcr" 10 "1 hr" "[-]" "Includes short-range comms, body cam, headlamp, HUD, exoskeletal weave (Strength Checks [+]), and radiation shielding. Damage Reduction: 3"]])

(defn mothershipstuff []
  (let [
        ;; weap (reduce #(conj %1 (weapon %2)) [] weapons)
        trai (reduce #(conj %1 (trait %2)) [] traits)
        ;; armo (reduce #(conj %1 (armor %2)) [] armors)
        mothership {:name "Mothership traits"
                    :description "Traits for mothership"
                    :entities trai}]
    (->> mothership
         (json/write-str)
         (spit "morskap.json"))))

(mothershipstuff)



(comment
  (->> (map create-armor d/core-armor)
       (into [])
       (spit "core-armor.edn"))


  (->> (map create-melee d/core-melee)
       (into [])
       (spit "core-melee.edn"))


  (->> (map create-ranged d/core-missile)
       (into [])
       (spit "core-missile.edn"))


  (->> (map create-ranged d/core-ranged)
       (into [])
       (spit "core-ranged.edn"))

  (->> (slurp "creatures.edn")
       (edn/read-string)
       (creatures-to-edn "Core creatures")
       (json/write-str)
       (spit "creaturetest.json"))

  (->> (slurp "magic.edn")
       (edn/read-string)
       (spells-to-edn "Magic spells" "Magic")
       (json/write-str)
       (spit "fudgerimport/magic.json"))
  
  (->> (slurp "miracles.edn")
       (edn/read-string)
       (spells-to-edn "Miracles" "Miracle")
       (json/write-str)
       (spit "fudgerimport/miracles.json"))
  
  (->> (slurp "psionics.edn")
       (edn/read-string)
       (spells-to-edn "Psionics" "Psionics")
       (json/write-str)
       (spit "fudgerimport/psionics.json"))

  (->> (slurp "perks.edn")
       (edn/read-string)
       (perks-to-edn "Perks")
       (json/write-str)
       (spit "fudgerimport/perks.json"))

  (->> (slurp "core-armor.edn")
       (edn/read-string)
       (items-to-edn "Core armor" "Armour" :armourStats)
       (json/write-str)
       (spit "fudgerimport/core-armor.json"))

  (->> (slurp "core-melee.edn")
       (edn/read-string)
       (items-to-edn "Core Melee" "Melee weapons" :weaponStats)
       (json/write-str)
       (spit "fudgerimport/melee-core.json"))

  (->> (slurp "core-missile.edn")
       (edn/read-string)
       (items-to-edn "Core missiles" "Ranged weapons" :rangedStats)
       (json/write-str)
       (spit "fudgerimport/core-missile.json")))
