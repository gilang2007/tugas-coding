public class tampil {
    public static void main(String[] args) {
        Rumah r = new Rumah();
        Sekolah s = new Sekolah();
        System.out.println("DATA RUMAH");
        r.tampilLokasi();
        r.tampilUkuran(10, 8);
        System.out.println("DATA SEKOLAH");
        s.tampilNama("SMK TELKOM MALANG");
        s.jumlahSiswa(36, 13);
    }

}
