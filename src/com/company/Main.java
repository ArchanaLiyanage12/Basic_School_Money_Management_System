package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher Saman = new Teacher(2,"Saman",700);
        Teacher Niwarthana = new Teacher(3,"Niwarthana",700);

        ArrayList<Teacher> teacherslist = new ArrayList<>();
        teacherslist.add(lizzy);
        teacherslist.add(Saman);
        teacherslist.add(Niwarthana);

        Student Pamod = new Student(1,"Pamod",12);
        Student Archana = new Student(2,"Archana",12);
        Student Uvindu = new Student(3,"Uvindu",12);
        ArrayList<Student> studentslist = new ArrayList<>();

        studentslist.add(Pamod);
        studentslist.add(Archana);
        studentslist.add(Uvindu);

        School Ananda = new School(teacherslist,studentslist);

        Pamod.UpdateFeesPaid(5000);
        Uvindu.UpdateFeesPaid(6000);
        System.out.println("Ananada collge has earned "+Ananda.getTotalMoneyEarned() );

        System.out.println("-----Making school Pay Salary----");
        lizzy.receivedsalary(lizzy.getSalary());
        System.out.println("Ananda has spent for salary to "+ lizzy.getName()+ "and now has "+ Ananda.getTotalMoneyEarned());


    }
}
