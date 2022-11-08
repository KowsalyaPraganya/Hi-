@F1
Feature: Advanced Search Home feature

@P1
Scenario Outline: Search available Stores 
Given User is on Advanced Search Page
When clicks Findstores button
And Enter storename or keyword as "<storeName or Keyword>"
Then He could see store detail
Examples:
|storeName or Keyword|
|Trends|
|Max|
|Angel|

@P2
Scenario Outline: Search Unavailable Stores 
Given User is on Advanced Search Page
When clicks Findstores button
And Enter storename or keyword as "<storeName or Keyword>"
Then He could be instructes to search with another name
Examples:
|storeName or Keyword|
|Sarvana|
||
|Aatha|
