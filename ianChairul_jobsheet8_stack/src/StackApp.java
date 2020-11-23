/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
class StackApp {
   public static void main(String[] args) {
      //  StackX thestack = new StackX[10];
       StackX thestack = new StackX(8);
thestack.push(20);
thestack.push(40);
thestack.push(60);
thestack.push(80);
while(!thestack.isEmpty());{
long value= thestack.pop();
        System.out.println(value);    }
    } 
}
