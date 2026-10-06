public class Main {
    public static void main(String[] args) {
        System.out.println("##### UNEB CANDIDATE REGISTRATION SYSTEM #####");

        // 1. First object: triggers the static block (once), then instance block, then constructor
        System.out.println(">>> Registering candidate 1...");
        Candidate c1 = new Candidate("U0001/001", "Nakato Sarah", "Gayaza High School");
        System.out.println();

        // 2. Second object: static block must NOT run again
        System.out.println(">>> Registering candidate 2...");
        Candidate c2 = new Candidate("U0002/045", "Okello David", "St. Mary's College Kisubi");
        System.out.println();

        // 3. Third object: from another school, counter keeps increasing
        System.out.println(">>> Registering candidate 3...");
        Candidate c3 = new Candidate("U0003/112", "Namukasa Ruth", "Mengo Senior School");
        System.out.println();

        // 4. Display all candidate details
        System.out.println("========== REGISTERED CANDIDATES ==========");
        c1.displayCandidateInfo();
        c2.displayCandidateInfo();
        c3.displayCandidateInfo();

        System.out.println("\nRegistration process completed.");

    }
}

