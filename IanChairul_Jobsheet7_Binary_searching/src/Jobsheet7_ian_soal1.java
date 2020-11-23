
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class Jobsheet7_ian_soal1 {
 public static void main(String args[])
  {
    int i, nilaiAwal, nilaiAkhir, nilaiTengah, n, search, array[];
    Scanner in = new Scanner(System.in);
    System.out.print("Panjang elemen ");
    n = in.nextInt(); 
    array = new int[n];
    System.out.println("Input " + n + " integers");
 
     for (i = 0; i < n; i++)
     array[i] = in.nextInt();
 
    System.out.print("Data yang akan dicari ");
    search = in.nextInt();
 
    nilaiAwal  = 0;
    nilaiAkhir   = n - 1;
    nilaiTengah = (nilaiAwal + nilaiAkhir)/2;
 
    while( nilaiAwal <= nilaiAkhir )
    {
      if ( array[nilaiTengah] < search )
        nilaiAwal = nilaiTengah + 1;    
      else if ( array[nilaiTengah] == search ) 
      {
        System.out.println(" data ditemukan di elemen ke " + (nilaiTengah + 1) + ".");
        break;
      }
      else
         nilaiAkhir = nilaiTengah - 1;
 
      nilaiTengah = (nilaiAwal + nilaiAkhir)/2;
   }
   if ( nilaiAwal > nilaiAkhir )
      System.out.println("data tidakditemukan.\n");
  }   
}
