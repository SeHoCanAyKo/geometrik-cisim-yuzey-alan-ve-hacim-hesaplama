import java.util.Scanner;

public class o1 {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		int s; 
		double p=3.14; 
		int r,h,x,z; 
		System.out.print("Kure-> 1\n");
		System.out.print("Silindir-> 2\n");
		System.out.print("Kup-> 3\n");
		System.out.print("Koni-> 4\n");
		System.out.print("Geometri kodunuzu giriniz:");
		s=oku.nextInt();
		switch(s)
		{
			case 1:
			{
				System.out.print("Yaricap giriniz:");
				r=oku.nextInt();
				double b= 4*p*r*r;
				double c= 4/3*p*r*r*r;
				System.out.println("Kurenin yuzey alani: "+b);
				System.out.println("Kurenin hacmi: "+c);
				break;
			}
			case 2:
			{
				System.out.print("Silindir yukseklik giriniz:");
				h=oku.nextInt();
				System.out.print("Yaricap giriniz:");
				r=oku.nextInt();
				double d= 2*p*r*(r+h);
				double e=p*(r*r)*h;
				System.out.println("Silindir yuzey alani: "+d);
				System.out.println("Silindir hacmi: "+e);
				break;
			}
			case 3:
			{
				System.out.print("Kup bir kenarini giriniz:");
				int a=oku.nextInt();
				double f = 6*(a*a);
				double g = a*a*a;
				System.out.println("Kup yuzey alani: "+f);
				System.out.println("Kup hacmi: "+g);
				break;
			}
			case 4:
			{
				System.out.print("yaricap giriniz: ");
				x=oku.nextInt();
				System.out.print("yanal analin yuzeyi giriniz: ");
				z=oku.nextInt();
				System.out.print("yukseklik giriniz: ");
				h=oku.nextInt();
				double y = p*x*(x+z);
				double m = 1/3*p*(x*x)*h;
				System.out.println("koni yuzey alani:"+y);
				System.out.println("koni hacmi: "+m);
				break;
			}
			default:
			{
				System.out.print("girmis oldugunuz deger 1-4 arası degil");
				break;
			}
		}
	}
}