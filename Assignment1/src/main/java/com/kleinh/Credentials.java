package com.kleinh;

public class Credentials
{
    private String name;
    private String surname;
    private int age;

    //default constructor
    public Credentials()
    {

    }
    //parameterized constructor
    public Credentials(String n,String sn, int a)
    {
        name = n;
        surname = sn;
        age = a;
    }

    //METHODS
    //setters
    public void setName(String n)
    {
        name = n;
    }

    public void setSurname(String sn)
    {
        surname = sn;
    }

    public void setAge(int a)
    {
        age = a;
    }

    //getters
    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public String toString()
    {
        return  "NAME: " + name + "\n" +
                "SURNAME: " + surname + "\n" +
                "AGE: " + age + "\n" ;
    }
}
