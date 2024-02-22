package assignmenttwo.refactoredsolitares;

/**
 * Represents an abstract concept of a heavenly body such as a star, planet, or moon.
 * This class provides a common structure and functionality for all types of heavenly bodies.
 */
public abstract class HeavenlyBody {
  private String name;
  private int avgRadiusInKm;

  /**
   * Constructs a new HeavenlyBody with the specified name and average radius.
   *
   * @param name The name of the heavenly body.
   * @param avgRadiusInKm The average radius of the heavenly body in kilometers.
   */
  protected HeavenlyBody(String name, int avgRadiusInKm) {
    this.setName(name);
    this.setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * Sets the name of this heavenly body.
   * This method is intended for internal use to ensure the name adheres
   * to validation rules, such as not being null or empty.
   *
   * @param name the new name to be assigned to this heavenly body.
   * @throws IllegalArgumentException if the newName is null or empty.
   */
  private void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must be not null or empty");
    }
    this.name = name;
  }

  /**
   * Sets the average radius of the heavenly body, ensuring it meets specific criteria.
   *
   * @param radius The new average radius in kilometers to set for this heavenly body.
   * @throws IllegalArgumentException if the specified radius does not meet the criteria.
   */
  protected void setAvgRadiusInKm(int radius) {
    if (checkAvgRadiusInKm(radius)) {
      this.avgRadiusInKm = radius;
    } else {
      throw new IllegalArgumentException("Invalid radius for " + this.getClass().getSimpleName());
    }
  }

  /**
   * Checks if the given radius is within acceptable limits for this type of heavenly body.
   *
   * @param radius The radius in kilometers to check.
   * @return true if the radius is acceptable, false otherwise.
   */
  protected abstract boolean checkAvgRadiusInKm(int radius);

  /**
   * Gets the name of this heavenly body.
   *
   * @return The name of the heavenly body.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the average radius of this heavenly body in kilometers.
   *
   * @return The average radius in kilometers.
   */
  public int getAvgRadiusInKm() {
    return this.avgRadiusInKm;
  }

  /**
   * Returns a string representation of this heavenly body, including its name and average radius.
   *
   * @return A string representation of this heavenly body.
   */
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + " = " + name + " ," 
      + "avgRadiusInKm = " + avgRadiusInKm + "Km"; 
  }
}
