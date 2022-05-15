package com.bridgelabz;

public class HeadsAndTailsProb {


    public static void main(String[] args) {
        int flipTimes = 100;

        for (int i = 1; i <= flipTimes; i++) {
            if (Math.random() < 0.5) {
                System.out.println(i+" Heads");
            } else {
                System.out.println(i+" Tails");
            }
        }
    }
}
