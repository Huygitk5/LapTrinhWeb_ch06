/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String heardFrom; // Từ nhóm Radio Buttons: Search engine, Social Media, v.v.
    private String wantAnnouncements; // Checkbox 1: YES, I'd like that.
    private String wantSendEmail; // Checkbox 2: YES, please send me email announcements.
    private String contactMethod; // Từ Dropdown: Email or postal mail
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        heardFrom = "unknown"; // Giá trị mặc định
        wantAnnouncements = "No";
        wantSendEmail = "No";
        contactMethod = "unknown";
    }
    
    public User(String firstName, String lastName, String email, String dateOfBirth, String heardFrom, String wantAnnouncements, String wantSendEmail, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.heardFrom = heardFrom;
        this.wantAnnouncements = wantAnnouncements;
        this.wantSendEmail = wantSendEmail;
        this.contactMethod = contactMethod;
    }
    
        public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getHeardFrom() { 
        return heardFrom; 
    }
    public void setHeardFrom(String heardFrom) { 
        this.heardFrom = heardFrom; 
    }
    
    public String getWantAnnouncements() { 
        return wantAnnouncements; 
    }
    public void setWantAnnouncements(String wantAnnouncements) { 
        this.wantAnnouncements = wantAnnouncements; 
    }

    public String getWantSendEmail() {  
        return wantSendEmail; 
    }
    public void setWantSendEmail(String wantSendEmail) { 
        this.wantSendEmail = wantSendEmail; 
    }

    public String getContactMethod() { 
        return contactMethod; 
    }
    public void setContactMethod(String contactMethod) { 
        this.contactMethod = contactMethod; 
    }
}


