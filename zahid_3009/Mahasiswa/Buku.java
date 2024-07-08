/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahid_3009.Mahasiswa;

/**
 *
 * @author MSI GF63
 */
public class Buku {
    private String kodebuku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;   


public Buku(){

}

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public Buku(String kodebuku, String judul, String pengarang, String penerbit, String tahun) {
        this.kodebuku = kodebuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

}