package LabSheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

        String Name, Course;
        int noOfSnacks, Total;

        //InputName

        Name = JOptionPane.showInputDialog(null, "Please enter your name", "Input", JOptionPane.QUESTION_MESSAGE);


                //InputCourse

        Course = JOptionPane.showInputDialog(null, "Please enter your course", "Input", JOptionPane.QUESTION_MESSAGE);

                //InputSnacks

        noOfSnacks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many snacks would you like", "Input", JOptionPane.QUESTION_MESSAGE));
                //PriceCalculator

        Total = (noOfSnacks * 2);

                //Receipt

        JOptionPane.showMessageDialog(null,"Name: " + Name + "\nCourse: " + Course + "\nSnacks: " + noOfSnacks + "\nCost: €" + Total,"Receipt",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
