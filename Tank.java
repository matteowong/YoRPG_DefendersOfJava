/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Tank extends Character{

    //default constructer for class tank
    //pre: takes a String for name
    //post: instantiates Tank's instance variables
    public Tank(String name){
	_health=150;
	_str=80;
	_def=50;
	_atkRating=0.3;
	_name=name;
    }

    public void specialize(){
	_str=98;
	_def=43;
    }

    public void normalize(){
	_str=80;
	_def=50;
    }

    public static String about(){
	return "\tTank: 150 health, 80 strength, 50 defense, 0.3 attack rating\n";
    }
}
