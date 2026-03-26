package factory;


import service.ServiceEmployee;
import service.ServiceOutSourceEmployee;

public class EmployeeFatory {
    
    public static ServiceEmployee create(String tipo) {

        if (tipo.equals("employee")) {
            return new ServiceEmployee();
        }
        if (tipo.equals("outEmployee")) {
            return  new ServiceOutSourceEmployee();
        }
        return  null;

    }
}
