Feature: Search book
Scenario: : Searching for a substring of the title

Given there is a book with title "sabastia"
When I search with "sab"
Then 1 book should have been found with title "sabastia"



Scenario: Searching for a substring of the author

Given there is a book with author "mohammed"
When I search withh "moh"
Then 1 book should have been found with author "mohammed"



Scenario: Searching for a substring of the ISBN

Given there is a book with ISBN "9780321146533"
When I search with ISBN "9780"
Then 1 book should have been found with ISBN "9780321146533"



Scenario: Searching also works when the user/administrator is logged in

Given the usear is already logged in with username 'ali' and password '111'

When I try to Search a book with title "sabastia" and isbn '9780321146533' and author 'mohammed' and Signature 'mohammed2010'

Then I will found the book in library with Signature 'mohammed2010'
