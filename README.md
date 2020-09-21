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
Upon launch, the user is given the option to pick a game or quit. Any time during gameplay, if the option to quit is chosen by the user, the application will terminate with a goodbye message. Once the user chooses Blackjack for their game the game begins.

Options 1-5 for number of 52 card decks to include for gameplay. Based on choice, decks are built and then shuffled. Blackjack rules state that the top card off the deck is to be burned as to eliminate card manipulation. Our simulator does this as well, prior to hand being dealt.

Options of 1-6 players to sit at the table. Table will display player name based on selection. Otherwise, the seat will be displayed as Open.

Dealer will deal cards to the chosen number of players at the table one card at a time in rotational order from the top of the shuffled  deck. The dealer will keep their first card face down until user moves have completed unless the dealer has Blackjack. Program will automatically check for player and dealer instance of Blackjack.  If the dealer has Blackjack, all player hands are checked for Push and the dealer face down card is turned over. If the dealer and player do not have Blackjack, the game continues. Each player is given the option to hit or stay, starting with the player most directly to the dealer's left. The player may "hit" (draw a card) until they are satisfied with their card total or surpass 21. Should the player pass 21, they have gone bust and their turn is over. This continues for as many players as have "sat" at the table.

Once player moves have completed, the dealer will commence gameplay in a specific fashion as dictated. If the dealer has less than 17, the dealer will draw a card. The dealer gameplay will stop once the dealer has reached 17 or gone over 21. Upon conclusion of dealer gameplay, all hands are checked individually against the dealer's hand. As long as any player's hand is higher than the dealer's but less than 22 (which would be "BUSTED!"), "WINNER!!" is displayed, "YOU LOSE" for hands lower than the dealer and "PUSH" for all ties.

The user may then choose to play again. Currently, the first option for number of players will remain until the user chooses to restart the entire program. If the game deck reaches less than one deck, the dealer will fill the shoe with a freshly shuffled amount of the same cards as was also initially chosen by the user. All hands are cleared and gameplay begins again.    

## Struggles
Readability. I feel like I could have done a much better job at not using the same statement blocks over and over. However, I feel like it was unavoidable at times. That likely isn't the case and I hope to get feedback on where I could have maybe just passed things into a method or another class. One of the things I did try to do was read back through and see if there wasn't specific things that I wanted out of the block and try to group those things into methods but a lot of times I would run into that one variable would affect 2 or more others so the return would not be of the same type if I didn't keep them all together. My feeling is that this will be a nightmare to read back and figure out where the hell everything is going and when.

I struggled a bit with abstract implementation. I don't really know why, I guess I was fuzzy on the "contract" rules for those types of classes and methods but I think I figured it out by the end.

Finer details on initial code building. I had many instances where I just placed things slightly wrong and I'd end up in infinite loops or in holes within the code where Java didn't know where to go because I'd left it in a dead end. Then, of course, because I had 6 players the code would be incorrect in 6 places.

Because I lost some time in those fixes I wasn't able to get to some of the other extras I had originally planned on implementing like betting, doubling down and splitting hands on pairs. There are more than a few more tweaks I would have liked to have made.


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
