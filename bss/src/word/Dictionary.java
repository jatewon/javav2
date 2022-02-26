/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package word;

import java.util.Hashtable;

/**
 *
 * @author Admin
 */
public class Dictionary {

    static Hashtable<String, String> hashTable = new Hashtable<>();

    public Dictionary() {
        hashTable.put("dog", "cho");
        hashTable.put("bee", "ong");
        hashTable.put("chiken", "ga");
        hashTable.put("fish", "ca");
        hashTable.put("cow", "bo");
        hashTable.put("ant", "kien");
        hashTable.put("pig", "lon");
        hashTable.put("snacke", "ran");
        hashTable.put("tiger", "ho");
        hashTable.put("cat", "meo");
    }
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        System.out.println("dog" + hashTable.get("dog"));
        hashTable.put("duck", "vit");
        System.out.println("duck"+ hashTable.get("duck"));
    }
}
