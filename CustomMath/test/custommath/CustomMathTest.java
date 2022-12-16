/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package custommath;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Student
 */
@RunWith (Parameterized.class)
public class CustomMathTest {
    
    @Parameters
    public static Collection sumValues() {
        return Arrays.asList(new Object [] [] {
            {1,1,2},
            {-1,1,0},
            {10,15,25}}) ;
        }
    
    int x,y, sumResult;
    
    public CustomMathTest(int x, int y, int sumResult) {
        this.x = x;
        this.y = y;
        this.sumResult = sumResult;
    }

    /**
     * Test of sum method, of class CustomMath.
     */
    @Test
    public void testSum() {
        int expResult = sumResult;
        int result = CustomMath.sum(x,y);
        assertEquals (expResult, result);
    }
        /*System.out.println("sum");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = CustomMath.sum(x, y);
        assertEquals(expResult, result);*/
    

    /**
     * Test of division method, of class CustomMath.
     */
    @Test
    public void testDivisionByZero() { 
        System.out.println("division");
        int x = 0;
        int y = 0;
        int expResult = 0;
        try{
        int result = CustomMath.division(x, y);
        assertEquals(expResult,  result);
        if (y==0) fail("Деление на 0 не создаёт исключительной ситуации");
                }catch(IllegalArgumentException e){
                    if(y!=0) fail("Генерация исключения при нулевом знаменателе");
                }
    }

    /**
     * Test of main method, of class CustomMath.
     */
    @Test
    @Ignore ("Not runnig")
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CustomMath.main(args);
        fail("The test case is a prototype.");
    }
    
}

