(ns data)


(def core-melee [["Chainsaw" "A small gas or electric motor powers
a toothed chain that circles a guide-bar. When
revved, the chain tears away at anything it touches.
It deals a straight damage value rather than
adding to Strength." 22 "14" "150 (11)" "Unwieldy"]
                 ["Machete" "Designed for cutting through thick foliage,
these mid-sized, single-edged blades are also perfectly
useful for cutting flesh. Modern machetes have built-
in tools and features that make survival tests Favored." 22 "+2" "40 (8)" "Survival tests Favored"]
                 ["Truncheon" "A modern baton made of advanced
materials and specially balanced and weighted.
Many versions have a hinged club-head or
are collapsible." 21 "+2" "120 (11)" ""]
                 ["Battle Axe" "A sharp, broad metal head attached to a
wooden shaft, battle axes are most commonly used
as melee weapons." 9 "+3" "200 (11)" ""]
                 ["Great Axe" "The most terrifying of the “barbarian“
weapons is the great axe. The double-edged blade
and wide arc cuts swaths through the wielder’s foes." 10 "+4" "300 (12)" "Stagger, Two Handed, Unwieldy"]
                 ["Dagger" "A short-bladed weapon between 15 and
30 centimeters in length. Daggers can be easily
concealed and drawn in close quarters." 8 "+1" "25 (7)" "Small"]
                 ["Longsword" "" 9 "+3" "120 (10)" ""]
                 ["Short Sword" "" 8 "+2" "90 (9)" ""]
                 ["Two-Handed Sword" "" 10 "+4" "300 (12)" "Two Handed"]
                 ["Mace" "" 8 "+2" "50 (9)" ""]
                 ["Morning Star" "A variation of the mace, the head
of the morning star is connected to the handle by
joints or chains which increase the force of the blow.
It cannot be used in tight spaces where the user
can’t effectively swing the impact end." 8 "+3" "200 (11)" "Unwieldy"]
                 ["War Hammer" "" 9 "+4" "250 (12)" "Stagger, Two Handed, Unwieldy"]
                 ["Halberd" "A polearm slightly over two meters
in length with a large axe-blade mounted at one
end with a spike for puncturing armor opposing
it. Some also have a long thrusting point on the
end of the pole for chopping and thrusting attacks." 10 "+4" "350 (12)" "Reach 2 meters, Two Handed"]
                 ["Spear" "A long wooden pole with a metal head
on the end, spears can be used as melee or missile
weapons. It is not uncommon for a warrior who
uses spears to carry several of them, some for
throwing and at least one to keep on hand for
melee combat." 8 "+2" "25 (7)" "Reach 2 meters, Thrown"]
                 ["Staff" "A staff can be a very effective weapon in
trained hands. Staves are also often seen as walking
sticks and overlooked as weapons." 5 "+2" "25 (7)" "Two Handed"]
                 ["Power Dagger" "Sometimes known as a plasma
dagger, pressing a control button on the hilt
activates a laser or plasma energy field around the
blade, increasing its effectiveness. The weapon can
be used as a regular dagger with the power off." 26 "+2" "220 (11)" "Small"]
                 ["Riot Stick" "A heavy metallic club used for crowd
suppression within the Cyberpapacy. When
activated the tip pulses with powerful electric
shocks which can be set to lethal or non-lethal. If
not activated treat as a mace." 26 "+3" "150 (11)" "Non-lethal, Painful"]
                 ["Bone Knife" "The simplest stabbing weapon,
usually little more than a handhold and a short
shaft with a sharpened point." 3 "+1" "5 (4)" "Fragile, Small"]
                 ["Hrockt Shoot Spear" "Pliable when wet and
growing, but hard as iron once cut and dried. Often
cultivated into straight spears with sharp points.
Also commonly thrown as a missile weapon." 2 "+2" "40 (8)" "Thrown"]
                 ["Improvised Club" "Almost anything a character
picks up may be swung like a weapon. The
advantage is the character is armed and uses melee
weapons for attack and defense. However, a miss
with the weapon leaves the character Vulnerable.
Balanced clubs designed for combat don’t suffer
that drawback." 1 "+2" "5 (4)" "Unwieldy"]
                 ["Stone Axe" "" 2 "+2" "15 (6)" "Fragile, Stagger"]
                 ["Bull Whip" "" 8 "+2" "40 (8)" "Reach 3 meters"]
                 ["Saber" "" 16 "+3" "150 (11)" ""]
                 ["Electric Katana" "The ion circuitry nano-imprinted
into the katana’s blade glows with energy when
activated. The field generated just over the
surface cuts even sharper, and protects the metal
underneath from chipping or dulling. May be used
as a normal katana when not energized." 24 "+4" "500 (13)" "Armor Piercing 2"]
                 ["Katana" "Outstanding quality steel and
workmanship allows this one-edged blade to be
lighter and sharper than a regular sword." 12 "+3" "140 (10)" ""]
                 ["Impact Hammer" "The heavy head contains a
pneumatic mechanism that adds a burst of thrust
to the swing and drives a spike forward at the point
of impact to greatly increase the force directed at
the impact point — if a wielder is strong enough to
get the hammer moving in the first place." 25 "+4" "300 (13)" "Stagger, Two Handed"]
                 ["Pain Gauntlet" "An armored glove laced with
technodemon technology. Once an opponent is
restrained the gauntlet deals damage every round
automatically." 25 "+1" "100 (10)" "Painful, Stagger"]])

(def core-missile 
  [["Compound Bow" "A further extension of the
composite bow, the compound bow uses pulleys
and cables instead of elastic materials to reduce
the amount of strength required to pull and hold
the bow while applying more force to the arrow
when it’s released. Compound bows can be quickly
adjusted to different draw strengths." 22 "13" 1 "20/40/80" "150 (11)" "Min Str 6"]
   ["Taser" "A small, spring-loaded device that fires
electrodes at a target, usually via compressed air.
It has very short range, but delivers a powerful
electrical jolt to the target. A taser generates Shock
normally, but doesn’t deal the associated Wounds.
A hit target automatically suffers a Very Stymied
result from uncontrollable muscle spasms." 22 "12" 1 "2/4/6" "150 (11)" "Painful, Stagger, Non-lethal"]
   ["Composite Longbow" "A more powerful version
of the long bow, this weapon is made up of three
different materials, combined to enhance the elastic
properties of each. While actually closer in size to
the short bow, the composite bow fires arrows at
a greater velocity." 13 "13" 1 "20/40/80" "200 (11)" "Min Str 7"]
   ["Darts" "A specially balanced blade weighted so that
it can be thrown with reliable accuracy at a target. A
normal dagger cannot be counted on to hit a target
blade-first." 8 "+1" 1 "5/10/15" "25 (7)" "Small"]
   ["Heavy Crossbow" "A larger version of the light
crossbow, almost always equipped with some kind
of foot stirrup and a winch or pulley arrangement
to facilitate cocking the more powerful pull of the
bow. Although it is more powerful and has a longer
range, the heavy crossbow is hampered by the time
it takes to cock the bow." 12 "13" 1 "10/25/40" "200 (11)" "Reload"]
   ["Long Bow" "A wooden bow, greater than 1.5
meters in length. The string is drawn back as far
as the ear, and has a greater range and can shoot
arrows at a greater velocity than the short bow." 9 "12" 1 "20/40/80" "100 (10)" "Min Str 8"]
   ["Light Crossbow" "A crossbow consists of a bow
attached to a wooden stock, which allows the
weapon to be kept cocked without any effort. Some
require the firer to cock the bow manually, while
others use cranks or pulleys which allow for much
stronger pulls and thus more power than the firer
might be able to manage with his Strength." 9 "12" 1 "10/25/40" "150 (11)" ""]
   ["Short Bow" "simple wooden bow, less than 1.5
meters in length. It fires wooden shafts usually
fitted with metallic heads. Short bows are actually
possible as early as Tech 5 but they aren't as
powerful as this version." 7 "11" 1 "10/25/40" "70 (9)" "Min Str 6"]
   ["Sling" "A sling is a piece of leather or cord with a
pouch in the middle. The pouch is loaded with a
stone or lead ball called a “bullet.“ Grasping both
             ends, the wielder twirls it rapidly and then releases
one end of the rope, flinging the stone rapidly
toward its target." 7 "+1" 1 "5/20/40" "15 (6)" ""]
   ["Throwing Axe" "A tomahawk or other light axe
weighted for throwing. May also be used as a melee
weapon with the same bonus." 8 "+2" 1 "5/10/15" "60 (9)" ""]
   ["Disruptor Grenade" "Each grenade resembles a
flat throwing disc. When it strikes the ground or a
target it emits a strong pulse meant to incapacitate
anyone nearby. Some disruptors use electric pulses,
others use sonic waves, but either has the same
effect on those unfortunate enough to be caught
within the pulse!" 26 "16" 1 "10/20/30" "100 (11)" "Non-lethal, Medium Blast"]
   ["Blow Gun" "A long tube that a dart or other small
projectile fits into. The user blows into the tube
to propel the dart. Blow gun projectiles are small
and deal limited damage, but may be coated with
poisons or toxins." 3 "+0" 1 "10/20/30" "5 (4)" ""]
   ["Hrockt Shoot Spear" "" 3 "+2" 1 "10/20/40" "40 (8)" ""]
   ["Rock Bolo" "Can be as simple as two stones tied
together by vines. A bolo is usually spun around to
generate momentum, then hurled at a target. Not
only does the impact deal damage, but the cord
between the weights often wraps around the target." 3 "+1" 1 "10/20/30" "5 (4)" "May be used to grapple"]
   ["Spear" "" 5 "+2" 1 "10/20/40" "25 (7)" ""]
   ["War Boomerang" "These heavy throwing sticks can
be hurled in such a way as to follow a curved flight
path. It returns to the thrower ready for another
toss after a miss— except on a Mishap!" 5 "+1" 1 "5/10/15" "40 (8)" "Returns when thrown"]
   ["Frag Grenade" "Pulling the pin on
this spherical grenade allows the safety handle to
pop free, arming the grenade, unless the handle
is manually held in place. The fuse has a normal
duration of seven seconds and has a Medium
Blast radius." 20 "16" 1 "10/20/30" "50 (9)" "Medium Blast"]
   ["Petrol Bomb" "Often called a Molotov Cocktail. A
petrol bomb usually involves a glass container such
as a bottle, flammable contents like fuel or alcohol,
                   and an igniter. An igniter can be as simple as a
flaming rag. When thrown at a target the container
breaks and the fuel ignites explosively. Targets are
engulfed in flame (see Fire on page 136)." 20 "14" 1 "10/20/30" "25 (7)" "Medium Blast, Fire"]
   ["Dynamite Stick" "" 17 "13" 1 "10/20/30" "20 (6)" "Medium Blast"]
   ["Multi-Crossbow" "These Victorian contraptions
usually have multiple sets of arms or spring
mechanisms that redraw and cock the crossbow
while feeding a new bolt into the chamber." 17 "13" 3 "10/25/40" "250 (12)" "Reload"]
   ["Electric Longbow" "Material memory alters the
elastic properties of the bow, and electronically
increases the force of the release. Arrowheads
usually include the same technology as an electric
katana, just on a smaller scale." 24 "13" 1 "20/40/80" "250 (12)" "Min Str 6, AP 2"]
   ["Ion Shuriken" "The famous “throwing stars“ of
the ninja, updated with state-of-the-art materials
and advanced, penetrating blades." 24 "+2" 1 "5/10/15" "200 (11)" "AP 2, Small"]
   ["Offensive Grenade" "A high-tech grenade
developed by the Kanawa corporation, it has not
seen much export due to problems with long-range
Contradictions. It is a small cylinder with a timer
knob on the top. The timer can be set from one to
60 seconds. Intended for use while advancing. The
Small Blast radius is less than the more familiar
fragmentation grenade." 23 "17" 1 "10/20/30" "250 (12)" "Small Blast"]
   ["Net Launcher" "A weighted net fits into a tube
launcher powered by a tightly wound torsion
spring. A mechanical engine is needed to wind the
spring or recover the net after it’s been launched.
The net acts just like a Grappling attempt (page
123), with a hit dealing −2 damage. A Good
hit restrains the target temporarily and does
full damage. An Outstanding hit restrains and
Stymies the target. Technodemons often employ
a special version of this weapon that deploys a
net with the same properties as a pain gauntlet." 25 "5" 1 "5/10/15" "100 (10)" "Small Blast"]])


(def core-ranged
  [[".38 Revolver" "A straightforward six-cylinder
revolver known for its reliability and long use by
law-enforcement organizations around the world." 20 "12" 6 "10/25/40" "100 (10)" "Small"]
   [".45 Colt Automatic" "Actually a semiautomatic
pistol, the .45 auto was the standard US military
sidearm for almost 70 years. It’s a heavy pistol with
a lot of recoil but with excellent stopping power.
The weapon is a favorite of the “mystery men“ who
operate in the Nile Empire." 20 "14" 7 "10/25/40" "250 (12)" ""]
   ["Glock 9mm" "A recoil-operated 9mm
semiautomatic. Notable for its large, double-
stacked ammo magazine." 22 "13" 15 "10/25/40" "250 (12)" ""]
   ["Atchisson 12" "Also known as the Assault 12, the
Atchisson is an innovative short-barreled, auto-
loading 12-gauge shotgun. The weapon is designed
for hip firing. The Atchisson’s normal rate of fire is
single shot, but it is capable of firing Long Bursts." 23 "14" 32 "10/20/30" "450 (13)" "Short Burst"]
   ["Remington 870" "A popular pump-action shotgun
available in a variety of gauges. Numerous add-ons
and special shells are available for the police and
paramilitary markets." 22 "14" 7 "10/20/30" "200 (11)" ""]
   ["MAC-10" "Generally considered more of a heavy
machine pistol, the MAC-10 is rugged and reliable
but not particularly accurate or easy to use." 22 "13" 30 "10/25/40" "350 (12)" "Short Burst"]
   ["Uzi" "Famous from appearing in numerous
movies, the Uzi is recognized and used
worldwide. It is extremely durable and designed
for extended use." 22 "13" 32 "10/25/40" "400 (13)" "Short Burst"]
   [".308 Hunting Rifle" "This is a common breech-
loading hunting rifle found throughout the world,
and in particular the United States. It was most
often used for deer hunting before the invasion." 21 "14" 10 "80/160/320" "300 (12)" ""]
   ["AK-47" "Also known as the Kalashnikov,
this Soviet-era assault rifle is a familiar sight
worldwide. It fires 7.62mm ammunition and
its normal rate of fire is the three-round burst,
though it can be set for single fire or Long Burst.
The AK-47 is a very rugged piece of equipment
and can take a lot more abuse than its American
counterpart, the M-16." 22 "14" 30 "40/80/160" "500 (13)" "Long Burst"]
   ["Barrett M82" "Fires a whopping .50-caliber round
that can penetrate brick walls and retain enough
energy to kill a person on the other side. The
Barrett has a semi-automatic firing mechanism
and heavy recoil suppression. It is almost always
fired braced with its bipod." 23 "16" 10 "10/500/1K" "1200 (15)" "Bulky, AP 4"]
   ["GM-94 Launcher" "A pump-action grenade
launcher used by Russian special forces and security
forces. Designed for fragmentation grenades or
offensive grenades (found under Missile Weapons
and Explosives), it delivers them at much greater
range. It has also proven adept at launching
salvaged technodemon explosives." 23 "16" 3 "50/100/200" "1500 (16)" "Medium Blast"]
   ["M4 carbine/M-16" "A modern variant of the
ubiquitous M-16 assault rifle, the M-4 is light,
compact, and used by military and police
organizations across the globe. In game terms, its
performance is near enough to the M-16 assault
rifle that the two may be used interchangeably.
It’s chambered for a relatively small 5.56mm
round. The M-4’s normal rate of fire is a Short
Burst. Older versions like the M-16 may Long
Burst, but newer models dispense with that
option completely." 23 "13" 30 "50/100/200" "300 (12)" "Long Burst"]
   ["7.62mm Minigun" "An electrically operated
Gatling gun, capable of a horrendous rate of fire.
It weighs 120 kilograms without ammunition and
is most often used in light aircraft or helicopters." 22 "15" 10 "100/500/1K" "10K (20)" "Heavy Burst, Bulky"]
   ["Maremont M60" "A selective-fire light machine-
gun, the Maremont can be set for Short or Long
Bursts. The barrel has a bipod for firing while
braced on the ground. A strong enough operator
can use it unbraced and on the move." 22 "15" 50 "100/500/1K" "3000 (17)" "Long Burst, Bulky"]
   ["Arquebus" "A matchlock musket with a
barrel length of 1.2 to 1.8 meters. The weapon
is so heavy that a wooden rest is required to
support the barrel when aiming. A lit match
is used to ignite the black powder and fire the
weapon. Wet conditions make use of a matchlock
virtually impossible. Always uses black powder
ammunition (page 158)." 14 "14" 1 "5/10/20" "200 (11)" "Reload"]
   ["Ayslish Wheel-lock" "An early form of firearm,
the wheel-lock uses a spring mechanism to
generate sparks when the trigger is pulled.
The sparks ignite the black powder and the
weapon is fired, assuming that all the involved
components are dry and working properly. Must
use black powder ammunition (page 158). In
Aysle, dwarves are generally the only people who
use wheel-locks." 14 "13" 1 "5/10/20" "150 (11)" "Reload"]
   ["Blunderbuss" "A flintlock musket with a wide
brass barrel and flared muzzle, the blunderbuss
does not have good range but it scatters shot
very effectively in that short range. Because
it is a black-powder-load weapon, it has the
additional benefit that just about any metal
scrap could be used for shot if lead pellets are
not available. Thanks to the wide scatter pattern
of a blunderbuss it counts as a shotgun (see page
126), and a single shot may hit two or three
targets (standard Multi-Targeting penalties
apply) if they are close together." 14 "14" 1 "5/10/15" "250 (12)" "Reload"]
   ["GWI GodFire Plasma" "The GodFire more
closely resembles a flamethrower than a rifle. A
hefty power supply worn as a backpack generates
the plasma energy, which is fed to the “rifle“
through a connecting cable. The superheated
plasma appears as a fiery red ball that explodes
when it hits, affecting all targets within the
detonation point." 26 "16" 10 "20/40/80" "2K (16)" "Small Blast"]
   ["GWI GodBeam Laser" "The GodBeam has a long
barrel, a stabilizing stock, and laser sight. It emits a
deadly blue beam of laser light. A laser sight (page
141) is integral, using a low-power beam from the
weapon itself. All GWI weapons are connected to
                         the GodNet by default, so hacked versions are rare
and expensive." 26 "14" 15 "100/500/1K" "600 (14)" "Short Burst, AP 1"]
   ["GWI GodLight Laser" "Small enough to be
mounted on a person’s wrist with an appropriate
holder. Like its larger cousin the GodBeam Laser,
this compact device always counts as having a
built-in laser sight." 26 "14" 5 "50/100/500" "350 (12)" "Small"]
   ["GWI GodMeeter" "The most common sidearm in
use by the Church Police. It’s a high caliber and
very loud firearm. Like other GWI weapons it has
a limited artificial intelligence built in—not to assist
with firing but to disable functions and preach
at miscreants if the weapon falls into the wrong
hands. The gun is also capable of selecting between
different types of ammunition by vocal command
if more than one type is loaded." 26 "15" 25 "10/25/40" "450 (13)" ""]
   ["MAS Storm Shotgun" "A fully automatic shotgun
used by the Church Police of the Cyberpapacy.
The storm gun fires its projectiles at great velocities,
giving it superior range capabilities. It’s a brutal
weapon reserved for when the Church wishes to
make a particular statement." 26 "15" 30 "15/30/45" "500 (13)" "Short Burst"]
   ["Hunting Shotgun" "The typical double-barreled
shotgun. The barrels are usually side by side,
and a single trigger fires each barrel in sequence
depending on how far it’s pulled." 20 "13" 2 "10/20/30" "100 (10)" ""]
   ["M1918 BAR" "The Browning Automatic
Rifle was a heavy rifle designed for support
fire. Its high rate of fire was limited by its
comparatively small magazine. Usually fired
from a shoulder sling." 20 "14" 20 "50/100/200" "2000 (16)" "Long Burst"]
   ["Mauser Pistol" "An often-copied design that
features a high muzzle velocity and excellent
penetration and a distinctive box magazine in
front of the trigger. It remains extremely popular
in the Nile Empire, where knock-offs are still
manufactured." 20 "13" 10 "10/25/40" "250 (12)" ""]
   ["Schmeisser MP-40" "A German 9mm submachine
gun from World War II, it is a cutting edge weapon
for Tech 20. The weapons of the Nile Empire bear
a striking resemblance to this model, and have the
same statistics. Likewise, it’s extremely popular in
the Nile Empire’s black markets." 20 "13" 32 "10/25/40" "350 (12)" "Short Burst"]
   ["Thompson 1928" "The “Tommy gun“ was made
famous during the gangster era of Prohibition in
the United States. A heavy weapon, the Thompson
fires .45 caliber ammunition and is brutally efficient
at close range thanks to its high rate of fire. A
20-round magazine was available, though more
people are familiar with the 50-round drum. Ammo
ratings are provided for both the clip and drum.
The Thompson cannot be fired on single shot, only
Short and Long Burst." 20 "14" 50 "15/30/60" "400 (13)" "Long Burst"]
   [".450 Nitro Express" "A double-barreled rifle with
a massive cartridge designed for large game such
as elephants, or the monsters of Gaea. The stock
was a metal plate so it could be braced against
a tree rather than the hunter’s shoulder. The
second barrel was meant for emergencies, such
as a charging beast tough enough to survive
the first shot." 18 "15" 2 "40/80/160" "400 (13)" "Bulky, AP 2"]
   ["Webley Revolver" "" 18 "14" 6 "10/25/40" "300 (12)" ""]
   ["Lee-Enfield MK 1" "A British bolt-action repeating
rifle with a box magazine, the Lee Enfield has proven
popular in Orrorsh because of its superiority to the
local Victorian rifles. A reliable and accurate rifle,
modern models of the Lee Enfield are available
but they do not differ significantly from the
Tech 20 version." 19 "14" 10 "50/100/200" "350 (12)" ""]
   ["Impala Chaingun" "" 24 "15" 20 "100/500/1K" "20K (21)" "Heavy Burst, Bulky"]
   ["SC Kyogo T11" "A powerful assault rifle from
the Pan-Pacifica mega-conglomerates that rivals
the power of the AK-47 while somehow managing
to squeeze four times the ammunition capacity
into each magazine. A modified version has been
designed for use in automated security systems." 24 "14" 120 "50/100/200" "800 (14)" "Long Burst"]
   ["SC Kyogo 144 SMG" "A lightweight submachine gun
from Pan-Pacifica, the Kyogo is unusually accurate
for a submachine gun and is quite popular due to
its exceptional range and damage." 24 "13" 45 "20/40/80" "400 (13)" "Short Burst"]
   ["Alph Pulverizer" "Many technodemons have
blaster weapons similar to the Pulverizer installed
in an arm. Its beam scours armor and flesh,
stripping it one layer at a time. This rare weapon
is a salvaged version converted to be carried like a
rifle. The weapon recharges by siphoning pain from
the user, which costs an action and deals 2 Shock
each time the magazine is reloaded without a dock." 25 "17" 3 "20/40/80" "8000 (19)" "Painful, Bulky"]
   ["Alph Sprayer" "An advanced energy weapon,
this assault weapon fires bolts of charged plasma
to devastating effect. The distinctive sound of its
energy projectiles are well known around Tharkold." 25 "14" 30 "40/80/160" "1000 (15)" "Long Burst, Bulky"]
   ["Thav-9 SMG" "A standard submachine gun design
used in Tharkold. Sophisticated muzzle brake
                  design prevents “climbing“ problems when fired
on Long Burst." 25 "13" 60 "20/40/80" "500 (13)" "Short Burst"]])

(def core-armor
  [["Ballistic/Kevlar Vest" "Also known as bulletproof vests or
Kevlar armor. Made of synthetic material designed
to catch and stop bullets as they spin into different
protective layers." 22 "+4" "250 (12)" "Max Dex 10,Torso, Fatigues"]
   ["Stab Vest" "Lighter and more comfortable
than a ballistic vest, and designed more
to stop slashing and piercing weapons.
Still somewhat effective against bullets." 23 "+3" "200 (11)" "Max Dex 10, Torso"]
   ["Tactical Armor" "Modern military grade protection
featuring different layers, a helmet, and nearly full
coverage while still allowing good mobility." 23 "+4" "450 (13)" "Max Dex 8, Min Str 8, Fatigues"]
   ["Chain Mail" "" 10 "+2" "300 (12)" "Max Dex 8, Min Str 8, Fatigues"]
   ["Elven Chain" "" 12 "+3" "500 (13)" "Max Dex 10, Torso"]
   ["Leather Armor" "Animal hides tanned or boiled to a
stiffer, more durable finish, then reinforced with
studs or stitched seams. Found in some form
in every cosm." 8 "+1" "150 (11)" "Max Dex 10"]
   ["Plate Mail" "Early plate
mail is heavy and hot,
but still offers excellent
protection against most
contemporary weapons.
Wearing plate is considered
a sign of prestige among the
nobles of Aysle." 12 "+3" "600 (14)" "Max Dex 8, Min Str 10, Fatigues, Full body"]
   ["Leather Jerkin" "" 8 "+1" "100 (10)" "Max Dex 12, Torso"]
   ["Spiked Plates" "A hodgepodge of metal plates with
sharpened protruding barbs, nails, and blades. The
spikes add the armor’s bonus to unarmed tests when
Grappling (see page 123) or resisting a grapple." 12 "+2" "400 (12)" "Max Dex 8, Min Str 8, Fatigues, bonus adds to unarmed damage"]
   ["Armor of God" "Made with thick but lightweight
sheets of HardPlas, a synthetic material with
very high tensile strength. As the primary armor
of all Church Police very limited quantities are
legitimately for sale, but a thriving black market
operates around re-purposed suits plundered from
fallen Streetbeaters." 26 "+4" "1000 (15)" "Max Dex 8, Fatigues, Full body"]
   ["Destroyer Armor" "Servo assisted power armor
that only the elite strike teams of the Cyberchurch
have access to. It automatically comes equipped
with an Augmented Reality HUD." 26 "+4" "3500 (17)" "Max Dex 8, Min Str 12, Fatigues, Full body, users Strength gains a +2 for attacks and carrying gear"]
   ["Reflec Armor" "Light, glittery, cloth-
like hybrid material designed to
refract and redistribute energy. Reflec
comes in various colors. It refracts light,
which usually surrounds the armor in a dazzling
corona, adding its armor rating to the wearer’s
dodge against all energy weapons." 26 "+2" "250 (12)" "Max Dex 10, Bonus also adds to dodge against energy weapons"]
   ["Bone and Hide" "Bone and hide armor consists of
finely shaped bone pieces carefully sewn into the
hide. It is very difficult to make, for if the bone layer
does not conform in shape to the user, it breaks
easily in combat." 3 "+1" "50 (8)" "Max Dex 12, Torso"]
   ["Carapace" "The chitinous shells of the Living
Land’s larger insects can be adapted into formidable
armor. The result is uncomfortable and restricting,
but resistant to even advanced weaponry." 3 "+3" "800 (14)" "Max Dex 6, Min Str 10, Fatigues"]
   ["Hrockt Root Armor" "Crafted from the extremely durable
roots of the hrockt tree, this armor is highly
protective but also immobile without the will of
Lanala. To be of any use the wearer must be a jakatt,
with one or more adds in faith (Keta Kalles) and a
Spirit Axiom of 11 or more. If the local axiom is
lower this armor does cause a Contradiction." 3 "+2" "400 (13)" "Max Dex 10, Torso, Jakatts only"]
   ["Fireproof Suit" "A thick set of coveralls woven
with fire resistant material." 19 "+1" "250 (12)" "Max Dex 10, Fatigues, Full body, +5 armor against fire attacks"]
   ["Flight Jacket" "" 19 "+1" "75 (9)" "Max Dex 12, Torso"]
   ["Boilerplate Hauberk" "Thick iron plates, intricately
hinged together to form a long overshirt. Includes
a thick pot helmet, faceplate, and ankle greaves.
Friend and foe alike call the hardy Victorian
shocktroops who wear this armor “juggernauts.“" 18 "+4" "1000 (15)" "Max Dex 6, Min Str 12, Fatigues"]
   ["Heavy Cuirass" "A rigid steel vest that protects the chest,
back, and vitals. Usually smooth and angled to help
deflect blows, but there are versions that mimic
musculature instead." 15 "+3" "250 (12)" "Max Dex 8, Fatigues, Torso"]
   ["Monster Hide Duster" "A long
overcoat made from the treated
skins of various beasts that
once terrorized the innocent.
The monsters of Orrorsh are
notoriously hardy, so leather
made from their hides is
especially durable." 16 "+2" "350 (12)" "Max Dex 10, Fatigues"]
   ["IriMesh Clothing" "A light textile woven by
nano-machines. IriMesh looks and feels similar to
silk, but with even more tensile strength. IriMesh
can be worn at elegant banquets without looking
out of place, and doesn’t raise security concerns
at checkpoints." 24 "+2" "250 (12)" ""]
   ["Kanawa Security Armor" "These suits of full body
armor are designed for Kanawa’s security forces,
but more than a few have fallen into the hands of
rebels and independent Storm Knights. The suits
are made of black laminate and resemble early
samurai armor." 24 "+4" "700 (15)" "Max Dex 8, Min Str 8, Full body"]
   ["Plexiflex Sheathing" "A series of
clasps, cups, and form-fitting plates that
fasten onto various parts of the wearer’s
body. Those who prefer subtlety strap
sheathing under loose clothing.
Some East Asian street gangs have
taken to decorating the pieces and
wearing them atop their clothing like
sports padding." 24 "+3" "450 (13)" "Max Dex 10, May be concealed under clothing"]
   ["Technodemon Hide Vest" "Killing a demon and taking
its skin is hard. Finding chemicals powerful enough
to tan and cure it is even harder. The result is
worth it — light, supple, and extremely tough.
The Fatigue effect isn’t from the weight of
the armor, but from the discomfort and
nightmares produced by the skin still
writhing with evil." 25 "+4" "350 (12)" "Max Dex 12, Torso, Fatigues"]
   ["Diffrax Plate" "Black metallic armor cobbled
together from energy-diffusing salvage. It
resembles obsidian, and energy skitters across its
surface, sizzling and popping until it coalesces and
re-emerges projected at some different angle." 25 "+3" "500 (13)" "Max Dex 8, Min Str 8, Fatigues, bonus adds to dodge vs energy weapons"]
   ["Riot Shield" "Police and security forces around
the world use these lightweight plexiglass shields
to protect themselves from rioters. Now many use
them against the invaders’ hordes as well." 22 "+2" "100 (10)" "Min Str 6"]
   ["Small Shield" "Usually little more than a rounded
piece of wood affixed to the warrior’s arm
with a strap." 9 "+1" "100 (10)" "Min Str 7"]
   ["Medium Shield" "About 1.5 meters in length, this
is the type of shield commonly associated with the
knights of Aysle." 9 "+2" "150 (11)" "Min Str 8"]
   ["Large Shield" "Sometimes called a tower shield,
it is up to two meters tall and requires Strength of
9 or higher to wield effectively. A character may
not move and attack while using such a shield.
Particularly strong characters (Strength 11+) may
move and attack normally." 9 "+3" "250 (12)" "Min Str 9, may not move and attack unless Strength 11+"]
   ["Tower of Babel" "An imposing, composite shield
favored by the Church Police of the Cyberpapacy.
The outer side pulses with dangerous electrical
shocks, while the inner side projects images of
what’s ahead and video communications. Similar
to a large shield, the Tower usually must be planted
to be effective — preventing a user from moving
and attacking unless he has Strength 10 or higher." 25 "+3" "200 (12)" "Min Str 8, Painful, may not move and attack unless Strength 10+"]
   ["Creature Shell" "" 3 "+1" "50 (9)" "Min Str 6"]
   ["Plexiflex Shield" "Plexiflex’s light weight,
transparency, and kinetic energy diffusing
properties make it an ideal material for shields." 24 "+3" "100 (10)" "Min Str 6"]
   ["Diffrax Shield" "A plate of Tharkoldu metal designed
to absorb and defract energy weapons. The material
is always a flat black. The bonus to defense is
doubled to +4 against any energy weapons." 25 "+2" "150 (11)" "Min Str 8, bonus doubled against energy"]])


(def ll-armor
  [["Boneforged Armor" "Crafted from dinosaur
skeletons using the sculpt bone miracle, this armor
gives its wearer a fearsome appearance, making
intimidation tests Favored." 2 "+3" "1000 (14)" 10 "Stalek, Min Str 8"]
   ["Boneforged Shield" "Crafted from dinosaur bone
using the sculpt bone miracle, these shields
grant a high level of protection, but
come at the expense of added weight.
Typically, boneforged shields are
constructed from fragments of the
upper skull of a dinosaur, an
implication in edeinos culture
that the wielder is a mighty
hunter." 2 "+3" "200 (12)" 0 "Stalek, Min Str 8"]
   ["Hrockt-Shoot Shield" "These
kite-shaped shields have been
woven together from hrockt-
shoots and strengthened by
the shape plant miracle, making
them light but effective. The
ends of the shoots have the same
pointed tips as spears." 3 "+2" "250 (12)" 0 "Jakatt, Min Str 7"]
   ["Silverscale Cloak" "This cloak is
made from a material that resembles
the hide of a dinosaur, the scales
glimmering with a silver hue. The
silverscale cloak stretches to the lower
leg on even the tallest edeinos and
includes a hood. The garment radiates
a sense of majestic valor.
Infused with the blessings of
Lanala, the cloak guides its wearer to
help those who are sick, injured, or
otherwise disabled. Stories are told
of edeinos wearing the silverscale
cloak performing great feats of
restoration. According to legend, even a grievously
wounded individual can be brought back to full
health—though this ability is not used lightly as
the cloak is lost afterward.
The wearer of a silverscale cloak gains a +2 bonus
to first aid, medicine, and persuasion tests. All those
skills count as trained, even if the wearer has
no adds. The silverscale cloak can perform a
miraculous feat of healing once: By draping
the cloak over a person and willing it so,
the cloak can heal any wound, cure any
disease, or undo the harmful effects of a
miracle or spell. Afterwards the cloak
rots into nothing and then reappears
elsewhere for a new champion." 5 "+4" "15M (36)" 12 "Sacred"]
   ["Warshell" "Possibly the most
unusual sacred item is not of edeinos
construction at all—rather, it is a suit
of armor created by the vanished
Ustanah civilization. A war shell
is made of smoothly rounded
plates of waxy, steel-hard chitin
of an iridescent gold and green
color. A war shell includes a helmet
that fits over the back and sides of the
wearer’s head, making it a good fit
for humanoids and edeinos alike.
There is no doubt that war shells
are blessed with spiritual power, but
there are many who question whether
the deity granting that favor is Lanala or
some other, unknown force. A war shell
increases the wearer’s power, supporting
and enhancing every physical
motion. It provides a high level of
protection, able to shrug off even
powerful blows." 6 "+5" "18M (36)" 10 "Sacred, Full Body, Min Str 12"]])

(def ll-melee
  [["Boneforged Club" "Made from dinosaur bone
using the sculpt bone miracle, these clubs are crafted
to maintain their origin—obvious leg, rib, or arm
bones—to better unsettle opponents." 2 "+3" "150 (11)" "Stalek, Two-handed, Stagger"]
   ["Boneforged Spear" "These long, narrow spears are
the namesake of the Whitespear Clan. Boneforged
spears are lighter than most other spears and can
be hurled a considerable distance." 2 "+2" "120 (10)" "Stalek, Thrown"]
   ["Bone Razor" "Formed from sharpened dinosaur
bones, this sword has a hilt wrapped in strips of
edeinos hide. As its name suggests, the sword’s
blade is exceptionally sharp. According to legends,
the bone razor can cut through even the toughest
stone. The lightweight bone makes the blade well-
balanced and deft.
This item is sacred to Rec Stalek—a palpable aura
of malevolence surrounds it. In the hands of an
unbeliever, the bone razor is simply a well-crafted
melee weapon. In the hands of the faithful, however,
the bone razor channels the power of death and
enhances the wielder’s ability to invoke miracles. It
is said that a priest of Rec Stalek with a bone razor in
hand can raise entire armies from corpses of the dead.
When wielded by one who is faithful to Rec
Stalek, a bone razor makes all faith tests Favored.
The wielder also gains knowledge of the unlife
miracle as well as an additional +2 bonus to faith
when invoking that miracle." 2 "+5" "800K (29)" "Sacred, Stalek"]
   ["Bronze Machete" "The most advanced metalwork
supported by the Living Land. This weapon is
little more than a flattened piece of metal with a
sharpened chopping edge." 6 "+2" "100 (10)" ""]
   ["Claw Blade" "As the name suggests, these fearsome
weapons are made from the claw of one of the
land’s gigantic predators, further sharpened to
rip through hide and armor alike. It’s considered
inappropriate to wield such a weapon without first
killing one of the creatures that provided the claw." 3 "+3" "300 (12)" "Two-handed"]
   ["Hrockt-Root Club" "Formed from woven hrockt
roots using the shape plant miracle, these simple
weapons are commonly carried by edeinos
warriors as a backup to their spear. Since clubs
are blunt weapons, edeinos warriors often employ
them when attempting to take prisoners." 2 "+1" "50 (8)" "Stagger"]
   ["Redthorn Whip" "The stinging leaves and spines of
the troublesome redthorn plant are woven into the
striking end of a whip—or the shape plant miracle
reforms the plant into a weapon." 2 "+2" "250 (12)" "Grapple, Painful, Reach 3 meters"]
   ["Stone Club" "Typically composed of a length of wood
with a rock wedged into one end, these weapons
are inelegant at best—but they get the job done." 1 "+2" "12 (5)" "Unwieldy"]
   ["Two-Handed Stone Club" "" 1 "+3" "50 (8)" "Two-handed, Stagger, Unwieldy"]])

(def ll-ranged
  [["Atlatl" "An atlatl is a short, hinged strut that hooks
onto the back of a spear, and adds extra leverage
when a hunter uses it to hurl the spear. Usually a
hunter uses shorter spears or javelins made to fit
the atlatl, but it may also be used to grant other
spears this weapon’s range." 4 "+2" 1 "10/40/80" "25 (7)" ""]
   ["Boneforged Spear" "Light and aerodynamic, these
spears have a long range when thrown." 2 "+2" 1 "5/35/50" "120 (11)" "Stalek"]
   ["Kesta Hive" "A kesta is large, thick-skinned fruit.
Once a kesta spoils it draws hundreds of small
stinging insects, also called kesta because they are
only found around this particular fruit tree. They
form a hive inside the skin of the fruit, lay eggs, and
hibernate for nearly a month if left undisturbed. If
the skin of the fruit is broken the insects awaken,
viciously attack the least-armored spot on any
creatures nearby, and then die. Much like bees,
the use of their stingers is fatal. Crafty hunters
may find hibernating nests and hurl the fruit at
enemies—just so long as the fruit isn’t squashed
too early. Once the natural hibernation cycle ends,
the insects burst from the husk of the fruit and fly
in search of the nearest kesta tree." 1 "13" 1 "5/10/15" "100 (10)" "Small Blast, Lowest Armor"]
   ["Life Lance" "Though resembling a humble hrockt-
shoot spear, a lifelance (or “takta rien” in the
edeinos’ language) seethes with Lanala’s vitality,
causing plant life to bloom and surge with vibrant
colors whenever it comes near. A particularly
complex pattern of woven roots forms the spear-
tip, one that causes dizziness if closely studied.
When thrown, the lifelance briefly transforms
into a blinding thunderbolt, reforming into its
hrockt-root-spear shape upon impact with a target.
Lifelances are also well-suited to healing, assisting
any faithful of Lanala in invoking miracles meant
to restore life. In addition, the wielder of a lifelance
need only speak aloud his need for shelter, water,
or food, and the spear-tip unerringly points toward
the closest location where that need can be satisfied.
Survival and faith tests become Favored when the
lance is held by a character faithful to Lanala. The
sacred weapon also grants knowledge of the healing
and regenerate miracles, and a +2 bonus to faith rolls
when invoking those miracles." 3 "+4" 1 "5/25/40" "250K (27)" "Sacred, Jakatt"]
   ["Sinew Bow" "An ancient form of bow that uses
animal tendons for backing and cordage." 6 "11" 1 "10/30/60" "50 (8)" "Min Str 7"]])

(def ne-armor
  [["Bulletproof Vest" "This is a low-tech version of
Core Earth’s Kevlar vest, which is bulkier and
more restrictive. It grants an armor bonus of +4,
covers the Torso, Fatigues, and has a Max Dex of 8." 20 "+4" "450 (13)" 8 "Torso, Fatigues"]
   ["Ceremonial Breastplate" "" 10 "+2" "250 (12)" 10 "Torso"]
   ["Forcefield Belt" "This belt with lights and buttons
on the buckle replicates the Force Field pulp
power. Whenever the force field may cancel a
Wound, the character rolls a die. On a 1–2, the force
field doesn’t absorb the damage and burns out the
eternium splinter." 20 "-" "4000 (18)" 12 "Weird Science, see description"]
   ["Mask" "Masks have power in the Nile Empire.
Those heroes and villains who don a mask find
themselves protected “somehow” even though
they wear normal clothes or a costume. Masks
count as +2 Armor for reality-rated characters. As
usual, only the largest bonus applies if the character
is already wearing armor. The protection is Full
Body, even though it technically doesn’t cover any
of the character’s body at all!
This bonus only applies within the Nile Empire
where the Law of Masks is in effect. Also, masks
carry a significant connotation within the Empire.
Anyone who wears one is either a villain working
for Mobius or a vigilante about to cause trouble." 10 "+2" "10 (5)" 0 "Weird Science, see description"]
   ["Protective Ankh +1" "One or two of these ankhs are
available at most major temples in the Empire,
with more available at temples dedicated to
Wadjet. Protective ankhs house a tourmaline, and
provide an Armor bonus of +1 that counts as Full
Body Armor. If the purchaser wishes to have an
Amaatist priest invoke empower ankh for him to
gain a higher Armor bonus (see page 50), it costs
more but there is no guarantee the miracle will
succeed. Priests normally invoking this miracle
have faith 12, the minimum required.
Important agents of Doctor Mobius frequently
wear protective ankhs which provide +2 or +3
Armor bonuses. These protective ankhs are attuned
to the wearer and do not function for others." 8 "+1" "250 (12)" 0 "Holy, Full Body"]
   ["Protective Ankh +2" "" 8 "+2" "1000 (15)" 0 "Holy, Full Body"]
   ["Protective Ankh +3" "" 8 "+3" "2500 (17)" 0 "Holy, Full Body"]
   ["Shielding Ankh" "This ankh, containing a ruby, grants
the bearer +1 to defenses against physical attacks." 8 "+1" "100 (10)" 0 "Holy"]
   ["Amazon Armor" "Specially crafted by the Amazon
smiths and only available on their island. Human
women from the Nile Empire may purchase this
armor at the base price, but for anyone else it costs
much more (Value 17), thanks to its rarity." 12 "+3" "500 (13)" 10 "Fatigues"]])

(def ne-melee
  [["Brass Knuckles" "These shaped, pieces of metal
(often but not always made of brass) fit around
the knuckles. Brass knuckles concentrate the force
of a punch on a smaller area, while reducing the
impact on the puncher. They are small and easily
concealed and favored by thugs and mobster
minions. Attacking with brass knuckles uses an
unarmed combat test instead of melee weapons, and
damage stacks with Perks like Brawler." 15 "+1" "10 (5)" "Small, uses unarmed combat"]
   ["Khopesh" "A khopesh is an ancient Egyptian sickle-
shaped sword, sharpened only on the outside
portion of the curved blade. The shape of the sword
makes it useful for disarming an opponent. When
attempting to disarm, the target gets a –2 penalty
to her Strength test to avoid disarming. Although
khopeshes existed during the Bronze Age, these
khopeshes are made from steel." 15 "+2" "200 (12)" "See description"]
   ["Lasso" "Also known as a lariat, this loop of rope is
thrown around a target and, when pulled, tightens
and restrains the victim. A character with a lasso
can make a grappling attack against a target within
reach, except with melee weapons instead of unarmed
combat (see Grappling in the Combat Options
section in Torg Eternity). Lassos are particularly
favored by Amazons." 7 "+0" "10 (5)" "Reach 10 meters, Grapple"]])

(def ne-ranged
  [["7.92 KAR" "This early assault rifle
is typically issued to shocktrooper veterans,
especially those in special forces units." 20 "14" 21 "50/100/200" "2.5K (17)" "Long Burst"]
   ["KK08 Pistol" "The KK08 is a semi-automatic
pistol assigned to shocktrooper officers and other
soldiers." 20 "13" 11 "10/25/40" "150 (11)" ""]
   ["KK81 Rifle" "The KK81 is a semi-automatic
carbine and is the standard issue weapon for all
shocktrooper infantry." 20 "14" 9 "50/100/200" "300 (12)" ""]
   ["Kocha MG" "This man packed, belt fed,
.30 caliber machine gun is typically assigned to one
shocktrooper per squad who is usually paired with
a second who is in charge of reloading the belt. The
Kocha can only fire Long Bursts. These weapons
are occasionally mounted onto vehicles and if so,
lose the Bulky property. Reloading the weapon
requires a full turn." 20 "14" 210 "100/500/1K" "3K (17)" "Long Burst, Bulky"]
   ["Ray-Gun Pistol" "This futuristic looking pistol replicates
any of the Ray pulp powers—chosen when the
device is created. It is powered with an eternium
splinter (included). It may be reloaded by shaking it
for a turn so long as the splinter remains functional.
Ray-Guns use the energy weapons skill for attacks." 20 "13" 5 "10/20/40" "2K (16)" "Weird Science"]
   ["Webley Revolver" "The Webley is a popular large
caliber revolver with good stopping power. Those
manufactured in the Nile Empire are a touch more
modern, but essentially the same as those found in
Orrorsh." 20 "14" 6 "10/20/40" "280 (12)" ""]
   ["Shuriken" "Only really used by those who know
pulp martial arts or similar disciplines, these
throwing stars are made of steel and are sharp as
a knife. In addition to being used as weapon, they
often are used in tricks as a distraction." 15 "+1" 1 "5/10/15" "10 (5)" "Small, Thrown"]])

(def ay-armor
  [["Bronze" "Bronze armor is normally too bulky
to be of practical use but is a way for physical
Ayslish characters to wear meaningful armor in
the Living Land without contradiction. A character
wearing bronze armor suffers one additional Shock
when he suffers Fatigue." 7 "+2" "400 (13)" 8 "Fatigues +1, Min Str 12, see text"]
   ["Furs" "Popular among Vikings and Outsiders in
areas near the Arctic Circle, this armor is made
from animal pelts stitched together to cover a
human-shaped body. It provides extra protection
against cold weather by making survival tests
against natural cold Favored." 3 "+1" "50 (8)" 12 "Tests vs. natural cold Favored"]
   ["Ring Armor" "Unlike a traditional mail, the metal
rings are sewn onto a fabric or leather basecoat
unconnected. The resulting armor is lighter than
full chain but is bulkier on the body." 12 "+2" "250 (12)" 10 "Min Str 10, Fatigues"]
   ["Scale Mail" "Instead of interlinking metal rings,
small rings are used to interlock metal pieces
resembling scales." 12 "+2" "300 (12)" 9 "Min Str 9, Fatigues"]
   ["Circlet of Protection" "This silver armband counts
as +2 Full Body Armor." 9 "+2" "15K (21)" 0 "Arcane, Full body"]
   ["Enchanted Cloth" "Often used by wizards,
enchanted cloth is frequently a component of
wizard’s robes, and is made from silk of magical
silkworms. It also can be made into an undershirt
and nobles and merchants often wear it under their
clothes at parties—especially weddings." 14 "+1" "1000 (15)" 0 "Enchanted"]
   ["Fey Chain" "Fey armor is a light and enchanted
version similar to elven chain armor that is also
Energy-proof (see page 50) and improves to +5
against one energy type. The most common types
are brownie armor (+5 vs. fire) and cyprium armor
(+5 vs. lightning)." 12 "+2" "5000 (18)" 11 "Enchanted, Torso"]
   ["Holy Vestment" "Each of the Ayslish deities has a
vestment, and it only functions for wearers with at
least one skill add in faith who follow the tenets of
that deity. A holy vestment acts as +1 armor but if
the wearer has the Miracles Perk, that increases to
+2, and becomes +2 Full Body armor if the wearer
also has:
• Vestment of Corba’al: any Darkness Perk
• Vestment of Dunad: any Light Perk
• Vestment of Elmiir: any Elf Perk
• Vestment of Rak: any Outsider Perk
• Vestment of Shali: any Spellcraft Perk" 14 "varies" "3000 (17)" 0 "Holy, see text"]])

(def ay-melee
  [["Ball and Chain" "For most creatures, this is a device
to keep them shackled with limited mobility, but in
the hands of a strong bruiser (such as a giant), this
can be an effective melee weapon. Its massive bulk
enables it to inflict damaging blows despite armor." 8 "+3" "50 (8)" "Unwieldy, Min Str 12, AP 1"]
   ["Giant's Club" "This is little more than a young
tree with its branches and roots stripped off. In the
hands of a giant, this is a brutal weapon." 1 "+4" "10 (5)" "Stagger, Min Str 12"]
   ["Lance" "This sharp pole, usually made from wood,
can only be used effectively when mounted on
an animal or vehicle. If on foot, attacks are at -4
and Disfavored. A lance’s damage is based on the
mount’s Strength, not the wielder’s. On a charge
(e.g. rushing) an attack with a lance gains AP 2." 12 "+3" "250 (12)" "Unwieldy, see text"]
   ["Pick Axe" "A pick axe has a head with a point at
one end and a blade at the other end. It can also be
used to chop or to break ice." 9 "+2" "100 (10)" "Unwieldy, Min Str 8, AP 1"]
   ["Pike" "A pike is a 2 meter long spear designed to
punch through both the armor of knights and the
barding of their horses. A pike can be used to defend
against a charging attack. If a character armed with
a pike takes a Wait action and is charged by a foe
(the foe must rush to engage him) the character
automatically interrupts his foe and attacks first.
The attack is Favored and has AP 2 if the charger is
on a horse or vehicle." 12 "+3" "100 (10)" "Reach 2 meters, see text"]
   ["Rapier" "Favored by swashbucklers and other
lightly armored combatants, this light sword
is designed to take advantage of a distracted
opponent." 14 "+2" "500 (13)" "Quick"]
   ["Aurel Blade" "This sacred, polished steel sword
is made from steel infused with a shard of the
shattered sword, Aurel, and shines with a holy
light that repels creatures of supernatural evil.
Attacks by supernatural evil creatures against the
wielder are Disfavored. Attacks against such a foe
are Favored and a hit inflicts an additional +1BD
damage." 9 "+6" "n/a" "Sacred, see text"]
   ["Darkbringer" "This sword, dedicated to the forces
of Darkness, wants nothing more than to destroy
its counterpart, Lightbringer. It will kill innocents
and lay waste to cities to do so. He who wields
Darkbringer is treated as if having the Frightening
Aspect and Smiling Deceiver Darkness Perks
(see Torg Eternity). If Darkbringer is bonded to a
nonplayer character, he gains the Insidious Special
Ability. Attacks against those with at least one
Light Perk have AP4. Darkbringer’s wielder is
treated as if having at least two Darkness Perks,
even if he doesn’t have any." 9 "+6" "-" "Artifact, see text"]
   ["Elf Longsword" "The first elf longsword was made
by Elmiir himself. While they are powerful for
every race, they confer a special benefit to elves." 9 "+3" "5000 (18)" "Holy, Attacks by elves Favored"]
   ["Fey Sword" "A fey sword is a longsword made by
the fae and imparts energy damage to the weapon:
• Brownie Sword: deals fire damage
• Cinlum Sword: deals ice damage (target loses
2 meters of movement on hit)
• Cyprium Sword: deals lightning damage (AP
2)
• Solium Sword: deals force damage (knocks
defender back 2 meters on hit)" 9 "+3" "10K (20)" "Arcane, Quick, deals energy damage"]
   ["Hammer of Thunder" "This runed hammer sends
foes flying backward a number of meters equal to
any bonus damage rolled. Those who are pushed
into a dangerous area may make a Dexterity test
as a free action to stop just outside. Foes who are
Large or bigger aren’t moved." 9 "+4" "30K (22)" "Arcane, Stagger, Two-Handed, Unwieldy, Beta Clearance, see text"]
   ["Lightbringer" "This Artifact is dedicated to
the Light, and when drawn shines brightly
according to the Aura of Light Perk (see page
16). Additionally, attacks against those with
Darkness Perks have AP4. The wielder of this
sword is treated as if she has at least two Light
Perks, even she personally does not have any. This
does not count for Perk prerequisites. The sword
is intelligent and righteous and wants to defeat
all who fall to Darkness. But above all, it wants to
destroy Darkbringer." 9 "+6" "-" "Artifact, see text"]
   ["Vanquisher's Blade" "A polished steel sword
that repels creatures of supernatural evil. Any hit
against such a foe also makes it Very Vulnerable." 9 "+3" "15K (21)" "Arcane, Beta Clearance, see text"]])

(def ay-ranged
  [["Elf Longbow" "The elf longbow is designed to hold
special arrows that are difficult to remove. The
construction is designed to be used by weaker but
more dexterous elves." 9 "13" 1 "25/40/80" "1000 (15)" "Min Str 7, Wounding"]
   ["Fey Bow" "A fey bow causes arrows fired from it to
transform into energy. These are the most common:
• Brownie bow: Deals 11 fire damage.
• Cyprium bow: Deals 11 lightning damage (AP 4)
• Solium bow: Deals 11 force damage and
characters who take damage from the bow are
Stymied." 9 "varies" 1 "20/50/180" "10K (20)" "Arcane, Min Str 6, Deals energy damage, see text"]])


(def cp-ranged
  [["GWI Devastator" "The Devastator plasma cannon
is a larger, vehicle-mounted version of the GodFire
plasma weapon. Heavy weapons is the skill used to
fire." 26 "20" 5 "20/40/80" "60K (24)" "Heavy Burst, See text"]
   ["GWI God's Fire Plasma" "" 26 "16" 10 "20/40/80" "2000 (16)" "Bulky, Small Blast, Fire, Targets lowest armor"]
   ["GWI GodBeam Laser" "" 26 "14" 15 "100/500/1K" "600 (14)" "Short Burst, AP 1"]
   ["GWI GodLight Laser" "" 26 "14" 5 "50/100/500" "350 (12)" "Small"]
   ["GWI GodMeeter" "" 26 "15" 25 "10/25/40" "450 (13)" ""]
   ["GWI GodSmite" "The GodSmite is the most recent
weapon manufactured by GWI, and currently
is mostly supplied to elite Cyberpapacy Church
Police Paragons. It is a large, high-powered laser
pistol capable of burst fire. It is equipped with
an integral laser sight (see General Gear in Torg
Eternity)." 26 "15" 30 "10/25/40" "1000 (15)" "Short Burst"]
   ["GWI God's Voice" "" 26 "24" 10 "50/150/200" "50K (23)" "Large Blast"]
   ["GWI Light of Creation" "This high powered laser
is equipped with sophisticated tracking sensors
and targeting systems and is primarily used in air
defense. The weapon is entirely powered by the
vehicle or emplacement it is mounted on, but its
use overwhelms its sensors after about one minute
of firing and requires a brief rest to recalculate the
target’s trajectory. This weapon uses heavy weapons
to fire." 26 "28" 5 "6K/-/-" "500K (28)" "Heavy Burst, +4 to hit air vehicles, AP 4"]
   ["MAS God's Wrath" "The God’s Wrath is an
advanced grenade launcher that can rain fire from
the skies. If the gunner is equipped with a TSE
HUD (or similar device) and has access to the local
surveillance cameras or a Scout Drone, he may
shoot over obstacles at targets he cannot even see
directly. Additionally, the launcher can fire in a
Short Burst, firing three grenades of the same type.
This can either grant a +2 bonus to hit or increase
the Blast Radius by one size. The God’s Wrath
can load multiple types of grenades (but MAS
grenades only) which are selectable with a switch.
This weapon uses missile weapons to fire." 26 "grenade" 12 "20/40/80" "600 (14)" "Short Burst"]
   ["MAS Herod IV" "The Herod IV is a bulky
automatic pistol stabilized by internal gyroscopes,
and was one of the first weapons to use a SmartGun
attachment (which comes standard). If fired by
someone who doesn’t have a device to view the
SmartGun data, attacks take a –2 penalty. They are
still frequently used by the Resistance, as they lack
the circuitry to connect with the GodNet and can
be used by anyone without being hacked." 25 "15" 15 "10/25/40" "300 (12)" "-2 to hit if fired without SmartGun feed"]
   ["MAS Storm Shotgun" "" 26 "15" 30 "15/30/45" "500 (13)" "Short Burst"]
   ["MAS AP Grenades" "These fragmentation
grenades break into sharp, hardened spikes when
they explode and are capable of shredding into
light armor." 26 "16" 1 "25/50/-" "100 (10)" "Medium Blast, AP 1"]
   ["MAS Disruptor Grenade" "" 26 "16" 1 "25/50/-" "100 (10)" "Medium Blast, Non-Lethal"]
   ["MAS Tear Gas Grenade" "These grenades release
an orange-colored gas, which burns exposed eyes
and irritates the lungs. If a person is in the area of
effect at the start of their turn, they become Stymied
and Vulnerable unless they are in sealed armor or
their Toughness (without armor) is higher than the
damage. The gas dissipates after 1 minute." 26 "14" 1 "25/50/-" "100 (10)" "Large Blast, see text"]
   ["TL EMP Grenade" "Manufactured only by Tierra
Libre, these grenades are in short supply. When
set off, computers and other electronics within
the area of effect shut down for one round. On
a Good Success that increases to one minute.
Outstanding Success is as Good, but also shuts
down one cyberware or Occultech install for one
minute. EMP grenades only do physical damage
to Tech Constructs, with bonus dice for Good and
Outstanding hits as usual." 26 "16" 1 "25/50/-" "1000 (15)" "Medium Blast, see text"]])

(def cp-melee
  [["GWI Ehud Dagger" "This power dagger is
commonly used by cyberknights who may require
an easily concealed weapon on clandestine
missions." 24 "+2" "220 (11)" "Armor Piercing 1, Small"]
   ["GWI GodHammer" "Although uncommon, this
double-headed power maul is occasionally used
by Inquisitors. Internal gyroscopes allow it to be
used easily despite the apparent imbalance caused
by the large head." 26 "+5" "300 (12)" "Stagger, Two Handed"]
   ["GWI Sword of David" "Also called a power sword,
this longsword is a favored weapon of Inquisitors
and Hospitalers." 24 "+4" "300 (12)" "Armor Piercing 2"]])

(def cp-armor
  [["GWI Armor of God" "" 26 "+4" "1000 (15)" "Max Dex 8, Fatigues, Full Body"]
   ["GWI Destroyer Armor" "" 26 "+4" "3500 (17)" "Max Dex 8, Min Str 12, Fatigues, Full Body, Strength based weapons gain +2 damage"]
   ["GWI HallowMesh" "This armor consists of tightly-
woven kinetic fibers that tighten when hit by a fast-
moving object or burst of energy. It is light enough
to be concealed under clothing and is favored by
cyberknights who need to blend in." 26 "+3" "400 (13)" "Can be concealed under clothing"]
   ["GWI Reflec Armor" "" 26 "+2" "250 (12)" "Max Dex 10, +2 to dodge vs. energy weapons"]
   ["GWI Sanctuary Shield" "When activated, this
medium shield generates a plasma field that at
least partially counteracts armor piercing weapons." 26 "+2" "300 (12)" "Min Str 7, Cancels 2 points of AP"]
   ["GWI Tower of Babel" "" 25 "+3" "200 (11)" "Min Str 8, Painful, may ot move and attack unless Strength 10+"]
   ["TL Liberte" "This thin layer of clothing is interlaced
with circuitry which creates a field that can ground
electrical shocks, such as those from the Tower of
Babel and Church Police riot sticks. The wearer
does not take additional Shock from Painful
electrical weapons." 26 "-" "100 (10)" "Can be concealed under clothing, cancels Painful electrical weapons"]])

(def th-armor
  [["Combat Helmet" "" 23 "+4" "150 (11)" "Max Dex 12, Head only"]
   ["Diffrax Vest" "The limited coverage makes the
Diffrax Vest less effective than plates that cover at
least portions of the user’s arms and legs, but still
better than standard armor when foes are using
energy weapon. Technodemons are especially fond
of Alph projectors of all sizes, which makes Diffrax
a good investment." 25 "+2" "350 (12)" "Max Dex 10, Torso, bonus adds to dodge vs energy weapons"]
   ["Hazmat Suit" "Hazmat suits protect against
toxins, the insidious effects of Occultech, and
are recommended when handling vril. They
don’t protect against radiation itself, but they do
prevent materials from lodging in the wearer’s
skin or clothing, which makes the Strength test
for avoiding the effects of radiation Favored. If
the wearer suffers a Wound the suit’s integrity is
ruined. It still grants basic armor protection, but no
longer provides any special protections." 23 "+1" "1K (15)" "Max Dex 8, Full Body, Min Str 8, Fatigues"]
   ["Junk Armor" "There’s a saying in the Blasted Land:
“make do with what you got.” Junk armor uses
modern materials that weren’t necessarily intended
for protection, but work better than nothing at all.
Junk armor is also exceedingly easy to repair or
replace away from dedicated armorers." 23 "+2" "100 (10)" "Max Dex 10, Min Str 8, Fatigues"]])

(def th-ranged
  [["Alph Blaster" "These heavy pistols are especially
popular among thralls and raiders since they can
be recharged with vril or any other power source,
rather than depending upon scarce ammunition.
Technodemons seldom use pistol style weapons,
favoring their natural weaponry if something gets
close enough for the smaller weapon to become
effective." 25 "13" 30 "10/25/40" "350 (12)" "Pistol"]
   ["Alph Eliminator" "The Eliminator is meant for long
range, single target sniping. It has a large magazine,
but requires a cooldown period between each of its
powerful shots." 25 "18" 30 "250/500/1K" "8000 (19)" "AP 4, Bulky, Reload"]
   ["AN-94 Assalut Rifle" "" 23 "14" 30 "40/80/160" "350 (12)" "Long Burst"]
   ["KSVK Anti-Material" "" 23 "16" 10 "100/1K/2K" "1500 (16)" "AP 4, Bulky"]
   ["Mim-8 Rifle" "This semi-automatic rifle is
essentially a miniature rail gun and fires
bullets to incredibly high velocities. At
short range is can easily penetrate
many types of armor." 25 "14" 20 "50/100/200" "500 (13)" "AP 2 at Short Range"]
   ["Mosin's Rifle" "These hardy
rifles were made in huge
numbers in Russia for
over a century, and use
ammunition that’s still in
common use." 19 "14" 5 "80/160/320" "200 (11)" ""]
   ["MP-443 Grach" "" 22 "13" 15 "10/25/40" "150 (11)" "Pistol"]
   ["Saiga-12 Shotgun" "The Saiga-12 is a fully-
automatic tactical shotgun employed in sport
shooting or urban combat. It has multiple
configurations, including a short-barrel version
that halves its ranges but gives it the Carbine
property (allowing it to be fired in close combat),
and extended magazines or drums that increase
the ammo capacity to 20 or more shots." 23 "14" 12 "10/20/30" "600 (14)" "Short Burst, Shotgun"]
   ["Thav-11 Tactical" "A ballistic sniper rifle that uses the
same standardized, caseless ammunition as the rest
of the Thav line. Usually equipped with a powerful
scope, allowing the shooter to ignore 2 points of
penalties when firing. The action is automatic, and
capable of a high rate of fire when needed." 25 "15" 10 "250/500/1K" "2000 (16)" "See text"]
   ["Alph Beleaguer" "The Beleaguer is a powerful
plasma cannon that shoots charged hydrogen
plasma through an electromagnetic conduit and
slices through most armor as if it wasn't there." 25 "32" 1 "1k/3k/5k" "600K (24)" "AP 12, Energy"]
   ["Alph Exterminator" "Only Dukes and dedicated
Digan weapon platforms equip this heavy brute.
The Exterminator is designed to unload as much
destructive energy into an area in as little time as
possible. It’s capable of selective fire, but that’s a
waste of the weapon’s destructive potential, at
least as far as technodemons are concerned." 25 "16" 50 "100/500/1k" "3500 (17)" "Heavy Burst, Energy"]
   ["Mim Obliterater" "The Obliterater is a man-packed
anti-air launcher that fires a highly accurate and
maneuverable missile. The firer uses an action
to aim at the target and rolls heavy weapons. A
standard success gains a lockon, and the missile
may be fired with another action.
A Good success gives a +2 when the missile is fired,
and an Outstanding success increases the bonus to
+4. The firer may continue trying to lock-on hoping
for the full +4 to the heavy weapons skill once the
missile is finally fired.
The pilot of the target vessel may make an Active
Defense roll to avoid the missile, and adds +4 to his
roll if he has anti-missile countermeasures such as
chaff or jammers.
If the missile still misses, it makes another
attack the following round, but without the
lock-on bonus." 25 "26" 1 "4k/-/-" "50K (23)" "AP 4, See text"]
   ["RPG-32" "Sometimes referred
to as Barkas. The launcher
is an aiming tube
that launches a HEAT
rocket warhead. The
launcher itself is re-
usable. Individual reloads
are $300 (Value 12) if available.
The RPG-32 and similar weapons
have proven indispensable
battling against technodemons,
and are highly prized both
within and outside the
regular military forces that
employ them." 23 "25" 1 "100/250/500" "500 (13)" "AP 4, HEAT"]
   ["Winch Ballista" "This vehicular weapon is
essentially a large, mounted crossbow with metal
arms. A motorized winch draws the bow and
applies high torsion. The ammunition is usually
long metal rods or bolts—easy to make or improvise
in areas where bullets are scarce." 22 "16" 1 "25/50/100" "2000 (16)" "Bulky, Reload"]
   ["F1 Grenade" "" 22 "16" 1 "10/20/30" "100 (10)" "Medium Blast"]
   ["Flashburn Grenade" "A tharkoldu
explosive device that spreads
an incendiary cloud and then
ignites it. The damage affects
a target’s lowest Armor value." 25 "16" 1 "10/20/30" "200 (11)" "Medium Blast, Fire"]
   ["Howler Grenade" "Another technodemon
device that’s been
copied and re-
purposed for use
by both sides.
When a howler
detonates it sends a
shockwave of supernatural
fear—and ungodly noise—
in all directions. Every
soul in a Huge Blast Radius
must test willpower or Spirit
or become Very Stymied. Rather
than testing for individuals
within Mobs, simply make the
entire Mob Stymied. The effect
isn’t selective, but allies’ tests
are Favored if they are
expecting the howler to
erupt." 25 "-" 1 "10/20/30" "200 (11)" "See text, Occultech"]])

(def th-melee
  [["Combat Knife" "" 20 "+1" "50 (8)" "Range 10/20/30"]
   ["Cutting Wheel" "This very heavy melee weapon
features a rapidly spinning grinding wheel, heavy
enough to rip through even armored plating.
Most of the device’s weight comes from its
power source and the mechanisms that
keep the cutter rotating at full speed." 25 "14" "300 (12)" "AP 2, Min Str 10"]])

(def or-armor
  [["Boilerplate Helmet" "The companion piece to the
Boilerplate Hauberk (Torg Eternity), this massive
solid headpiece rests on the wearer’s shoulders
and is made of steel more than six millimeters
thick. The wearer can only see through a thin slit
across the eye-line." 18 "+4" "300 (12)" "Max Dex 6, Min Str 10, Head, Find -2"]
   ["Embroidered Waistcoat" "The multiple reinforced
cloth layers provide some protection, but the
overall style and decoration is still suitable for
fashionable events which might otherwise frown
upon armor." 17 "+1" "350 (12)" "Max Dex 12, Counts as Semi-Formal Attire"]
   ["Sacellum Shield" "Unlike the charms that many
Victorians wear and cling to, the Sacellum Shield
is manufactured and endorsed by the church. It’s
a round plate with the Sacellum cross embossed
upon it, and crafted using cold iron. It’s moderately
effective as a normal shield, but it truly shines
against creatures of the night. If an opponent
is either supernatural evil or has the Cloak of
Darkness property the shield offers +3 to Defenses
instead of the normal +2. This is considered the
same exact bonus provided by ward enemy, so it
doesn’t stack with that miracle." 17 "+2" "500 (13)" "Max Dex 12, Min Str 8, +1 vs supernatural evil or Cloak of Darkness"]
   ["Shrieking Coat" "Shrieking coats are a true oddity,
and considered quite distasteful—bordering on
monstrous—by everyone except monster hunters
who depend on them for survival. They are made
with cured monster hide, but in this case some part
of the monster is still conscious and bound to the
coat. Two eyes are fixed in the back, sometimes
hidden, sometimes not, and a small mouth of a sort.
Usually the coat remains muffled and silent, but it
can still see, and it can still feel. When hit by attacks
the coat may whimper or groan in surprise, and if
someone attacks from behind where the coat can
see it cries out in warning. The effect is surprising
and unsettling when the wearer isn’t expecting it.
The result is if the wearer would be caught Flat-
Footed he counts as Vulnerable instead." 17 "+2" "800 (14)" "Max Dex 10, Magic 14, Torso, Fatigues, Flat Footed becomes Distracted instead"]
   ["Silver Plate" "Silver plate is a set of segmented
armor covering the top of the chest, neck, and
shoulders. Each segment is steel underneath, with
worked and ornamental silver leafed on top. The
effect is striking, and though it doesn’t actually
provide much benefit against lycanthropes it
evokes the Victorian Knights and their associated
heroism even in people who aren’t familiar with
the tales. Tests against Fear are Favored for the
wearer, and for any allies within five meters." 17 "+3" "2500 (17)" "Max Dex 8, Min Str 10, Fatigues, Fear tests Favored within 5 meters"]])

(def or-melee
  [["Silver Dagger" "Don’t leave home without it! The
blade of unalloyed silver is easy to nick and dull in
regular combat, but it’s a literal life-saver in close
combat with a lycanthrope or any other monster
that reacts badly to the pure metal." 17 "+1" "75 (9)" "Thrown, Range 10/20/30"]
   ["Cold Iron Blade" "Also sometimes called a
“pure iron” sword. Thanks to the materials and
techniques used the blade affects ethereal beings.
Cold iron causes too much pain to such beings for
one of them to wield while ethereal!" 17 "+2" "200 (11)" ""]])

(def or-ranged
  [["Martini-Henry" "A classic breach-loaded long
rifle. Some remain in use from Core Earth, and the
Victorians brought many of theirs along as well.
Like the Webley and the Lee-Enfield, these are
identical in both worlds." 17 "14" 1 "50/100/200" "200 (11)" ""]
   ["Revolving Rifle" "Rare on Core Earth, but a staple
of Victoria. These rifles use a cylinder compatible
with the Webley pistol, so parts from one can be
used to repair the other." 18 "14" 6 "50/100/200" "250 (12)" ""]
   ["Derringer" "A small caliber pistol used as a holdout
or backup weapon." 18 "9" 2 "10/20/30" "100 (10)" "Small, Pistol"]
   ["Pepperbox" "Pepperbox is a nickname for a
particular type of holdout pistol with four different
barrels all separately loaded with a break action.
Technically it’s supposed to fire one barrel at a time,
but usually all the barrels trigger at once whether
the firer wants them to or not. A pepperbox always
gains the +2 from a Short Burst, and always uses all
four shots. On a Critical Failure the gun explodes,
dealing its damage to the firer." 18 "9" 4 "10/20/30" "150 (11)" "Small, Pistol, Short Burst only (4 shots)"]
   ["Coach Gun" "A double-barreled break action
shotgun. Both barrels may be triggered at once,
which gives the weapon +1 damage. As an extra
option the shotgun may be “sawed off,” shortening
the barrel to count as a Carbine but long Range
suffers a –6 penalty instead of the usual –4 total." 17 "13" 2 "10/20/30" "100 (10)" "Shotgun"]
   ["24-pounder Cannon" "Breach loading, smooth-bore
cannons named after the weight of the shell they
fire. They fire either Shrapnel Shells or Grapeshot at
close range. A 24-pounder is set in either a wheeled
carriage or on a naval mount affixed to a ship. These
guns can be disassembled, but the barrel and other
parts are too large to transport over rough terrain
without extremely large teams of workers." 17 "21" 1 "100/500/1k" "8K (19)" "AP 2, Reload"]
   ["Mountain Howitzer" "These small field guns are
built to be packed on horses. The wheeled carriage
and barrel can be broken down and carried over
rough terrain, then reassembled for firing. Usually
a gun has a crew of two. Howitzers are deployed
for indirect fire using Shrapnel Shells or Grapeshot
(see Torg Eternity)." 18 "19" 50 "100/500/1k" "6K (19)" "AP 2, Reload"]
   ["Maxim Gun" "A recoil-powered machine-gun
available in small numbers from Gaea and now
being manufactured in some areas of Orrorsh.
Maxim guns have a strong rate of fire and better
reliability than most machine-guns of the era.
Victorians often refer to their Maxims as simply
“the killing machines.”" 18 "15" 250 "-/2k/4k" "6K (19)" "AP 2, Long Burst"]
   ["Punt Gun" "A massive shotgun between one and
two meters long. Technically a person can carry
and fire one, but they are meant to be laid on the
ground or in a small boat." 17 "16" 1 "20/40/60" "2K (16)" "Bulky, Reload, Shotgun, Med Blast"]
   ["Extinguisher Vial" "A glass vial that looks much
like a magical elixir, but is actually filled with fire-
retardant chemicals. It’s meant to be thrown at
burning objects to douse flames or at least make it
harder for the fire to spread." 17 "-" 1 "10/20/30" "100 (10)" "Puts out flames"]
   ["Fuse Bomb" "A handheld version of a Shrapnel
Shell (see Torg Eternity) like those used in most
cannons. The personal version often has a visible,
quick burning fuse. On a Critical Failure the
bomb explodes in the thrower’s hands, dealing its
damage +1BD." 17 "15" 1 "10/20/30" "200 (11)" "Medium Blast"]
   ["Fire Elixir" "An alchemical potion that explodes
into flames once it contacts oxygen. Usually in a
fragile glass container so it can be thrown into a
target and shatter, triggering the effect. Taking the
cap off exposes the mixture to air and sets off the
explosion as well." 18 "15" 1 "10/20/30" "200 (11)" "Magic 14, Small Blast, Fire"]
   ["Harpoon" "A harpoon is a heavy, thrown weapon
made for penetrating the hide of large animals.
Harpoons have a barbed end and stick into the
target if damage exceeds Toughness." 17 "+2" 1 "10/20/30" "75 (9)" "AP 2, Min Str 10"]])