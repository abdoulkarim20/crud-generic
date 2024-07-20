package cours.apprentissage.gestionproduitreact.business.categorie.mappers;

import cours.apprentissage.gestionproduitreact.business.categorie.Categorie;
import cours.apprentissage.gestionproduitreact.business.categorie.dtos.CategorieDTO;
import cours.apprentissage.gestionproduitreact.utils.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper extends EntityMapper<CategorieDTO, Categorie> {
}
