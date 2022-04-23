/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp2130_assignment_1;

/**
 *
 * @author Dennis
 */
public class Address {
    private String streetInfo;
    private String city;
    private String postalCode;
    private String province;
    private String country;
    
    public Address(String streetInfo, String city, String postalCode, String province, String country){
        this.streetInfo = streetInfo;
        this.city = city;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }
    
    public String getStreetInfo() {
        return streetInfo;
    }
    
    public String getCity() {
        return city;
    }
    
    public String postalCode() {
        return postalCode;
    }
    
    public String province() {
        return province;
    }
    
    public String country() {
        return country;
    }
    
    public String toString(){
        String s = "";
        
        s += "Street Info: " + streetInfo;
        s += "\nCity: " + city;
        s += "\nPostal Code: " + postalCode;
        s += "\nProvince: " + province;
        s += "\nCountry: " + country;
        
        return s;
    }
}
