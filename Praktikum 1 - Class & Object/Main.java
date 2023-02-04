import java.lang.System;
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		// System.out.println("Hello World!");
		MataKuliah matkul = new MataKuliah("MA1", "Matematika", 3 , "afif", 100);
		IndeksMataKuliah imk = new IndeksMataKuliah(matkul , "Marvel" , 4.0);
		String indeks = imk.getIndeks();
		System.out.println(indeks);
		String name = imk.getNama();
		System.out.println(name);
		imk.ubahNilai(3.0);
		System.out.println(imk.getIndeks());
		imk.normalisasiNilai(75);
		System.out.println(imk.getNilai());

	}
}