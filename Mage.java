/*Team Roster: Piotr Milewski, Matteo Wong, Angel Ng
  Team Name: DefendersOfJava
  APCS1 pd1
  HW32 -- Yo Olde Role Playing Game, Expanded
  2016-11-20*/

class Mage extends Character{

    private boolean _recharge;

    public Mage(String name){
	_name=name;
	_health=100;
	_str=140;
	_def=30;
	_atkRating=0.7;
	_recharge=false;
    }

    public void recharge(){
	if (_recharge){
	    _str = 0;
	    System.out.println("Mage is recharging");
	    _recharge = false;
	}
    }
    
    public void specialize(){
	_str=170;
	_def=5;
	recharge();
	_recharge = true;
    }
    public void normalize(){
	_str=140;
	_def=30;
	recharge();
    }

    public static String about(){
	return "\tMage: 100 health, 95 strength, 30 defense, 0.7 attack rating";
    }
}
