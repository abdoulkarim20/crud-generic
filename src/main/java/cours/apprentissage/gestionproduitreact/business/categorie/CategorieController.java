package cours.apprentissage.gestionproduitreact.business.categorie;

import cours.apprentissage.gestionproduitreact.business.crud.CrudController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategorieController extends CrudController<Categorie, Long> {

    public CategorieController(CategorieImpl categorie) {
        super(categorie);
    }
}
