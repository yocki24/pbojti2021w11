public class Keledai extends Binatang implements Herbivora {
    private String Suara, warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.Suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan(){
        System.out.println("Makanan\t\t: Tumbuhan");
    }
    public void displayBinatang(){
        System.out.println("Jenis\t\t: Herbivora");
    }
    public void displayData(){
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Jumlah Kaki\t: " + this.jmlKaki);
        System.out.println("Suara\t\t: " + this.Suara);
        System.out.println("Warna Bulu\t: " + this.warnaBulu);
    }
}
