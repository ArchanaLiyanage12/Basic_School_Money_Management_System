package com.company;

/**
 * this class is responsible for keep the track of teacher namme,id and salary
 */

public class Teacher {
    private int ID;
    private String Name;
    private  int Salary;
    private int salaryrecieved;

    public Teacher(int ID, String Name,int Salary){
        this.ID = ID;
        this.Name = Name;
        this.Salary = Salary;
        this.salaryrecieved = 0;

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }


    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
       this.Salary = salary;
    }

    /**
     * add to the salary
     * reduce total money earned from school income
     * @param salary
     */
    public void receivedsalary(int salary){
        salaryrecieved += salary;
        School.UpdateTotalMoneySpent(salary);


    }
}
