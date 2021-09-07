/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class MadLib {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a noun:");
        String noun = scan.next();
        System.out.print("Enter a verb:");
        String verb = scan.next();
        System.out.print("Enter an adjective:");
        String adjective = scan.next();
        System.out.print("Enter an adverb:");
        String adverb = scan.next();
        System.out.print("Do you "+verb+" your "+adjective+" "+noun+" "+adverb+"? That's hilarious!");
    }
}
