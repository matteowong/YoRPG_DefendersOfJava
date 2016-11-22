/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Warrior extends Character{
    private String _name;

    //default constructor for class Warrior
    //pre: takes a String for name
    //post: instantiates instance variables
    public Warrior(String name){
	_health=125;
	_str=100;
	_def=40;
	_atkRating=0.4;
	_name=name;
    }

    public void specialize(){
	_str=117;
	_def=23;
    }

    public void normalize(){
	_str=100;
	_def=40;
    }
    
    public static String about(){
	return "\tWarrior: 125 health, 100 strength, 40 defense, 0.4 attack rating\n";
    }
}
