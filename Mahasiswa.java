public class Mahasiswa extends Civitas implements pesertaKelas {
    private String nim;
    private double ipk;
    private int golUkt;

    public void ngerjainTugas() {
        System.out.println(nama + " mengerjakan tugas");
    }

    public void pasrah() {
        System.out.println(nama + " pasrah");
    }

    public void mengikutiOrganisasi(String nama) {
        System.out.println(this.nama + " mengikuti organisasi " + nama);
    }

    public void presentasi() {
        System.out.println(nama + " presentasi");
    }

    @Override
    public void masukKelas() {
        System.out.println(nama + " masuk ke kelas");
    }
}