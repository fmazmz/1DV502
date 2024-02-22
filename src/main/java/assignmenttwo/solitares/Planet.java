package assignmenttwo.solitares;

/**
 * Represents a planet with a name and an average radius in kilometers.
 * This class ensures that the planet has a valid name and an average radius within specified bounds
 * through its constructor and setter methods.
 */
public class Planet {
  private String name;
  private int avgRadiusInKm;

  /**
   * Constructs a new Planet instance with the specified name and average radius.
   * It validates the name and radius through the setName and setAvgRadiusInKm methods.
   *
   * @param name The name of the planet; must not be null or empty.
   * @param avgRadiusInKm The average radius of the planet in kilometers; must be within a valid range.
   * @throws IllegalArgumentException If the name or average radius do not meet the constraints.
   */
  public Planet(String name, int avgRadiusInKm) {
    this.setName(name);
    this.setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * Sets the name of the planet.
   * This method ensures the name is not null or empty.
   *
   * @param name The name to set for the planet.
   * @throws IllegalArgumentException If the name is null or empty.
   */
  private void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must be not null or empty");
    }
    this.name = name;
  }

  /**
   * Sets the average radius of the planet in kilometers.
   * This method validates that the radius is within the specified range.
   *
   * @param avgRadiusInKm The average radius to set for the planet; must be between 2,000 and 200,000 kilometers.
   * @throws IllegalArgumentException If the average radius is outside the allowed range.
   */
  private void setAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 2000 || avgRadiusInKm > 200000) {
      throw new IllegalArgumentException("Planet's average radius must be between 2 000km - 200 000km");
    }
    this.avgRadiusInKm = avgRadiusInKm;
  }

  /**
   * Returns the name of the planet.
   *
   * @return The name of the planet.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the average radius of the planet in kilometers.
   *
   * @return The average radius of the planet.
   */
  public int getAvgRadiusInKm() {
    return this.avgRadiusInKm;
  }

  /**
   * Returns a string representation of the planet, including its name and average radius.
   *
   * @return A string that represents the planet.
   */
  @Override
  public String toString() {
    return "Planet: " + name + "," + avgRadiusInKm + "km";
  }

  protected final void finalize() {
    
  }
}
