package sara.ahmed.moatazsamir.main.pojo;

import java.util.ArrayList;

public abstract class Model
{

    private ArrayList<String> codeNumber;
    private ArrayList<String> codeDescription;
    private ArrayList<String> codeCategory;
    private ArrayList<String> separateCategories;
    private ArrayList<String> determineAction;

    public void setCodeNumber(ArrayList<String> codeNumber) {
        this.codeNumber = codeNumber;
    }

    public void setCodeDescription(ArrayList<String> codeDescription) {
        this.codeDescription = codeDescription;
    }

    public void setCodeCategory(ArrayList<String> codeCategory) {
        this.codeCategory = codeCategory;
    }

    public void setSeparateCategories(ArrayList<String> separateCategories) {
        this.separateCategories = separateCategories;
    }

    public void setDetermineAction(ArrayList<String> determineAction) {
        this.determineAction = determineAction;
    }


    public ArrayList<String> getCodeNumber()
    {
        return codeNumber;
    }

    public ArrayList<String> getCodeDescription() {
        return codeDescription;
    }

    public ArrayList<String> getCodeCategory() {
        return codeCategory;
    }

    public ArrayList<String> getSeparateCategories() {
        return separateCategories;
    }

    public ArrayList<String> getDetermineAction() {
        return determineAction;
    }

}
