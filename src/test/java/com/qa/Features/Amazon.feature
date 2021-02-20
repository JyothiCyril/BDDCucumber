Feature: Validate the amazon application
Background: Initialize the browser
Given the user opens the browser
Then the user runs the URL

Scenario Outline: validating the amazon application to search an item
Given The user is an amazon home page
When the user select category as "<Category>"
Then enter the "<ItemName>"
And click the magnifier button
Then check the title of the page
Then close the browser

Examples:
|Category|ItemName|
|Books|Da vinci code|
|Electronics|Washing machines|
|Furniture|Wooden Tables|

Scenario: validate the footer links present on the amazon application
Given The user is an amazon home page
Then check the total number of footerlinks present the page
Then close the browser