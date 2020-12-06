package co.zw.movie.moviecatalogue.repository;

import co.zw.movie.moviecatalogue.model.CatalogueItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CatalogueItemRepository extends CrudRepository<CatalogueItem, String> {
    Optional<CatalogueItem> findById(String Id);
    CatalogueItem save(String Id);
    List<CatalogueItem> findAll();
}
