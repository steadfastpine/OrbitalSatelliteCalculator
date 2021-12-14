

         _______                   _____                    _____          
        /::\    \                 /\    \                  /\    \         
       /::::\    \               /::\    \                /::\    \        
      /::::::\    \             /::::\    \              /::::\    \       
     /::::::::\    \           /::::::\    \            /::::::\    \      
    /:::/~~\:::\    \         /:::/\:::\    \          /:::/\:::\    \     
   /:::/    \:::\    \       /:::/__\:::\    \        /:::/  \:::\    \    
  /:::/    / \:::\    \      \:::\   \:::\    \      /:::/    \:::\    \   
 /:::/____/   \:::\____\   ___\:::\   \:::\    \    /:::/    / \:::\    \  
|:::|    |     |:::|    | /\   \:::\   \:::\    \  /:::/    /   \:::\    \ 
|:::|____|     |:::|    |/::\   \:::\   \:::\____\/:::/____/     \:::\____\
 \:::\    \   /:::/    / \:::\   \:::\   \::/    /\:::\    \      \::/    /
  \:::\    \ /:::/    /   \:::\   \:::\   \/____/  \:::\    \      \/____/ 
   \:::\    /:::/    /     \:::\   \:::\    \       \:::\    \             
    \:::\__/:::/    /       \:::\   \:::\____\       \:::\    \            
     \::::::::/    /         \:::\  /:::/    /        \:::\    \           
      \::::::/    /           \:::\/:::/    /          \:::\    \          
       \::::/    /             \::::::/    /            \:::\    \         
        \::/____/               \::::/    /              \:::\____\        
         ~~                      \::/    /                \::/    /        
                                  \/____/                  \/____/         



Orbital Satellite Calculator



# Contact: https://www.linkedin.com/in/steadfastpine/

# Release Date: 2019-07-12
# Version: .1



Description

	Determine the velocity and distance from center of rotation for a satellite in orbit around a planet. The universal gravitational constant and mass of the planet are taken into account. Customization for the mass of different planets is supported, as well as changed gravitation for interferometric testing.



Prerequisites

	Java Virtual Machine



Methods

	getUniversalGravitationalConstant()
		// Getter - universalGravitationalConstant. Returns the value after resolving the constant

	getMassOfPlanet()
		// Getter - massOfPlanet. Returns the value after resolving the constant 

	setUniversalGravitationalConstant(double universalGravitationalConstant)	
		// Setter - universalGravitationalConstant. Assigns custom value for different dimentions and warped spacetime

	setMassOfPlanet(massOfPlanet)
		// Setter - massOfPlanet. Assigns custom value for planets other than Earth

	getVelocity(radius)	
		// Input the radius, and it returns the orbital velocity

	getRadius(velocity)
		// Input the velocity and it returns the radius, being the distance from satellite to the center of rotation



Example Usage
	
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



License 

	This program is licensed under the GPL License, view the LICENSE.md file for more information.














