/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class StackX {
   private int maxsize;
   private long [] stackarray;
private int top;
StackX(int s){
maxsize = s;
stackarray = new long[maxsize];
top=-1;
}

public void push(long j){
stackarray[++top]=j;
}

public long pop(){
return stackarray[top--];}

public long peek(){
return stackarray[top];}

public boolean isEmpty(){
return (top==-1);
}
public boolean isFull(){
return(top==maxsize-1);
}

    void push(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
