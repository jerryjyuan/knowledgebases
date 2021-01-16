
========================================================
UI Design:

==>Global Styling:
	==>Styling 1:
		1) Use: .scss, but it means .css for right now
				==>styles.scss: mostly define header section
					1) imports: MD themes + MD customized themes + Any other imports
					2) Define body and global
					3) Define Header Section css
		2) Use: MD defaults: for MD selectors
            "styles": [
              "./node_modules/@angular/material/prebuilt-themes/deeppurple-amber.css",
              "src/styles.scss"              
            ],
		3) Bootstrap: not in use yet
		4) 
	==>Layout:
		==>Header:
			==>styles.scss: mostly define header section
			==>Contain 3 components:
				==>Section css: styles.scss:	==>Define section layout and styling
				==>3 Components: define its own CSS
				
					==>Component 3:
						width:986px;
						height:46px;
		==>Main Section:
			==>
		==>Footer: its own .css:
			==>Not:
				==>Angular components
				==>Bootstrap CSS
				==>MD
			==>Simple HTML/CSS
			==>Not impact any other sections
	
		==>Upgrades:
			==>UI-Stage-1: Optimize the current UI:
				==>Header Section:
				
				==>
			
			==>UI-Stage-2:
				==>1) Layout: Upgrade to MD layout design
				==>2) Enable:
						==>Those links on the main pages:
							==>Add components' inputs to take the user events
							1) My Account: user click: component takes to mock data or backend data/service calls
							2) Sign up: same
							Right now: you can mock json data, or SessionStorage data
							
							Shopping cart:
								==>Click: go to component's function
								==>Display: show field data from component
							
							SubMenu: links: enabled with components' functions
							
						==>Display data:
							1) New Features/Promos: display from component's fields/properties: {{data}}
			
			==>Optional: Layout: Bootstrap CSS)




==>Section: HTML and CSS:
	==>Section Level
		==>1) Layout:
				<div1>: positioning + spaces + flowing
		==>2) Box/Container:
				<div2>: contents "box/container":
							==>
							==>background colors
							==>
	==>Sub-Section/Component-Level:	
		==>1) Layout:
				<div1>: positioning + spaces + flowing	
		==>2) Contents: Styling
				<div2>: contents "box/container":
							==>
							==>background colors
							==>
				<div3>: contents styling: fonts, sizes, family, ...
							==>This level: can have larger fonts: then the entire part become larger
								==>But the actual words can be defined/overidden at below level <div4>
								==>But if there is no <div4> defining the words, then it is subject to this <div3> defining
				
		==>3) Additional Contents:
				==>This level can have another <div4>
				Links
				Images
		==>4) Animations: effects



========================================================
