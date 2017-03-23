 package oopsbasic;

public class Counterwithoutstatic {
 int count=0; //instance variable

public Counterwithoutstatic() {
	count++; //count=1,1,1,1
	System.out.println(count);
}

public static void main(String[] args) {
Counterwithoutstatic c=new Counterwithoutstatic(); //count incremented as 1 with new creation of object
Counterwithoutstatic c1=new Counterwithoutstatic();
Counterwithoutstatic c2=new Counterwithoutstatic();
 }
}
