package pojos;

public class SubjectRating {
    private String studentName;
    private double testScore;
    private double quizScore;
    private double labScore;
    private double projectScore;
    private double overallRating;

    public SubjectRating(String studentName, double testScore, double quizScore, double labScore, double projectScore, double overallRating) {
        this.studentName = studentName;
        this.testScore = testScore;
        this.quizScore = quizScore;
        this.labScore = labScore;
        this.projectScore = projectScore;
        this.overallRating = overallRating;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public void setQuizScore(int quizScore) {
        this.quizScore = quizScore;
    }

    public void setLabScore(int labScore) {
        this.labScore = labScore;
    }

    public void setProjectScore(int projectScore) {
        this.projectScore = projectScore;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
    }

    public String getStudentName() {
        return studentName;
    }


    @Override
    public String toString() {
        return "Student Name : " + studentName +
                "\nTest Score : " + testScore +
                "\nquizScore : " + quizScore +
                "\nlabScore : " + labScore +
                "\nprojectScore : " + projectScore +
                "\noverallRating : " + overallRating;
    }
}
