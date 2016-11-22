/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Mage extends Character{

    public Mage(String name){
	_name=name;
	_health=100;
	_str=95;
	_def=30;
	_atkRating=0.7;
    }

    public void specialize(){
	_str=120;
	_def=5;
    }
    public void normalize(){
	_str=95;
	_def=30;
    }

    public static String about(){
	return "\tMage: 100 health, 95 strength, 30 defense, 0.7 attack rating";
    }
}
