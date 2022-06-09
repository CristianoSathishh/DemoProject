 Feature: Hotel Booking Application
@smoke
Scenario Outline: Login page 
        Given user Launch The Application Url
        When user Enter The Username In "<username>" Field 
        And user Enter The Password In  "<password>" Field
        Then user Click The Login Button And It Navigates To Search Hotel Page
      Examples:
      |username |password |
      |java@123  |    123    |
      | sathish510 |  sathish@123|
   @sanity   
Scenario: Search Hotel Page
        When user Select The Location In Location Field
        And user Select The Hotels In Hotels Field
        And user Select The Room Type In Room Type Field
        And user Select The Number of Rooms In Number of Rooms Field
        And user Enter The Check In Date In Check In Date Field
        And user Enter The Check Out Date In Check Out Date Field
        And user Select The Adults per Room In Adults per Room Field
        And user Select The Children per Room In Children per Room Field
        Then user Click the Search Button And It Navigates To Select Hotel
    
Scenario: Select Hotel
        When user Click the Radio Button In Select Field
        Then user Click the Continue Button And It Navigates To Book A Hotel
      
Scenario: Book A Hotel
        When user Enter The Firstname In Firstname Field
        And user Enter The Last Name In Last Name Field
        And user Enter The Billing Address In Billing Address Field
        And user Enter The Credit Card No In Credit Card No Field
        And user Select The Credit Card Type In Credit Card Type Field
        And user Select The Month In Expiry Date Field
        And user Select The year In Expiry Date Field
        And user Enter CVV Number In CVV Number Field
        Then user Click The Submit Button And It Navigates To Booking Confirmation Page
        
Scenario: Booking Confirmation
      Then user Click The My Itinerary Button And It Navigates To Booked Itinerary Page
     
Scenario: Booked Itinerary


    
                                     
