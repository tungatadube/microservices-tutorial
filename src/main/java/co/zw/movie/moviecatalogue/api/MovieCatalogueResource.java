package co.zw.movie.moviecatalogue.api;

import co.zw.movie.moviecatalogue.model.CatalogueItem;
import co.zw.movie.moviecatalogue.model.Movie;
import co.zw.movie.moviecatalogue.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalogue")
public class MovieCatalogueResource {

    private WebClient.Builder webclientBuilder;

    @Value("${movies.uri}")
    private String uri;

    @Autowired
    public MovieCatalogueResource(@Qualifier("projectBuilder")
            WebClient.Builder webclientBuilder) {
        this.webclientBuilder = webclientBuilder;
    }

    @RequestMapping("/{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable String userId) {
        List<Rating> ratings = webclientBuilder.build()
                .get()
                .uri()
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Rating>> () {})
                .block();
        return ratings.stream().map(rating -> {
            Movie movie = webclientBuilder.build()
                    .get()
                    .uri(uri + "/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();
            return new CatalogueItem(movie.name, "Movie on the character Bumblebee", rating.getRating());
        }).collect(Collectors.toList());
    }
}
