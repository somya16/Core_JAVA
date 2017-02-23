package oopsbasic;

public class mainwithinclass {
int id;   //instance variable/data members
String name;

public mainwithinclass() {
 mainwithinclass m1=new mainwithinclass(); //creating an object of mainwithinclass
 System.out.println(m1.id);   //accessing a data member through reference variable
 System.out.println(m1.name);
}
}
