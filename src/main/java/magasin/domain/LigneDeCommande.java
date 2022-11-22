package magasin.domain;

public class LigneDeCommande {
    private final Reference reference;
    private Integer quantite;
    private Integer montant;

    public LigneDeCommande(Reference reference, Integer quantite) {
        this.reference = reference;
        this.quantite = quantite;
        montant = quantite * reference.getPrix();
    }

    public Reference getRef() {
        return reference;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public Integer getMontant() {
        return montant;
    }
}
