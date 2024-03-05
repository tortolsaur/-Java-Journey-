/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomrid;

import java.security.SecureRandom;

public class RANDOMRID {

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            String mixedString = generateMixedString(32);
            System.out.println("Mixed String " + (i + 1) + ": " + mixedString);
        }
    }

    private static String generateMixedString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder mixedString = new StringBuilder();

        String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            mixedString.append(characters.charAt(randomIndex));
        }

        return mixedString.toString();
    }
}
