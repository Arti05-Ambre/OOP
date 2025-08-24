package newthis;
class Employee{
	Employee()
	{
		System.out.println("I am in a company employee");
	}
}

class Employee1 extends Employee{
	String empname;
	String empadd;
	int empDOB;
	long empphoneno;
	int empID;
	String empposition1;
	long empsalary1;
	String empeducationbackground;
	long empaccountno;
	int empHomephoneno;
	String empjobDepartment;
	long empjoindate;
	
	 Employee1() {
		
	}


 Employee1(String empname,String empadd) {
	 this();
		this.empname = empname;
		this.empadd = empadd;
		System.out.println("employee name is : "+empname);
		System.out.println("employee addrese is : "+empadd);

	}
 Employee1(int empDOB) {
	    this("ram","Sangamner");
	    this.empDOB = empDOB;
		System.out.println("employee DOB is : "+empDOB);

}
 Employee1(long empphoneno, int empID) {
	 this(2_2_2022);
	    this.empphoneno = empphoneno;
		this.empID = empID;
		System.out.println("employee phone no is : "+empphoneno);
		System.out.println("employee ID is : "+empID);

}
 Employee1(String empposition1, long empsalary1)
 {        this(9960945472L,102);
	    this.empposition1 = empposition1;
		this.empsalary1 = empsalary1;
		System.out.println("employee position is : "+empposition1);
		System.out.println("employee salary is : "+empsalary1);

}
 Employee1(long empaccountno,String empeducationbackground) {
	  this("manager",23000l);
	    this.empaccountno = empaccountno;
		this.empeducationbackground = empeducationbackground;
		System.out.println("employee empaccountno is : "+empaccountno);
		System.out.println("employee  empeducationbackground is : "+ empeducationbackground);

}
 Employee1(String empjobDepartment,int empHomephoneno) 
{
	 this(1212121212l,"Msc(computer sci)");
		this.empjobDepartment = empjobDepartment;
         this.empHomephoneno = empHomephoneno;
		System.out.println("employee empHomephoneno is : "+empHomephoneno);
		System.out.println("employee empjobDepartment is : "+empjobDepartment);

}
 
 Employee1(long empjoindate) {
	 
        this("Computer", 34657821l);
	    this.empjoindate = empjoindate;
		System.out.println("employee empjoindate is : "+empjoindate);

}
}
 
public class Thiswithconstructor {

        public static void main(String[] args)
        {
	Employee1 e1 = new Employee1(23_12_2005l);
        }
}
