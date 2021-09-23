package com.mydeveloperplanet.myjava17planet;

import java.awt.*;
import java.util.HashMap;

public class HelpfulNullPointerExceptions {

    public static void main(String[] args) {
        HashMap<String, GrapeClass> grapes = new HashMap<>();
        grapes.put("grape1", new GrapeClass(Color.BLUE, 2));
        grapes.put("grape2", new GrapeClass(Color.white, 4));
        grapes.put("grape3", null);
        var color = ((GrapeClass) grapes.get("grape3")).getColor();
    }
}
