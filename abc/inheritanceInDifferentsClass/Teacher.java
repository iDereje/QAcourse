package inheritanceInDifferentsClass;


class Teacher extends Person
{

    private String dept_name;
    private String qual;

    public void read()
    {
        super.read();
        dept_name = "CSE";
        qual = "PhD";
    }

    public void show()
    {
        super.show();
        System.out.println("Departement = " + dept_name);
        System.out.println("Qualififcation = " + qual);
    }
}
