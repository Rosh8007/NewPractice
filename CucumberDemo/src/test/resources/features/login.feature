

Feature:Login Fuctionality for M S

@Abc
Scenario:Login Check
Given User navigation to MercuryTours
When User login by using username "Roshan"
And pass password as "aware@890"
And Click on submit button
Then Login should be  success

@Xyz
Scenario: For flight booking
Given User login successfuly
When click on flight details
Then view flight details page