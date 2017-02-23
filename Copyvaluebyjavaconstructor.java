package oops.concept.programs;

public class Copyvaluebyjavaconstructor {
 int id;   //data members or instance variable
 String name;
 
 Copyvaluebyjavaconstructor(int i,String n) { //parameterized constructor
	id=i;
	name=n;
}
 Copyvaluebyjavaconstructor(Copyvaluebyjavaconstructor c) { //parameterized constructor where previous constructor pass as a parameter
	id=c.id;
	name=c.name;
}
 
 void display(){ //display method
	 System.out.println("[id :"+id+" name :"+name+"]");
 }
 
 public static void main(String[] args) {
	Copyvaluebyjavaconstructor c1 =new Copyvaluebyjavaconstructor(1,"Somya");//creating an object to access members
	Copyvaluebyjavaconstructor c2=new Copyvaluebyjavaconstructor(c1);//creating object to copy value of above object
	c1.display();//displaying value of members
	c2.display();
}
 
}
