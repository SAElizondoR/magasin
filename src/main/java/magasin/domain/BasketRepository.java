package magasin.domain;

import java.io.IOException;

public interface BasketRepository {
    public void save(Basket basket) throws IOException;
}
