/*Create an interface Department containing attributes deptName and deptHead. It
also has abstract methods display DeptData(). Create a class Hostel containing hostel
Name, hostelLocation and RoomNo. The Hostel class contains methods readHostel
Data() and display Hostel Info() to read and display the hostel informations. Next
create a Student class which extending the Hostel class and implementing the
Department interface. The Student class contains attributes studentName, regdNo,
electiveSubject and avgMarks. Write suitable readStudentInfo() and
displayStudentInfo() methods to read and display the Student details. Now create an
object of Student class to read and display:
(a) Student Information (b) his/her Department Information (c) his/her Hostel Information*/

import java.util.*;
interface Department{
	String deptName="CSE";
	String deptHead="AP";
	void displayDeptData();
}
class Hostel{
	String hostelName,hostelLocation,RoomNo;
	void readHostelData(String hn, String hl, String rn){
		hostelName = hn;
		hostelLocation = hl;
		RoomNo = rn;
    }
	void displayHostelInfo(){
		System.out.println("Hostel name: "+hostelName);
		System.out.println("Hostel Location: "+hostelLocation);
		System.out.println("Room no: "+RoomNo);
	}
}
class Student extends Hostel implements Department{
	String studentName,electiveSubject; int regNo; float avgMarks;
	void readStudentInfo(String n, String e, int r, float a, String hn, String hl, String rn){
		super.readHostelData(hn,hl,rn);
		studentName = n; electiveSubject = e; regNo = r; avgMarks = a;
	}
	void displayStudentInfo(){
		System.out.println("Student name: "+studentName);
        System.out.println("Elective subject: "+electiveSubject);
        System.out.println("Reg. No: "+regNo);
		System.out.println("Average marks: "+avgMarks);
	}
	public void displayDeptData(){
		System.out.println("Department name: "+deptName);
                System.out.println("Department Head: "+deptHead);
	}
}
public class p5{
	public static void main(String args[]){
		Student s = new Student();
		s.readStudentInfo("Sagnik","AI",221070119,70f,"3rdYearHostel","Besidesstaffsonlygate","G101");
		s.displayStudentInfo(); System.out.println();
		s.displayDeptData(); System.out.println();
		s.displayHostelInfo();
	}
}