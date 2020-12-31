Feature: Bestbuy

Scenario: Home Page deafult login
Given Initilize driver
Given navigates to "https://www.bestbuy.com/"
Given Click on Login link in home page to land on Secure sign in Page
When User Logs in with "dsk" And "asd"
Then dont allow in "WrongPassword" 
Then user can sign in with Apple
Then user will put Apple "User" and "Pass"
And quit Browser 

Scenario: Home Page deafult login
Given Initilize driver 
Given navigates to "https://www.bestbuy.com/"
Given Click on Login link in home page to land on Secure sign in Page
When user will put Gmail "mdalminhaz12@gmail.com" and "Mdalminhaz1234"
Then allow in 
And quit Browser 
