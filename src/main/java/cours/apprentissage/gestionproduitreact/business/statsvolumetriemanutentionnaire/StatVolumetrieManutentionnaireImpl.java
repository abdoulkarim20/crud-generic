package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire;

import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDynamicQueryDTO;
import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireSumDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StatVolumetrieManutentionnaireImpl implements IStatVolumetrieManutentionnaire {
    private final StatVolumetrieManutentionnaireRepository statVolumetrieManutentionnaireRepository;

    public StatVolumetrieManutentionnaireImpl(StatVolumetrieManutentionnaireRepository statVolumetrieManutentionnaireRepository) {
        this.statVolumetrieManutentionnaireRepository = statVolumetrieManutentionnaireRepository;
    }

    @Override
    public List<StatVolumetrieManutentionnaireSumDTO> getAllStatVolumetrieManutentionnaire() {
        return statVolumetrieManutentionnaireRepository.getAllStatVolumetrieManutennaires();
    }
    @Override
    public List<StatVolumetrieManutentionnaireDynamicQueryDTO>getAllStatVolumetrieManutennairesByFields(Integer annee, Integer startMonth, Integer endMonth, String codeManutentionnaire, String codeTypeEnlevement) {
        return statVolumetrieManutentionnaireRepository.getAllVolumetrieByQueryFields(annee,startMonth,endMonth,codeManutentionnaire,codeTypeEnlevement);
    }
}
