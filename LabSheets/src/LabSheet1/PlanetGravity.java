package LabSheet1;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {

        float MassEarth,RadiusEarth,MassPlanet,RadiusPlanet,EarthGravity = 9.81f,OtherPlanetGravity;

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter the mass of planet earth");
        MassEarth = input.nextFloat();

        System.out.print("Please enter the radius of planet earth");
        RadiusEarth = input.nextFloat();

        System.out.print("Please enter the mass of the other planet");
        MassPlanet = input.nextFloat();

        System.out.print("Please enter the radius of the other planet");
        RadiusPlanet = input.nextFloat();

        OtherPlanetGravity = ((EarthGravity * MassPlanet * RadiusEarth * RadiusEarth) / (MassEarth * RadiusPlanet * RadiusPlanet));

        System.out.println("\nThe acceleration due to gravity on the other planet is " + String.format("%.2f", OtherPlanetGravity) + " m/s/s");
    }
}
