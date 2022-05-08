package inheritanceInDifferentsClass;

class Person
{
    private String name;
    private long phno;

    public void read()
    {
        name = "Baruch";
        phno = 928374993;
    }

    public void show()
    {
        System.out.println("Name = " + name);
        System.out.println("Phone = " + phno);
    }
}


