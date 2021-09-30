package LabSheet1;

import java.util.Scanner;
import javax.swing.*;

public class HeightStats {
    public static void main(String[] args) {

        float CurrentHeight,AverageHeights, SmallestHeight,AboveAverage = 0f,PThreePNine = 0f, GlobalAverage = 1.665f;
        Boolean Valid;
        int i = 1;

        Scanner input = new Scanner(System.in);

        while(i <=6)
        {
            System.out.print("Please enter height: ");
            CurrentHeight = input.nextFloat();

            if (CurrentHeight < 0.5464 || CurrentHeight > 2.72)
            {
                System.out.print("Invalid!!! Please re-enter height: ");
                CurrentHeight = input.nextFloat();
            }
            i++;
        }
    }
}

