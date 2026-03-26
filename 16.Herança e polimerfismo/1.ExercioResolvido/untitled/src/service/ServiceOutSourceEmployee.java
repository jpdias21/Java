package service;

import DataBase.model.Employee;
import DataBase.model.OutSourceEmployee;

public class ServiceOutSourceEmployee extends ServiceEmployee {



    @Override
    public void paymentEmployee(Employee employee){

        super.paymentEmployee(employee);

        if(employee instanceof OutSourceEmployee outSourceEmployee) {

            double additionalBonus = outSourceEmployee.getAdditionalCharge() * 1.10;


            outSourceEmployee.setPayment(outSourceEmployee.getPayment() + additionalBonus);
        }
    }
}
