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
   static Hashtable<String, String> hashtable = new Hashtable<String, String>();

    public Dictionary() {
        // khoi tai 10 tu
        hashtable.put("dog", "cho");
        hashtable.put("bee", "ong");
        hashtable.put("chiken", "ga");
        hashtable.put("fish", "ca");
        hashtable.put("cow", "bo");
        hashtable.put("ant", "kien");
        hashtable.put("pig", "lon");
        hashtable.put("snacke", "ran");
        hashtable.put("tiger", "ho");
        hashtable.put("cat", "meo");
        
        
    }
    public static void main(String[] args) {
        Dictionary ds = new Dictionary();
        System.out.println("dog: "+ hashtable.get("dog"));
    }
    
}
