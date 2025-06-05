package com.prem.javaoneseven.textblocks;

public class TextBlocks {

    public static void main(String[] args) {

        oldStyle();
        emptyBlock();
        jsonBlock();
        jsonMovedBracketsBlock();
        jsonMovedEndQuoteBlock();
    }


    private static void oldStyle() {
        String text = "{\n" +
                "  \"name\": \"John Doe\",\n" +
                "  \"age\": 45,\n" +
                "  \"address\": \"Doe Street, 23, Java Town\"\n" +
                "}";
        System.out.println(text);
    }

    private static void emptyBlock() {
        String text = """
            """;
        System.out.println("||" + text + "||");
    }

    private static void jsonBlock() {
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
        String text = """
              {
                "name": "John Doe",
                "age": 45,
                "address": "Doe Street, 23, Java Town"
              }
            """;
        System.out.println(text);
        System.out.println("123");
    }

    private static void jsonMovedEndQuoteBlock() {
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
