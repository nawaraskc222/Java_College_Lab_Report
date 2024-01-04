package Lab1;


/////question 4
public class Staff {

    public String code;
    public String name;

    public static class Teacher extends Staff {
        public String subject;
        public String publication;
    }

    public static class Officer extends Staff {
        public String grade;
    }

    public static void main(String[] args) {
        // Teacher access
        Teacher t = new Teacher();
        t.code = "1";
        t.name = "Ram";
        t.subject = "Science";
        t.publication = "Asia";

        System.out.println("Teacher Information:");
        System.out.println("Code: " + t.code);
        System.out.println("Name: " + t.name);
        System.out.println("Subject: " + t.subject);
        System.out.println("Publication: " + t.publication);
        System.out.println("______________________________________");

        // Officer access
        Officer o = new Officer();
        o.code = "2";
        o.name = "Sita";
        o.grade = "A++";

        System.out.println("Officer Information:");
        System.out.println("Code: " + o.code);
        System.out.println("Name: " + o.name);
        System.out.println("Grade: " + o.grade);
    }
}
