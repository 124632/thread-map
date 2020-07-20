package com.xworkz.java.Map.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.xworkz.java.Map.Doctor;
import com.xworkz.java.Map.Patient;

public class HashMapDemo {
	public static void main(String[] args) {
		Doctor asha = new Doctor("Asha","Java",5);
		Doctor omkar = new Doctor("Omkar","Framework",10);
		Doctor devandra = new Doctor("Devandra","J2EE",3);
		Doctor varun = new Doctor("Varun","SQL",6);
		Doctor pavan = new Doctor("Pavan","Project",4);
		
		Patient deepak = new Patient("Deepak","Java",22);
		Patient kartik = new Patient("Kartik","Java",23);
		Patient kavya = new Patient("Kavya","Framework",22);
		Patient divya = new Patient("Divya","Framework",21);
		Patient jyothi = new Patient("Jyothi","J2EE",23);
		Patient gaye = new Patient("Gaye","J2EE",22);
		Patient sushu = new Patient("Sushu","SQL",21);
		Patient pooja = new Patient("Pooja","SQL",24);
		Patient seema = new Patient("Seema","Framework",22);
		Patient ashwitha = new Patient("Ashwitha","Framework",22);

		Set<Patient> javaPatients = new HashSet<Patient>();
		javaPatients.add(deepak);
		javaPatients.add(kartik);
		
		Set<Patient> frameworkPatients = new HashSet<Patient>();
		frameworkPatients.add(kavya);
		frameworkPatients.add(divya);
		
		Set<Patient> j2EEPatients = new HashSet<Patient>();
		j2EEPatients.add(jyothi);
		j2EEPatients.add(gaye);
		
		Set<Patient> sqlPatients = new HashSet<Patient>();
		sqlPatients.add(sushu);
		sqlPatients.add(pooja);
		
		Set<Patient> projectPatients = new HashSet<Patient>();
		projectPatients.add(seema);
		projectPatients.add(ashwitha);
		
		Map<Doctor,Set <Patient>> doctorAndpatients = new HashMap<Doctor,Set <Patient>>();
		doctorAndpatients.put(asha, javaPatients);
		doctorAndpatients.put(omkar, frameworkPatients);
		doctorAndpatients.put(devandra, j2EEPatients);
		doctorAndpatients.put(varun, sqlPatients);
		doctorAndpatients.put(pavan, projectPatients);
		
		System.out.println("below is he Patients treated by Asha");
		System.out.println("-----------------------");
		
		for(Map.Entry<Doctor,Set <Patient>> doctorpatients :doctorAndpatients.entrySet()){
			Doctor doctor = doctorpatients.getKey(); 
			if(doctor.getName().equals("Asha")) {
				Set<Patient> patients = doctorpatients.getValue();
				for(Patient patient : patients) {
					System.out.println(patient.getName());
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
	

}
