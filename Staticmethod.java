package oopsbasic;

public class Staticmethod {
 int age; //data member or instance variable
 int id;
 static String company = "SONATA"; //static data member or static instance variable
 
 static void details(){  //static method
	 company = "Accenture";//staic data members can be called in static method,we can override static data member
 }
 
 public Staticmethod(int a,int i) { //parameterized constructor
	age=a;
	id=i;
}
 
 void display(){ //display method
	 System.out.println(age+"  "+id+"  "+company);
 }
 
 public static void main(String[] args) {
	Staticmethod.details(); //direct static method called with class name
	Staticmethod s=new Staticmethod(1, 11); //accessing data members through object creation
	Staticmethod s1=new Staticmethod(2, 22);
	
	s.display(); //display values of members exists in object
	s1.display();
}
}
