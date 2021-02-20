Feature: validating the google application

Scenario: Searching an item
Given the user is on google page
Then enter "Software testing" in the search text box
Then get all the items from auto suggest
Then submit the input
Then get the title and print
Then close the google browser

#Single line parameterization
Scenario: Searching for miltiple items
Given the user is on google page
Then enter item in the search text box
|Software Testing|
|Automation Testing|
|Performance Testing|
Then get all the items from auto suggest
Then submit the input
Then get the title and print
Then close the google browser

#Multiple line parameterization

Scenario Outline: Search multiple items
Given the user is on google page
Then type "<Item_Name>" in the search text box
Then get all the items from auto suggest
Then submit the input
Then get the title and print
Then close the google browser

Examples:
|Item_Name|
|Software Testing|
|Automation Testing|
|Performance Testing|
