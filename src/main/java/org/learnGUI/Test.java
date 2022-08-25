package org.learnGUI;
import java.util.HashMap;

public class Test {
    public static void main(String args[]) {
        // List
        String [] cars = {"Mazda", "Audi", "Toyota", "Mercedes", "Huindai"};
        for (String ax:cars) {
            System.out.println(ax);
        }
        // HashMap
        HashMap<String, String> xd = new HashMap<String, String>();
        xd.put("England", "London");
        xd.put("Poland", "Warsaw");
        for (String ls:xd.keySet()) {
            System.out.println(xd.get(ls));
        }

    }
}
