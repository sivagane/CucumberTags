
Feature: Title of your feature

  #@Smoketest
  #Scenario: Valid  Login
    #Given User enters with valid login id and valid password

  #@Regressiontest
  #Scenario: Invalid Login
    #Given User enters with Invalid login id and valid password

  #@Smoketest @Regressiontest
  #Scenario: Create Contacts
    #Given User creates a contact
#
  #@Regressiontest
  #Scenario: Create Deals
    #Given User creates a Deal
#
  #@EndtoEndtest
  #Scenario: Create Tasks
    #Given User creates a Task
#
  #@Smoketest @Regressiontest
  #Scenario: Search LeftPanels
    #Given User Searches LeftPanel
#
  #@EndtoEndtest
  #Scenario: Create Cases
    #Given User creates a Case
#
  #@Smoketest
  #Scenario: Create Docs
    #Given User creates a Doc
#
  #@Smoketest @Regressiontest
  #Scenario: Create Form
    #Given User creates a Form
#
  #@EndtoEndtest
  #Scenario: Create Reports
    #Given User Reports
#
  #@Regressiontest @EndtoEndtest
  #Scenario: Create Company
    #Given User creates a Company

  @Smoketest
  Scenario: Create Search
    Given User Searches for Company

  @EndtoEndtest
  Scenario: Click Timeline
    Given User clicks Timeline

  @Regressiontest
  Scenario: Create Alerts
    Given User creates a Alert

  @Smoketest @EndtoEndtest
  Scenario: Click CustomView
    Given User Click on CustomView
