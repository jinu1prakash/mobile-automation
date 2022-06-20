@apkdemotest
Feature: ApiDemos-debug apk Test Case

  Scenario Outline: Navigation to Accessibility Custom View
    Given I open the application on android device
    Then I click on custom view using <ElementType> - <ElementAttribute>

    Examples:
      | ElementType | ElementAttribute                                         |
      | Xpath       | //android.widget.TextView[@content-desc='Accessibility'] |