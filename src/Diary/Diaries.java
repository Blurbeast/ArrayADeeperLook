package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diary = new ArrayList<>();
    public void addDiary(String password, String username) {
        Diary anotherDiary = new Diary(password, username);
        diary.add(anotherDiary);
    }
    public int getSizeOfDiaries() {
        return diary.size();
    }
    public Diary findByUserName(String username) {
        for (Diary diary1 : diary){
            if (diary1.getUserName().equals(username)) return diary1;
        }
        return null;
    }
    public void deleteByUserNameAndPassword(String password, String username) {
        for (Diary anotherDiary : diary){
            if (anotherDiary.getUserName().equals(username) &&
                    anotherDiary.getPassword().equals(password)) diary.remove(anotherDiary);
        }
    }
}
