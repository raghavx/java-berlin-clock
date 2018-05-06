Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO

Scenario: Early morning 
When the time is 04:00:00
Then the clock should look like
Y
OOOO
RRRR
OOOOOOOOOOO
OOOO

Scenario: Yoga time 
When the time is 05:00:00
Then the clock should look like
Y
ROOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Dropping kid to school  
When the time is 06:55:00
Then the clock should look like
Y
ROOO
ROOO
YYRYYRYYRYY
OOOO


Scenario: When kid is late to school  
When the time is 07:05:00
Then the clock should look like
Y
ROOO
RROO
YOOOOOOOOOO
OOOO

Scenario: Breakfast time
When the time is 07:35:01
Then the clock should look like
O
ROOO
RROO
YYRYYRYOOOO
OOOO

Scenario: Drive to office
When the time is 08:57:11
Then the clock should look like
O
ROOO
RRRO
YYRYYRYYRYY
YYOO


Scenario: Unexpected time
When the time is 24:57:03
Then the clock should look like
O
RRRR
RRRR
YYRYYRYYRYY
YYOO

Scenario: Pick up kid from school and have lucnch
When the time is 13:15:07
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
OOOO


Scenario: Scrum time in office 
When the time is 16:18:39
Then the clock should look like
O
RRRO
ROOO
YYROOOOOOOO
YYYO

Scenario: Time to go home 
When the time is 18:49:05
Then the clock should look like
O
RRRO
RRRO
YYRYYRYYROO
YYYY

Scenario: Dinner time 
When the time is 21:29:33
Then the clock should look like
O
RRRR
ROOO
YYRYYOOOOOO
YYYY

Scenario: Icecream time 
When the time is 21:59:28
Then the clock should look like
Y
RRRR
ROOO
YYRYYRYYRYY
YYYY


Scenario: Bed time 
When the time is 22:01:42
Then the clock should look like
Y
RRRR
RROO
OOOOOOOOOOO
YOOO


Scenario: Invalid time hour
When the time is 25:01:42
Then the clock should look like
Invalid


Scenario: Invalid time minute
When the time is 02:61:42
Then the clock should look like
Invalid


Scenario: Invalid time second
When the time is 02:01:62
Then the clock should look like
Invalid


Scenario: Invalid time minute second
When the time is 02:61:62
Then the clock should look like
Invalid


Scenario: Invalid time hour minute second
When the time is 42:61:62
Then the clock should look like
Invalid


Scenario: Invalid time boundry
When the time is 25:60:60
Then the clock should look like
Invalid


Scenario: I don't know the time
When the time is null
Then the clock should look like
Invalid


Scenario: Unusual time (boundry condition)
When the time is 24:59:59
Then the clock should look like
O
RRRR
RRRR
YYRYYRYYRYY
YYYY


Scenario: Unusual time (boundry condition )
When the time is 24:59:58
Then the clock should look like
Y
RRRR
RRRR
YYRYYRYYRYY
YYYY