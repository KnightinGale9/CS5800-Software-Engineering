package Aggregation;

public class courseDriver {
    public static void main(String[] args) {
        Instructor nima = new Instructor("Nima", "Davarpanah","3-2636");
        Textbook cleanCode = new Textbook("Clean Code","Robert Martin","Pearson");

        Instructor yu = new Instructor("Yu", "Sun","8-0040");
        Textbook designPattern = new Textbook("Design Patterns","Erich Gamma","Addison-Wesley");

        Course oneInstructor = new Course();
        oneInstructor.setCourseName("CS5800 Advance Software Engineering");
        oneInstructor.setInstructor(nima);
        oneInstructor.setTextbook(cleanCode);
        oneInstructor.setInstructor(yu);
        oneInstructor.setTextbook(designPattern);
        System.out.println(oneInstructor);

    }
}
