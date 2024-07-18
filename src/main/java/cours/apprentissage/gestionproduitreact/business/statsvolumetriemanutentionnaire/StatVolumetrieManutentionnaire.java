package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stats_enlevements")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatVolumetrieManutentionnaire {
    @Id
    private String id;
    private Integer annee;
    @Column(name = "code_mois")
    private Integer codeMois;
    private String mois;
    @Column(name = "code_manutentionnaire")
    private String codeManutentionnaire;
    @Column(name = "manutentionnaire")
    private String manutentionnaire;
    @Column(name = "code_typeenlevement")
    private String codeTypeEnlevement;
    @Column(name = "type_enlevement")
    private String typeEnlevement;
    private Long dossiers;
    private Long conteneurs;
}
