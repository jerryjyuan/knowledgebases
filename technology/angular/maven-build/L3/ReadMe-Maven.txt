
==========================================
Maven:

==>mvn clean install:
	==>Normal Maven Project
	==>1) Use: frontend-maven-plugin: new one: 1.9.1
				https://github.com/eirslett/frontend-maven-plugin
				==>Use core features
				==>the syntax comes from github plugin official contents
				==>Variation 1: Enterprise Apps: prefer to use their controlled node and npm versions instead of local versions
								==>They do a download from enterprise repo and save it to local maven repo
								==>And then copy them to a local folder inside the app maven structure ==>enabled as a specific version to use
								Refer to those 2 apps
				==>Otherwise: can use global installed versions
				==>Run executions: install, ...,
				==>All configurations can be enabled by the plugin doc
				==>Same as exec-maven-plugin
	==>2) App Design:
				==>Normally: no RESTful APIs or other modules inside this jar
					==>Because it is for UI app
					==>Only exception: some Spring Boot config was used: application.properties is in use
						==>So some local RESTful APIs are in use: "/config"
						==>So application.properties config can supply to Angular UI
						==>But most of the UI apps don't use this way
						==>Only one app does this:
							==>Create xxx.jar
							==>Angular code is copied to Spring Boot app's resources/static folder as static contents
								==>Spring boot maven plugin will add these into target/classes/static folder:
									==>Can maven copy plugin or resource plugin or shade plugin directly copy Angular contents into target or into resources/static folder?
										==>Or both ways work
								==>And then package them into BOOT-INF\classes\static in Spring Boot jar file
								==>When Spring Boot jar app is running as a web application, it refers to this location to serve static contents
								
								Static Content
									By default, Spring Boot serves static content from a directory called /static (or /public or /resources or /META-INF/resources) in the classpath or from the root of the ServletContext. It uses the ResourceHttpRequestHandler from Spring MVC so that you can modify that behavior by adding your own WebMvcConfigurer and overriding the addResourceHandlers method.
								You can also customize the static resource locations by using the spring.resources.static-locations property 
									(replacing the default values with a list of directory locations). The root Servlet context path, "/", is automatically added as a location as well.
								Spring Boot supports both static and templated welcome pages. It first looks for an index.html file in the configured static content locations. If one is not found, it then looks for an index template. If either is found, it is automatically used as the welcome page of the application.
								
							==>http://xxx.com/<app-root>/index.html
								==>index.html functions exactly like regular Angular UI index.html
							==>In this way: it is deployed as a pure Spring Boot application
						==>Advantages:
							==>Direct deployment with Spring Boot app:
								==>no other web server needed
								==>no need to run: "ng serve" needed
							==>Can utilize RESTful APIs inside the same jar and host
							==>
				==>Only Angular UI code and module:
					==>Reasons:
						==>As one module inside other maven modules inside one application parent pom.xml
				==>

==========================================


==========================================



==========================================
