/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2130_assignment_1;

import java.util.Arrays;
/**
 *
 * @author Dennis
 */
public class Student {
    private Integer StudentID;
    private String stdFirstName;
    private String stdLastName;
    private Double[] stdMarks;
    private Address stdAddress;
    
    public Student(Integer StudentID, String stdFirstName, String stdLastName, Double[] stdMarks, String streetInfo, String city, String postalCode, String province, String country) {
        this.StudentID = StudentID;
        this.stdFirstName = stdFirstName;
        this.stdLastName = stdLastName;
        this.stdMarks = stdMarks;
        stdAddress = new Address(streetInfo, city, postalCode, province, country);
    }
    
    public Integer getStudentID() {
        return StudentID;
    }
    
    public String getStdFirstName() {
        return stdFirstName;
    }
    
    public String getStdLastName() {
        return stdLastName;
    }
    
    public Double[] getStdMarks() {
        return stdMarks;
    }
    
    public Address getStdAddress() {
        return stdAddress;
    }
    
    public Double Average() {
        double average;
        double total = 0;
        
        for (int i = 0; i < stdMarks.length; i++){
            total = total + stdMarks[i];
        }
        
        average = total / stdMarks.length;
        return average;
    }
    
    public String toString() {
        String s = "";
        
        s += "Student ID: " + StudentID;
        s += "\nName: " + stdFirstName + " " + stdLastName;
        s += "\nMarks: (" + Arrays.toString(stdMarks) + ")";
        s += "\nAddress: " + stdAddress.toString();
        
        return s;
    }    
}
