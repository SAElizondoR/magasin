package magasin.domain;

public class ReferenceId {
    private final String value;

    public ReferenceId(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ReferenceId))
            return false;
        ReferenceId other = (ReferenceId)obj;
        return value == other.value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
