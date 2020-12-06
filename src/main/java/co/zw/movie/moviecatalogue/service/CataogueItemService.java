package co.zw.movie.moviecatalogue.service;

import co.zw.movie.moviecatalogue.model.CatalogueItem;

import java.util.List;
import java.util.Optional;

public interface CataogueItemService {
    Optional<CatalogueItem> findById(String id);
     CatalogueItem save(String Id);
    List<CatalogueItem> findAll();
}
