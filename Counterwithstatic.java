package oopsbasic;

public class Counterwithstatic {
static int count=0; //get memory once and retain a same value

public Counterwithstatic() {
	count++; //count=1,2,3
	System.out.println(count);
}

public static void main(String[] args) {
Counterwithstatic c=new Counterwithstatic();
Counterwithstatic c1=new Counterwithstatic();
Counterwithstatic c2=new Counterwithstatic();
}
}
