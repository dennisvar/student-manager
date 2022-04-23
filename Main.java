/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2130_assignment_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class Main {
    static Main m1;
    static Boolean loop;
    static Boolean eligible = true;
    
    private Student[] studentList;
    private int numStudents;
    
    public Main() {
        studentList = new Student[10];
        numStudents = 0;
    }
    
    public Boolean addUndergraduateStudent(Integer StudentID, String stdFirstName, String stdLastName, Double[] stdMarks, String streetInfo, String city, String postalCode, String province, String country, String subject, Integer yearOfEntry) {
        if (numStudents < 10) {
            studentList[numStudents] = new UndergraduateStudent(StudentID, stdFirstName, stdLastName, stdMarks, streetInfo, city, postalCode, province, country, subject, yearOfEntry);
            numStudents++;
            return true;
        }
        if (studentList[numStudents].Average() > 50) {
            eligible = true;
        }
        return false;
    }
    
    public Boolean addGraduateStudent(Integer StudentID, String stdFirstName, String stdLastName, Double[] stdMarks, String streetInfo, String city, String postalCode, String province, String country, String subject, Integer yearOfEntry, String thesisTopic) {
        if (numStudents < 10) {
            studentList[numStudents] = new GraduateStudent(StudentID, stdFirstName, stdLastName, stdMarks, streetInfo, city, postalCode, province, country, subject, yearOfEntry, thesisTopic);
            numStudents++;
            return true;
        }
        if (studentList[numStudents].Average() > 70) {
            eligible = true;
        }
        return false;
    }
    
    public String viewAllStudents() {
        String s = "";
        s += "-- Student List --";
        
        for (int i = 0; i < numStudents; i++) {
            s += "\n\n" + studentList[i].toString();
        }
        
        return s;
    }
    
    public String viewEligibleStudents() {
        String s = "";
        s += "-- Eligible Student List --";
        
        for (int i = 0; i < numStudents; i++) {
            if (studentList[i] instanceof UndergraduateStudent && studentList[i].Average() > 50) {
                s += "\n\n" + studentList[i].toString();
            }
            if (studentList[i] instanceof GraduateStudent && studentList[i].Average() > 70) {
                s += "\n\n" + studentList[i].toString();
            }
        }
        
        return s;
    }
    
    
    public static void main(String[] args) {   
        m1 = new Main();
        
        loop = true;
        while (loop) {
            runProgram();
        }
    }
    
    static void clearScreen() {
        System.out.println("\u001b[2J");
        System.out.flush();  
    }
    
    static void showMenu() {
        clearScreen();
        System.out.println("---- MENU ----");
        System.out.println("Choose an option from the list.");
        System.out.println("1. Add undergraduate student");
        System.out.println("2. Add graduate student");
        System.out.println("3. View all students");
        System.out.println("4. View all student eligible for graduation");
        System.out.println("5. Exit");
    }
    
    static int getChoice() {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        
        try {
            choice = keyboard.nextInt(); 
        } 
        catch (InputMismatchException exception) {
        }
            
        return choice;
    }
    
    static void runProgram() {
        showMenu();
        int choice = getChoice();
        switch (choice) {
            case 1:
                optionOne();
                break;
            case 2:
                optionTwo();
                break;
            case 3:
                if (m1.studentList[0] == null) {
                    System.out.println("\nThere are no students in the array");
                }
                else {
                optionThree();
                }
                break;
            case 4:
                if (m1.studentList[0] == null || eligible == false) {
                    System.out.println("\nThere are no students in the array");
                }
                else {
                optionFour();
                }                
                break;
            case 5:
                loop = false;
                break;
            default:
                System.out.println("\nThat is not a valid option.");
                break;

        }
    }
    
    static void optionOne() {
//        (Integer StudentID, String stdFirstName, String stdLastName, Double[] stdMarks, String streetInfo, String city, String postalCode, String province, String country, String subject, Integer yearOfEntry)

        String stdFirstName, stdLastName, streetInfo, city, postalCode, province, country, subject;
        Integer StudentID, yearOfEntry;
        Double[] stdMarks;
        
        Scanner keyboard = new Scanner(System.in);
        
        clearScreen();
        
        System.out.println("Enter your student id: ");
        StudentID = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter your first name: ");
        stdFirstName = keyboard.nextLine();
        
        System.out.println("Enter your last name: ");
        stdLastName = keyboard.nextLine();
        
        System.out.println("Enter how many marks you want to enter: ");
        stdMarks = new Double[keyboard.nextInt()];
        int count = 1;
        for (int i = 0; i < stdMarks.length; i++) {
            System.out.println("Enter mark " + count + ":");
            ++count;
            stdMarks[i] = keyboard.nextDouble();
        }
        keyboard.nextLine();
        
        System.out.println("Enter your street address: ");
        streetInfo = keyboard.nextLine();
        
        System.out.println("Enter your city: ");
        city = keyboard.nextLine();
        
        System.out.println("Enter your postal code: ");
        postalCode = keyboard.nextLine();
        
        System.out.println("Enter your province: ");
        province = keyboard.nextLine();
        
        System.out.println("Enter your country: ");
        country = keyboard.nextLine();
        
        System.out.println("Enter the subject your are studying: ");
        subject = keyboard.nextLine();
        
        System.out.println("Enter the year you entered the university: ");
        yearOfEntry = keyboard.nextInt();
        
        if (m1.addUndergraduateStudent(StudentID, stdFirstName, stdLastName, stdMarks, streetInfo, city, postalCode, province, country, subject, yearOfEntry)) {
            System.out.println("Student Added Successfully.");
        }
        else {
            System.out.println("Student Not Added");
        }

    }
    
    static void optionTwo() {
        //Integer StudentID, String stdFirstName, String stdLastName, Double[] stdMarks, String streetInfo, String city, String postalCode, String province, String country, String subject, Integer yearOfEntry, String thesisTopic

        String stdFirstName, stdLastName, streetInfo, city, postalCode, province, country, subject, thesisTopic;
        Integer StudentID, yearOfEntry;
        Double[] stdMarks;
        
        Scanner keyboard = new Scanner(System.in);
        
        clearScreen();
        
        System.out.println("Enter your student id: ");
        StudentID = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter your first name: ");
        stdFirstName = keyboard.nextLine();
        
        System.out.println("Enter your last name: ");
        stdLastName = keyboard.nextLine();
        
        System.out.println("Enter how many marks you want to enter: ");
        stdMarks = new Double[keyboard.nextInt()];
        int count = 1;
        for (int i = 0; i < stdMarks.length; i++) {
            System.out.println("Enter mark " + count + ":");
            ++count;
            stdMarks[i] = keyboard.nextDouble();
        }
        keyboard.nextLine();
        
        System.out.println("Enter your street address: ");
        streetInfo = keyboard.nextLine();
        
        System.out.println("Enter your city: ");
        city = keyboard.nextLine();
        
        System.out.println("Enter your postal code: ");
        postalCode = keyboard.nextLine();
        
        System.out.println("Enter your province: ");
        province = keyboard.nextLine();
        
        System.out.println("Enter your country: ");
        country = keyboard.nextLine();
        
        System.out.println("Enter the subject your are studying: ");
        subject = keyboard.nextLine();
        
        System.out.println("Enter the year you entered the university: ");
        yearOfEntry = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Enter your thesis topic: ");
        thesisTopic = keyboard.nextLine();
        
        if (m1.addGraduateStudent(StudentID, stdFirstName, stdLastName, stdMarks, streetInfo, city, postalCode, province, country, subject, yearOfEntry, thesisTopic)) {
            System.out.println("Student Added Successfully.");
        }
        else {
            System.out.println("Student Not Added");
        }
    }
    
    static void optionThree() {
        clearScreen();
        System.out.println(m1.viewAllStudents());
    }
    
    static void optionFour() {
        clearScreen();
        System.out.println(m1.viewEligibleStudents());
    }
}
