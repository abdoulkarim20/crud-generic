package cours.apprentissage.gestionproduitreact.business.categorie;

import cours.apprentissage.gestionproduitreact.business.categorie.dtos.CategorieDTO;

import java.util.List;

public interface ICategorie {
    List<CategorieDTO>getAllCategories();
    CategorieDTO save(CategorieDTO categorieDTO);

    CategorieDTO updateCategorie(CategorieDTO categorie);

    void deleteCategorie(Long id);

    CategorieDTO detailCategorie(Long id);
}
