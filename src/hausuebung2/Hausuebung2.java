/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung2;

import java.util.Scanner;

/**
 *
 * @author lreisinger18
 */
public class Hausuebung2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1252");
        HalloJavamitForEach h = new HalloJavamitForEach();
        NumberTester t = new NumberTester("");
        t.setOddEvenTester((var) -> (var%2 == 0));
        t.setPrimeTester((n) -> );
        t.setPalindromeTester((var3) -> (var3%2 == 0));
        //h.printHallo();
        //h.printHalloLampda();
    }
    
}
