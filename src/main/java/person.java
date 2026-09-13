

public class person {
    protected String name;
    protected int age;
    protected double annualSalary;
    protected double periodSalary;
    protected String paymentPeriod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(int paymentPeriodInt) {
        if (paymentPeriodInt == 1) {
            this.paymentPeriod = "monthly";
        } else if (paymentPeriodInt == 2) {
            this.paymentPeriod = "bi-weekly";
        } else if (paymentPeriodInt == 3) {
            this.paymentPeriod = "weekly";
        } else if (paymentPeriodInt == 4) {
            this.paymentPeriod = "yearly";
        }
    }

    public double getPeriodSalary() {
        if (paymentPeriod.equals("monthly")) {
            periodSalary = annualSalary / 12;
        } else if (paymentPeriod.equals("bi-weekly")) {
            periodSalary = annualSalary /26;
        } else if (paymentPeriod.equals("weekly")) {
            periodSalary = annualSalary / 52;
        } else {
            periodSalary = annualSalary;
        }
        return periodSalary;
    }
}
