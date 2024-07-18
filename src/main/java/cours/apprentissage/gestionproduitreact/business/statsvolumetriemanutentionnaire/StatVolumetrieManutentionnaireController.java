package cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire;


import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireDynamicQueryDTO;
import cours.apprentissage.gestionproduitreact.business.statsvolumetriemanutentionnaire.dtos.StatVolumetrieManutentionnaireSumDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/statistique-volumetrie-manutentionnaire")
@CrossOrigin("*")
public class StatVolumetrieManutentionnaireController {
    private final IStatVolumetrieManutentionnaire iStatVolumetrieManutentionnaire;

    public StatVolumetrieManutentionnaireController(IStatVolumetrieManutentionnaire iStatVolumetrieManutentionnaire) {
        this.iStatVolumetrieManutentionnaire = iStatVolumetrieManutentionnaire;
    }
    @GetMapping("")
    public List<StatVolumetrieManutentionnaireSumDTO> getStatistiqueVolumetrieManutentionnaire(@RequestParam(required = false) Long annee, @RequestParam(required = false) Integer mois) {
        return iStatVolumetrieManutentionnaire.getAllStatVolumetrieManutentionnaire();
    }
    @GetMapping("/filter")
    public List<StatVolumetrieManutentionnaireDynamicQueryDTO>getAllVolumetrieByFilter(@RequestParam(required = false) Integer annee, @RequestParam(required = false) Integer startMonth, @RequestParam(required = false) Integer endMonth, @RequestParam(required = false) String codeManutentionnaire, @RequestParam(required = false) String codeTypeEnlevement) {
        return iStatVolumetrieManutentionnaire.getAllStatVolumetrieManutennairesByFields(annee,startMonth,endMonth,codeManutentionnaire,codeTypeEnlevement);
    }
}
