package com.example.eazybank_JEE.INTERFACES;

import com.example.eazybank_JEE.DTO.Affectation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface AffectationDAO {
    Optional<Affectation> insert(Affectation affectation) throws SQLException;

    List<Map<String, String>> getEmployeeAffectations(String num) throws SQLException;

    Optional<Map<String, Integer>> Statistiques() throws SQLException;
}