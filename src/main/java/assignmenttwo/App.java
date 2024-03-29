/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignmenttwo;

import assignmenttwo.refactoredsolitares.HeavenlyBody;
import assignmenttwo.solarsystem.Star;
import java.util.Arrays;

/**
 * This is the generated Hello World Greeting App.
 */
public class App {

  private void sunPlanetMoon() {
    assignmenttwo.solitares.Star sun = new assignmenttwo.solitares.Star("Sun", 696342);
    System.out.println("Solar System:");
    System.out.println("  " + sun);

    final assignmenttwo.solitares.Planet[] planets = {
      new assignmenttwo.solitares.Planet("Mercury", 2439),
      new assignmenttwo.solitares.Planet("Mercury", 2439),
      new assignmenttwo.solitares.Planet("Venus", 6051),
      new assignmenttwo.solitares.Planet("Earth", 6371),
      new assignmenttwo.solitares.Planet("Mars", 3389),
      new assignmenttwo.solitares.Planet("Jupiter", 69911),
      new assignmenttwo.solitares.Planet("Saturn", 58232),
      new assignmenttwo.solitares.Planet("Uranus", 25362),
      new assignmenttwo.solitares.Planet("Neptune", 24622)
      };
    System.out.println("\n  Planets:");
    for (assignmenttwo.solitares.Planet planet : planets) {
      System.out.println("    " + planet);
    }

    final assignmenttwo.solitares.Moon[] moons = {
      new assignmenttwo.solitares.Moon("Moon", 1737),
      new assignmenttwo.solitares.Moon("Phobos", 11),
      new assignmenttwo.solitares.Moon("Deimos", 6),
      new assignmenttwo.solitares.Moon("Io", 1821),
      new assignmenttwo.solitares.Moon("Europa", 1560),
      new assignmenttwo.solitares.Moon("Ganymede", 2634),
      new assignmenttwo.solitares.Moon("Callisto", 2410),
      new assignmenttwo.solitares.Moon("Titan", 2575),
      new assignmenttwo.solitares.Moon("Rhea", 763),
      new assignmenttwo.solitares.Moon("Iapetus", 734),
      new assignmenttwo.solitares.Moon("Miranda", 235),
      new assignmenttwo.solitares.Moon("Oberon", 761),
      new assignmenttwo.solitares.Moon("Titania", 788),
      new assignmenttwo.solitares.Moon("Triton", 1353),
      new assignmenttwo.solitares.Moon("Charon", 606)
      };

    System.out.println("\n  Some moons:");
    for (assignmenttwo.solitares.Moon moon : moons) {
      System.out.println("    " + moon);
    }
  }

  private void heavenlyBody() {
    // Create heavenly bodies
    HeavenlyBody sun = new assignmenttwo.refactoredsolitares.Star("Sun", 696342);
    HeavenlyBody earth = new assignmenttwo.refactoredsolitares.Planet("Earth", 6371);
    HeavenlyBody moon = new assignmenttwo.refactoredsolitares.Moon("Moon", 1737);

    // Array of heavenly bodies
    HeavenlyBody[] solarSystem = {sun, earth, moon};

    // Print information about the heavenly bodies
    for (HeavenlyBody body : solarSystem) {
      System.out.println(body);
    }
  }

  private void solarSytem() {
    // Create the sun, the central star of the solar system
    assignmenttwo.solarsystem.Star sun = new assignmenttwo.solarsystem.Star("Sun", 696340);

    // Add planets to the sun, along with their moons where applicable
    // Mercury
    sun.addPlanet("Mercury", 2439, 57909227);

    // Venus
    sun.addPlanet("Venus", 6051, 108209475);

    // Earth and its Moon
    assignmenttwo.solarsystem.Planet earth = sun.addPlanet("Earth", 6371, 149598262);
    earth.addMoon("Moon", 1737, 384400);

    // Mars and its moons (Phobos and Deimos)
    assignmenttwo.solarsystem.Planet mars = sun.addPlanet("Mars", 3389, 227943824);
    mars.addMoon("Phobos", 11, 9376);
    mars.addMoon("Deimos", 6, 23458);

    // Jupiter and its moons (adding only the four Galilean moons for simplicity)
    assignmenttwo.solarsystem.Planet jupiter = sun.addPlanet("Jupiter", 69911, 778340821);
    jupiter.addMoon("Io", 1821, 421700);
    jupiter.addMoon("Europa", 1560, 671034);
    jupiter.addMoon("Ganymede", 2634, 1070412);
    jupiter.addMoon("Callisto", 2410, 1882709);
 
    // Print the entire solar system hierarchy
    System.out.println(sun.toString());
    orderInHeaven(sun);
  }

  /**
   * Print all HeavenlyBodies in a SolarSystem in ascending order.
   *
   * @param hb each individual body of a solarsystem.
   */
  public static void printHeavenlyBody(assignmenttwo.solarsystem.HeavenlyBody hb) {
    System.out.println("Heavenly Body: " + hb.getName() + ", average radius " + hb.getAvgRadiusInKm() + "Km");
  }

  /**
   * Add heavenly bodies to an array and print them in ascending order.
   *
   * @param sun Sun.
   */
  public static void orderInHeaven(Star sun) {
    assignmenttwo.solarsystem.HeavenlyBody[] bodiesArray = sun.getHeavenlyBodies();
    Arrays.sort(bodiesArray);

    for (assignmenttwo.solarsystem.HeavenlyBody hb : bodiesArray) {
      printHeavenlyBody(hb);
    }
  }

  /**
   * The App starting point.
   *
   * @param args Unused program arguments.
   */
  public static void main(String[] args) {
    App theApp = new App();
    theApp.sunPlanetMoon();
    theApp.heavenlyBody();
    theApp.solarSytem();
  }
}
