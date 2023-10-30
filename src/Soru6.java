
public class Soru6 {

	public static void main(String[] args) {
		
areFriends(220,284);

	}
public static void areFriends(int x, int y) {
	int sum1=sumFactors(x);
	int sum2=sumFactors(y);
	if (sum1==x && sum2==y) {
	System.out.println(x+"ve"+y+"sayıları arkadaş sayılardır");
	}
	else {
	System.out.println(x+"ve"+y+"sayilari arkadas sayilar degildir");
	}
}
public static int sumFactors(int i) {	
return i;
}
}
