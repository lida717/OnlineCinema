
import java.util.ArrayList;

public class CinemaApplicationRun {

    private static final ArrayList<Viewer> viewerList = new ArrayList<>();

    public static void createList() { // формируем список всех файлов и всех пользователей
        Cinema.cinemaListTotal.add(new Cinema("фильм1", "жанр1", 2));
        Cinema.cinemaListTotal.add(new Cinema("фильм2", "жанр2", 2.5));
        Cinema.cinemaListTotal.add(new Cinema("фильм3", "жанр1", 1.5));
        Cinema.cinemaListTotal.add(new Cinema("фильм4", "жанр1", 2.5));
        Cinema.cinemaListTotal.add(new Cinema("фильм5", "жанр1", 3));

        viewerList.add(new Viewer("viewer1", 10));
        viewerList.add(new Viewer("viewer2", 20));
        viewerList.add(new Viewer("viewer3", 30));
        viewerList.add(new Viewer("viewer4", 40));
        viewerList.add(new Viewer("viewer5", 50));

    }

    public static void main(String[] args) {
        createList();
        System.out.println("averageAge is " + ViewerStatistics.averageAge(viewerList));
        for (Viewer viewer : viewerList) System.out.printf(viewer.toString());

    }
}
