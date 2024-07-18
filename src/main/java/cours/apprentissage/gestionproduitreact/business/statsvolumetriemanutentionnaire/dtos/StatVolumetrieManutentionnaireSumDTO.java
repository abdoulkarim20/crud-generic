package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos;

public class StatVolumetrieManutentionnaireSumDTO {
    private String manutentionnaire;
    private String typeEnlevement;
    private String codeManutentionnaire;
    private Long totalDossier;
    private Long totalConteneur;

    public StatVolumetrieManutentionnaireSumDTO() {
    }

    public StatVolumetrieManutentionnaireSumDTO(String manutentionnaire, String typeEnlevement, String codeManutentionnaire, Long totalDossier, Long totalConteneur) {
        this.manutentionnaire = manutentionnaire;
        this.typeEnlevement = typeEnlevement;
        this.codeManutentionnaire = codeManutentionnaire;
        this.totalDossier = totalDossier;
        this.totalConteneur = totalConteneur;
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

    public String getCodeManutentionnaire() {
        return codeManutentionnaire;
    }

    public void setCodeManutentionnaire(String codeManutentionnaire) {
        this.codeManutentionnaire = codeManutentionnaire;
    }

    public Long getTotalDossier() {
        return totalDossier;
    }

    public void setTotalDossier(Long totalDossier) {
        this.totalDossier = totalDossier;
    }

    public Long getTotalConteneur() {
        return totalConteneur;
    }

    public void setTotalConteneur(Long totalConteneur) {
        this.totalConteneur = totalConteneur;
    }
}
