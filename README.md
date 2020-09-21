## ![Logo](http://skilldistillery.com/downloads/sd_logo.jpg) Aaron Cottrell
## Blackjack Project

## Overview
Simulate virtual casino Blackjack game with game options, dealer, player and gameplay.

## Step by Step (Short Version)
1. Pick game
2. Pick # of decks in the dealer card pool
3. Pick number of players at the table
4. Check all players and dealer for instances of Blackjack
5. All players execute hand based on proper Blackjack table position
6. Dealer executes casino gameplay based on rules of Blackjack
7. Compare all players hands individually to dealer to determine winner
8. Option to play again or quit

## Walkthrough (Long Version)


## Struggles
Readability. I feel like I could have done a much better job at not using the same statement blocks over and over. However, I feel like it was unavoidable at times. That likely isn't the case and I hope to get feedback on where I could have maybe just passed things into a method or another class. One of the things I did try to do was read back through and see if there wasn't specific things that I wanted out of the block and try to group those things into methods but a lot of times I would run into that one variable would affect 2 or more others so the return would not be of the same type if I didn't keep them all together. My feeling is that this will be a nightmare to read back and figure out where the hell everything is going and when.

I struggled a bit with abstract implementation. I don't really know why, I guess I was fuzzy on the "contract" rules for those types of classes and methods but I think I figured it out by the end.

Finer details on initial code building. I had many instances where I just placed things slightly wrong and I'd end up in infinite loops or in holes within the code where Java didn't know where to go because I'd left it in a dead end. Then, of course, because I had 6 players the code would be incorrect in 6 places.


## Lessons Learned
You can have the right variable declaration in the wrong spot by just a fraction and it can take a ton of time to figure it out.

Making things look nice takes forever and can be more frustrating than the logic itself.

Redundancy is really hard to avoid.

Make sure it's perfect before replicating for multi-player use. Too many times I thought things were working and I just hadn't tested enough to run into problems. This ended up costing me a lot more time in troubleshooting and repairs since I then had to fix numerous issues, rather than just one.

## New Course Material
1. Try/Catch Block
2. Exceptions
3. Enums
4. Abstract Classes and Methods
5. Pass by Value Methods
