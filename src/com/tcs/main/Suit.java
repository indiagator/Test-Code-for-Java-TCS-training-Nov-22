package com.tcs.main;

public class Suit
{
    SuitType type;
    Rank[] ranks = {
                        Rank.ACE,
                        Rank.TWO
                        //...
                    };

    Suit(SuitType type)
    {
        this.type = type;
    }
}
