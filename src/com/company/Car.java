package com.company;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 1080;
    boolean isThisCarOn = false;
    char grades = 'H';
    String nameOfCar = "Harsh's Porsche";
    String colorOfCar = "Blue";
    int numberOfPerson=1;
    double current_fuel=15;
    double max_fuel=18;
    double mileageOfCar=27.8;
    int maxCapacity=6;



    //getters and setters
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed=newMaxSpeed;
    }
    public int getMinSpeed(){
        return this.minSpeed;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean isThisCarOn(){
        return this.isThisCarOn;
    }
    public void upgradeMaxSpeed(){
        setMaxSpeed ( getMaxSpeed () + 100 );
    }

    public void printAttributes () {
        System.out.println ( nameOfCar );
        System.out.println(colorOfCar);
        System.out.println ( "Maximum Speed of car is --->" + maxSpeed );
        System.out.println ( "Minimun Speed of car is --->" + minSpeed );
        if(numberOfPerson==1) {
            System.out.println ( "Only You are in your car" );
        }
        else System.out.println("You are with "+numberOfPerson+" more Persons");
        System.out.println ( "Car is on/off-->" + isThisCarOn );
        System.out.println ( "Car Condition is-->" + grades );
        System.out.println("Mileage of Car is-->"+mileageOfCar);
        System.out.println("Max Fuel is-->"+max_fuel);
        System.out.println("Current Fuel is--->"+current_fuel);
    }

    public Car ( String name, int max, String color ,double mileage,double tank) {
        nameOfCar = name;
        maxSpeed = max;
        grades='A';
        isThisCarOn=false;
        colorOfCar = color;
        mileageOfCar=mileage;
        max_fuel=tank;
    }

    public void changeGrades () {
        grades = 'A';
    }
    public void getIn(){
        if(numberOfPerson < maxCapacity) {
            numberOfPerson++;
            System.out.println("You are with "+numberOfPerson+" Persons:)");
        }
        else{
            System.out.println("Car is full :(");
        }
    }
    public void getOut(){
        if(numberOfPerson>=1){
        numberOfPerson--;
        System.out.println("People left "+numberOfPerson);
        }
        else{
            System.out.println("You are alone :O");
        }


    }
    public double howManyKilometersOutOfFuel(){
        return mileageOfCar*current_fuel;
    }
    public double maxKilometersPerFuel(){
        return mileageOfCar*max_fuel;
    }

    public void turnTheCarOn(){
        if(isThisCarOn==false){
            isThisCarOn=true;
        }

    }
    public static void main ( String args[] ) {

        Scanner scan = new Scanner ( System.in );
       /* Car Harsh_Car=new Car();
        Harsh_Car.printAttributes ();
        Car Family_Car=Harsh_Car;
        Family_Car.changeGrades ();
        System.out.println("When Family comes");
        Family_Car.printAttributes ();
        System.out.println("Harsh's Condition now-->");
        Harsh_Car.printAttributes ();*/
        String inp1 = Integer.toString ( 100 );
        System.out.println ( inp1.length ( ) );
        String res = inp1 + " ";
        System.out.println ( res );
        String final_out = "";
        String space = " ";
        for ( int k = 1; k <= 15; k++ ) {

            final_out += space;
        }
        System.out.println ( final_out );
        System.out.println ( 1.0 / 0.0 );
        int a = 100000;
        int b = 2;
        //ternary operator
        int min = (a > b) ? a : b;
        System.out.println ( min );
        //left shift
        int a1 = 8; //in binary 1000      2^5 2^4 2^3 2^2 2^1 2^0
        int a2 = a1 << 2; //right shift   1     0   0   0  0    0 ==32
        System.out.println ( a2 );
        int a3 = a1 >> 2; //left shift                     1    0 == 2
        System.out.println ( a3 );
        // formula for left shift = a1 * 2^(n)
        // formula for right shift = a1 / 2^(n)

        System.out.println ( "Please Enter the name of Your new Car===>" );
        String name = scan.nextLine ( );
        System.out.println ( "Maximum Speed that Your car can attain====>" );
        int max = scan.nextInt ( );
        System.out.println ( "What is the Body Color of ur Car==> " );
        scan.nextLine();
        String color = scan.nextLine( );
        System.out.println("What Mileage does Ur Car gives?-->");
        double mileage=scan.nextDouble();
        System.out.println("Tank Capacity--->");
        double tank=scan.nextDouble ();
        Car new_car=new Car ( name,max,color,mileage,tank);
        scan.hasNextLine ();
        System.out.println ( );
        new_car.getIn ();
        new_car.getIn();
        new_car.getIn();
        new_car.getIn();
        new_car.getIn();
        new_car.getIn();
        new_car.getOut();
        new_car.getOut();
        new_car.getOut();
        new_car.getOut();

        new_car.printAttributes ();
        System.out.println("Kilometers left"+new_car.howManyKilometersOutOfFuel ());
        System.out.println("Kilometers Total traveled during full tank"+new_car.maxKilometersPerFuel ());


        LocalDate dt=LocalDate.of(1998,03,8);
        System.out.println(dt.getDayOfWeek ());
        String res4= String.valueOf ( dt.getDayOfWeek () );

        System.out.println(res4);
    }

}