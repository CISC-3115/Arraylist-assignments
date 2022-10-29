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
public class IntQueue {

    private final ArrayList<Integer> list;

    public IntQueue() {

        list = new ArrayList<>();

    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(int element) {

        list.add(element);

    }

    public int dequeue() {
        int r = list.get(0);
        
        list.remove(0);

        return r;

    }

    public int peek() {
        return list.get(0);
    }
    
    
    @Override
    public String toString(){
        
        return list + "";
        
    }
    
    @Override
     public boolean equals(Object o) {
        if (o instanceof IntQueue){
            
            IntQueue r = (IntQueue)o;
            
            return this.list.equals(r.list);
            
        }
        
        return false;
    }

}
