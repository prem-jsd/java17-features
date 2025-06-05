package com.prem.javaoneseven.switchexpr;

public class SwitchExpressions {

    public static void main(String[] args) {

        oldStyleWithoutBreak(Fruit.APPLE);
        oldStyleWithBreak(Fruit.APPLE);
        withReturnValue(Fruit.APPLE);
        withReturnValueEvenShorter(Fruit.APPLE);

        oldStyleWithYield(Fruit.APPLE);
    }

    private static void oldStyleWithoutBreak(Fruit fruit) {
        switch (fruit) {
            case APPLE, PEAR:
                System.out.println("Common fruit");
            case ORANGE, AVOCADO:
                System.out.println("Exotic fruit");
            default:
                System.out.println("Undefined fruit");
        }
    }

    private static void oldStyleWithBreak(Fruit fruit) {
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

    private static void withReturnValue(Fruit fruit) {
        String text = switch (fruit) {
            case APPLE, PEAR -> "Common fruit";
            case ORANGE, AVOCADO -> "Exotic fruit";
            default -> "Undefined fruit";
        };
        System.out.println(text);
    }

    private static void withReturnValueEvenShorter(Fruit fruit) {
        System.out.println(
                switch (fruit) {
                    case APPLE, PEAR -> "Common fruit";
                    case ORANGE, AVOCADO -> "Exotic fruit";
                    default -> "Undefined fruit";
                });
    }

    //todo:: What do you do when you need to do more than only 1 thing in the case?
    //  In this case, you can use brackets to indicate a case block and when returning a value, you use the keyword yield
    // What do you do when you need to do more than only 1 thing in the case? In this case, you can use brackets to indicate
    // a case block and when returning a value, you use the keyword yield
    private static void withYield(Fruit fruit) {
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

    private static void oldStyleWithYield(Fruit fruit) {
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
