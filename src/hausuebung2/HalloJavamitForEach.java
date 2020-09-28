/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hausuebung2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lreisinger18
 */
public class HalloJavamitForEach {

    List<String> halloList = new ArrayList<>();

    public void printHallo() {
        halloList.add("Hallo");
        for (String ausgeben : halloList) {
            System.out.println(halloList);
        }
    }

    public void printHalloLampda() {
        halloList.add("Hallo!");
        halloList.forEach((ausgeben) -> {
            System.out.println(halloList);
        });
    }
}
