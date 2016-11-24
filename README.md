# YoRPG_DefendersOfJava

##Feature additions
- [x] Create a health accessor to print out Monster's and Character's health in Terminal -Angel Ng
- [x] Change archer so that archer has the possibility to attack twice -Matteo Wong
- [x] Change mage so that mage recharges after each specialized attack -Piotr Milewski

##Code restructurings
* Changed attack() so that it now returns a string message rather than an int
* Wrote new print statements in YoRPG to give the player a better visualization of the battle scene
* Added a getHealth() method to return the health of a Character
* Gave Mage subclass a new boolean instance variable recharge for determining whether mage will attack or not

##How to play our game
1. Type in "java YoRPG" to start a new game
2. Pick a difficulty by inputting an integer in the range 1-3
  * The difficulty is specified next to each number
3. Input a string with your name 
4. Pick a class by inputting an integer in the range 1-5
  * The difficulty is specified next to each number
5. Input an integer in the range 1-2 to determine whether you would like to perform a special attack.
  * Inputting 1 will not alter your attack and defense.
  * Inputting 2 will increase your attack but lower your defense
    * If you are a Mage, you will have to recharge after your special attack during the next turn
6. You win if the Monster's health reaches 0 and you lose if your health reaches 0.
7. Good luck!
