/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan52siapakamuoo;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class If110119024Latihan52SiapaKamuOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen;
        Mahasiswa mahasiswa;
        
        dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10119024");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Kusnandi Pirmansyah");
        mahasiswa.setUmur(22);
        mahasiswa.setKelas("IF1");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
