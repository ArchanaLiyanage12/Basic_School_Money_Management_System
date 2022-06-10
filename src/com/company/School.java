package com.company;

import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private static int TotalMoneyEarned;
    private static int TotalMoneySpent;

    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.TotalMoneyEarned = 0;
        this.TotalMoneySpent = 0;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return TotalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return TotalMoneySpent;
    }

    /**
     * Add teachwrs to school
     * @param teacher
     */
    public void AddTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * add students to school
     * @param student
     */
    public void AddStudents(Student student) {
      students.add(student);
    }

    /**
     * Update total money earned
     * @param MoneyEarned
     */
    public static void UpdateTotalMoneyEarned(int MoneyEarned) {
        TotalMoneyEarned += MoneyEarned;
    }

    /**
     * Update total money spent buy the user
     * @param MoneySpent
     */
    public static void UpdateTotalMoneySpent(int MoneySpent) {
        TotalMoneySpent += MoneySpent;
        TotalMoneyEarned -= MoneySpent;
    }
}
