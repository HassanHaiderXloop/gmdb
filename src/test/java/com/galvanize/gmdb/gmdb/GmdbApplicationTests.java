package com.galvanize.gmdb.gmdb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GmdbApplicationTests {

	// Stories for this project are shown below in order of value, with the highest value listed first.
    // This microservice will contain the CRUD operations required to interact with the GMDB movie database.
    // Other functionality (e.g. user authentication) is hosted in other microservices.
    //
    // 1. As a user
    //    I can GET a list of movies from GMDB that includes Movie ID | Movie Title | Year Released | Genre | Runtime
    //    so that I can see the list of available movies.
    // 
    // Movie ID | Movie Title | Year Released | Genre | Runtime
    // 2. As a user
    //    I can provide a movie ID and get back the record shown in story 1, 
    //    plus a list of reviews that contains Review ID | Movie ID | Reviewer ID | Review Text | DateTime last modified
    //    so that I can read the reviews for a movie.
    //
    // 3. As a user
    //    I can provide a Reviewer ID and get back a record that contains Reivewer ID | Username | Date Joined | Number of Reviews
    //    so that I can see details about a particular reviewer.
    //
    // 4. As a user
    //    I can register as a reviewer by providing my Username. (Reviewer ID should be autogenerated)
    //    So that I can start reviewing movies.
    //
    // 5. As a reviewer
    //    I can post a review by providing my reviewer ID, a movie ID and my review text. (Review ID should be autogenerated)
    //    So that I can share my opinions with others.
    //
    // 6. As a reviewer
    //    I can delete a review by providing my reviewer ID and a review ID
    //    So that I can remove reviews I no longer wish to share.
    //
    // 7. As a reviewer
    //    I can update a review by providing my reviewer ID, a movie ID and my review text.
    //    So that I can modify the opinion I'm sharing with others.
    //
    // 8. As an Admin
    //    I can add a new movie to the database by providing the data listed in story 1 (Movie ID should be autogenerated)
    //    so that I can share new movies with the users.
    // 9. As an Admin
    //    I can add update the entry for a movie by providing the data listed in Story 1.
    //    so that I can correct errors in previously uploaded movie entries.
    //
    //10. As an admin
    //    I can delete a movie by providing a movie ID
    //    so that I can remove movies I no longer wish to share.
    //
    //11. As an admin
    //    I can impersonate a reviewer and do any of the things they can do
    //    so that I can help confused reviewers.

	@Test
	public void contextLoads() {
	}

}
