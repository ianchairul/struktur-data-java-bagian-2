/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lestari
 */
class Queue {
private int maxSize;
private long[] queArray;
private int head;
private int tail;
private int nItems;

    public Queue (int s){
        maxSize = s;
        queArray = new long[maxSize];
        head = 0;
        tail = -1;
        nItems = 0;
    }

    public void enqueue (long j){
        queArray[++tail] = j;
        nItems++;
    }

    public long dequeue(){
        long temp = queArray[tail--];
        nItems--;
        return temp;
    }

    public long peekhead(){
        return queArray[head];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems==maxSize);
    }

    public int size(){
        return nItems;
    }
}


