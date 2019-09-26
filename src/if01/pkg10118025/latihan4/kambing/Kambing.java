/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan4.kambing;

/**
 *
 * @author
 * Nama     : Rizki Restu Illahi
 * Kelas    : IF01
 * NIM      : 10118025
 */
public class Kambing {

    /**
     */
    public void tambahKambing(){
        //deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah di Tambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
