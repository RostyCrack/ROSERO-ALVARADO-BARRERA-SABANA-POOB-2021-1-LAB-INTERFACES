package edu.sabana.poob.sabanapayroll;

import java.util.HashSet;
import java.util.UUID;

public class CafamFund implements IFamilyCompensationFund{

    private static HashSet<Employee> registeredEmployees = new HashSet<>();

    public CafamFund(){

    }

    @Override
    public boolean registerEmployee(Employee employee) {
        if (isEmployeeRegistered(employee.getId())){
            return false;
        }
        else{
            registeredEmployees.add(employee);
            return true;
        }
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        if (registeredEmployees.iterator().hasNext()) {
            if (registeredEmployees.iterator().next().getId() == id) {
                registeredEmployees.remove(registeredEmployees.iterator().next());
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        if(registeredEmployees.iterator().hasNext()){
            return registeredEmployees.iterator().next().getId() == id;
        }
        return false;
    }

    @Override
    public String printBenefits() {
        return ":v";
    }
}
