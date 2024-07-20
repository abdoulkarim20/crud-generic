package cours.apprentissage.gestionproduitreact.business.categorie;

import cours.apprentissage.gestionproduitreact.business.categorie.dtos.CategorieDTO;
import cours.apprentissage.gestionproduitreact.business.crud.CrudController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@CrossOrigin("*")
public class CategorieController extends CrudController<Categorie, Long> {
    private final ICategorie iCategorie;

    public CategorieController(CategorieImpl categorie, ICategorie iCategorie) {
        super(categorie);
        this.iCategorie = iCategorie;
    }

    @GetMapping("/liste")
    public List<CategorieDTO> liste() {
        return iCategorie.getAllCategories();
    }

    @PostMapping("/save-categorie")
    public CategorieDTO save(@RequestBody CategorieDTO categorie) {
        return iCategorie.save(categorie);
    }

    @PutMapping("/update-categorie/{id}")
    public CategorieDTO update(@RequestBody CategorieDTO categorie, @PathVariable Long id) {
        categorie.setId(id);
        return iCategorie.updateCategorie(categorie);
    }

    @DeleteMapping("/delete-categorie/{id}")
    public void delete(@PathVariable Long id) {
        iCategorie.deleteCategorie(id);
    }

    @GetMapping("/detail-categorie/{id}")
    public CategorieDTO detailCategorie(@PathVariable Long id) {
        return iCategorie.detailCategorie(id);
    }
}
