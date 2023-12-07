class Student{ 
String name; 
String surname; 
int rollNo; 
Student(String studentName, String studentSurname, int studentRollNo){ 
	this.name= studentName; 
	this.surname = studentSurname; 
	this.rollNo= studentRollNo; 
} 
public void getStudentDetails(){ 
	System.out.println("The name of the student is "+ this.name +" "+ this.surname); 
	System.out.println("The roll no of the student is "+ this.rollNo); 
} 
} 
class OOPS{ 
public static void main(String args[]) { 
	 Student student1 = new Student("Vivek", "jadhav" , 20); 
	student1.getStudentDetails(); 
} 
}
