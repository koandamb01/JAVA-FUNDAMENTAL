public class Project {
    private String name;
    private String description;
    private double cost = 0;

    public Project() {
        System.out.println("Your project has no name nor description. I dont think that's a good idea!");
    }

    public Project(String nameParam) {
        this.name = nameParam;
        System.out.println("Your project only has name: " + this.name
                + " Please use setDescription to add description to your project later");
    }

    public Project(String nameParam, String descriptionParam) {
        this.name = nameParam;
        this.description = descriptionParam;
        System.out.println("Your project info are: " + this.elevatorPitch());
    }

    public String elevatorPitch() {
        String info = this.name + ", (" + this.cost + "):" + this.description;
        return info;
    }

    // setter
    public void setProjectName(String newName) {
        this.name = newName;
    }

    // setter
    public void setProjectCost(double newCost) {
        this.cost = newCost;
    }

    public void setProjectDescription(String newDescription) {
        this.description = newDescription;
    }

    // Getter
    public String getProjectName() {
        return this.name;
    }

    public String getProjectDescription() {
        return this.description;
    }

    public double getProjectCost() {
        return this.cost;
    }
}