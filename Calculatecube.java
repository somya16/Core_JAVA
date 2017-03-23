package oopsbasic;

public class Calculatecube {
static int cal(int x){ //static method
	return (x*x*x);
}

public static void main(String[] args) {
 int r =Calculatecube.cal(2);
 System.out.println(r);
}
}
