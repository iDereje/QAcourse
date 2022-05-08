package inheritanceInDifferentsClass;

class Hierarchical
{

	
    public static void main(String args[])
    {
        System.out.println("******************** Displaying Person Information ********************");
    	Person p1 = new Person();
    	p1.read();
    	p1.show();
    	
    	Student s1 = new Student();

        s1.read();
        System.out.println("******************** Displaying Student Information ********************");

        s1.show();

        Teacher t1 = new Teacher();

        t1.read();
        System.out.println("******************** Displaying Teacher Information ********************");

        t1.show();
    }
}