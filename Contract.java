public class Contract extends Employee{

    private double nbHours;  // weekly  work duration
    private double hourRate; // hourly rate 
    private double percentHourSuP; // overtime percentage
    private static double dueHour = 40;

    Contract(String name){
        super(name);
    } 

    Contract(String name, double nbHours, double hourRate, double percentHourSuP, double dueHour) {
        super(name);
        this.nbHours = nbHours;
        this.hourRate = hourRate;
        this.percentHourSuP = percentHourSuP;
        this.dueHour = dueHour;
    }

    // Setter salary info
    void SetSalaryInfo(double nbHours, double hourRate, double percentHourSuP, double dueHour){

        this.nbHours = nbHours;
        this.hourRate = hourRate;
        this.percentHourSuP = percentHourSuP;
        this.dueHour = dueHour;
    }

    // getters
    double getNbHours(){
        return this.nbHours;
    }

    double getHourRate(){
        return this.hourRate;
    }

    double getPercentHourSup(){
        return this.percentHourSuP;
    }

    double getSalary(){
        double supHours = this.nbHours - this.dueHour;
        return (this.nbHours * this.hourRate) + (supHours * this.hourRate * (1 + this.percentHourSuP));
    }

    @Override
    public String toString(){
        // display the number of hours worked per week, the hourly rate and the percentage for overtime.
        return ""+ this.name + " earns " + this.getSalary() + " $";
    }


}