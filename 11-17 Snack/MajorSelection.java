//Blueprint for creating a major selection reply

//Classes are essentially blueprints to create objects. The objects would be a 
//ballot to determine what major people are 
public class MajorSelection {
    private int osis;
    private String major;

    MajorSelection()
    {
        this.osis = 0;
        this.major = "LAS";
    }

    MajorSelection(int osisNum, String choice)
    {
        this.osis = osisNum;
        this.major = choice;
    }

    public String returnDecision()
    {
        return "OSIS: " + this.osis + " - Major: " + this.major;
    }
}
