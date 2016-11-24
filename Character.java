/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

public abstract class Character {
    protected int _health;
    protected int _str;
    protected int _def;
    protected double _atkRating;
    protected String _name;

    //public isAlive
    //pre: called by a Character
    //post: returns if Character has health
    public boolean isAlive(){
	return _health>0;
    }

    //accessor for _name
    public String getName(){
	return _name;
    }
    
    //accessor for _def
    public int getDefense(){
	return _def;
    }

    //accessor for _health
    public int getHealth(){
	return _health; 
    }

    //lowerHP
    //pre: takes an int
    //post: lowers HP by the int
    public void lowerHP(int a){
	_health -= a;
    }

    //attack
    //pre: takes a Character
    //post: lowers Character's health by a certain amount and returns the damage dealt
    public String attack(Character a){
	int d= (int)(_str * _atkRating) - a.getDefense();
	if (d<0) {d=0;}
	a.lowerHP(d);
	String retStr = "" + d;
	return retStr;
    }

    
    public abstract void specialize();

  
    public abstract void normalize();

    public static String about(){
	String retStr= "\tWarrior: 125 health, 100 strength, 40 defense, 0.4 attack rating\n";
	retStr+="\tMage: 100 health, 95 strength, 30 defense, 0.7 attack rating\n";
	retStr+="\tTank: 150 health, 80 strength, 50 defense, 0.3 attack rating\n";
	retStr+="\tRogue: 90 health, 80 strength, 35 defense, 0.5 attack rating\n";
	retStr+="\tArcher: 107 health, 90 strength, 40 defense, 0.6 attack rating\n";
	return retStr;
	}


}
