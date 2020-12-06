package co.zw.movie.moviecatalogue.service;

import co.zw.movie.moviecatalogue.model.CatalogueItem;
import co.zw.movie.moviecatalogue.model.Movie;
import co.zw.movie.moviecatalogue.repository.CatalogueItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CatalogueItemServiceImpl implements CataogueItemService {

    private CatalogueItemRepository catalogueItemRepository;

    @Autowired
    public CatalogueItemServiceImpl(CatalogueItemRepository movieRepository) {
        this.catalogueItemRepository = movieRepository;
    }

    @Override
    public Optional<CatalogueItem> findById(String movieId) {
        return catalogueItemRepository.findById(movieId);
    }

    @Override
    public CatalogueItem save(String id) {
        return catalogueItemRepository.save(id);
    }

    @Override
    public List<CatalogueItem> findAll() {
        return catalogueItemRepository.findAll();
    }
}
