/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Queue;

/**
 *
 * @author rivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nama rivan = new nama("Rivan","Setiawan");
        nama adam = new nama("Adam","Hamzah");
        nama indah = new nama("Indah","Setiani");
        nama boboiboy = new nama("Boboiboy","Gempa");
        nama upin = new nama("upin","ipin");
        
        arrqueue queue = new arrqueue();
        
        queue.add(rivan);
        queue.add(adam);
        queue.add(indah);
        queue.add(boboiboy);
        queue.add(upin);
        
        queue.printQueue();
        
        System.out.println("============================");
        System.out.println(queue.peek());
        queue.remove();
        
        System.out.println("================================");
        
        queue.printQueue();
        
    }
    
}
