import java.util.ArrayList;

public class Viewer {

    private String nickName;
    private int age;
    private int numberWatchedFilms;



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

    public void setNumberWatchedFilms(int numberWatchedFilms) {
        this.numberWatchedFilms = numberWatchedFilms;
    }

    public Viewer(String nickName, int age, int numberWatchedFilms) {
        setNickName(nickName);
        setAge(age);
        setNumberWatchedFilms(numberWatchedFilms);
    }

    public  Viewer() {}



}