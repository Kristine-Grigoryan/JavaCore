package homework;
import java.util.Stack;
public class BraceChecker {

    private String text;


    public BraceChecker(String text) {
        this.text = text;

    }
    public  void check() {
        System.out.println(text);

        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char last;
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last != '(') {
                        System.out.println("Error:closed"
                                + c + "at " + i + " but  opened" + last);
                    }
                      break;
                        case '}':
                               last = (char) stack.pop();
                            if (last != '(') {
                                System.out.println("Error:closed"
                                        + c + "at " + i + " but  opened" + last);
                        break;



                    }
                    }

            }

        }

    }

