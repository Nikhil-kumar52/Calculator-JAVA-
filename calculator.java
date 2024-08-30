import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        switch (operator) {
            case 1 -> System.out.println(a+b);
            case 2 -> System.out.println(a-b);
            case 3 -> System.out.println(a*b);
            case 4 -> {
                if (b == 0) {
                    System.out.println("invalid");
                } else {
                    System.out.println(a/b);
                }
            }
                case 5 -> {
                    if (b == 0) {
                        System.out.println("invalid");
                    } else {
                        System.out.println(a%b);
                    }
            }
                    default -> System.out.println("invalid operator");
                }
            }
        }