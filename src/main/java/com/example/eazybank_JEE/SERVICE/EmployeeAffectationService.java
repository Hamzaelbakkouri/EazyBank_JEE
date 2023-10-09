package SERVICE;


import com.example.eazybank_JEE.DAO.Agence;
import com.example.eazybank_JEE.DAO.Employee;
import com.example.eazybank_JEE.DAO.EmployeeAffectation;
import com.example.eazybank_JEE.INTERFACES2.EmployeeAffectationDAO;

import java.util.List;
import java.util.Optional;

public class EmployeeAffectationService {

    private final EmployeeAffectationDAO EmployeeAffectationIMPL;

    public EmployeeAffectationService(EmployeeAffectationDAO employeeAffectationIMPL) {
        EmployeeAffectationIMPL = employeeAffectationIMPL;
    }

    public Optional<EmployeeAffectation> insertAffectation(EmployeeAffectation EmployeAffectation) {
        Optional<EmployeeAffectation> theNewAgence = Optional.empty();
        try {
            theNewAgence = this.EmployeeAffectationIMPL.CreateAffecattion(EmployeAffectation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return theNewAgence;
    }

    public Optional<EmployeeAffectation> MuteEmployee(EmployeeAffectation employeeAffectation) {
        Optional<EmployeeAffectation> theNewAgence = Optional.empty();
        try {
            theNewAgence = this.EmployeeAffectationIMPL.MuteEmployee(employeeAffectation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return theNewAgence;
    }

    public List<Employee> EmployeeHistorique(EmployeeAffectation employeeAffectation) {
        List<Employee> employees = null;
        try {
            employees = this.EmployeeAffectationIMPL.AffecatationsHistorique(employeeAffectation);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employees;
    }
}
