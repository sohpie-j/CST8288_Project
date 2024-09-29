package com.algonquin.cst8288.fall24.assignment1.patient;

/**
 * @author KyungA Jang
 * @class Outpatient
 * super class: Patient
 */

public class Outpatient extends Patient {
	
    private String appointmentDate;

    public Outpatient(String id, String name, String email, String phoneNumber, String dateOfBirth, String appointmentDate) {
        super(id, name, email, phoneNumber, dateOfBirth);
        this.appointmentDate = appointmentDate;
    }

    /*
    * getAppointmentDate
    * @return: appointmentDate
    */
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /*
    * @description: Implementation for admitting an outpatient.
    * @return: UnsupportedOperationException();
    */
    @Override
    public void admit() {
           
        throw new UnsupportedOperationException("Unexpcted error occurred");	
	
    }
      
}

