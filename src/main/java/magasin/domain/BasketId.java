package magasin.domain;

public class BasketId {
    private static int counter = 0;
    private final Integer value;

    public BasketId() {
        value = counter++;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BasketId))
            return false;
        BasketId other = (BasketId)obj;
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return value;
    }
}
