package assignmenttwo.refactoredsolitares;

/**
 * Represents a Planet, which is a specific type of {@link HeavenlyBody}.
 * Planets are characterized by their name and average radius in kilometers.
 * A Planet must have an average radius between 2,000 and 200,000 kilometers to be valid.
 */
public class Planet extends HeavenlyBody {

  /**
   * Constructs a new Planet with the specified name and average radius.
   *
   * @param name The name of the planet.
   * @param avgRadiusInKm The average radius of the planet in kilometers.
   */
  public Planet(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Checks if the given radius meets the criteria specific to a Planet.
   * For a Planet, the radius must be between 2,000 and 200,000 kilometers.
   *
   * @param radius The radius to check.
   * @return {@code true} if the radius is within the specified range, {@code false} otherwise.
   */
  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius >= 2000 && radius <= 200000;
  } 
}
