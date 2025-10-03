package entities;

public class AprovedGrades {
    private String name;
    private double firstSemester;
    private double secondSemester;

    public AprovedGrades(String name,double firstSemester, double secondSemester) {
        this.firstSemester = firstSemester;
        this.name = name;
        this.secondSemester = secondSemester;
    }

    public double getFirstSemester() {
        return firstSemester;
    }

    public void setFirstSemester(double firstSemester) {
        this.firstSemester = firstSemester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSecondSemester() {
        return secondSemester;
    }

    public void setSecondSemester(double secondSemester) {
        this.secondSemester = secondSemester;
    }
}
