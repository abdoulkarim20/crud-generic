package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire;


import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDynamicQueryDTO;
import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireSumDTO;

import java.util.List;

public interface IStatVolumetrieManutentionnaire {
    List<StatVolumetrieManutentionnaireSumDTO> getAllStatVolumetrieManutentionnaire();

    List<StatVolumetrieManutentionnaireDynamicQueryDTO>getAllStatVolumetrieManutennairesByFields(Integer annee, Integer startMonth, Integer endMonth, String codeManutentionnaire, String codeTypeEnlevement);
}
