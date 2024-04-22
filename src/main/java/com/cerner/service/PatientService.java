package com.cerner.service;

import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.cerner.model.Patient;

public class PatientService {

	static HashMap<Integer, Patient> personMap = getPatientMap();

	private static HashMap<Integer, Patient> getPatientMap() {

		return personMap;
	}

	public PatientService() {
		super();

		if (personMap == null) {
			personMap = new HashMap<Integer, Patient>();
			// Creating some object of patient while initializing
			Patient patient1 = new Patient(1, "Swagat", "male", new Date(), "Marathahali", false);
			Patient patient2 = new Patient(2, "Swati", "female", new Date(), "Marathahali", false);
			Patient patient3 = new Patient(3, "Sip", "male", new Date(), "Marathahali", false);
			Patient patient4 = new Patient(4, "Manu", "male", new Date(), "Marathahali", false);

			personMap.put(1, patient1);
			personMap.put(4, patient2);
			personMap.put(3, patient3);
			personMap.put(2, patient4);
		}
	}

	public List<Patient> getAllPatients() {
		List<Patient> totalPatient = new ArrayList<Patient>(personMap.values());
		return totalPatient;
	}

	public Patient getPatient(int id) {
		Patient patient = personMap.get(id);
		return patient;
	}

	public Patient addPatient(Patient person) {
		person.setpId(personMap.size() + 1);
		personMap.put(person.getpId(), person);
		return person;
	}

	public Patient updatePatient(Patient person) {
		if (person.getpId() <= 0)
			return null;
		personMap.put(person.getpId(), person);
		return person;

	}

	public void deletePatient(int id) {
		personMap.remove(id);
	}

}
