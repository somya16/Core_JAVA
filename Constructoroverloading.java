package oopsbasic;

public class Constructoroverloading {
int id; //data members or instance variable
String name;
int age;

Constructoroverloading(int i,String n) {  //constructor with two parameter
	id=i;
	name=n;
}

Constructoroverloading(int i,String n,int a) { //constructor with 3 parameter
	id=i;
	name=n;
	age=a;
 }

void display(){  //display method
	System.out.println("[id :"+ id +", name :"+name +", age :"+age+"]");
}

public static void main(String[] args) {
	Constructoroverloading c=new Constructoroverloading(1, "Somya"); //object created to access members
	Constructoroverloading c1=new Constructoroverloading(11, "ILU", 2);
	c.display();
	c1.display();
}
}
