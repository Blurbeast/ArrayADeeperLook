package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private List<Entry> entries;
    private String userName;

    public Diary(String password, String userName){
        this.password = password;
        this.userName = userName;
        entries = new ArrayList<>();
    }
    public String getUserName(){
        return this.userName;
    }
    String getPassword(){
        return this.password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void unlockDiary(String password) {
        if (this.password.equals(password)) isLocked = false;
    }
    public void lockDiary() {
        isLocked = true;
    }

    public void createEntry(String title, String body) {
        boolean confirmIfDiaryIsNotLocked = !isLocked;
        if (confirmIfDiaryIsNotLocked) {
            Entry newEntry = new Entry(title, body);
            entries.add(newEntry);
        }
    }
    public Entry findEntryById(int id) {
        boolean confirmIfDiaryIsNotLocked = !isLocked;
        if (confirmIfDiaryIsNotLocked) {
            for (Entry enter : entries) {
                if (enter.getId() == id) return enter;
            }
        }
        return null;
    }
    public Entry findEntryByTitle(String title){
        boolean confirmIfDiaryIsNotLocked = !isLocked;
        if (confirmIfDiaryIsNotLocked) {
            for (Entry enter : entries) {
                if (enter.getTitle().equalsIgnoreCase(title)) return enter;
            }
        }
        return null;
    }
    public int countEntry() {
        boolean confirmIfDiaryIsNotLocked = !isLocked;
        if (confirmIfDiaryIsNotLocked) return entries.size();
        return 0;
    }
    public void deleteEntryByTitle(String title){
        boolean confirmIfDiaryIsNotLocked = !isLocked;
        if (confirmIfDiaryIsNotLocked) {
            for (Entry entry : entries){
                if (entry.getTitle().equals(title)) entries.remove(entry);
            }
        }
    }
    public int sizeOfEntry(){
        return entries.size();
    }
    public void updateEntry(int id, String updateTitle, String updateBody) {
        boolean confirmIfDiaryIsNotLocked = !isLocked;
        if (confirmIfDiaryIsNotLocked) {
            Entry entry = new Entry(id, updateTitle, updateBody);
            entries.add(entry);
        }
    }
}
//    public void deleteEntryById(int entry) {
//        boolean confirmIfDiaryIsNotLocked = !isLocked;
//        if (confirmIfDiaryIsNotLocked) {
//            for (Entry entry1 : entries){
//                if (entry1.getId() == entry) entries.remove(entry1);
//            }
//        }
//    }
