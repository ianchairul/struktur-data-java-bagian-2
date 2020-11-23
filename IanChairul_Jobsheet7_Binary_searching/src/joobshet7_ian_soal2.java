/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class joobshet7_ian_soal2 {
    public static void main(String[] args) {
        int data[]={1,2,3,4,5,6,7,8,9};
        int l=0; int r=data.length-1;
        boolean find=false;
        int key = 4; int m=(l+r)/2;
        while (l<=r&& !find){
            
            if (data[m]==key)
                find=true;
            if (key<data[m])
                r=m-1;
            if(key>data[m])
                l=m+1;
        }
        if(find)
            System.out.println("key berada di elemen ke "+m);
    }
  
}
