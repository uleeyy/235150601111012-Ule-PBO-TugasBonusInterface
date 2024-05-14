public class Dosen extends Civitas implements pesertaKelas, Pengajar {
    private String nip;
    private double gaji;

    public void ikutPenelitian() {
        System.out.println(nama + " mengikuti penelitian");
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk ke kelas");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihtugas() {
        System.out.println(nama + " mengasi tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas");
    }
}