package co.zw.movie.moviecatalogue.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class CatalogueItem {

    private String name;
    private String description;
    private int rating;

}
