/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.luckysevens2022;

import java.util.Random;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-00-00
 * purpose: A small program to prove the futility of gambling with dice
 */
public class LuckySevens {
    
    public static void main(String[] args) {
        
        
        Random random = new Random();
        
        int startingBalance = 100;
        int currentBalance = startingBalance;
        int max = startingBalance;
        int countAtMax = 0;
        int count = 0;

        while (currentBalance > 0) {
            
            count++;
            
            if (random.nextInt(6) + (random.nextInt(6)) + 2 == 7) {
                currentBalance += 4;
            } else {
                currentBalance--;
            }
            
            if (currentBalance >= max) {
                max = currentBalance;
                countAtMax = count;
            }
            
        }
        
        System.out.println("You lost $" + startingBalance + " in only " + count + " rounds.");
        if (countAtMax == 0) {
            System.out.println("You never broke even.");
        } else {
            System.out.printf("You should have stopped at round %d when you were $%d ahead!", countAtMax, max - startingBalance);
        }
    }
    
}
