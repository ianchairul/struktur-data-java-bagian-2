
import java.util.Scanner;
public class jobsheet6_ian_soal2 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak data \t : "); int banyak=input.nextInt();
        int A[] = new int[banyak];
        System.out.println(" Inputkan data array ");
                for (int i=0; i<banyak; i++) {
            
            A[i] = input.nextInt();
        }
        System.out.println();
        int i=0, key=5;
        boolean ketemu = false;
        System.out.println("Angka yang ingin dicari adalah "+key);
        while ((ketemu == false) && (i<A.length)) {
            if(A[i] == key) {
                ketemu = true;
            }
            else {
                i+=1;
            }
        }
        if(ketemu == true) {
            System.out.println("Data ditemukan di indeks ke "+i);
            System.out.println("Perbandingan dilakukan sebanyak "+(i+1)+" kali");
        }
        else {
            System.out.println("Data tidak ditemukan");
            System.out.println("Perbandingan dilakukan sebanyak "+banyak+" kali");
        }
    }
}
