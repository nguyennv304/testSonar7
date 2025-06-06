/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201_he182568_lab7_binarysearchtree;

import java.util.Scanner;

/**
 *
 * @author VAN NGUYEN
 */
public class Validate {
    static Scanner sc = new Scanner (System.in);
    public static int checkInteger(){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine());
                if(result < 0 || result > 100){
                    throw new NumberFormatException (); 
                }
                return result;
            }
            catch( NumberFormatException e){
                System.err.println("Out of bound");
                System.out.println("Enter again");             
            }
                   
        }
    }
    public static String checkString(){
        while(true){
            try{
                String s = sc.nextLine();
                if(s.matches("^[a-zA-Z]-$")){
                    throw new RuntimeException();
                }
                return s;
            }catch(RuntimeException e){
                System.err.println("Cannot having special character!");
                System.out.println("Enter again");
            }
        }
    }
    public static int checkIntegerLimit(int a, int b){
        while(true){
            try{
                int result = Integer.parseInt(sc.nextLine());
                if(result < a || result > b){
                    throw new NumberFormatException (); 
                }
                return result;
            }
            catch( NumberFormatException e){
                System.err.println("Out of bound");
                System.out.println("Enter again");             
            }
                   
        }
    }
}
