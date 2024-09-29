package com.algonquin.cst8288.fall24.assignment1.patient;

/*
* @author:KyungA Jang
* @class: Inptient
* @super type: Patient
*/
public class Inpatient extends Patient {

    private final String roomNumber;

    /*
    * Inpatient
    * @param: id, name, email. phoneNumber, dateOfBirth, roomNumber
    * constructing the super class patient
    */
    public Inpatient(String id, String name, String email, String phoneNumber, String dateOfBirth, String roomNumber) {
        super(id, name, email, phoneNumber, dateOfBirth);
        this.roomNumber = roomNumber;
    }

    /*
    * getRoomNumber
    * @return: roomNumber
    */
    public String getRoomNumber() {
        return roomNumber;
    }

    /*
    * admit
    * @override
    */

    @Override
    public void admit() {
            System.out.println(getName() + " has been admitted to " + getRoomNumber());

    }
}
