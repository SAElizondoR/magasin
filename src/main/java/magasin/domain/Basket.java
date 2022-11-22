package magasin.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Basket {
    private final BasketId id;
    private final ArrayList<LigneDeCommande> lignesDeCommande;
    private Integer montant;

    public Basket() {
        id = new BasketId();
        lignesDeCommande = new ArrayList<>();
        montant = 0;
    }

    public BasketId getId() {
        return id;
    }

    public List<LigneDeCommande> getLignesDeCommande() {
        return lignesDeCommande;
    }

    void addReference(Reference reference, Integer quantite) {
        LigneDeCommande ligneDeCommande =
            new LigneDeCommande(reference, quantite);
        lignesDeCommande.add(ligneDeCommande);
        montant += ligneDeCommande.getMontant();
    }

    void supprimerReference(Reference ref) {
        Iterator<LigneDeCommande> iter = lignesDeCommande.iterator();
        while (iter.hasNext()) {
            LigneDeCommande actual = iter.next();
            if (actual.getRef() == ref) {
                iter.remove();
                return;
            }
        }
        throw new NoSuchElementException("Reference not found");
    }
}
