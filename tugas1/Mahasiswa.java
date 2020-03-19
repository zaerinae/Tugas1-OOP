public class Mahasiswa {
    // field/ atribut/ properties/ variabel

    String nim;
    String nama;
    String kelas; // 3 atribut kelas


    public Mahasiswa() {
        nama = "Kim doyoung";
        nim = "127";
        kelas = "NCT";

    }
    

    // method / fungsi / prosedur 
    public String info() {
        return nim + ":" + nama + ":" + kelas;    
    }
    

}