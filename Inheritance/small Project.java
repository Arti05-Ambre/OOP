package com.inheritance;

import java.util.Scanner;

class College_1 {
    String CollegeName = "Sahakar Maharshi Bhausaheb Santuji Thorat College of Arts, Science, Commerce, Sangamner";
    int CollegeID = 45098;
    String collegeemail = "smbst234@gmail.com";
    String collegeAddress = "Sangamner tal:- Sangamner";
    String PrincipalName = "Wagh sir";
    void display() {
        System.out.println("\nWelcome to: " + CollegeName + " College Management System");
        System.out.println("College ID: " + CollegeID);
        System.out.println("Email: " + collegeemail);
        System.out.println("Address: " + collegeAddress);
        System.out.println("Principal: " + PrincipalName);
    }
}

class Department extends College_1 {
    String deptName;
    Department(String deptName) {
        this.deptName = deptName;
    }
    void showDepartment() {
        super.display();
        System.out.println("Department: " + deptName);
    }
}

class Course extends Department {
    String courseName;
    Course(String deptName, String courseName) {
        super(deptName);
        this.courseName = courseName;
    }
    void showCourse() {
        this.printCourse();
    }
    void printCourse() {
        System.out.println("Course: " + courseName);
    }
}

class Student_1 {
    int rollNo;
    String name;
    double marks;
    String grade;
    Student_1(int rollNo, String name) {
        this(rollNo, name, 0.0);
    }
    Student_1(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade();
    }
    String calculateGrade() {
        if (marks >= 90) return "A+ (Excellent)";
        else if (marks >= 75) return "A (Very Good)";
        else if (marks >= 60) return "B (Good)";
        else if (marks >= 50) return "C (Average)";
        else if (marks >= 35) return "D (Pass)";
        else return "F (Fail)";
    }
    void showStudent() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", Grade: " + grade);
    }
}

public class SMBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        String dept;
        String course;

        College_1 college = new College_1();
        college.display();

        while (true) {
            System.out.println("\nChoose Department:");
            System.out.println("1. Arts");
            System.out.println("2. Science");
            System.out.println("3. Commerce");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Exiting Program... Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    dept = "Arts";
                    System.out.println("Available Courses: BA, BFA");
                    System.out.print("Enter Course: ");
                    course = sc.next();
                    Course artsCourse = new Course(dept, course);
                    artsCourse.showDepartment();
                    artsCourse.showCourse();
                    manageStudents(sc);
                    break;

                case 2:
                    dept = "Science";
                    System.out.println("Available Courses: BCA, BCS, BSc");
                    System.out.print("Enter Course: ");
                    course = sc.next();
                    Course sciCourse = new Course(dept, course);
                    sciCourse.showDepartment();
                    sciCourse.showCourse();
                    manageStudents(sc);
                    break;

                case 3:
                    dept = "Commerce";
                    System.out.println("Available Courses: BBA, BCom");
                    System.out.print("Enter Course: ");
                    course = sc.next();
                    Course comCourse = new Course(dept, course);
                    comCourse.showDepartment();
                    comCourse.showCourse();
                    manageStudents(sc);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
        System.out.println("\nThank you for using SMBST College Management System!");
    }

    static void manageStudents(Scanner sc) {
        System.out.print("\nEnter number of students to register: ");
        int n = sc.nextInt();
        Student_1[] students = new Student_1[n];
        double totalMarks = 0;
        Student_1 topper = null;

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            students[i] = new Student_1(roll, name, marks);
            totalMarks += marks;
            if (topper == null || students[i].marks > topper.marks) {
                topper = students[i];
            }
        }

        System.out.println("\n--- Student Details with Grades ---");
        for (Student_1 s : students) {
            s.showStudent();
        }

        if (n > 0) {
            double average = totalMarks / n;
            System.out.println("\nAverage Marks of Course: " + average);
            if (average >= 75) System.out.println("Overall Performance: Excellent");
            else if (average >= 60) System.out.println("Overall Performance: Good");
            else if (average >= 40) System.out.println("Overall Performance: Average");
            else System.out.println("Overall Performance: Poor");
            System.out.println("\nTopper of the Course:");
            topper.showStudent();
        } else {
            System.out.println("No students registered!");
        }
    }
}



Output
  Welcome to: Sahakar Maharshi Bhausaheb  Santuji Thorat College of Arts, Science, Commerce,Sangamner College Management System
College ID is: 45098
College Email is: smbst234@gmail.com
College Address is: Sangamaner tal:- Sangamner
Name of the college principal : Wagh sir

Choose Department:
1. Arts
2. Science
3. Commerce
4. Exit
Enter choice: 2
Available Courses: BCA, BCS, BSc, BScMATH, BScBIO, BScPHY, BScCHEM
Enter Course: Bcs

Welcome to: Sahakar Maharshi Bhausaheb  Santuji Thorat College of Arts, Science, Commerce,Sangamner College Management System
College ID is: 45098
College Email is: smbst234@gmail.com
College Address is: Sangamaner tal:- Sangamner
Name of the college principal : Wagh sir
Department: Science
Course: Bcs
Semester 1
Semester 2
Semester 3
Year 1
Year 2
Year 3
Exam Attempt 1
Exam Attempt 2
Facility: Library
Facility: Sports
Facility: Canteen
Facility: Hostel
Implicit Casting (int -> double): 120.0
Explicit Casting (double -> int): 89

Choose Department:
1. Arts
2. Science
3. Commerce
4. Exit
Enter choice: 
