1.  What are Listeners?
	It an interface in android that contains a callback method that is triggered by the View that the listener is registered too

2. Define the difference in Runtime and Compile Time.
	Runtime is when the program is run and compile time is before when it compiled to be ran.

3. What is reflection in JAVA?
	It ’s an API that changes the behaviors of class, interfaces, and methods when the program is ran.

4.  How does gradle work behind the scene.
The gradle is a build automation tool, It has a Project in represents what needs to be build, and it also has tasks the needed to execute during the build process. The first thing the gradle dose is identify all projects involved, it then executes the build scripts behind the project and finally it executes all tasks that need to be done.
 
5. Explain each of the following view dimension measurement types :
sp, dp, px, pt, in, mm

	sp- Scale Pixel
		-Scales sizes by the users font sizes
	px- Screen Pixel
		-Sets the pixel does not scale
	pt-1/72 of an inch, with respect of screen size
	in-inches
		-Uses inches which takes screen size in to mind.
	mm- millimeters
		-Uses millimeters which takes screen size in to mind.
	dp - density pixels
		-Set the size in pixels based on the size of the screen that the app is being run on.
    
This app takes a string and put the reverse of it into a textView.
