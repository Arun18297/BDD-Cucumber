Feature: Creating Organization in vtiger app 

Scenario Outline: Creating Organization with Different Data 
	Given launch the Browser 
	When enter the url "http://localhost:8888" 
	Then enter UserName "admin" 
	And  enter Password "admin" 
	Then click on Loginbtn 
	And verify Home Page 
	Then  click on Organization Module 
	And click on Plus Button 
	Then enter Organization Name "<OrgName>" 
	And enter Phone Number "<PhNo>" 
	#	Then click on Save Button
	And click on signOut 
	Then close the Browser 
	
	Examples: 
		| OrgName 	| PhNo 			|
		| Twlight 	| 1685329746 	|
		| Consuring | 4685239576 	|
		| Ring 		| 0369852146 	|