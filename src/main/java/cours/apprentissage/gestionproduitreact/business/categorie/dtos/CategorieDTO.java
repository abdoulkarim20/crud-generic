package cours.apprentissage.gestionproduitreact.business.categorie.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategorieDTO {
    private Long id;
    private String libelle;
    private String descrition;
}
