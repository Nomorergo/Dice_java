import  java.util.Random;
class CallDice{

	public static void main(String args[]){

		

		Dice d1 = new Dice();

 		d1.toss();
 		System.out.println("Rolling  Dice1 face of dice 1 is " +d1.face);

		Dice d2 = new Dice();
		
		
		d2.toss();	
 		System.out.println("Rolling  Dice2 face of dice 2 is " +d2.face);


		Dice d3 = new Dice();
	
	
 		d3.toss();
 		System.out.println("Rolling  Dice3 face of dice 3 is " + d3.face);

}
	}





