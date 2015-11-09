package evan.homework;
import java.util.Date;

/**
 * Created by Evan on 10/12/2015.
 */
public class Assignment {

    public Assignment(Date dueDate, String assignmentTitle, String assignmentNotes) {
        this.dueDate = dueDate;
        this.assignmentTitle = assignmentTitle;
        this.assignmentNotes = assignmentNotes;

    }
    private Date dueDate;
    private String assignmentTitle;
    private String assignmentNotes;

    public Date getDueDate() {
        return this.dueDate;
    }
    public String getAssignmentTitle() {
        return this.assignmentTitle;
    }
    public String getAssignmentNotes() {
        return this.assignmentNotes;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }
    public void setAssignmentNotes(String assignmentNotes) {
        this.assignmentNotes = assignmentNotes;
    }



}
