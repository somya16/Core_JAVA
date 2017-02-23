package oopsbasic;
class studentdetails{
	int id;      //data member or instance variable
	String name;
void insertRecord(int id,String name){   //initialized a method 
   this.id=id;    //this used to access a instance variable in method
   this.name=name; 
}

void display(){    //method initilaized to display members
	System.out.println(id+"  "+name);
}
}

public class Initializationthroughmethods {
public static void main(String[] args) {    
	studentdetails s1=new studentdetails();   //creating an object of studentdetails
	s1.insertRecord(1, "somya");  //value passing from method
	s1.display();   //displaying data members value
}
}
