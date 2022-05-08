package inheritanceInDifferentsClass;

class Student extends Person
{
    private int rollno;
    private String course;

    public void read()
    {
        super.read();
        rollno = 007;
        course = "Computer Science";
    }

    public void show()
    {
        super.show();
        System.out.println("Roll No. = " + rollno);
        System.out.println("Course = " + course);
    }
}
