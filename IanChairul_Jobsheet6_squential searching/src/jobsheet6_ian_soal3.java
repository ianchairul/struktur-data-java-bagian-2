
import java.util.Scanner;
public class jobsheet6_ian_soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak data \t : "); int banyak=input.nextInt();
        int A[] = new int[banyak];
        System.out.println(" Inputkan data array ");
                for (int i=0; i<banyak; i++) {
            
            A[i] = input.nextInt();
        }
        
        for (int i=1; i<A.length; i++){           
            int key = A[i];
            int j =i-1;            
            while ((j>=0) && (key < A[j])) {
                A[j+1] = A[j];
                j-=1;
            }
            A[j+1] = key;
        }
        System.out.println("Data setelah diurutkan");
        for (int i=0; i<A.length; i++) {
            System.out.print(A[i]+" ");
        }        System.out.println("");
        System.out.print("Cari angka \t: ");int key = input.nextInt();
        
        int i=0;
        boolean ketemu = false;
            while (!ketemu && (i<A.length)) {
            if(A[i]>key)break;
            if(A[i] == key) {
                ketemu = true;}
            else {
            i+=1;
            }}
        if(ketemu == true) {
            System.out.println("Data ditemukan di indeks ke "+i);
            System.out.println("Perbandingan dilakukan sebanyak "+(i+1));
        }
        else {
            System.out.println("Data tidak ditemukan");
            System.out.println("Perbandingan dilakukan sebanyak "+i+" kali");
        }
    }
}
