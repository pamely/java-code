/*

    In this exercise, I will program the calculation of weekly salaries for the employees of a 
    employees of a company.
    This company has several types of employees:
    - Contract employees who are paid according to the number of hours they work in a week. 
    They are paid at a certain hourly rate. They are paid at a certain hourly rate and their overtime (beyond 40 hours) is 
    hours (over 40 hours) are paid 30% more than regular hours. 
    regular hours.
    - Other contract employees are paid the same, but their overtime is paid at 50% more than regular hours. 
    overtime is paid at 50% more than regular hours.
    - Permanent employees are paid a fixed amount plus 1% of the sales they make. 
    of the turnover they have made in the week.

 */
public class Employee {
    // Employee name
    protected String name;

    Employee(String name){
        this.name = name;
    }
    // name getter
    String getName(){
        return this.name;
    }

    // getSalary computes salary 
    double getSalary(){
        return 0;
    }

    // print employee's name and salary
    @Override
    public String toString(){   
        return "" + this.name + " has an unspecify pay";
    }

}