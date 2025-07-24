package com.jpa;

import com.jpa.dto.BloodGroupStats;
import com.jpa.dto.CPatientInfo;
import com.jpa.dto.IPatientInfo;
import com.jpa.entity.Patient;
import com.jpa.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient() {
//        List<Patient> patientList = patientRepository.findAll();
//        List<IPatientInfo> patientList = patientRepository.getAllPatientsInfo();
//        List<CPatientInfo> patientList = patientRepository.getAllPatientsInfoConcrete();
//        List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();

//        for (var patient : patientList) {
//            System.out.println(patient);
//            System.out.println("ID: " + patient.getId());
//            System.out.println("Name: " + patient.getName());
//            System.out.println("Email: " + patient.getEmail());

//        int rowsAffected = patientRepository.updatePatientNameWithId("Riyaz",1L);
//        System.out.println(rowsAffected);


        List<Patient> patients = patientRepository.getAllPatientsWithAppointments();
        for(var p:patients){
            System.out.println(p);
        }
    }

}
