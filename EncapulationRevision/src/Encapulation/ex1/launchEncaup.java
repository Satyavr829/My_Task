package Encapulation.ex1;
class Book{
	private int pgNo;
 public void setPgNo(int x) {
	if(x>0) {
	 pgNo=x;
	}else {
		System.out.println("Inavalid deatils provided");
	}
 }
 public int getPgNo() {
	 return pgNo;
 }

}
public class launchEncaup {
public static void main(String[] args) {
	Book b= new Book();
	b.setPgNo(0);
System.out.println(b.getPgNo());
}
}
