package cours.apprentissage.gestionproduitreact.business.categorie;

import cours.apprentissage.gestionproduitreact.business.produit.Produit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "td_categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String libelle;
    @Column(nullable = false, length = 200)
    private String descrition;
    @OneToMany(mappedBy = "categorie", fetch = FetchType.EAGER)
    private List<Produit> produits;
}
