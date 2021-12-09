/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de6;

import java.util.Hashtable;

/**
 *
 * @author Admin
 */
public class Dictionary {
    Hashtable<String, String> hashtable = new Hashtable<String,String>();

    public Dictionary() {
        hashtable.put("akali", "sat thu jutera");
        hashtable.put("yasuo", "kiem khach jutera");
        hashtable.put("goku", "trai dat sayja");
    }
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
       
        
    }
}
