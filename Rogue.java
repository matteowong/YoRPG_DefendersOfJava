/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Ye Olde Role Playing Game, Expanded
  2016-11-20*/

class Rogue extends Character{
    public Rogue(String name){
	_name=name;
	_health=90;
	_str=80;
	_def=35;
	_atkRating=0.4;
    }

    public void specialize(){
	_str=115;
	_def=30;
    }

    public void normalize(){
	_str=80;
	_def=35;
    }

    public static String about(){
	return "\tRogue: 90 health, 80 strength, 35 defense, 0.5 attack rating";
    }
}
