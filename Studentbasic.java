package oopsbasic;


class student{
	int id;   //instance variable/data member
	String name;
	
}
class Studentbasic {
public static void main(String[] args) {
	student s1=new student();    //object creation of student
	System.out.println(s1.id);    //accessing data members through reference variable
	System.out.println(s1.name);
}
}
