package com.softcap.artrosario.lib;

import java.util.Random;

public class JokesLib {
    public String[] jokesArray = {"How do functions break up? \"They stop calling each other!\"",
            "In what unit do you measure a function's length? \"In Para meters...\"",
            "What did the flirtatious function say? \"Call me ;)\"",
            "Q: How do you tell an introverted computer scientist from an extroverted computer scientist?\n" +
                    "\n" +
                    "A: An extroverted computer scientist looks at your shoes when he talks to you."
    };
    public String tellAHandCraftedJoke(){
           return jokesArray[new Random().nextInt(jokesArray.length)];
            //return "A hand-crafted joke";
        }

}
