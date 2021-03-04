Feature: AddBook__Feature


Scenario: Add a book when the administrator is logged in

Given  The Administrator is logged in and on home page

When Administrator enters the filed
And Administrator clicks on add button

Then added book message should be thrown
And added book should be successful


Scenario: Add a book when the administrator is not logged in

Given The administrator is not logged in
And Administrator is on the login page

 When Administrator enter username as "<username>" and Password as "<Password>" with valid credential
  And Administrator clicks on login button 

Then Administrator should be able to login successfully
And Administrator enters the filed to add book
And Administrator clicks on add button
And added book should be successful


