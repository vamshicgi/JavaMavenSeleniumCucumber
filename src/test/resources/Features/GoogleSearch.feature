Feature: Feature to test google search

Scenario: Validating google search engine is working via Selenium

When Browser is opend
And  User is on google search page
When User entered text in search box
And Hits enter
Then User is navigated to Search Page