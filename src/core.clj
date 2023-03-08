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
