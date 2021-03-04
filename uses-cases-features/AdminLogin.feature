Feature: AdminLogIn_Feature
This is to do LogIn

Scenario: Administrator can log in with valid credential

  Given prowser is open
  And Administrator is on the login page
  
  When Administrator enter username as "<username>" and Password as "<Password>" with valid data
  And Administrator clicks on login button 
 
  Then Administrator should be able to login successfully
  And Administrator should be on the users home page
    
#Examples:
#|username|Password  |
#|"mohammad"|1234|
#|"amjad"|4321|




Scenario: Administrator has the wrong password

Given prowser is open
And Administrator is on the login page  

When Administrator enter username as "<username>" and Password as "<Password>" 
And Administrator clicks on login button   

Then Administrator should NOT be able to login successfully

 #   Examples:
  #    | username | Password   |
   #   | correctuser | wrongpassword |
   
   
 
