/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung2;

/**
 *
 * @author lreisinger18
 */
public class NumberTester implements NumberTest{
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;
    String fileName;
    
    public NumberTester(String fileName)
    {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile()
    {
    
    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}
