package cours.apprentissage.gestionproduitreact.utils;

import java.util.List;

public interface EntityMapper<D,E>{
    D toDto(E entity);
    E toEntity(D dto);
    List<D> toDto(List<E> toEntityList);
    List<D> toEntity(List<E> toDtoList);
}
