package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos;

public class StatVolumetrieManutentionnaireDTO {
    private Integer annee;
    private String mois;
    private String manutentionnaire;
    private String typeEnlevement;
    private Long dossiers;
    private Long conteneurs;
    private String codeManutentionnaire;

    public StatVolumetrieManutentionnaireDTO() {
    }

    public StatVolumetrieManutentionnaireDTO(Integer annee, String mois, String manutentionnaire, String typeEnlevement, Long dossiers, Long conteneurs) {
        this.annee = annee;
        this.mois = mois;
        this.manutentionnaire = manutentionnaire;
        this.typeEnlevement = typeEnlevement;
        this.dossiers = dossiers;
        this.conteneurs = conteneurs;
    }

    public StatVolumetrieManutentionnaireDTO(String manutentionnaire, String typeEnlevement, String codeManutentionnaire, Long conteneurs, Long dossiers) {
        this.manutentionnaire = manutentionnaire;
        this.typeEnlevement = typeEnlevement;
        this.codeManutentionnaire = codeManutentionnaire;
        this.conteneurs = conteneurs;
        this.dossiers = dossiers;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public String getManutentionnaire() {
        return manutentionnaire;
    }

    public void setManutentionnaire(String manutentionnaire) {
        this.manutentionnaire = manutentionnaire;
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

    public String getCodeManutentionnaire() {
        return codeManutentionnaire;
    }

    public void setCodeManutentionnaire(String codeManutentionnaire) {
        this.codeManutentionnaire = codeManutentionnaire;
    }
}
