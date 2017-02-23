package oopsbasic;

 class student1{
	 int id;     //instance variable or data members
	 String name;
 }
public class Initializationthroughreferncevariable {
  public static void main(String[] args) {
  student1 s1=new student1();  //creating an object of student1
  student s2=new student();
  s1.id=4;   //initialization through reference variable
  s1.name="somya";
  s2.id=5;
  s2.name="ilu";
  System.out.println(s1.id+"  "+s1.name);//accessing data from refernce variable
  System.out.println(s2.id+"  "+s2.name);
  }
}
