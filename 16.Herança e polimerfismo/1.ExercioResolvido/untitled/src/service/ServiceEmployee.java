package service;

import DataBase.model.Employee;

public class ServiceEmployee {

    public void paymentEmployee(Employee employee){

        employee.setPayment(employee.getHour() * employee.getValuePerHour());
    }


}
