package oops.concept.programs;

public class Copyvaluewithoutconstructor {
int id; //data member or instance variable
String name;

void assignvale(int i,String n){ //method to assign members
  id=i;
  name=n;
}

 void display(){ //display method
	 System.out.println("[id :"+id+", name :"+name+"]");
 }
 
 public static void main(String[] args) { 
	Copyvaluewithoutconstructor c=new Copyvaluewithoutconstructor();//object created to access members
	Copyvaluewithoutconstructor c1=new Copyvaluewithoutconstructor();
	c.assignvale(1, "somya");//value asssigned to members
	c1.id=c.id;//copy a member of c object to member of c1 object
	c1.name=c.name;
	c.display(); //display member values
	c1.display();
	}
}
