public class ProjectTest {
    public static void main(String[] args) {
        Project myPoject1 = new Project();
        Project myPoject2 = new Project("MD-Doc");
        Project myPoject3 = new Project("MD-Doc", "Create document and collab with people");

        myPoject1.setProjectCost(25.5);
        myPoject2.setProjectCost(22.5);
        myPoject3.setProjectCost(100.6);

        Portfolio myPorfolio = new Portfolio();

        myPorfolio.addNewPorject(myPoject1);
        myPorfolio.addNewPorject(myPoject2);
        myPorfolio.addNewPorject(myPoject3);

        myPorfolio.showPortfolio();

    }
}