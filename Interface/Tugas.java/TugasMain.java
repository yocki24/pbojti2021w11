public class TugasMain {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("Keledai", 4, "hehehehe", "Abu-Abu");
        Gorila gorila = new Gorila("Gulali", 4, "Haaum Haaum", "Hitam Manis");
        Singa singa = new Singa("CingaCing", 4, "Roaaar", "Coklat");

        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();

        System.out.println();

        gorila.displayBinatang();
        gorila.displayMakan();
        gorila.displayData();

        System.out.println();

        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
    }
}
