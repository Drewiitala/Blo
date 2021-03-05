import java.util.LinkedList;

public class Section {
    String sectionName;
    LinkedList<Student> Students;

    public Section(String sectionName){
        this.sectionName=sectionName;
        Students = new LinkedList<>();
    }

    // Return true if the sectionNames match
    // Return false otherwise
    public boolean compare(String sectionName){
        return this.sectionName.equals(sectionName);
    }



}
