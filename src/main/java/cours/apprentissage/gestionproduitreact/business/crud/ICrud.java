package cours.apprentissage.gestionproduitreact.business.crud;

public interface ICrud <Entity,Id>{
    Iterable<Entity> findAll();
    Entity findById(Id id);
    Entity save(Entity entity);
    void deleteById(Id id);
    boolean existsById(Id id);
    Entity update(Entity entity);
}
