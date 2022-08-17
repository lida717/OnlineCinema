
import java.util.ArrayList;

public class CinemaApplicationRun {

    private static ArrayList<Viewer> viewerList=new ArrayList<>();

    public static void createList() {
        viewerList.add(new Viewer("viewer1", 10, 3));
        viewerList.add(new Viewer("viewer2", 20, 16));
        viewerList.add(new Viewer("viewer3", 30, 25));
        viewerList.add(new Viewer("viewer4", 40, 1));
        viewerList.add(new Viewer("viewer5", 50, 11));
    }

    public static void main(String[] args) {
        createList();

        System.out.println(ViewerStatistics.averageAge(viewerList));

    }
}
