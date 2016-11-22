/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Archer extends Character{
    public Archer(String name){
	_name=name;
	_health=107;
	_str=90;
	_def=40;
	_atkRating=0.6;
    }

    public void specialize(){
	_str=107;
	_def=20;
    }

    public void normalize(){
	_str=90;
	_def=40;
    }

    public static String about(){
	return "\tArcher: 107 health, 90 strength, 40 defense, 0.6 attack rating";
    }
}
