# UITestsBelong

***Coding assignment - Cucumber scenario***
Write feature file , step definitions and pages for any two of the below requirements 

Site URL: http://automationpractice.com/

1.	While registering, if the email address is incorrect. User should see an error message
2.	Check whether Megamenu works (Dresses -> Summer dresses)
3.	On the Summer dresses page, select a dress(Quick view) and change the color (Blue) and then add the item to cart, Validate	whether same product name, color and quantity are displayed in Cart Summary page.

Once you finish assignment, please raise a PR on your Branch 

If you have write access issues, please push changes to your personal account and share.


//comments from Nidhi

1. I suggest some changes in the way pages have been defined. For example, the sign in button should be part of landing page object (or static page object) rather than the register page object. Hence for test scenario 2, I have created a landing page page object which holds the mega menu and other menu items. In my opinion, sign in should be part of this page object.
2. It is better to have test ids for the website components, which not only makes locating the elements easier but easy to manage as class names are prone to change. 
3. I have removed the thread.sleep used in the code and replaced with explicit wait where needed.

