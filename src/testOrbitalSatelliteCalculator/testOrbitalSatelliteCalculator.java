/*
# Author: Scott Forsberg
# Contact: contact.scottforsberg@gmail.com
# Release Date: 2019-07-12
# Version: .1
 */

package testOrbitalSatelliteCalculator;

import orbitalSatelliteCalculator.OrbitalSatelliteCalculator;

public class testOrbitalSatelliteCalculator {

	public static void main(String[] args) {
		
		OrbitalSatelliteCalculator osc = new OrbitalSatelliteCalculator();
		
		System.out.println("The universal gravitational constant in m^3/kgs^2 is:");		
		System.out.println(osc.getUniversalGravitationalConstant());
		
		System.out.println("\nThe mass of the planet in kilograms (equal to earth by default) is:");		
		System.out.println(osc.getMassOfPlanet());
		
		System.out.println("\nWith a velocity of 1022 m/s, the radius of the moon to the earth in meters is calculated to be:");		
		System.out.println(osc.getRadius(1022));

		System.out.println("\nWith a radius of 385000000 meters from the moon to earth, orbital velocity in m/s is calculated to be:");	
		System.out.println(osc.getVelocity(385000000));
		
		System.out.println("\nWith a radius of 100000000 meters from a satellite to earth, orbital velocity is calculated to be faster with a shorter radius:");	
		System.out.println(osc.getVelocity(100000000));
			
		System.out.println("\nWith warped spacetime and an altered gravitational constant of 5.67e-11, orbital velocity of the earths moon in m/s would be:");	
		osc.setUniversalGravitationalConstant(5.67e-11);
		System.out.println(osc.getVelocity(385000000));
		
		System.out.println("\nWith a radius of 385000000 meters from a satellite to Mars (having a mass of 6.4e+23 kiligrams), orbital velocity is calculated to be:");	
		osc.setUniversalGravitationalConstant(6.67e-11);
		osc.setMassOfPlanet(6.4e+23);	
		System.out.println(osc.getVelocity(385000000));
	}
}
