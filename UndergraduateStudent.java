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
public class UndergraduateStudent extends Student {
    private String subject;
    private Integer yearOfEntry;
    
    public UndergraduateStudent(Integer StudentID, String stdFirstName, String stdLastName, Double[] stdMarks, String streetInfo, String city, String postalCode, String province, String country, String subject, Integer yearOfEntry) {
        super(StudentID, stdFirstName, stdLastName, stdMarks, streetInfo, city, postalCode, province, country);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public Integer getYearOfEntry() {
        return yearOfEntry;
    }
    
    public Boolean Graduate() {
        if (Average() > 50) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String s = "";
        
        s += "Type: Undergraduate Student";
        s += "\nSubject: " + subject;
        s += "\nYear Of Entry: " + yearOfEntry;
        s += "\nStudent ID: " + getStudentID();
        s += "\nName: " + getStdFirstName() + " " + getStdLastName();
        s += "\nMarks: (" + Arrays.toString(getStdMarks()) + ")";
        s += "\n-- Address --\n" + getStdAddress().toString();
        
        return s;
    }
}
