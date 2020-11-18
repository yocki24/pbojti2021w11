public class Gorila extends Binatang implements Karnivora, Herbivora{
    private String suara, warnaBulu;

    public Gorila(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Makanan\t\t: Daging dan Tumbuhan");
    }
    public void displayBinatang(){
        System.out.println("Jenis\t\t: Karnivora dan Herbivora");
    }
    public void displayData(){
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
        System.out.println("Suara\t\t: " + this.suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu);
    }
}
