package Static.ex1;

public class Lauchstatic {
	
	static int a,b,c,d;
	static {
		System.out.println("Static block");
		a=10;
		b=19;
		c=33;
		d=66;
	}
	static void disp() {
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	
	}
public static void main(String[] args) {
	
	Lauchstatic.disp();
}
}
