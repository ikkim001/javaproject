
public class Ex06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//500에서 1000까자의 홀수의 합
		
		int a=0;
		int b;
		
		for(b = 500; b <=1000; b = b + 2) {
			
			a += b;
		}
		System.out.printf("500~100까지의 홀수의 합: %d",a);

	}

}
