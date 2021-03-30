import java.util.Random;


public class ComputeMethods5026201017 {
    
    public double fToC(double degreesF){
	double degreesC = (degreesF-32)*5/9;
	System.out.println("Temp in celcius is "+degreesC);
	return degreesC;
    }

    public double hypotenuse(int a, int b) {
	double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	System.out.println("Hypotenuse is "+c);
	return c;
    }

    public int roll(){
	Random dice = new Random();
	int dice1 = dice.nextInt(6) + 1;
	int dice2 = dice.nextInt(6) + 1;
	int diceSum = dice1 + dice2;
	System.out.println("The sum of the dice values is "+diceSum);
	return diceSum;
    }

}

