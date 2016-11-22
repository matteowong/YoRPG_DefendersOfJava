/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Monster extends Character{
    
    //default constructor for class Monster
    //pre: nothing
    //post: instantiates a Monster with attributes reset, _str is random
    public Monster() {
	_health=150;
	_str=(int)(Math.random() * 45 + 20);
	_def=20;
	_atkRating=1;	
    }
    
    public String getName(){
	return "smaug";
    }

    public static String about(){
	return "\tMonster: 150 health, [20,45) strength, 20 defense, 1 _atkRating";
    }

    //defined normalize() and specialize() so monster() didnt need to be abstract
    public void normalize() {
    }
    public void specialize(){
    }
    
}
