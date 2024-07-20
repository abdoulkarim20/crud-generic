package cours.apprentissage.gestionproduitreact.business.categorie;

import cours.apprentissage.gestionproduitreact.business.categorie.dtos.CategorieDTO;
import cours.apprentissage.gestionproduitreact.business.categorie.mappers.CategorieMapper;
import cours.apprentissage.gestionproduitreact.business.crud.CrudImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CategorieImpl extends CrudImpl<Categorie,Long> implements ICategorie{
    private final CategorieMapper categorieMapper;
    private final CategorieRepository categorieRepository;

    public CategorieImpl(CategorieRepository categorieRepository, CategorieMapper categorieMapper) {
        super(categorieRepository);
        this.categorieMapper = categorieMapper;
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<CategorieDTO> getAllCategories() {
        return categorieMapper.toDto(categorieRepository.findAll());
    }

    @Override
    public CategorieDTO save(CategorieDTO categorieDTO) {
        Categorie categorie=categorieMapper.toEntity(categorieDTO);
        Categorie categorieSaved=categorieRepository.save(categorie);
        return categorieMapper.toDto(categorieSaved);
    }

    @Override
    public CategorieDTO updateCategorie(CategorieDTO categorieDTO) {
        Categorie categorie=categorieMapper.toEntity(categorieDTO);
        return categorieMapper.toDto(categorieRepository.save(categorie));
    }

    @Override
    public void deleteCategorie(Long id) {
        Categorie categorie=categorieRepository.findById(id).orElse(null);
        if (categorie!=null){
            categorieRepository.delete(categorie);
        }else {
            throw new RuntimeException("categorie n'existe pas");
        }
    }

    @Override
    public CategorieDTO detailCategorie(Long id) {
        Categorie categorie=categorieRepository.findById(id).orElse(null);
        if (categorie!=null){
           return categorieMapper.toDto(categorie);
        }else {
            throw new RuntimeException("categorie n'existe pas");
        }
    }
}
