package com.lionelnkaya.biblepromisegenerator;

import java.util.Random;

public class QuoteBook {
    // Fields or Member variables - Properties about the object
    private String[] quotes = {
            "'The Lord will fight for you, and you shall hold your peace.' " + " - Exodus 14:14",
            "'He gives power to the weak, and to those who have no might He increases strength.'" + " - Isaiah 40:29",
            "'Therefore if the Son makes you free, you shall be free indeed.'" + " - John 8:36",
            "'You, Lord, keep my lamp burning, my God turns my darkness into light.'" + " - Psalm 18:28",
            "'For I am the LORD your God who takes hold of your right hand and says to you : do not fear, I will help you.' " + " - Isaiah 41:13",
            "'If any of you lacks wisdom, let him ask God, who gives generously to all without reproach, and it will be given him.'" + " - James 1:5",
            "'You, by the help of your God, return, Observe mercy and justice, And wait on your God continually.'" + " - Hosea 12:6",
            "'Now may the God of hope fill you with all joy and peace in believing, that you may abound in hope by the power of the Holy Spirit.'" + " - Romans 15:13",
    };

/*    private String[] authors = {
            "Exodus 14:14",
            "Isaiah 40:29",
            "John 8:36",
            "Psalm 18:28",
            "Isaiah 41:13",
            "James 1:5",
            "Hosea 12:6",
            "Romans 15:13",
    };*/

    //Methods - Actions the object can take
    String getquote () {
        //Randomly select a quote
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt (quotes.length);
        return quotes[randomNumber];
    };


}
