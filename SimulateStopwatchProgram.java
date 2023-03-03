package com.bridgelabz;


import java.util.Scanner;

public class SimulateStopwatchProgram {
    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    public void start(){
        startTimer= System.currentTimeMillis();
        System.out.println("Start Time is: "+startTimer);
    }

    public void stop(){
        stopTimer= System.currentTimeMillis();
        System.out.println("Stop Time is: "+stopTimer);
    }

    public long getElapsedTime(){
        elapsed= stopTimer-startTimer;
        return elapsed;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SimulateStopwatchProgram sw= new SimulateStopwatchProgram();
        System.out.println("Press 1 to Start Time:");
        char s= in.next().charAt(0);
        sw.start();
        System.out.println("_________________________");
        System.out.println("Press 2 to Stop Time:");
        char m= in.next().charAt(0);
        sw.stop();

        long l=sw.getElapsedTime();
        System.out.println("************************************************");
        System.out.println("Total Time Elapsed (in milliseconds) is: "+l);
        System.out.println("Converting milliseconds to seconds: "+(l/1000));
    }
}
