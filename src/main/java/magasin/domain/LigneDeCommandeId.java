package magasin.domain;

public class LigneDeCommandeId {
    private final int id;

    public LigneDeCommandeId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof LigneDeCommandeId))
            return false;
        LigneDeCommandeId other = (LigneDeCommandeId)obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
