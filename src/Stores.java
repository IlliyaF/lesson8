public class Stores {
int idStore;
int idChairs;
String dateOfComing;
int volumeOfParty;
int volumeOfResidue;

    public Stores(int idStore, int idChairs, String dateOfComing, int volumeOfParty, int volumeOfResidue) {
        this.idStore = idStore;
        this.idChairs = idChairs;
        this.dateOfComing = dateOfComing;
        this.volumeOfParty = volumeOfParty;
        this.volumeOfResidue = volumeOfResidue;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "idStore=" + idStore +
                ", idChairs=" + idChairs +
                ", dateOfComing='" + dateOfComing + '\'' +
                ", volumeOfParty=" + volumeOfParty +
                ", volumeOfResidue=" + volumeOfResidue +
                '}';
    }
}
