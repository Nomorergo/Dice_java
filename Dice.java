import  java.util.Random;
class Dice {

	static int count; // number of dices created
	
	byte face;
	
	public void Dice(){
		
		toss();
	}

	void toss(){
		Random randNum = new Random();

		int x = randNum.nextInt() % 6;
		if (x < 0)
			x = -x;
		face = (byte) ++x;

	}


}