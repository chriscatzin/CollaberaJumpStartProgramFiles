import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            System.out.println("Welcome to the threading control center!");
            Scanner keyboard = new Scanner(System.in);
            int input;
            int threadOne = 1;
            int threadTwo = 2;
            int threadThree = 3;
            int threadFour = 4;
            int threadFive = 5;
            int stop = 0;
            //int stopThreadOne;
            // int resumeThreadOne;
            //int controlThreadTwo;
            myThread R1 = new myThread( "thread 1");

            myThread R2 = new myThread( "thread 2");

            myThread R3 = new myThread( "thread 3");

            myThread R4 = new myThread( "thread 4");

            myThread R5 = new myThread( "thread 5");

            System.out.println("To control a thread, press keys 1 - 5 respectively: (Press '0' to stop)");
            input = keyboard.nextInt();
            while(input != stop){
                if(input == threadOne) {
                    System.out.println("You are now controlling " + threadOne);
                    R1.start();
                    break;
                }
                else if(input == threadTwo){
                    System.out.println("You are now controlling " + threadTwo);
                    R2.start();
                    break;
                }
                else if(input == threadThree){
                    System.out.println("You are now controlling " + threadThree);
                    R3.start();
                }
                else if(input == threadFour){
                    System.out.println("You are now controlling " + threadFour);
                    R4.start();
                    break;
                }
                else if(input == threadFive){
                    System.out.println("You are now controlling " + threadFive);
                    R5.start();
                    break;
                }

                System.out.println("Enter another thread number to control: ");
                input = keyboard.nextInt();
            }

            /*
            try {
                R2.suspend();
                System.out.println("Suspending thread Two");
                Thread.sleep(8000);
                R2.resume();
                System.out.println("Resuming thread Two");
            } catch (InterruptedException e) {
                System.out.println("Main thread Interrupted");
            }try {
                System.out.println("Waiting for threads to finish.");
                R1.t.join();
                R2.t.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread Interrupted");
            }
            System.out.println("Main thread exiting.");

             */
        }


}

