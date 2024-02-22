package assignmenttwo.solarsystem;

/**
 * Represents an abstract celestial body, providing a foundation for specific types of celestial bodies
 * such as planets, moons, and stars. It defines common properties and functionalities.
 */
public abstract class HeavenlyBody implements Comparable<HeavenlyBody> {
  protected String name;
  protected int avgRadiusInKm;

  /**
   * Constructs a new HeavenlyBody with a specified name and average radius.
   *
   * @param name The name of the celestial body.
   * @param avgRadiusInKm The average radius of the celestial body in kilometers.
   * @throws IllegalArgumentException If the name is null or empty, or if the radius is invalid.
   */
  protected HeavenlyBody(String name, int avgRadiusInKm) {
    this.setName(name);
    this.setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * Returns the name of the celestial body.
   *
   * @return The name of the celestial body.
   */
  public String getName() {
    return name;
  }

  /**
   * Sets a new name for the celestial body.
   *
   * @param newName The new name to be set.
   * @throws IllegalArgumentException If the new name is null or empty.
   */
  protected void setName(String newName) {
    if (newName == null || newName.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty.");
    }
    this.name = newName;
  }

  /**
   * Returns the average radius of the celestial body in kilometers.
   *
   * @return The average radius of the celestial body.
   */
  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * Sets the average radius of the celestial body.
   *
   * @param radius The new average radius to be set, in kilometers.
   * @throws IllegalArgumentException If the radius is deemed invalid by {@link #checkAvgRadiusInKm(int)}.
   */
  protected void setAvgRadiusInKm(int radius) {
    if (checkAvgRadiusInKm(radius)) {
      this.avgRadiusInKm = radius;
    } else {
      throw new IllegalArgumentException("Invalid radius for " + this.getClass().getSimpleName() + ": " + radius);
    }
  }

  /**
   * Checks if the provided average radius is valid for the celestial body.
   *
   * @param radius The radius to check.
   * @return true if the radius is valid, false otherwise.
   */
  protected abstract boolean checkAvgRadiusInKm(int radius);

  /**
   * Returns a string representation of the celestial body.
   * This method is abstract as the representation depends on the specific type of celestial body.
   *
   * @return A string detailing information about the celestial body.
   */
  @Override
  public abstract String toString();

  /**
   * Compares the current bodies average radius to others.
   *
   * @param other The bodies to check.
   * @return positive, zero, or a negative integer.
   */
  @Override
  public int compareTo(HeavenlyBody other) {
    return Integer.compare(this.avgRadiusInKm, other.avgRadiusInKm);
  }
}