
public class Prob1 {
	public static void main(String args[]){
		int number = 1;
		int sum = 0;
		while(number <= 999){
			
			if(number %3 == 0){
				sum += number;
				System.out.println(sum);
			}
			else if(number %5 == 0){
				sum += number;
				System.out.println(sum);
			}
			number ++;
			
		}
	}
}
