package entities;

import java.time.LocalDate;

public class ContractWork {
    private Double valueHour;
    private Integer WorkerDuration ;
    private LocalDate dayOfWork;



    public ContractWork(LocalDate dayOfWork, Double valueHour, Integer workerDuration) {
        this.dayOfWork = dayOfWork;
        this.valueHour = valueHour;
        WorkerDuration = workerDuration;
    }

    public LocalDate getDayOfWork() {
        return dayOfWork;
    }

    public void setDayOfWork(LocalDate dayOfWork) {
        this.dayOfWork = dayOfWork;
    }

    public Double getValueHour() {
        return valueHour;
    }

    public void setValueHour(Double valueHour) {
        this.valueHour = valueHour;
    }

    public Integer getWorkerDuration() {
        return WorkerDuration;
    }

    public void setWorkerDuration(Integer workerDuration) {
        WorkerDuration = workerDuration;
    }
    public double Calcution(){
        return WorkerDuration * valueHour;
    }
}
