/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Hashtable;

public class App
{
    public static void main( String[] args )
    {
        int age = Input.GetInt("What is your age? ");
        System.out.print(age < 16 ? "You are not old enough to legally drive." : "You are old enough to legally drive.");
    }
}