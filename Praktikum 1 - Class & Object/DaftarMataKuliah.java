import java.lang.System;
import java.util.Scanner;

public class DaftarMataKuliah {
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	String kode = input.nextLine();
	String nama = input.nextLine();
	int sks = Integer.parseInt(input.nextLine());
	String dosen = input.nextLine() ;
	int kapasitas = Integer.parseInt(input.nextLine());
	int tambahan = Integer.parseInt(input.nextLine());

	MataKuliah matkul = new MataKuliah(kode , nama , sks , dosen , kapasitas);
	System.out.println("Kode Mata Kuliah: " + matkul.getKode());
	System.out.println("Nama Mata Kuliah: " + matkul.getNama());
	System.out.println("SKS Mata Kuliah: " + matkul.getSks());
	System.out.println("Nama Dosen: " + matkul.getDosen());
	System.out.println("Kapasitas Kuliah: " + matkul.getKapasitas());
	matkul.tambahKapasitas(tambahan);
	System.out.println("Total Revisi Kapasitas Kuliah: " + matkul.getKapasitas());
}
}
	