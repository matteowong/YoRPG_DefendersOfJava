/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Archer extends Character{
    public Archer(String name){
	_name=name;
	_health=107;
	_str=60;
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






     public String attack(Character a){
	int d= (int)(_str * _atkRating) - a.getDefense();
	if (Math.random()<0.5) {d=d*2;}
	if (d<0) {d=0;}
	a.lowerHP(d);
	String retStr="damage twice, each time hitting for "+d/2;
	return retStr;
    }

}
