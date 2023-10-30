import java.util.Iterator;

public class Soru5 {

	public static void main(String[] args) {
	
sumFactors(120);
	}

public static int sumFactors(int number) {
int sum=0;
for (int i = 1; i<number;i++) {
	if (number%i==0) {
		
		sum+=i;
		
	}
	
}
       System.out.println(sum);     

return sum;
}



}
