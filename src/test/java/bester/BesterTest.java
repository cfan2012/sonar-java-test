package bester;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BesterTest {
    private Bester bester;
    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Cookie cookie1;
    private Cookie cookie2;

    @Before
    public void setUp() {
        bester = new Bester();
        rectangle1 = new Rectangle(4, 4);
        rectangle2 = new Rectangle(2,2);

        cookie1 = new Cookie(5);
        cookie2 = new Cookie(2);
    }

    @Test
    public void getBiggestRectangleFromArray() {
        Rectangle[] rectangles = {rectangle1,rectangle2};

        assertEquals(rectangle1, bester.compare(rectangles));
    }

    @Test
    public void getBestCookiesFromArray() {
        Cookie[] cookies = {cookie1, cookie2};

        assertEquals(cookie1,bester.compare(cookies));
    }
}
