# Final Project Team 4
This is a web automation project that automates the testing of the OrangeHRM Demo website using Selenium WebDriver and Java. 
It follows best practices like the Page Object Model (POM), Singleton pattern, and Browser Factory pattern. The project uses Allure report to generate detailed and interactive reports of the test results.



# Test Scenarios
Login to the OrangeHRM Demo site.
Create two new employees and save their details to a JSON list.
Go to the PIM dashboard and search for the first user by name. Assert that the user is found.
Click on the first user from the search table and update their ID with a random user ID.
Search for the first user by their new user ID from the PIM dashboard menu. Assert that the user is found.
Logout of the admin account and login with the second user from the JSON list.
Click on the "My Info" menu and select the "Gender" and "Blood Type" fields. Save the changes.
Input the address and email details in the "Contact Details" section.
Logout of the second user's account.
