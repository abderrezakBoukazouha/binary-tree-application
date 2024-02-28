package Queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Application {

    @Test
    public void shouldVerifyIfStringContainsTheRightOrderOfBrackets() {

        assertTrue(containsTheRightOrderOfBrackets(""));
        assertFalse(containsTheRightOrderOfBrackets(")"));
        assertTrue(containsTheRightOrderOfBrackets("(())"));
        assertFalse(containsTheRightOrderOfBrackets("(("));
        assertFalse(containsTheRightOrderOfBrackets("()()((()((()"));
        assertFalse(containsTheRightOrderOfBrackets("((((()))))))((())))))))))))))"));
        assertTrue(containsTheRightOrderOfBrackets("((((())))())"));
    }

    private boolean containsTheRightOrderOfBrackets(String brackets) {
        Queue<String> queue = new LinkedList<>();

        for (char c : brackets.toCharArray()) {
            if (c == ')' && queue.isEmpty()) {
                return false;
            }
            if (c == '(') {
                queue.add("(");
            }
            if (c == ')') {
                queue.remove();
            }
        }
        return queue.isEmpty();
    }

    @Test
    public void randomTest() {
        List <String> rows = List.of("...X.X", "XXXXXX", "XXXXXX", "..XXXX", ".XXX.X", ".XXXXX");
        int height = rows.size();
        int width =  rows.getFirst().length();

        int nbrX = 0;

        for (int i = 1; i<height -1 ; i++ ) {
            for (int j = 1; j<width -1 ; j++ ) {
                if(rows.get(i).charAt(j) == 'X' && rows.get(i-1).charAt(j) == 'X' && rows.get(i + 1).charAt(j) == 'X'
                && rows.get(i).charAt(j - 1) == 'X' && rows.get(i).charAt(j + 1) == 'X') {
                    nbrX ++;
                }
            }
        }

        System.out.println(nbrX);
    }

}
