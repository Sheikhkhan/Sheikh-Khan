Feature: Mouse purchase

description: user able to purchase mouse

Scenario: User able to ordered 2 mouses
Given User logged in and on homepage
When User clicks on mouse
And User clicks on add to cart
Then Add to cart page is displayed
When user updates the number of mouse to two
And user updates number of mouse in cart
Then value changes to two
When user clicks check out button
And user clicks on continue button