package assignmenttwo.solarsystem;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a star in a solar system, extending the properties of a HeavenlyBody.
 * This class allows for the addition of planets orbiting the star.
 */
public class Star extends HeavenlyBody {
  private List<Planet> planets = new ArrayList<>();

  /**
   * Constructs a new Star object with a specified name and average radius.
   *
   * @param name The name of the star.
   * @param avgRadiusInKm The average radius of the star in kilometers.
   */
  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
  }

  /**
   * Adds a planet to the star's orbit.
   *
   * @param name The name of the planet.
   * @param avgRadiusInKm The average radius of the planet in kilometers.
   * @param avgOrbitRadiusInKm The average orbit radius of the planet in kilometers from the star.
   * @return The newly created Planet object.
   * @throws IllegalArgumentException If the planet's orbit radius is less than 18,000 km.
   */
  public Planet addPlanet(String name, int avgRadiusInKm, double avgOrbitRadiusInKm) {
    if (avgOrbitRadiusInKm < 18000) {
      throw new IllegalArgumentException("Planet orbit radius must be at least 18,000 km.");
    }
    Planet planet = new Planet(name, avgRadiusInKm, avgOrbitRadiusInKm);
    planets.add(planet);
    return planet;
  }

  /**
   * Retrieves all heavenly bodies associated with this star, including the star itself and all planets and their moons.
   *
   * @return An array of HeavenlyBody objects representing the star, its planets, and their moons.
   */
  public HeavenlyBody[] getHeavenlyBodies() {
    ArrayList<HeavenlyBody> entities = new ArrayList<>();
    for (Planet planet : planets) {
      for (HeavenlyBody h : planet.getHeavenlyBodies()) {
        entities.add(h);
      }
    }

    HeavenlyBody[] bodies = new HeavenlyBody[entities.size() + 1];
    bodies[0] = new Star(super.getName(), super.getAvgRadiusInKm());
    int index = 1;
    for (HeavenlyBody h : entities) {
      bodies[index++] = h;
    }
    return bodies;
  }

  /**
   * Checks if the average radius of the star is within an acceptable range.
   *
   * @param radius The radius to check.
   * @return true if the radius is greater than 16,700 km, false otherwise.
   */
  @Override
  protected boolean checkAvgRadiusInKm(int radius) {
    return radius > 16700;
  }

  /**
   * Returns a string representation of the star and its planetary system.
   *
   * @return A string detailing the star's name and information about its planets and their moons.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Star: ").append(super.getName())
        .append(", average radius ").append(super.getAvgRadiusInKm()).append("km\n\n");
    sb.append("Planets:\n");
    for (Planet planet : planets) {
      sb.append(planet.toString()).append("\n");
    }
    return sb.toString().trim(); // Trim to remove the last newline character
  }
}