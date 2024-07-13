package com.springboot.dao;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.springboot.domain.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {

    static List<Patient> patientList = new ArrayList<>();

    static {
        patientList.add(new Patient(1L, "Swathy", "9876567234", "swathy@gmail.com", "31-07-1989"));
        patientList.add(new Patient(2L, "Vanmathi", "9873877234", "vanmathi@gmail.com", "23-04-1992"));
        patientList.add(new Patient(3L, "Kevin", "9823641234", "kevin@gmail.com", "01-04-2000"));
    }

    @Override
    public List<Patient> createPatient(Patient patient) {
        patientList.add(patient);
        return patientList;
    }

    @Override
    public List<Patient> getPatients() {
        return patientList;
    }
}
