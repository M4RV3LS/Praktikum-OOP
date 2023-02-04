import java.lang.System;
import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nim = input.nextLine();
        int sks = input.nextInt();
        int tambahSks = input.nextInt();
        Mahasiswa marvel = new Mahasiswa(nama, nim, sks);
        System.out.println("Nama mahasiswa: " + marvel.getNama());
        System.out.println("NIM mahasiswa: " + marvel.getNim());
        System.out.println("SKS mahasiswa: " + marvel.getSks());
        System.out.println("Jumlah mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
        marvel.tambahSks(tambahSks);
        System.out.println("Total Revisi SKS mahasiswa: " + marvel.getSks());
    }
}
