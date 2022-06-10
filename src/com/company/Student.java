package com.company;

/**
 * this class is use to keep track of students
 */

public class Student {
    private int ID ;
    private String Name;


    private int Grade;
    private int feesPaid;
    private int FeesTotal ;

    /**
     * To create a new student by initializing
     * Fees for every student is $300000
     * fees paid is initially is 0
     * @param ID ID should be unique
     * @param Name
     * @param Grade
     */

    public Student(int ID,String Name,int Grade){
        this.feesPaid = 0;
        this.FeesTotal = 30000;
        this.ID = ID;
        this.Name = Name;
        this.Grade =  Grade;



    }
    // student name ,ID are not going to change so that we don't need getters and setters for that

    /**
     * used to update the grade
     * @param grade
     */
    public void setGrade(int grade) {
        Grade = grade;
    }

    /**
     * Used to update the feespaid
     * @param feesPaid
     */

    public void setFeesPaid(int feesPaid) {
        this.feesPaid = feesPaid;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getGrade() {
        return Grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return FeesTotal;
    }

    /**
     * Keep updating feespaid when student pays fees
     * @param fees the fees student paid
     */
  public void UpdateFeesPaid(int fees){
        feesPaid += fees;
        School.UpdateTotalMoneyEarned(fees);
  }

    /**
     * return the remaining fees
     * @return
     */
  public int getremainingfees(){
      return FeesTotal-feesPaid;

    }
}
