package com.algonquin.cst8288.fall24.assignment1.management;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.algonquin.cst8288.fall24.assignment1.patient.Patient;

/**
 * The patient management class  used by Physicians to perform multiple tasks.
 * 
 */

public class PatientValidator {

	
	/**
	 * Validate patient data
	 * 
	 * @param patient
	 * @return
	 */

	public boolean validatePatientData(Patient patient) {
		if (!isValidName(patient.getName())) {
			return false;
		}
		patient.setName(patient.getName().trim());

		if (!isValidAlphaNumeric(patient.getName())) {
			return false;
		}
		if (patient.getEmail() == null || patient.getEmail().trim().length() == 0) {
			return false;
		}
		patient.setEmail(patient.getEmail().trim());
		if (!isValidEmail(patient.getEmail())) {
			return false;
		}
		
		if(!isValidPhone(patient.getPhoneNumber())) {
			return false;
		}

		return true;
	}

        /*
        * isValidName
        * @param String value
        * @return
        */
	private boolean isValidName(String value) {
		return value != null && value.trim().length() > 0;
	}

        /*
        * isValidAlphaNumeric
        * @param String value
        * @return
        */
	private boolean isValidAlphaNumeric(String value) {
		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
		Matcher matcher = pattern.matcher(value);
		return !matcher.find();
	}

        /*
        * isValidEmail
        * @param String value
        * @return
        */
	private boolean isValidEmail(String value) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}

        /*
        * isValidPhone
        * @param String value
        * @return
        */
	private boolean isValidPhone(String value) {
		Pattern pattern = Pattern.compile("^\\+?[0-9. ()-]{7,25}$");
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}
}



