import java.util.Scanner;

class myThread implements Runnable {
    public Thread t;
    private String threadName;
    boolean suspended = false;

    myThread( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        int stopThreadOne;
        int resumeThreadOne;
        int threadOne = 1;
        int threadTwo = 2;
        int threadThree = 3;
        int threadFour = 4;
        int threadFive = 5;
        String threadString1 = "thread 1";
        String threadString2 = "thread 2";
        String threadString3 = "thread 3";
        String threadString4 = "thread 4";
        String threadString5 = "thread 5";

        int anotherThread = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Running " +  threadName );
        try {
            System.out.println("Press " + threadName + " to pause the thread");
            System.out.println("Press X to control another thread: ");
            stopThreadOne = keyboard.nextInt();
            while (stopThreadOne != anotherThread) {
                if (threadName.equals(threadString1)) {
                        System.out.println("Now Pausing Thread One ...");
                        for (int i = 1; i > 0; i--) {
                            if (stopThreadOne == threadOne) {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                suspend();
                                System.out.println("Suspending First Thread");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press 1 to resume " + threadOne);
                                resumeThreadOne = keyboard.nextInt();
                                System.out.println("Executing " + threadOne + ".");
                                if (resumeThreadOne == threadOne) {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    resume();
                                    System.out.println("Resuming thread One. ");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    //break;
                                }

                            }
                            System.out.println("Thread: " + threadName);
                            // Let the thread sleep for a while.
                            Thread.sleep(300);
                            synchronized (this) {
                                while (suspended) {
                                    wait();
                                }
                            }
                        }
                } else if (threadName.equals(threadString2))  {
                        System.out.println("Now Pausing Thread Two ...");

                        for (int i = 1; i > 0; i--) {
                            if (stopThreadOne == threadTwo) {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                suspend();
                                System.out.println("Suspending Second Thread");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press 2 to resume " + threadTwo);
                                resumeThreadOne = keyboard.nextInt();
                                System.out.println("Executing thread " + threadTwo + ".");
                                if (resumeThreadOne == threadTwo) {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    resume();
                                    System.out.println("Resuming thread Two)");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }
                            }
                            System.out.println("Thread: " + threadName);
                            // Let the thread sleep for a while.
                            Thread.sleep(300);
                            synchronized (this) {
                                while (suspended) {
                                    wait();
                                }
                                //break;
                            }
                        }

                } else if (threadName.equals(threadString3)) {
                        System.out.println("Now Pausing Thread Two ...");

                        for (int i = 1; i > 0; i--) {
                            if (stopThreadOne == threadThree) {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                suspend();
                                System.out.println("Suspending Third Thread");
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press " + threadThree + " to resume thread " + threadThree);
                                resumeThreadOne = keyboard.nextInt();
                                System.out.println("Executing " + threadThree + ".");
                                if (resumeThreadOne == threadThree) {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    resume();
                                    System.out.println("Resuming)");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }

                            }
                            System.out.println("Thread: " + threadName);
                            // Let the thread sleep for a while.
                            Thread.sleep(300);
                            synchronized (this) {
                                while (suspended) {
                                    wait();
                                }
                            }
                        }

                } else if (threadName.equals(threadString4)) {
                        System.out.println("Now Pausing Thread Four ...");
                        for (int i = 1; i > 0; i--) {
                            if (stopThreadOne == threadFour) {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                suspend();
                                System.out.println("Suspending " + threadString4);
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press 4 to resume " + threadString4 + "....");
                                resumeThreadOne = keyboard.nextInt();
                                System.out.println("Executing " + threadString4 + "....");
                                if (resumeThreadOne == threadFour) {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    resume();
                                    System.out.println("Resuming " + threadString4 + "....");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }

                            }
                            System.out.println("Thread: " + threadName);
                            // Let the thread sleep for a while.
                            Thread.sleep(300);
                            synchronized (this) {
                                while (suspended) {
                                    wait();
                                }
                            }
                        }

                } else if (threadName.equals(threadString5)) {

                        for (int i = 1; i > 0; i--) {
                            if (stopThreadOne == threadFive) {
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                suspend();
                                System.out.println("Suspending " + threadString5);
                                try {
                                    Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                System.out.println("Press 5 to resume " + threadString5 + "....");
                                resumeThreadOne = keyboard.nextInt();
                                System.out.println("Executing " + threadString5 + "....");
                                if (resumeThreadOne == threadFive) {
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    resume();
                                    System.out.println("Resuming " + threadString5 + "....");
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                }

                            }
                            System.out.println("Thread: " + threadName);
                            // Let the thread sleep for a while.
                            Thread.sleep(300);
                            synchronized (this) {
                                while (suspended) {
                                    wait();
                                }
                            }
                        }
                }
                System.out.println("Enter another thread number to control: ");
                stopThreadOne = keyboard.nextInt();
            }

        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }


    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    void suspend() {
        suspended = true;
    }

    synchronized void resume() {
        suspended = false;
        notify();
    }
}