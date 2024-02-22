package assignmenttwo.refactoredsolitares;

/**
 * Represents a Moon, which is a specific type of {@link HeavenlyBody}.
 * Moons are characterized by their name and average radius in kilometers.
 * A Moon must have an average radius between 6 and 10,000 kilometers to be valid.
 */
public class Moon extends HeavenlyBody {

  /**
   * Constructs a new Moon with the specified name and average radius.
   *
   * @param name The name of the moon.
   * @param avgRadiusInKm The average radius of the moon in kilometers.
   */
  public Moon(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Checks if the given radius meets the criteria specific to a Moon.
   * For a Moon, the radius must be between 6 and 10,000 kilometers.
   *
   * @param radius The radius to check.
   * @return {@code true} if the radius is within the specified range, {@code false} otherwise.
   */
  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius >= 6 && radius <= 10000;
  }
}
