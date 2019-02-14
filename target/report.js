$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Login.feature");
formatter.feature({
  "line": 1,
  "name": "oscommerce user login",
  "description": "\r\ndescription: This is going to be the test casese for user stories",
  "id": "oscommerce-user-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "All test cases",
  "description": "",
  "id": "oscommerce-user-login;all-test-cases",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is on oscommerce website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on my account",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters  valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user able to log in",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstepdef.user_is_on_oscommerce_website()"
});
formatter.result({
  "duration": 12951158000,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdef.user_clicks_on_my_account()"
});
formatter.result({
  "duration": 823984300,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdef.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 238242200,
  "status": "passed"
});
formatter.match({
  "location": "Loginstepdef.user_able_to_log_in()"
});
formatter.result({
  "duration": 923947300,
  "status": "passed"
});
formatter.uri("src/main/resources/Mouse.feature");
formatter.feature({
  "line": 1,
  "name": "Mouse purchase",
  "description": "\r\ndescription: user able to purchase mouse",
  "id": "mouse-purchase",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User able to ordered 2 mouses",
  "description": "",
  "id": "mouse-purchase;user-able-to-ordered-2-mouses",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User logged in and on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on mouse",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on add to cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add to cart page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user updates the number of mouse to two",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user updates number of mouse in cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "value changes to two",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks check out button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Mousestepdef.user_logged_in_and_on_homepage()"
});
formatter.result({
  "duration": 21358341700,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.user_clicks_on_mouse()"
});
formatter.result({
  "duration": 5353979000,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.user_clicks_on_add_to_cart()"
});
formatter.result({
  "duration": 3263710800,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.add_to_cart_page_is_displayed()"
});
formatter.result({
  "duration": 9431600,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.user_updates_the_number_of_mouse_to_two()"
});
formatter.result({
  "duration": 119446800,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.user_updates_number_of_mouse_in_cart()"
});
formatter.result({
  "duration": 1981337100,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.value_changes_to_two()"
});
formatter.result({
  "duration": 45434500,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.user_clicks_check_out_button()"
});
formatter.result({
  "duration": 414933900,
  "status": "passed"
});
formatter.match({
  "location": "Mousestepdef.user_clicks_on_continue_button()"
});
formatter.result({
  "duration": 403427100,
  "status": "passed"
});
});