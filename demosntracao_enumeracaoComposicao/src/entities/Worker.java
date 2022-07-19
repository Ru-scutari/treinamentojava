package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private static String name;
    private WorkerLevel level;
    private static Double baseSalary;

    private static Department department;
    private static List<HourContract> contract = new ArrayList<HourContract>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContract() {
        return contract;
    }

    public void addContract(HourContract contract){
        this.contract.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contract.remove(contract);
    }

    public static double income(Integer year, Integer month){
        int sum = 0;
        sum += baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c: contract){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if (c_month == month && c_year == year){
                sum += c.TotalValue();
            }
        }
        return sum;
    }
}
