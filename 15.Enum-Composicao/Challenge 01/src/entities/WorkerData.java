package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class WorkerData {
    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalarial;

    private List<ContractWork> contracts = new ArrayList<>();

    public WorkerData( String name, Double baseSalarial, WorkerLevel workerLevel) {
        this.baseSalarial = baseSalarial;
        this.name = name;
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public List<ContractWork> getContracts() {
        return contracts;
    }
    public void addContract(ContractWork contractWork){
        contracts.add(contractWork);
    }
    public void removeContract(ContractWork contractWork){
        contracts.add(contractWork);
    }

 public double income(int year, int month){
        double salaryBase = getBaseSalarial();
        double sum = 0;
        for(ContractWork contractWork : contracts){
            LocalDate date = contractWork.getDayOfWork();
            int mes = date.getMonthValue();
            int ano = date.getYear();

            if(mes == month && ano == year){
                sum += contractWork.Calcution();
            }

        }
        return sum + salaryBase;
 }
}
