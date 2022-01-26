/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author rivan
 */
public class nama {
    private String namapertama;
    private String namabelakang;
    
    public nama(String namapertama, String namabelakang){
    this.namapertama = namapertama;
    this.namabelakang = namabelakang;
    }

    public String getNamapertama() {
        return namapertama;
    }

    public void setNamapertama(String namapertama) {
        this.namapertama = namapertama;
    }

    public String getNamabelakang() {
        return namabelakang;
    }

    public void setNamabelakang(String namabelakang) {
        this.namabelakang = namabelakang;
    }

    @Override
    public String toString() {
        return "nama{" + "namapertama=" + namapertama + ", namabelakang=" + namabelakang + '}';
    }
}
