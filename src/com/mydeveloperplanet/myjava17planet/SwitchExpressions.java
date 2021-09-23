package com.mydeveloperplanet.myjava17planet;

public class SwitchExpressions {

    public static void main(String[] args) {
        oldStyleWithoutBreak(FruitType.APPLE);
        oldStyleWithBreak(FruitType.APPLE);
        withSwitchExpression(FruitType.APPLE);
        withReturnValue(FruitType.APPLE);
        withReturnValueEvenShorter(FruitType.APPLE);
        withYield(FruitType.APPLE);
        oldStyleWithYield(FruitType.APPLE);
    }

    private static void oldStyleWithoutBreak(FruitType fruit) {
        System.out.println("""
                ***************************
                * Old style without break *
                ***************************""");
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void oldStyleWithBreak(FruitType fruit) {
        System.out.println("""
                ************************
                * Old style with break *
                ************************""");
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
                break;
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
                break;
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void withSwitchExpression(FruitType fruit) {
        System.out.println("""
                **************************
                * With switch expression *
                **************************""");
        switch (fruit) {
            case APPLE, PEAR -> System.out.println("Common fruit");
            case ORANGE, AVOCADO -> System.out.println("Exotic fruit");
            default -> System.out.println("Undefined fruit");
        }
    }

    private static void withReturnValue(FruitType fruit) {
        System.out.println("""
                *********************
                * With return value *
                *********************""");
        String text = switch (fruit) {
            case APPLE, PEAR -> "Common fruit";
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    private static void withReturnValueEvenShorter(FruitType fruit) {
        System.out.println("""
                **********************************
                * With return value even shorter *
                **********************************""");
        System.out.println(
            switch (fruit) {
                case APPLE, PEAR -> "Common fruit";
                case ORANGE, AVOCADO -> "Exotic fruit";
                default -> "Undefined fruit";
            });
    }

    private static void withYield(FruitType fruit) {
        System.out.println("""
                **************
                * With yield *
                **************""");
        String text = switch (fruit) {
            case APPLE, PEAR -> {
                System.out.println("the given fruit was: " + fruit);
                yield "Common fruit";
            }
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    private static void oldStyleWithYield(FruitType fruit) {
        System.out.println("""
                ************************
                * Old style with yield *
                ************************""");
        System.out.println(switch (fruit) {
            case APPLE, PEAR:
                yield "Common fruit";
            case ORANGE, AVOCADO:
                yield "Exotic fruit";
            default:
                yield "Undefined fruit";
        });
    }

}
