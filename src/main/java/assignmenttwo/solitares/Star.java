package assignmenttwo.solitares;

/**
 * Represents a star with a name and an average radius.
 * The Star class provides methods to safely set and retrieve the star's properties.
 * It insures the name is not null or empty and the average radius meets certain constraints.
 */
public class Star {
  private String name;
  private int avgRadiusInKm;

  
  /**
   * Constructs a Star instance with a specified name and average radius.
   *
   * @param name The name of the star. Cannot be null or empty.
   * @param avgRadiusInKm The average radius of the star in kilometers. Must be greater than 16 700km.
   * @throws IllegalArgumentException if the name or the average radius do not meet constraints.
   */
  public Star(String name, int avgRadiusInKm) {
    this.setName(name);
    this.setAvgRadiusInKm(avgRadiusInKm);
  }

  
  /**
   * Sets the name of the star.
   *
   * @param name The name set for the star. IT must not be null or empty.
   * @throws IllegalArgumentException if the name does not meet constraints.
   */
  private void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must be not null or empty");
    }
    this.name = name;
  }

  /**
   * Sets the average radius of the star in kilometers.
   *
   * @param avgRadiusInKm The average radius to set for the star. Must be greater than 16,700 km.
   * @throws IllegalArgumentException if avgRadiusInKm is less than 16,700 km.
   */
  private void setAvgRadiusInKm(int avgRadiusInKm) {
    if (avgRadiusInKm < 16700) {
      throw new IllegalArgumentException("Star cannot be smaller than 16 700km");
    }
    this.avgRadiusInKm = avgRadiusInKm;
  }

  /**
   * Returns the name of the star.
   *
   * @return The name of the star.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Return the average radius of the star in kilometers.
   *
   * @return The average radius of the star.
   */
  public int getAvgRadiusInKm() {
    return this.avgRadiusInKm;
  }

  /**
   * Returns the name of the star and the average radius as a string.
   *
   * @return The name and average radius of the star in a string format.
   */
  @Override
  public String toString() {
    return "Star: " + name + "," + avgRadiusInKm + "km";
  }

  protected final void finalize() {
    
  }
}