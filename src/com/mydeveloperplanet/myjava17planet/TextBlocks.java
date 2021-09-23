package com.mydeveloperplanet.myjava17planet;

public class TextBlocks {

    public static void main(String[] args) {
        oldStyle();
        emptyBlock();
        jsonBlock();
        jsonMovedBracketsBlock();
        jsonMovedEndQuoteBlock();
    }

    private static void oldStyle() {
        System.out.println("""
                *************
                * Old Style *
                *************""");
        String text = "{\n" +
                      "  \"name\": \"John Doe\",\n" +
                      "  \"age\": 45,\n" +
                      "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                      "}";
        System.out.println(text);
    }

    private static void emptyBlock() {
        System.out.println("""
                ***************
                * Empty Block *
                ***************""");
        String text = """
                """;
        System.out.println("|" + text + "|");
    }

    private static void jsonBlock() {
        System.out.println("""
                **************
                * Json Block *
                **************""");
        String text = """
                {
                  "name": "John Doe",
                  "age": 45,
                  "address": "Doe Street, 23, Java Town"
                }
                """;
        System.out.println(text);
    }

    private static void jsonMovedBracketsBlock() {
        System.out.println("""
                *****************************
                * Json Moved Brackets Block *
                *****************************""");
        String text = """
                  {
                    "name": "John Doe",
                    "age": 45,
                    "address": "Doe Street, 23, Java Town"
                  }
                """;
        System.out.println(text);
    }

    private static void jsonMovedEndQuoteBlock() {
        System.out.println("""
                ******************************
                * Json Moved End Quote Block *
                ******************************""");
        String text = """
                  {
                    "name": "John Doe",
                    "age": 45,
                    "address": "Doe Street, 23, Java Town"
                  }
                       """;
        System.out.println(text);
    }
}
