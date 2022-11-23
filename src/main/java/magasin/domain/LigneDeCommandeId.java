package magasin.domain;

public class LigneDeCommandeId {
    private static Integer counter = 0;
    private final Integer value;

    public LigneDeCommandeId() {
        value = counter++;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}