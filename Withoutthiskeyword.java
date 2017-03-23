package oopsbasic;

public class Withoutthiskeyword {
  String empName;//instance variable or data member
  int empId;
  
  void empDetails(String empName,int empId){
	  this.empName=empName;//this keyword used to indentify instance variable
	  empId=empId; //comparison with this and without this keyword,ambiguity happens
  }
 void displayDetails(){ //display method
	 System.out.println("Employee name :"+empName+" empId :"+empId);
 }
 public static void main(String[] args) {
	Withoutthiskeyword s1=new Withoutthiskeyword(); //create a new object
	Withoutthiskeyword s2=new Withoutthiskeyword();
	s1.empDetails("somya", 1234);//intialization of variables
	s2.empDetails("prasad", 789);
	s1.displayDetails();//calling display method		
	s2.displayDetails();		
}

}
