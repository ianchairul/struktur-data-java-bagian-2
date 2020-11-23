public class JOBSHEET6_ian_soal1 {

    public static void main(String[] args) {
            int A[] ={12,15,7,25,2,15,5,20};
          
        System.out.println();
        int i=0, key=25;
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
            System.out.println("Perbandingan dilakukan sebanyak kali");
        }
    } 
}
