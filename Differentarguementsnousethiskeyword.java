package oopsbasic;

public class Differentarguementsnousethiskeyword {
String empName;
int empId;

public Differentarguementsnousethiskeyword(String n,int i) {
	empName=n;
	empId=i;
} 

void display(){
	System.out.println("Name :"+empName+" id :"+empId);
}

public static void main(String[] args) {
	Differentarguementsnousethiskeyword s1=new Differentarguementsnousethiskeyword("somya", 123);
	s1.display();
}
}
