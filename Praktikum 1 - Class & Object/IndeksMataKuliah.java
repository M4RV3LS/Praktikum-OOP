/**
 * MataKuliah.java
 * Class ini merupakan sebuah kelas yang memodelkan nilai akadameik seorang mahasiswa ITB.
 * 
 * @author 18221058 Marvel Subekti
 */

public class IndeksMataKuliah {
    // Deklarasi atribut
    private MataKuliah mataKuliah;
    private String nama;
    private String indeks;
    private Double nilai;

    /**
     * Konstruktor
     * 
     * @param mk
     * @param nama
     * @param nilai
     *                   indeks ditentukan berdasarkan nilai yang diperoleh dengan
     *                   ketentuan sebagai berikut
     *                   A -> nilai = 4
     *                   B -> 3.0 <= nilai < 4.0
     *                   C -> 2.0 <= nilai < 3.0
     *                   D -> 1.0 <= nilai < 2.0
     *                   E -> 0.0 <= nilai < 1.0
     *                   Apabila nilai tidak valid, maka indeks dianggap E dan nilai
     *                   dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mk, String nama, Double nilai) {
        this.mataKuliah = mk;
        this.nama = nama;
        if(nilai == 4.0){
            this.indeks = "A";
            this.nilai = nilai;
        }
        else if((nilai >= 3.0) && (nilai < 4.0)){
            this.indeks = "B";
            this.nilai = nilai;
        }
        else if((nilai >= 2.0) && (nilai < 3.0)){
            this.indeks = "C";
            this.nilai = nilai;
        }
        else if((nilai >= 1.0) && (nilai < 2.0)){
            this.indeks = "D";
            this.nilai = nilai;
        }
        else if((nilai >= 0.0) && (nilai < 1.0)){
            this.indeks = "E";
            this.nilai = nilai;
        }
        else {
            this.indeks = "E";
            this.nilai = 0.0;
        }
    }

    // public IndeksMataKuliah(String kode, String nama2, int sks, String dosen, int kapasitas) {
    //     MataKuliah matkul = new MataKuliah(kode , nama2 , sks , dosen , kapaasitas);
    // }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }

    /**
     * Getter nama
     * 
     * @return nama
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Getter indeks
     * 
     * @return indeks
     */
    public String getIndeks() {
        return this.indeks;
    }

    /**
     * Getter nilai
     * 
     * @return nilai
     */
    public Double getNilai() {
        return this.nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
        this.updateIndeks(nilai);
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
        if(nilai == 4.0){
            this.indeks = "A";
            this.nilai = nilai;
        }
        else if((nilai >= 3.0) && (nilai < 4.0)){
            this.indeks = "B";
            this.nilai = nilai;
        }
        else if((nilai >= 2.0) && (nilai < 3.0)){
            this.indeks = "C";
            this.nilai = nilai;
        }
        else if((nilai >= 1.0) && (nilai < 2.0)){
            this.indeks = "D";
            this.nilai = nilai;
        }
        else if((nilai >= 0.0) && (nilai < 1.0)){
            this.indeks = "E";
            this.nilai = nilai;
        }
        else {
            this.indeks = "E";
            this.nilai = 0.0;
        }

    }

    /**
      * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Contoh: nilai = 2.0, countLulus = 25, kapasitas = 100
     * normalisasi nilai = 2.0 + (2.0 * (25/100)) = 2.5
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
        // int capacity = this.mataKuliah.getKapasitas();
        //System.out.println(this.nilai); 
        this.nilai = this.nilai + (this.nilai * countLulus/this.mataKuliah.getKapasitas());
		if (this.nilai > 4.0) {
			this.nilai = 4.0;
		}
    }

    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP(int sks) {
        return ((this.mataKuliah.getSks() * this.nilai)/sks);
    }
}
