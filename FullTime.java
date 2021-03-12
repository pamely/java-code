public class FullTime extends Employee{
    private double pay;
    private double turnover;
    private double percentTurnover;

    // constructor
    FullTime(String name){
        super(name);
    }

    FullTime(String name, double pay, double turnover, double percentTurnover){
        super(name);
        this.pay = pay;
        this.turnover = turnover;
        this.percentTurnover = percentTurnover;
    }

    // setters 
    void setSalaryInfo(double pay, double turnover, double percentTurnover){
        this.pay = pay;
        this.turnover = turnover;
        this.percentTurnover = percentTurnover;   
    }

    void setTurnover(double turnover){
        this.turnover = turnover;
    }

    void setPay(double pay){
        this.pay = pay;
    }

    double getSalary(){
        if(this.pay == 0.0){
            return 0;
        } else {
            return (this.pay + this.turnover * this.percentTurnover);
        }

    }
    @Override
    public String toString(){

        if(this.getSalary() == 0.0){
            return "" + this.name + " has an unspecify pay";
        } else {
            return ""+ this.name + " earns " + this.getSalary() + " $";
        }
    }


}