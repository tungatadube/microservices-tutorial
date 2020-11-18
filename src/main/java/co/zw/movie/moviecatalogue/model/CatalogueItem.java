package co.zw.movie.moviecatalogue.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CatalogueItem {

    private String name;
    private String description;
    private int rating;

}
