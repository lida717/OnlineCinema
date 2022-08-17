import java.util.ArrayList;

public class Viewer {
    private String nickName;
    private int age;
    private int numberWatchedFilms;

    public ArrayList<Cinema> cinemaList = new ArrayList<>();

    public String getNickName() {
        return nickName;
    }
    public int getAge() {
        return age;
    }

    public int getNumberWatchedFilms() {
        return numberWatchedFilms;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberWatchedFilms() {
        this.numberWatchedFilms = cinemaList.size();
    }

    public ArrayList<Cinema> getCinemaList() {
        return cinemaList;
    }

    public void createWatchedCinema(){
        ArrayList<Boolean> listIsWatch = new ArrayList();
        for (int i=0;i<Cinema.cinemaListTotal.size();i++) {
            listIsWatch.add(((int) (Math.random() * 2) == 1 ? true : false));
            if (listIsWatch.get(i) == true) cinemaList.add(Cinema.cinemaListTotal.get(i));
        }
        // формируем перечень просмотренных фильмов случайным образом из списка всех фильмов
        // в реальном приложении список должен формироваться - добавлением фильма после просмотра

    }

    public void setCinemaList(ArrayList<Cinema> cinemaList) {
        this.cinemaList = cinemaList;
    }

    public Viewer(String nickName, int age) {
        setNickName(nickName);
        setAge(age);
        createWatchedCinema();
        setNumberWatchedFilms();
    }

    public  Viewer() {}

    @Override
    public String toString(){
        return "Viewer:  "+ this.getNickName()+", age: "+this.getAge()+
                " watched "+ this.numberWatchedFilms+ " films: "+ System.lineSeparator()+this.getCinemaList().toString()+ System.lineSeparator();
    }

}
