Feature: Add book


Scenario: Add a book when the administrator is logged in
Given the usear is already logged in  

When add a book with title "sabastia" and isbn '9780321146533' and author 'mohammed' and Signature 'mohammed2010'
Then I will found the book in library with Signature 'mohammed2010'



Scenario: Add a book when the administrator is not logged in
Given the usear not logged in
When I try to add a book with title "sabastia" and isbn '9780321146533' and author 'mohammed' and Signature 'mohammed2010'
Then I can't found the book in library with Signature "mohammed2010"