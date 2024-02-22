package assignmenttwo.solitares;

/**
 * Represents a moon with a name and an average radius in kilometers.
 * This class ensures that the moon has a valid name and an average radius within specified bounds
 * through its constructor and setter methods.
 */
public class Moon {
  private String name;
  private int avgRadiusInKm;

  /**
   * Constructs a new Moon instance with the specified name and average radius.
   * It validates the name and radius through the setName and setAvgRadiusInKm methods.
   *
   * @param name The name of the moon; must not be null or empty.
   * @param avgRadiusInKm The average radius of the moon in kilometers; must be within a realistic range for moons.
   * @throws IllegalArgumentException If the name or average radius do not meet constraints.
   */
  public Moon(String name, int avgRadiusInKm) {
    this.setName(name);
    this.setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * Sets the name of the moon.
   * This method ensures the name is not null or empty.
   *
   * @param name The name to set for the moon.
   * @throws IllegalArgumentException If the name is null or empty.
   */
  private void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must be not null or empty");
    }
    this.name = name;
  }

  /**
   * Sets the average radius of the moon in kilometers.
   * This method validates that the radius is within a realistic range for moons.
   *
   * @param avgRadiusInKm The average radius to set for the moon;
   * @throws IllegalArgumentException If the average radius is outside the allowed range.
   */
  private void setAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 6 || avgRadiusInKm > 10000) {
      throw new IllegalArgumentException("THe moon must be between 6km - 10 000km");
    }
    this.avgRadiusInKm = avgRadiusInKm;
  }

  /**
   * Returns the name of the moon.
   *
   * @return The name of the moon.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Returns the average radius of the moon in kilometers.
   *
   * @return The average radius of the moon.
   */
  public int getAvgRadiusInKm() {
    return this.avgRadiusInKm;
  }

  /**
   * Returns a string representation of the moon, including its name and average radius.
   *
   * @return A string that represents the moon.
   */
  @Override
  public String toString() {
    return "Moon: " + name + "," + avgRadiusInKm + "km";
  }

  protected final void finalize() {
    
  }
}
