package oops.concept.programs;

public class Staticvariable {
int emp_id;  //data member or instance variable
String emp_name;
static String company = "SONATA";  //static variable 

  Staticvariable(int e_id,String e_name){ // passed two arguement to method
	emp_id=e_id;
	emp_name=e_name;
}

void displayemployeedetails(){ // display method with all members
	System.out.println("[emp_id :"+emp_id+", emp_name :"+emp_name+", company: "+company+"]");
	}

public static void main(String[] args) {

	Staticvariable s=new Staticvariable(12, "somya"); // creating an object
	s.displayemployeedetails(); //accessing all members through method
 }
}
