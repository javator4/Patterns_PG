package com.sda.patterns;

/**

 */
public class App 
{

    static class task1 implements Runnable{
        @Override
        public void run() {
            System.out.println(Singleton.getInstance());
        }
    }

    static class task2 implements Runnable{
        @Override
        public void run() {
            System.out.println(Singleton.getInstance());
        }
    }
    public static void main( String[] args )
    {

        Thread thread1 = new Thread(new task1());
        thread1.start();

        Thread thread2 = new Thread(new task2());
        thread2.start();

       Singleton singleton = Singleton.getInstance();
       Singleton singleton1 = Singleton.getInstance();
       Singleton singleton2 = Singleton.getInstance();
       Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
