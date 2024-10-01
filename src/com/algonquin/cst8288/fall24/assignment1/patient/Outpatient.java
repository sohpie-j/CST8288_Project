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

    public void scheduleAppointment() {
        System.out.println(getName() + " has an appointment on " + getAppointmentDate());
    }

}

