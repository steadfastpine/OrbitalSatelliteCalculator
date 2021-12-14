/*
# Author: Scott Forsberg
# Contact: contact.scottforsberg@gmail.com
# Release Date: 2019-07-12
# Version: .1
 */

package orbitalSatelliteCalculator;

public class OrbitalSatelliteCalculator {

	// define constants for usage as default values	
	private final double MASS_OF_EARTH = 5.98e+24;
	private final double UNIVERSAL_GRAVITATIONAL_CONSTANT = 6.67e-11;

	// define private variables
	private double radius;	
	private double velocity; 
	private double massOfPlanet=0;
	private double universalGravitationalConstant=0;
	
	// main method
	public static void main(String[] args) {
	}
	
	// Constant resolver. If custom values not entered with setter methods, constant value is used
	private void resolveConstants() {
		if (universalGravitationalConstant==0) {
			universalGravitationalConstant=UNIVERSAL_GRAVITATIONAL_CONSTANT ;
		}
		if (massOfPlanet==0) {
			massOfPlanet=MASS_OF_EARTH ;
		}
	}
	
	// Getter - universalGravitationalConstant. Returns the value after resolving the constant
	public double getUniversalGravitationalConstant() {
		this.resolveConstants();
		return universalGravitationalConstant;
	}

	// Getter - massOfPlanet. Returns the value after resolving the constant 
	public double getMassOfPlanet() {
		this.resolveConstants();
		return massOfPlanet;
	}
	
	// Setter - universalGravitationalConstant. Assigns custom value for different dimentions and warped spacetime
	public void setUniversalGravitationalConstant(double universalGravitationalConstant) {
		this.universalGravitationalConstant = universalGravitationalConstant;
	}

	// Setter - massOfPlanet. Assigns custom value for planets other than Earth
	public void setMassOfPlanet(double massOfPlanet) {
		this.massOfPlanet = massOfPlanet;
	}
	
	// Input the radius, and it returns the orbital velocity
	public double getVelocity(double radius) {
		this.resolveConstants();
		velocity = Math.pow(((universalGravitationalConstant*massOfPlanet)/radius), .5);
		return velocity;
	}

	// Input the velocity and it returns the radius, being the distance from satellite to the center of rotation
	public double getRadius(double velocity) {
		this.resolveConstants();
		radius = ((universalGravitationalConstant*massOfPlanet)/(Math.pow(velocity, 2)));
		return radius;
	}
}
