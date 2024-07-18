package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos;

public class StatVolumetrieManutentionnaireDynamicQueryDTO {
    private String id;
    private Integer annee;
    private Integer codeMois;
    private String mois;
    private String codeManutentionnaire;
    private String manutentionnaire;
    private String codeTypeEnlevement;
    private String typeEnlevement;
    private Long dossiers;
    private Long conteneurs;

    public StatVolumetrieManutentionnaireDynamicQueryDTO() {
    }

    public StatVolumetrieManutentionnaireDynamicQueryDTO(String id, Integer annee, Integer codeMois, String mois, String codeManutentionnaire, String manutentionnaire, String codeTypeEnlevement, String typeEnlevement, Long dossiers, Long conteneurs) {
        this.id = id;
        this.annee = annee;
        this.codeMois = codeMois;
        this.mois = mois;
        this.codeManutentionnaire = codeManutentionnaire;
        this.manutentionnaire = manutentionnaire;
        this.codeTypeEnlevement = codeTypeEnlevement;
        this.typeEnlevement = typeEnlevement;
        this.dossiers = dossiers;
        this.conteneurs = conteneurs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Integer getCodeMois() {
        return codeMois;
    }

    public void setCodeMois(Integer codeMois) {
        this.codeMois = codeMois;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getCodeManutentionnaire() {
        return codeManutentionnaire;
    }

    public void setCodeManutentionnaire(String codeManutentionnaire) {
        this.codeManutentionnaire = codeManutentionnaire;
    }

    public String getManutentionnaire() {
        return manutentionnaire;
    }

    public void setManutentionnaire(String manutentionnaire) {
        this.manutentionnaire = manutentionnaire;
    }

    public String getCodeTypeEnlevement() {
        return codeTypeEnlevement;
    }

    public void setCodeTypeEnlevement(String codeTypeEnlevement) {
        this.codeTypeEnlevement = codeTypeEnlevement;
    }

    public String getTypeEnlevement() {
        return typeEnlevement;
    }

    public void setTypeEnlevement(String typeEnlevement) {
        this.typeEnlevement = typeEnlevement;
    }

    public Long getDossiers() {
        return dossiers;
    }

    public void setDossiers(Long dossiers) {
        this.dossiers = dossiers;
    }

    public Long getConteneurs() {
        return conteneurs;
    }

    public void setConteneurs(Long conteneurs) {
        this.conteneurs = conteneurs;
    }
}
