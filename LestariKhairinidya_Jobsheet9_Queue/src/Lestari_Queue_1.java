/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lestari
 */

class Lestari_Queue_1{
    public static void main(String[] args){
        Queue theQueue = new Queue(6);
        
        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);
        
        theQueue.dequeue();
        theQueue.dequeue();
        theQueue.dequeue();
        
        theQueue.enqueue(50);
        theQueue.enqueue(60);
        theQueue.enqueue(70);
        theQueue.enqueue(80);
        theQueue.enqueue(90);
        
        while( !theQueue.isEmpty()){
            long n = theQueue.dequeue();
            System.out.print(n);
            System.out.print(" ");
        }
    System.out.println("");
    }
}   

