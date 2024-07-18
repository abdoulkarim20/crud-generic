package cours.apprentissage.gestionproduitreact.business.crud;

import org.springframework.data.repository.CrudRepository;

public abstract class CrudImpl<Entity, Id> implements ICrud<Entity, Id> {
    private final CrudRepository<Entity, Id> repository;

    protected CrudImpl(CrudRepository<Entity, Id> repository) {
        this.repository = repository;
    }
    @Override
    public Iterable<Entity> findAll() {
        return repository.findAll();
    }
    @Override
    public Entity findById(Id id) {
        return repository.findById(id).get();
    }
    @Override
    public Entity save(Entity entity) {
        return repository.save(entity);
    }
    @Override
    public void deleteById(Id id) {
        repository.deleteById(id);
    }
    @Override
    public boolean existsById(Id id) {
        return repository.existsById(id);
    }

    @Override
    public Entity update(Entity entity) {
        return repository.save(entity);
    }
}
