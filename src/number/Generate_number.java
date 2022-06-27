package number;


import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Generate_number {

	public static void main(String[] args) {
	
		int max = 500;
		int min = 1;
		Random randNum = new Random();
		 int rn   = ThreadLocalRandom.current().nextInt(min, max + 1);
			
			Set<Integer>mySet = new TreeSet<Integer>();
			while( mySet.size() != 500 ) {
				mySet.add(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
			}
			
			System.out.println(mySet);
			System.out.println("smallest Size of TreeSet: " +mySet.size());
			System.out.println("smallest Size of TreeSet: " +((TreeSet<Integer>) mySet).first());
			Object[]mySetArray = mySet.toArray();
	    	 System.out.println(mySetArray[8]);
	            
			
			
			
		}
	//All of this  below Questions are   Take Home  exam 
	public int GetMax(int[]values) {
		// int number   =  rn.nextInt(100);
		int max = values[0];
		for(int i = 0; i < (values.length-1); i++) {
			
		
		if(values[i]>max) {
			max = values[i];
		
	
		
	}

}
	return max;	
}
	
	public int Multiple(int firstOperand, int secondOperand) {
		
	   return firstOperand*secondOperand;
	}
	
	public int divide(int firstOperand, int secondOperand) {
		//int count = 0;
		if(secondOperand!=0) {
		//	count++;
			
		}
		return firstOperand/secondOperand;
	}
	public int Subtr(int firstOperand, int secondOperand) {// 
		return firstOperand - secondOperand;
	}
	
	public String Add(String firstOperand, int secondOperand) {
		return firstOperand+secondOperand;
	}
	
}
