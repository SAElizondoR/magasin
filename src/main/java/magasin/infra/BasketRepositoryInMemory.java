package magasin.infra;

import java.util.HashSet;
import java.util.Set;

import magasin.domain.Basket;
import magasin.domain.BasketRepository;

public class BasketRepositoryInMemory implements BasketRepository {
    Set<Basket> memory;

    public BasketRepositoryInMemory() {
        memory = new HashSet<>();
    }

    @Override
    public void save(Basket basket) {
        memory.add(basket);
    }
}
