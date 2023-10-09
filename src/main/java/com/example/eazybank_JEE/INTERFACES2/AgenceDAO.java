package com.example.eazybank_JEE.INTERFACES2;

import com.example.eazybank_JEE.DTO.Employee;
import com.example.eazybank_JEE.DTO.Agence;

import java.util.List;
import java.util.Optional;

public interface AgenceDAO extends TypeDAO<Agence, String> {
    List<Agence> getAll();
    Optional<Agence> getOneByAdress(Agence agence);
    List<Agence> findByEmploye(Employee employee);
    List<Agence> contact();
}
