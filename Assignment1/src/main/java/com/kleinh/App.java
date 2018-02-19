package com.kleinh;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Credentials cred = new Credentials();

        cred.setName("Heinrich");
        cred.setSurname("Klein");
        cred.setAge(41);

        System.out.println("MY CREDENTIALS: " + "\n" + cred.toString());
    }
}
