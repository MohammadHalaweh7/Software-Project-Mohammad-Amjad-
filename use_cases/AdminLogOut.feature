Feature: AdminLogOut_Feature


Scenario: Administrator logout

Given The administrator is loged in with username 'ali' and password '111'

When I call logout function  

Then The administrator should be logout
