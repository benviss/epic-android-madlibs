package com.vizo.madlibs;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Guest on 11/15/16.
 */
public class CrazyLibDictionary {
    private final String[] mAdventureWordRequests = new String[] {
            "Name",
            "Creature",
            "Adjective",
            "Noun",
            "Adjective",
            "Verb",
            "Noun",

    };
    private final String[] mSpaceWordRequests = new String[] {
            "Name",
            "Name",
            "Alien Species",
            "Adjective",
            "Adjective",
            "Favorite Spaceship",
            "Space Weapon",
            "Adjective",
            "Name",
            "Part of the Body",
            "Adjective",
            "Verb",
            "Noun",
            "Exclamation",

    };
    private final String[] mHorrorWordRequests = new String[] {
            "Name",
            "Place",
            "Adjective",
            "Adjective",
            "Verb of Motion",
            "Sound",
            "Emotion",
            "Famous Person",
            "Verb",
            "Adjective",
            "Place",

            "Ad-Verb",
            "Plural Noun",
            "Verb",

    };


    public String[] getWordRequests(String userChoice) {
        Log.d("test", userChoice);
        if(userChoice.equals("Adventure")) {
            return mAdventureWordRequests;
        } else if (userChoice.equals("Space")) {
            return mSpaceWordRequests;
        } else {
            return mHorrorWordRequests;
        }
    }

    public String getCrazyParagraph(String chosenStory, ArrayList<String> userWords) {
        String paragraph = "";
        if(chosenStory.equals("Adventure")) {
            paragraph = "Once upon a time "+userWords.get(0)+" decided to try and kill a " +
                    ""+userWords.get(1)+". " +
                    "It was going to be a "+userWords.get(2)+" task, so "+userWords.get(0)+" " +
                    "decided " +
                    "to " +
                    "bring his " +
                    "trusty "+userWords.get(3)+". The "+userWords.get(3)+" was embued with " +
                    ""+userWords.get(4)+" " +
                    "powers and should be " +
                    "able to slay the "+userWords.get(1)+" easily. Upon seeing the " +
                    ""+userWords.get(1)+", " +
                    ""+userWords.get(0)+" started to "+userWords.get(5)+" and managed to " +
                    ""+userWords.get(6)+"" +
                    " the " +
                    ""+userWords.get(1)+". ";
        } else if (chosenStory.equals("Space")) {
            paragraph = "***Transmission Beginning***"+userWords.get(3)+" "+userWords.get(0)+", " +
                    "come in "+userWords.get(3)+" " +
                    ""+userWords.get(0)+", this is" +
                    " "+userWords.get(4)+" "+userWords.get(1)+", we have been " +
                    "attacked by "+userWords.get(2)+" We need immediate attention or the " +
                    ""+userWords.get(5)+" is " +
                    "going down! We are all out of munitions for the "+userWords.get(6)+" and I " +
                    "don't " +
                    "think "+userWords.get(7)+" "+userWords.get(8)+" is going to make it! They " +
                    "already lost a " +
                    ""+userWords.get(9)+"! "+userWords.get(13)+"! " +
                    "The "+userWords.get(2)+" are in the "+userWords.get(5)+", this is " +
                    ""+userWords.get(10)+"! I'm" +
                    " going to" +
                    " "+userWords.get(11)+", " +
                    "I don't think I have the "+userWords.get(12)+" to wi-***Transmission " +
                    "Ended***";
        } else {
            paragraph = ""+userWords.get(2)+" "+userWords.get(0)+" and his friends decided to " +
                    "visit "+userWords.get(1)+" one day. On " +
                    "arrival they felt a "+userWords.get(3)+" in the air. They decided to " +
                    ""+userWords.get(4)+" " +
                    "into the "+userWords.get(1)+", even though "+userWords.get(0)+" protested. As soon as they " +
                    "entered, the entry was" +
                    " closed off and they were locked in. They heard "+userWords.get(5)+" coming " +
                    "all around " +
                    "them. "+userWords.get(0)+" became very "+userWords.get(6)+" and decided to " +
                    ""+userWords.get(8)+" from all his friends. He " +
                    "was soon separated until he found "+userWords.get(7)+", but a really " +
                    ""+userWords.get(9)+" version. "+userWords.get(7)+" opened a gateway to " +
                    ""+userWords.get(10)+" and " +
                    "sucked "+userWords.get(0)+" in. The rest of "+userWords.get(0)+"'s friends " +
                    "found a way out," +
                    " but "+userWords.get(2)+" " +
                    ""+userWords.get(0)+" was never seen again.";
        }
        return paragraph;
    };
}
