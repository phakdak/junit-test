import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class testTest {

    @Test
    public void testDivide() {
        test.divide(2,1);
        assertEquals(1, test.divide(2,2));
    }
    @Test
        public void testDivideByZero() throws java.lang.ArithmeticException{
        //assertEquals("Can't divide by zero!", test.divide(0,0));
        test.divide(0,0);
    }


}