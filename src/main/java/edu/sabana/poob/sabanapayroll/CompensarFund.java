package edu.sabana.poob.sabanapayroll;

import java.util.ArrayList;
import java.util.UUID;

public class CompensarFund implements IFamilyCompensationFund {

    private static ArrayList<Employee> registeredEmployees = new ArrayList<>();

    public CompensarFund(){

    }

    @Override
    public boolean registerEmployee(Employee employee) {
        if(employee.getClass()==EmployeeByHours.class){
            return false;
        }
        else if(isEmployeeRegistered(employee.getId())){
            return false;
        }
        else{
            registeredEmployees.add(employee);
            return true;
        }
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        for (Employee employee: registeredEmployees){
            if (employee.getId()==id){
                registeredEmployees.remove(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        for (Employee employee: registeredEmployees){
            if (employee.getId()==id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String printBenefits() {
        return ":v";
    }
}
