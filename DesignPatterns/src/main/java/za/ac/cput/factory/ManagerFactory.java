package za.ac.cput.factory;

import za.ac.cput.domain.Manager;
import za.ac.cput.util.Helper;

public class ManagerFactory {
    public static Manager buildManager(String employeeNumber, String firstName,String lastName,String parkingBay){
        if(Helper.isNullOrEmpty(employeeNumber)||Helper.isNullOrEmpty(firstName)||Helper.isNullOrEmpty(lastName)||Helper.isNullOrEmpty(parkingBay)){
            return null;
        }
        return new Manager.Builder().setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setParkingBay(parkingBay)
                .build();
    }
}
