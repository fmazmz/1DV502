package assignmenttwo.solarsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a planet in a solar system, extending the properties of a HeavenlyBody.
 * This class adds functionality specific to planets, such as orbit radius and moons.
 */
public class Planet extends HeavenlyBody {
  private double avgOrbitRadiusInKm;
  private List<Moon> moons = new ArrayList<>();

  /**
   * Constructs a new Planet object with specified name, average radius, and average orbit radius.
   *
   * @param name The name of the planet.
   * @param avgRadiusInKm The average radius of the planet in kilometers.
   * @param avgOrbitRadiusInKm The average orbit radius of the planet in kilometers.
   * @throws IllegalArgumentException If the average orbit radius is less than 18,000 km.
   */
  protected Planet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    super(name, avgRadiusInKm);
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Orbit radius must be at least 18,000 km");
    }
    this.avgOrbitRadiusInKm = avgOrbitRadiusInKm;
  }
  
  /**
   * Adds a moon to the planet.
   *
   * @param name The name of the moon.
   * @param avgRadiusInKm The average radius of the moon in kilometers.
   * @param avgOrbitRadiusInKm The average orbit radius of the moon in kilometers.
   * @return The newly created Moon object.
   * @throws IllegalArgumentException If the moon's orbit radius or radius does not meet requirements.
   */
  public Moon addMoon(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    if (avgOrbitRadiusInKm < 60) {
      throw new IllegalArgumentException("Moon orbit must be at least 60 km.");
    }
    if (avgRadiusInKm > this.avgRadiusInKm / 2) {
      throw new IllegalArgumentException("Moon cannot be larger than half the size of its planet.");
    }
    Moon moon = new Moon(name, avgRadiusInKm, avgOrbitRadiusInKm);
    moons.add(moon);
    return moon;
  }

  /**
   * Gets the average orbit radius of the planet in kilometers.
   *
   * @return The average orbit radius in kilometers.
   */
  public double getAvgOrbitRadiusInKm() {
    return avgOrbitRadiusInKm;
  }

  /**
   * Retrieves all heavenly bodies associated with this planet, including the planet itself and its moons.
   *
   * @return An array of HeavenlyBody objects representing the planet and its moons.
   */
  public HeavenlyBody[] getHeavenlyBodies() {
    HeavenlyBody[] bodies = new HeavenlyBody[this.moons.size() + 1];
    bodies[0] = new Planet(super.getName(), super.getAvgRadiusInKm(), this.avgOrbitRadiusInKm);
    int index = 1;
    for (Moon moon : moons) {
      bodies[index++] = new Moon(moon.getName(), moon.getAvgRadiusInKm(), moon.getAvgOrbitRadiusInKm());
    }
    return bodies;
  }

  /**
   * Checks if the average radius of the planet is within an acceptable range.
   *
   * @param radius The radius to check.
   * @return true if the radius is between 2,000 km and 200,000 km, false otherwise.
   */
  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius >= 2000 && radius <= 200000;
  }

  /**
   * Returns a string representation of the planet and its moons.
   *
   * @return A string detailing the planet's name, orbit radius, and information about its moons.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("\tPlanet: ").append(super.getName())
        .append(", average radius ").append(super.getAvgRadiusInKm()).append("km");
    if (!moons.isEmpty()) {
      sb.append("\n\t\tMoons:\n");
      for (Moon moon : moons) {
        sb.append("\t\t").append(moon.toString()).append("\n");
      }
    }
    return sb.toString();
  }
}
