import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Project> myProjects = new ArrayList<Project>();

    public Portfolio() {
        System.out.println("Your Portfolio is ready to be use.");
    }

    // add new project
    public void addNewPorject(Project proj) {
        this.myProjects.add(proj);
    }

    // getter
    public double getPortfolioCost() {
        double sum = 0;
        for (int i = 0; i < myProjects.size(); i++) {
            Project temp = myProjects.get(i);
            System.out.println("instance Name: " + temp);
            sum += temp.getProjectCost();
        }
        return sum;
    }

    public void showPortfolio() {
        double sum = 0;
        for (int i = 0; i < myProjects.size(); i++) {
            Project temp = myProjects.get(i);
            System.out.println(temp.elevatorPitch());
            sum += temp.getProjectCost();
        }
        System.out.println("All Projects Total Cost: " + sum);
    }
}