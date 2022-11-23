package magasin.domain;

public class LigneDeCommande {
    private final LigneDeCommandeId id;
    private final Reference reference;
    private Integer quantite;
    private Integer montant;

    public LigneDeCommande(LigneDeCommandeId id, Reference reference, Integer quantite) {
        this.id = id;
        this.reference = reference;
        this.quantite = quantite;
        montant = quantite * reference.getPrix();
    }

    public LigneDeCommandeId getId() {
        return id;
    }

    public Reference getReference() {
        return reference;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public Integer getMontant() {
        return montant;
    }
}
