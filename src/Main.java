

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String a = "fsdfa(dsfsadf{sdfs{dasdasdfase}sfadf}asdfasdf[fsdf]dsfdsf)";
        System.out.println(correct(a));
    }

    public static boolean correct(String letter) {
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == '(' || letter.charAt(i) == '[' || letter.charAt(i) == '{') {
                list.push(letter.charAt(i));

            }
            switch (letter.charAt(i)) {
                case ')':
                    if (!list.isEmpty() && list.peek() == '(') {
                        list.pop();
                        break;
                    }
                case ']':
                    if (!list.isEmpty() && list.peek() == '[') {
                        list.pop();
                        break;
                    }
                case '}':
                    if (!list.isEmpty() && list.peek() == '{') {
                        list.pop();
                        break;
                    }

            }

        }
    return list.isEmpty();
    }
}