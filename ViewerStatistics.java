import java.util.ArrayList;

public class ViewerStatistics {
    public static int averageAge(ArrayList<Viewer> viewerList) {
        int sum = 0;
        for (int i = 0; i < viewerList.size(); i++)
            sum = sum + viewerList.get(i).getAge();
        return (sum / viewerList.size());
    }
}
