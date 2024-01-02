package ents;

public class TaxPayer {

    private double salaryIncome;
    private double serviceIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer() {
    }

    public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }


    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public double salaryTax() {
        double salaryMonthly = salaryIncome / 12.0;
        if (salaryMonthly >= 3000.00 && salaryMonthly <= 5000.00) {
            return salaryIncome * 0.10;
        } else if (salaryMonthly > 5000.00) {
            return salaryIncome * 0.20;
        } else {
            return 0.0;
        }
    }

    public double servicesTax() {
        return serviceIncome * 0.15;
    }

    public double capitalTax() {
        return capitalIncome * 0.20;
    }

    public double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public double taxRebate() {
        double totalSpending = healthSpending + educationSpending;
        double maxRebate = grossTax() * 0.30;
        if (totalSpending < maxRebate) {
            return totalSpending;
        } else {
            return maxRebate;
        }
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }
}
