package cours.apprentissage.gestionproduitreact.business.categorie;

import cours.apprentissage.gestionproduitreact.business.crud.CrudImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CategorieImpl extends CrudImpl<Categorie,Long> {
    public CategorieImpl(CategorieRepository categorieRepository) {
        super(categorieRepository);
    }
}
