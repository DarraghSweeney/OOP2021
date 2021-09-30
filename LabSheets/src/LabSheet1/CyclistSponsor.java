package LabSheet1;

import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args) {

        String Name;
        int Km;
        float RateA = 1.75f, RateB = 2.50f, AmountDue = 0;

        Name = JOptionPane.showInputDialog(null,"Please enter your name","Input",JOptionPane.QUESTION_MESSAGE);

        Km = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of Km cycled","Input",JOptionPane.QUESTION_MESSAGE));

        if(Km <=10){

            AmountDue = (Km * RateA);
        }

        else if (Km >10){

            AmountDue = ((RateB *(Km - 10)) + (10 * RateA));
        }

        JOptionPane.showMessageDialog(null,"Name: " + Name + "\nDistance Cycled: " + Km + " km" + "\nSponsorShip amount Due: €" + AmountDue,"Receipt",JOptionPane.INFORMATION_MESSAGE);
    }
}
