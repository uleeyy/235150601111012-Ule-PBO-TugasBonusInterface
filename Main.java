public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.nama = "Dr. Budi";
        dosen.ikutPenelitian();
        dosen.mengajar("Matematika");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Aldi";
        mahasiswa.ngerjainTugas();
        mahasiswa.masukKelas();

        Asprak asprak = new Asprak();
        asprak.nama = "Sari";
        asprak.ngasihKomenDiGCR();

        Resepsionis resepsionis = new Resepsionis();
        resepsionis.nama = "Andi";
        resepsionis.melayani();
    }
}