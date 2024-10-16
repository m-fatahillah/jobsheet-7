import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total = 0;
            System.out.println("jenis-jenis kendaraan");
            System.out.println("1. mobil");
            System.out.println("2. motor");
            System.out.println("0. keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            do {
                if (jenis==1 || jenis==2) {
                    System.out.print("Masukkan durasi: ");
                    durasi = sc.nextInt();
                    if (durasi>5) { 
                        total += 12500;
                    }else {
                        if  (jenis==1) {
                                total =+ durasi*3000;
                        } else {
                            total += durasi *2000;
                        }
                }
            }
             
        }while (jenis!=0);
        System.out.println("Total = " + total);
    
    }
}
