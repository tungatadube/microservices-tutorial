package co.zw.movie.moviecatalogue.api;

import co.zw.movie.moviecatalogue.model.CatalogueItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {

    @RequestMapping("/{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable String userId){
        return Collections.singletonList(
                new CatalogueItem("Transformers:BumbleBee", "Movie on the character Bumblebee", 4));
    }
}
