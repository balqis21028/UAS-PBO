public class Lecturer extends Employee implements Teaching{
    int lecturerID;
    String courselist;

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }
    public void setCourselist(String courselist) {
        this.courselist = courselist;
    }

    public String getCourceList() {
        return courselist;
    }

}
