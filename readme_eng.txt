Hi! It's a 3-d cube-based strategy. You can build map in creative mode or try game mode.
In game mode you can win, protecting your HQ and defeating opponent's HQ.
Units can receive orders to move to location, but they attack on their own will.
You can load the same map in different modes, but you cannot win/loose in creative.
You can add new maps, adding them to game's folder. Maybe you would like to copy an orig. map.
__1024*768 or 800*600 resol. is good. Requires JRE7+, Windows XP+. (Coord. are displayed z,y,x).
Physics: rock arch 1-2 (block) wide, columns 1-2 tall or becomes gravel, which slides and falls.
__ F9 - new map; height 2-12; width&length 15 - 40 (?). No blocks in sky and peak z (height) lvl.
__ F10 - quick load, F12 - quick save. may require click on menu after done. F11 - menu.
Save/load from map.txt in the same folder (will create new if absent).
NOTE! While quick saving, it will create/rewrite map.txt with current map.
To save map and start new, try 'save as in options'.
__Esc - quit. Left, Right, Up, Down or Mouse move close to screen borders - scroll x&y.
Page Up/Down or Mouse Scroll - scroll height. Backspace - top view. Space - bottom slice.
0-9 show slice levels. |-| (minus) peak lvl (top for gr. units). |=| (equals) sky lvl.
Insert - switch tunnel view. z - undo. o - switch borders. p - switch physics.
F1 - set brush rock . F2 - gravel. (1 and 2 in save map). F3 - engineer pl1. F4- zeppelin pl1. 
F5 - brush void. F6 - fill map with brush. F7 - switch brush between 1*1*1 and custom.
F8 - set new brush size. zyx not more 12, and single minus index for set a unit/bld.
In creative mode single minus index for deploying units via brush. For example, -3 pl1 engineer
Pl2 units are index+2000, 2003 for engineer pl2. Buildings pl1 start from 1000,  from 3000 to pl2
3 - engineer, 4 zeppelin, 5 air def, 6 mortar, 7 gun car, 8 tank, 9 heavy howitzer for pl1
1003 and 3003 HQ for pl1 and pl2. 1005 air def, 1006 mortar, 1007 gun bld, 1008 barracks pl1.
Mortars and howitzer units and bld have +1 range for every 3 blocks height.
Mortars and howitzer can shoot (parabolic) if target and shooter don't have blocks upwards.
Guns shoot directly, so they can shoot underground, but not in big elevation (+/-1).
4001 for neutral medic (not on peak), heals all close units. Engineer repairs close allied buildings.
4007 for neutral car (all gaia are not on peak).
For engineer select building or dig with LMB or RMB, and RMB on close blocks on map to build.
1001/3001 mine on resource site (small transp. green oval). The deeper - the greater income.
One mine for one source only, if hammer is white, mine is working.
998000+ for rock types, 999000+for gravel types.
 Last 3 nums - special block, (i.e. 998001/999001 - gives recourses in this coordinates.)
Left mouse button (LMB) - use selected brush; Right MB (RMB) - erase (void, delete).
__In windowed mode MouseMove scroll the map may not work.
x - brush select (-1) (when units selected, Right Mouse button to move to the point on screen).
When brush is <select> (-1), drag LMB for box selection. Only zeppelins are selected in sky slice.
c - deselect (or click non-unit blocks with Left Mouse button). d - dig/build switch to engineer.
rock 1 digs behind the engineer's direction.
v - units/bld list with coord. s - stop selected units. a - select all units.
b - test step cycle. n - switch on|off timer. Delete - erase selected units.
h - hold fire, f - fire at will for selected units and buildings.
g - ground attack permission for selected units (zeppelins and (RMB -target of heavy howitzers)).
Upper the map money is shown, under menu button - quantity of units, buildings, fire bld, HQ.
options.txt will be created in the same folder. If need, adjust it before starting program.
12 blocks on screen row; for 1024*786 d =64 (768/12) (block size in pix); for 800*600 d = 50.;
_Best, OlegTim

After compiling *.java files (with manifest) to *.jar, you have quite independent file:
map.txt and option.txt would be generated, if nessesary.
You can copy (or create) new maps in the game folder.
//Intellij Idea compiles fine, via console maybe more complicated.
/*
path C:\Program Files (x86)\java\jdk1.7.0\bin
cd c:\1
jar cmf manif.txt  Sol.jar *.class
*/
 