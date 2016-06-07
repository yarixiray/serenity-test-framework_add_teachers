Scenario: Checking Find Field
Given the user is on the Our Team page
When the user type teachers name in the FindField <teacher>
Then system is present result

1. openSearchPage
2. enterSearchCriteria
3. searchName
4. assertFalse(isEmptySearchResult())
5. assertEqualse()
