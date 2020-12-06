package co.zw.movie.moviecatalogue.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@NoArgsConstructor
@Data
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String movieId;
    public String name;
    @OneToMany
    public Rating rating;
}
