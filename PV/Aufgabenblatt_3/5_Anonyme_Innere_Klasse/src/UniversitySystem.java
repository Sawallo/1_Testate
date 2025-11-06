class UniversitySystem {
    private ExamEvaluatorInterface evaluator;

    public UniversitySystem() {
        this.evaluator = new ExamEvaluatorInterface(){

        public int evaluate(int score) {
        if (score >= 50) {
            return 1; // Bestanden
        } else {
            return 0; // Nicht bestanden
        }
    }

        };
    }

    public void printResult(int studentScore) {
        int result = evaluator.evaluate(studentScore);
        if (result == 1) {
            System.out.println("Der Student hat bestanden.");
        } else {
            System.out.println("Der Student ist durchgefallen.");
        }
    }

    public static void main(String[] args) {
        UniversitySystem system = new UniversitySystem();
        system.printResult(65); // Beispielpunktzahl
    }
}