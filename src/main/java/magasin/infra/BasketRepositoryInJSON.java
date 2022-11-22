package magasin.infra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;

import magasin.domain.Basket;
import magasin.domain.BasketRepository;
import magasin.domain.LigneDeCommande;
import magasin.domain.Reference;

public class BasketRepositoryInJSON implements BasketRepository {

    @Override
    public void save(Basket basket) throws IOException {
        JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
        
        for (LigneDeCommande ligne: basket.getLignesDeCommande()) {
            
            Reference ref = ligne.getRef();
            JsonObject ligneDeCommandeObject = Json.createObjectBuilder()
            .add("id", ref.getRef().toString())
            .add("nom", ref.getNom())
            .add("description", ref.getDescription())
            .add("quantite", ligne.getQuantite().toString())
            .build();
            arrayBuilder.add(ligneDeCommandeObject);
        }

        try(BufferedWriter buff = new BufferedWriter(
            new FileWriter("basket" + basket.getId().toString() + ".json"))) {
                buff.write(arrayBuilder.build().toString());
            }
    }
}
