package com.mydeveloperplanet.myjava17planet;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {
        oldStyle();
        streamToList();
    }

    private static void oldStyle() {
        System.out.println("""
                        *************
                        * Old style *
                        *************""");
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList =  stringStream.collect(Collectors.toList());
        for(String s : stringList) {
            System.out.println(s);
        }
    }

    private static void streamToList() {
        System.out.println("""
                        *****************
                        * stream toList *
                        *****************""");
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> stringList =  stringStream.toList();
        for(String s : stringList) {
            System.out.println(s);
        }
    }
}
