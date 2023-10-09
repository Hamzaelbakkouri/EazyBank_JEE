package com.example.eazybank_JEE.INTERFACES2;


import com.example.eazybank_JEE.DTO.Agence;
import com.example.eazybank_JEE.DTO.Employee;
import com.example.eazybank_JEE.DTO.EmployeeAffectation;

import java.util.List;
import java.util.Optional;

public interface EmployeeAffectationDAO {
    Optional<EmployeeAffectation> CreateAffecattion(EmployeeAffectation employeeAffectation);

    Optional<EmployeeAffectation> MuteEmployee(EmployeeAffectation employeeAffectation);

    List<Employee> AffecatationsHistorique(EmployeeAffectation employeeAffectation);

}
