Feature: hello_to_user
  Scenario Outline: sample_hello
    Given: "what is your name?" is show
    When: user enters his name which is <name>
    Then: the output is <hello_name>

  Examples:
  | name   | hello_name   |
  | ali    | hello ali    |
  | sajjad | hello sajjad |
  | reza   | hello reza   |