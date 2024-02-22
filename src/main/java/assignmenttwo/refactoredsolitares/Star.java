package assignmenttwo.refactoredsolitares;

/**
 * Represents a Star, which is a specific type of {@link HeavenlyBody}.
 * Stars are characterized by their name and average radius in kilometers.
 * A Star must have an average radius greater than 16,700 kilometers to be valid.
 */
public class Star extends HeavenlyBody {

  /**
   * Constructs a new Star with the specified name and average radius.
   *
   * @param name The name of the star.
   * @param avgRadiusInKm The average radius of the star in kilometers.
   */
  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Checks if the given radius meets the criteria specific to a Star.
   * For a Star, the radius must be greater than 16,700 kilometers.
   *
   * @param radius The radius to check.
   * @return {@code true} if the radius is greater than 16,700 kilometers, {@code false} otherwise.
   */
  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius > 16700;
  }
}
