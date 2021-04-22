package edu.sabana.poob.sabanapayroll;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ColsubsidioFund implements IFamilyCompensationFund {

    private static Map<UUID, Employee> registeredEmployees = new HashMap<>();

    public ColsubsidioFund() {

    }

    /**
     * No permite registrar empleados de tipo EmployeeByCommission.
     *
     * @param employee
     * @return
     */
    @Override
    public boolean registerEmployee(Employee employee) {
        if(employee.getClass()==EmployeeByCommission.class){
            return false;
        }
        else if(isEmployeeRegistered(employee.getId())){
            return false;
        }
        else{
            registeredEmployees.put(employee.getId(), employee);
            return true;
        }
    }

    @Override
    public boolean deleteEmployee(UUID id) {
        if(registeredEmployees.containsKey(id)){
            registeredEmployees.remove(id);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean isEmployeeRegistered(UUID id) {
        return registeredEmployees.containsKey(id);
    }

    @Override
    public String printBenefits() {
        return ":v";
    }
}
