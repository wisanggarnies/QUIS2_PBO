public class RunDinosaurus {
    public static void main(String[] args) {
        TyrannosaurusRex trex = new TyrannosaurusRex();
        Triceratops tricera = new Triceratops();
        Oviraptor ovi = new Oviraptor();
        AnakPemburu anak = new AnakPemburu();

        System.out.println("|===============================================|");
        trex.makan();
        trex.berjalan();

        System.out.println("|===============================================|");
        tricera.makan();
        tricera.berjalan();

        System.out.println("|===============================================|");
        ovi.makan();
        ovi.berjalan();
        ovi.bertelur();

        System.out.println("|===============================================|");
        anak.berburu();
        anak.mengambilTelur(tricera);
        System.out.println("|===============================================|");
    }
}
