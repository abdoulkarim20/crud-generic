package cours.apprentissage.gestionproduitreact.business.crud;

import org.springframework.web.bind.annotation.GetMapping;

public abstract class CrudController<Entity,Id> {
    private ICrud<Entity,Id> icrud;

    protected CrudController(ICrud<Entity, Id> icrud) {
        this.icrud = icrud;
    }
    @GetMapping("/all")
    public Iterable<Entity> getAll() {
        return icrud.findAll();
    }
}
