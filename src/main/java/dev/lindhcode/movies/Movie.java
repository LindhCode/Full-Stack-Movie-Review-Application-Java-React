package dev.lindhcode.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") // Let the framework know that this class will present all documents in the Movies collection
@Data // Makes the class automatically have getters, setters and toString-methods
@AllArgsConstructor // Automatically creates a constructor that takes all the private fields as arguments
@NoArgsConstructor // Automatically creates a constructors with no parameters
public class Movie {
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference // This will cause the data for the reviews to be stored in a separate collection
    private List<Review> reviewIds;



}
