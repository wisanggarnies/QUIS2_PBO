public class AnakPemburu extends Pemburu implements IMengambilTelur{
    public void berburu() {
        super.berburu(null);
    }
    public void mengambilTelur(Dinosaurus dino) {
        System.out.println("Mengambil telur");
    }
}
