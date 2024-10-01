package com.algonquin.cst8288.fall24.assignment1.patient;

import com.algonquin.cst8288.fall24.assignment1.prescription.Prescription;

/**
 * Patient class that holds all patient data. 
 * @author KyungA Jang
 * @param 
 */

public abstract class Patient {
	
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private long age;
    private String lifeStage;
    private String plannedTreatment;
    private Prescription prescription;

    
    /**
     * @contructor 
     * @param: id, name, email, phoneNumber, dateOfBirth
     */
    public Patient(String id, String name, String email, String phoneNumber, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * getId--
     * @desciption: Getter for ID 
     * @return: id
     */
    public String getId() {
        return id;
    }

    /**
     * getName
     * @desciption: Getter for Name 
     * @return: name
     */
    public String getName() {
        return name;
    }

    /**
     * getEmail
     * @desciption: Getter for email 
     * @return: email
     */
    public String getEmail() {
        return email;
    }

    /**
     * getPhoneNumber
     * @desciption: Getter for getPhoneNumber
     * @return: phoneNumber
     */
    public String getPhoneNumber() {
	return phoneNumber;
    }

    /**
     * setId
     * @desciption: Setter for setId
     * @param: String id
     */
    public void setId(String id) {
        this.id = id;
    }

    
    /**
     * setName
     * @desciption: Setter for setName
     * @param: String name
     */
    public void setName(String name) {
            this.name = name;
    }

    
    /**
     * setEmail
     * @desciption: Setter for dateOfBirth
     * @param: String email
     */
    public void setEmail(String email) {
            this.email = email;
    }

    
    /**
     * setPhoneNumber
     * @desciption: Setter for setPhoneNumber
     * @param: String phoneNumbe
     */
    public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
    }

    
    /**
     * getDateOfBirth
     * @desciption: Getter for dateOfBirth
     * @return: dateOfBirth
     */
    public String getDateOfBirth() {
            return dateOfBirth;
    }

    /**
     * setDateOfBirth
     * @desciption: Setter for dateOfBirth
     * @param: String dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
    }

     /**
     * getAge
     * @desciption: Getter for age
     * @return: age
     */
    public long getAge() {
            return age;
    }

   /**
     * setAge
     * @desciption: Setter for age 
     * @param: long age
     */
    public void setAge(long age) {
            this.age = age;
    }

    /**
     * getLifeStage
     * @desciption: Getter for lifeStage
     * @return: lifeStage
     */
    public String getLifeStage() {
            return lifeStage;
    }

    /**
     * setLifeStage
     * @desciption: Setter for setLifeStage 
     * @param: String lifeStage
     */
    public void setLifeStage(String lifeStage) {
            this.lifeStage = lifeStage;
    }

    /**
     * getPrescription
     * @desciption: Getter for Planned Treament 
     * @return: prescription
     */
    public Prescription getPrescription() {
            return prescription;
    }

    /**
     * setPrescription
     * @desciption: Setter for Prescription Details 
     * @param: Prescription prescription
     */
    public void setPrescription(Prescription prescription) {
            this.prescription = prescription;
    }

    /**
     * setPlannedTreatment
     * @desciption: Getter for PlannedTreatment
     * @return: String plannedTreatment
     */
    public String getPlannedTreatment() {
            return plannedTreatment;
    }


    /**
     * setPlannedTreatment
     * @desciption: Setter for PlannedTreatment
     * @param: String plannedTreatment
     */
    public void setPlannedTreatment(String plannedTreatment) {
            this.plannedTreatment = plannedTreatment;
    }


    /**
     * @desciption: Abstract admit 
     */
    //public abstract void admit();
      
}




