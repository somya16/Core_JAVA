package oopsbasic;

public class Parameterizedconstructor {
 int id;    //data member or instance variable
 String name;
 
 Parameterizedconstructor(int id, String name) { //parameterized constructor
	this.id = id;
	this.name = name;
}
  void dispaly(){  //method to display
	  System.out.println(id +"  "+name);
  }
 
  public static void main(String[] args) {
	Parameterizedconstructor p=new Parameterizedconstructor(1,"somya");//initializing different values to distinct objects
	Parameterizedconstructor p1=new Parameterizedconstructor(2,"ILU");
	p.dispaly();
	p1.dispaly();
  }
}
