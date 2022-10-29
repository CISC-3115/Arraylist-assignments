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
public class UniqueIntegerList extends ArrayList<Integer> {

    public UniqueIntegerList() {

        super();

    }

    @Override
    public boolean add(Integer element) {

        for (int i : this) {
            if (i == element) {

                return false;

            }

        }

        super.add(element);
        return true;

    }

    @Override
    public void add(int index, Integer element) {

        int flag = 0;
        for (int i : this) {
            if (i == element) {
                flag++;

            }

        }
        if (flag == 0) {

            super.add(index, element);
        }

    }

    @Override
    public Integer set(int index, Integer element) {

        int flag = 0;
        Integer old = 0;
        for (int i : this) {
            if (i == element) {
                flag++;

                return super.get(index);
            }

        }
        if (flag == 0) {
            old = super.get(index);
            super.set(index, element);

        }
        return old;
    }

    public double average() {
        double add = 0;
        double average = 0;

        for (double i : this) {

            add += i;
            average = add / this.size();

        }
        return average;
    }
}
