package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire;

import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDTO;
import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDynamicQueryDTO;
import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireSumDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface StatVolumetrieManutentionnaireRepository extends JpaRepository<StatVolumetrieManutentionnaire, String> {
    String QUERY_VOLUMETRIE_MANUTENTIONNAIRE = " SELECT new cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDTO(" +
            "stv.annee ," +
            "stv.mois ," +
            "stv.manutentionnaire ," +
            "stv.typeEnlevement ," +
            "stv.dossiers ," +
            "stv.conteneurs ) FROM StatVolumetrieManutentionnaire as stv";

    String QUERY_VOLUMETRIE_SUM_MANUTENTIONNAIRE = " SELECT new cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireSumDTO(" +
            "stv.manutentionnaire ," +
            "stv.typeEnlevement ," +
            "stv.codeManutentionnaire ," +
            "SUM(stv.dossiers) ," +
            "SUM(stv.conteneurs) ) FROM StatVolumetrieManutentionnaire as stv ";
    String QUERY_FILTER_BY_DYNAMIC_FIELDS = " SELECT new cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDynamicQueryDTO(" +
            "stv.id ," +
            "stv.annee ," +
            "stv.codeMois ," +
            "stv.mois ," +
            "stv.codeManutentionnaire ," +
            "stv.manutentionnaire ," +
            "stv.codeTypeEnlevement ," +
            "stv.typeEnlevement ," +
            "SUM(stv.dossiers) ," +
            "SUM(stv.conteneurs) ) FROM StatVolumetrieManutentionnaire as stv ";

    @Query(value = QUERY_VOLUMETRIE_MANUTENTIONNAIRE + " WHERE stv.annee = :annee AND stv.codeMois >=:startMonth AND stv.codeMois <=:endMonth ORDER BY stv.codeMois ASC ")
    List<StatVolumetrieManutentionnaireDTO>getAllStatVolumetrieManutennairesByDateBeteween(
            @Param("annee") Long annee,
            @Param("startMonth") Integer startMonth,
            @Param("endMonth") Integer endMonth
    );
    @Query(value = QUERY_VOLUMETRIE_SUM_MANUTENTIONNAIRE + " GROUP BY stv.manutentionnaire, stv.codeManutentionnaire, stv.typeEnlevement ORDER BY SUM(stv.dossiers) DESC ")
    List<StatVolumetrieManutentionnaireSumDTO>getAllStatVolumetrieManutennaires();
    @Query(value = QUERY_FILTER_BY_DYNAMIC_FIELDS + " WHERE (:annee is null or stv.annee = :annee) " +
            "and (:startMonth is null or stv.codeMois >= :startMonth) " +
            "and (:endMonth is null or stv.codeMois <= :endMonth) " +
            "and (:codeManutentionnaire is null or stv.codeManutentionnaire = :codeManutentionnaire) " +
            "and (:codeTypeEnlevement is null or stv.codeTypeEnlevement = :codeTypeEnlevement) " +
            "GROUP BY stv.id, " +
            "stv.annee, " +
            "stv.codeMois, " +
            "stv.mois, " +
            "stv.codeManutentionnaire, " +
            "stv.manutentionnaire, " +
            "stv.codeTypeEnlevement, " +
            "stv.typeEnlevement " +
            "ORDER BY SUM(stv.conteneurs) DESC")
    List<StatVolumetrieManutentionnaireDynamicQueryDTO> getAllVolumetrieByQueryFields(
           @Param("annee") Integer annee,
           @Param("startMonth") Integer startMonth,
           @Param("endMonth") Integer endMonth,
           @Param("codeManutentionnaire") String codeManutentionnaire,
           @Param("codeTypeEnlevement") String codeTypeEnlevement
    );
}
