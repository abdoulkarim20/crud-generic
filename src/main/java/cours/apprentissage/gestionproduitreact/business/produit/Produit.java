package cours.apprentissage.gestionproduitreact.business.produit;

import cours.apprentissage.gestionproduitreact.business.categorie.Categorie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "td_produits")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String produitName;
    @Column(nullable = false, length = 100)
    private String photo;
    private Double prix;
    @Column(nullable = false, length = 200)
    private String description;
    @ManyToOne
    private Categorie categorie;
}
