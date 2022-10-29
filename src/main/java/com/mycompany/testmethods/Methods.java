/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testmethods;


import java.util.ArrayList;

/**
 *
 * @author naymo
 */

public class Methods {
    public static double average(ArrayList<Double> r) {
        double add = 0;
        double av = 0;
        for (double x : r) {
            
            add += x;
            av = add / r.size();
        }
        return av;
    }
    public static int maxLength(ArrayList<String>  r) {
        int add = 0;
        for (String x : r) {
            if (x.length() > add) {
                add = x.length();
            }
        }
        return add;
    }
    public static String first(ArrayList<String>  r) {
        return r.get(0);
    }
    public static ArrayList firstThree(ArrayList r) {
        ArrayList list2 = new ArrayList <>();
        for (int i = 0; i < 3; i++) {
            list2.add(r.get(i));
        }
        return list2;
    }
    public static ArrayList firstN(ArrayList r, int n) {
        ArrayList list2 = new ArrayList();
        for (int i = 0; i < n; i++) {
            list2.add(r.get(i));
        }
        return list2;
    }
    public static String last(ArrayList<String>  r) {
        return r.get(r.size() - 1);
    }
    public static ArrayList lastThree(ArrayList r) {
        ArrayList list2 = new ArrayList<>();
        for (int i = r.size() - 3; i < r.size(); i++) {
            list2.add(r.get(i));
        }
        return list2;
    }
    public static ArrayList lastN(ArrayList r, int n) {
        ArrayList list2 = new ArrayList<>();
        for (int i = r.size() - n; i < r.size(); i++) {
            list2.add(r.get(i));
        }
        return list2;
    }
    public static void swapFirstAndLast(ArrayList<String>  r) {
        
        String temp = r.get(0);
        String second = r.get(r.size() - 1);
        r.set(0, second);
        r.set(r.size() - 1, temp);
    }
    public static int nthIndexOf(ArrayList r, String x, int n) {
        int count = 0;
        for (int i = 0; i < r.size(); i++) {
            if (x.equals(r.get(i)) ) {
                count++;
            }
            if (count == n) {
                return i;
            }
        }
        return -1;
    }
}
