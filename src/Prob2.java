
public class Prob2 {
public static void main(String args[]){
	int sum = 0;
	int lastNumber = 0;
	int newNumber = 1;
	int evenNumber = (lastNumber+newNumber)%2;
	int evenNumber2 = (newNumber+lastNumber)%2;
	
	while(lastNumber <= 4000000 && newNumber <= 4000000){
		lastNumber += newNumber;
		if(lastNumber%2 == 0){
			sum += lastNumber;
			System.out.println(sum);
		}
		newNumber += lastNumber;
		if(newNumber%2 == 0){
			sum += newNumber;
			System.out.println(sum);
		}
	}
	
}
}



