package com.example.eazybank_JEE.DAO;

import DATABASE.DB;
import com.example.eazybank_JEE.DTO.Employee;
import com.example.eazybank_JEE.DTO.EmployeeAffectation;
import com.example.eazybank_JEE.INTERFACES2.EmployeeAffectationDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

public class EmployeeAffectationIMPL implements EmployeeAffectationDAO {
    Connection connection = DB.getConnection();

    @Override
    public Optional<EmployeeAffectation> CreateAffecattion(EmployeeAffectation employeeAffectation) {
        try {
            String query = "INSERT INTO EmployeeAffectation (employee_code, creationDate, agence_id) VALUES (?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, employeeAffectation.getEmployee().getRegistrationNumber());
            preparedStatement.setDate(2, Date.valueOf(employeeAffectation.getCreationDate()));
            preparedStatement.setString(3, employeeAffectation.getAgence().getCode());
            int rowAffected = preparedStatement.executeUpdate();
            if (rowAffected == 0) {
                return Optional.empty();
            } else {
                return Optional.of(employeeAffectation);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return Optional.empty();
    }

    @Override
    public Optional<EmployeeAffectation> MuteEmployee(EmployeeAffectation employeeAffectation) {
        return Optional.empty();
    }

    @Override
    public List<Employee> AffecatationsHistorique(EmployeeAffectation employeeAffectation) {
        return null;
    }
}
