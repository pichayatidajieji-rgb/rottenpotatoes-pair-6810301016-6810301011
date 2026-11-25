package th.ac.cdti.rottenpotatoes.acceptance;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import th.ac.cdti.rottenpotatoes.domain.Movie;
import th.ac.cdti.rottenpotatoes.domain.MovieCatalog;
import th.ac.cdti.rottenpotatoes.domain.Rating;

/** Step definitions for movie_filter.feature, run directly against the plain-Java domain. */
public class MovieSteps {

  private final List<Movie> movies = new ArrayList<>();
  private List<String> shown;

  @Given("a movie {string} rated {string} released in {int} is in the catalog")
  public void addMovieToTheCatalog(String title, String label, int year) {
    throw new io.cucumber.java.PendingException("TODO 6.1: add to movies, released 1 January");
  }

  /** Keeps only the titles, because the Then steps compare titles. */
  @When("I filter movies by rating {string}")
  public void filterMoviesByRating(String label) {
    throw new io.cucumber.java.PendingException("TODO 6.2: titles with this rating into shown");
  }

  @Then("I should see {string}")
  public void shouldSee(String title) {
    throw new io.cucumber.java.PendingException("TODO 6.3: shown has this title");
  }

  @Then("I should not see {string}")
  public void shouldNotSee(String title) {
    throw new io.cucumber.java.PendingException("TODO 6.4: shown does not have this title");
  }

  @Then("I should see no movies")
  public void shouldSeeNoMovies() {
    throw new io.cucumber.java.PendingException("TODO 6.5: shown is empty");
  }
}
