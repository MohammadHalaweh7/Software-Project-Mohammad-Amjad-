Feature: Login


Scenario: Login with valid username and  password
Given there is already username 'amjad' and password '123' 

When the user try to login with username 'amjad' and password '123'

Then the user will login

Scenario: Login with valid username wrong password
Given there is already username 'amjad' and password '123' 
When the user try to login with username 'amjad' and password '12345'
Then the user will not login

