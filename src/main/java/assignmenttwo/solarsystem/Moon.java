package assignmenttwo.solarsystem;


/**
 * Represents a moon orbiting a planet, extending the properties of a HeavenlyBody.
 */
public class Moon extends HeavenlyBody {
  private double avgOrbitRadiusInKm;

  /**
   * Constructs a new Moon object with a specified name, average radius, and average orbit radius.
   *
   * @param name The name of the moon.
   * @param avgRadiusInKm The average radius of the moon in kilometers.
   * @param avgOrbitRadiusInKm The average orbit radius of the moon in kilometers from its planet.
   * @throws IllegalArgumentException If the orbit radius is less than 60 km.
   */
  protected Moon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Orbit radius must be at least 60 km.");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }

  /**
   * Returns the average orbit radius of the moon.
   *
   * @return The average orbit radius in kilometers.
   */
  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Validates the average radius of the moon.
   *
   * @param radius The radius to check.
   * @return true if the radius is between 6 and 10,000 km, false otherwise.
   * @throws IllegalArgumentException If the radius is not within the specified range.
   */
  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    if (radius < 6 || radius > 10000) {
      throw new IllegalArgumentException("Radius must be between 100 km and 10,000 km.");
    }
    return true;
  }

  /**
   * Returns a string representation of the moon, including its name and orbit radius.
   *
   * @return A string detailing the moon's name and its orbit radius in kilometers.
   */
  @Override
  public String toString() {
    return "\tMoon: " + super.getName() + ", average radius " + super.getAvgRadiusInKm() + "km";
  }
}
