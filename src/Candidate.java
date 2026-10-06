public class Candidate {
    //(Static variables)
    private static  int examYear;
    private static double registrationFee;
    private static String gradingPocily;
    private static int totalRegisteredCandidates;

    //(Instance variables)
    private String indexNumber;
    private String fullName;
    private String SchoolName;
    private String registrationStatus;
    private String centreAssignment;

    static
    {
        System.out.println("============ 1. STATIC BLOCK ========");
        System.out.println("============ Loading Candidate Data.... ========");
        examYear = 2026;
        registrationFee = 200000.0;
        gradingPocily = "Grade Scale";

        System.out.println("Exam Year: " + examYear);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("Grading Pocily: " + gradingPocily);

        System.out.println(" The end of the static block");
    }

}
