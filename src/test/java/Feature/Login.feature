Feature: Login to the application 

Scenario: Login to app through valid credits 
	Given launch the browser 
	When enter URL 
	Then enter username 
	And  enter password 
	Then click on loginbtn 
	And click on logoutbtn
	Then close the browser 
	
Scenario: Login to app through valid credits 
	Given launch the browser 
	When enter URL "http://localhost:8888" 
	Then enter username "admin" 
	And  enter password "admin" 
	Then click on loginbtn 
	And click on logoutbtn
	Then close the browser 