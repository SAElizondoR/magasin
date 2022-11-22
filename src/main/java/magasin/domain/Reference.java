package magasin.domain;

public class Reference {
    private final ReferenceId ref;
    private final String nom;
    private final String description;
    private final Integer prix;

    public Reference(String ref, String nom, String description, Integer prix) {
        this.ref = new ReferenceId(ref);
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public ReferenceId getRef() {
        return ref;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrix() {
        return prix;
    }
}
