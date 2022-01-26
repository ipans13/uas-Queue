/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

import java.util.EmptyStackException;

/**
 *
 * @author rivan
 */
public class arrqueue {
    private nama[] queue;
    private int depan;
    private int belakang;
    
    public arrqueue (){
    queue = new nama[5];
    }
    public void add (nama Nama){
    queue [belakang] = Nama;
    belakang++;
    }
    public nama remove(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    nama Nama = queue[depan];
    queue[depan] = null;
    depan++;
    if (isEmpty()){
        depan = 0;
        belakang = 0;
    }
    return Nama;
    }
    public nama peek(){
    if(isEmpty()){
        throw new EmptyStackException();
    }
    return queue [depan];
   }
    public boolean isEmpty(){
    return size() == 0;
    }
    public int size(){
        return belakang - depan;
    }
    public void printQueue(){
    for(int i = depan; i < belakang; i++){
        System.out.println(queue[i]);
    }
    }
}
