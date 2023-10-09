package com.example.eazybank_JEE.INTERFACES;

import com.example.eazybank_JEE.DTO.Account;
import com.example.eazybank_JEE.DTO.Operation;
import com.example.eazybank_JEE.DTO.SimpleOperation;

import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;

public interface OperationDAO {
    Optional<SimpleOperation> insert(SimpleOperation operation) throws SQLException;

    Optional<SimpleOperation> getOne(int operationNumber) throws SQLException;

    boolean delete(int t) throws SQLException;
}
