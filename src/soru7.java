
public class soru7 {

	public static void main(String[] args) {
		
isPerfect(28);
	}
public static int sumFactors(int i) {
	return i;
}
public static boolean isPerfect(int a) {
	if ( a==sumFactors(a)) {
		System.out.println(a+" "+"sayısı mukkemmel bir sayidir");
		return true;
	}
	else {
		System.out.println("sayı mukemmel sayi degildir");
		return false; 
	}
}
}
