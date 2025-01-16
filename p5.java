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