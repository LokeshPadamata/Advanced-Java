package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathOperationsTest {
    MathOperations mathOperations;
    @BeforeAll
    static void inIt(){   // Should be Static
        System.out.println("Runs Before Running All Methods");
    }
    @BeforeEach    //Runs Before every method and initializes the class
    void setUp(TestInfo testInfo, TestReporter testReporter) {
        mathOperations = new MathOperations(); // missed this
        System.out.println("Runs before Executing every Method");
        System.out.println("Running"+ testInfo.getDisplayName());
    }
    @AfterEach
    void tearDown() {
        System.out.println("Runs after Executing every Method");
    }
    @Nested
    @DisplayName("Add TestCase Class")
    class testAdd{
        @Test
        @DisplayName("Testing add positive Method")
        void testAddPositive(){
    //        MathOperations mathOperations = new MathOperations();
            int expected = 10;
            int actual = mathOperations.add(5,5);
            assertEquals(expected,actual);
        }
        @Test
        @DisplayName("Testing Negative")
        void testAddNegative(){
            assertEquals(-7,mathOperations.add(-4,-3));
        }
    }
    @Test
    void testMultiply(){
//        MathOperations mathOperations = new MathOperations();
        assertAll(     // test to be passed if every condition true
                ()-> assertEquals(15,mathOperations.multiply(3,5)),
                ()-> assertEquals(10,mathOperations.multiply(5,2)),
                ()-> assertEquals(6,mathOperations.multiply(3,2))
        );
    }

}