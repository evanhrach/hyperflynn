package evan.homework;

import java.util.ArrayList;

/**
 * Created by Evan on 10/12/2015.
 */
public class Course {
    public Course (String courseName, int period) {
        this.courseName = courseName;
        this.period = period;
        assignmentList = new ArrayList<Assignment>();
    }
    private int period;
    private String courseName;
    private ArrayList<Assignment> assignmentList;

    /**Getters and Setters for Assignment List
     *
     * addAssignment(<b>Assignment</b> <i>>a</i>)
     * returns <b>boolean</b> <i>isSuccessful</i>
     * <br>
     * getAssignment(<b>int</b> <i>index</i>)
     * returns <b>Assignment</b> <i>a</i>
     */
    public boolean addAssignment(Assignment newAssignment) {
        assignmentList.add(0, newAssignment);
        return true;
    }
    public Assignment getAssignment(int assignmentIndex) {
        return assignmentList.get(assignmentIndex);
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getPeriod() {
        return period;
    }
    public void setPeriod(int period) {
        this.period = period;
    }



}
