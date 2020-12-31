import org.testng.annotations.Test;


    public class FirstTest {
        /*
        1. Setup Open browser and application
        2. Login
        3. Close
         */
        @Test(priority = 1)
        void setup(){
            System.out.println("This is setup test");
        }

        @Test(priority = 2)
        void login(){
            System.out.println("This is login test");
        }

        @Test(priority = 3)
        void teardown(){
            System.out.println("Closing browser test");
        }


    }

