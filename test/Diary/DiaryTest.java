package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    Diaries diaries;
    @BeforeEach public void startsWith(){
        diary = new Diary("password", "username");
        diaries = new Diaries();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(diary);
        assertNotNull(diaries);
    }
    @Test public void diaryIsLockedByDefault(){
        assertTrue(diary.isLocked());
    }
    @Test public void diaryCanBeUnlockedFromDefaultState(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }
    @Test public void diaryCanBeLockedAfterUnlocking(){
        diary.unlockDiary("Password");
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test public void diaryCanBeUnLockedWithCorrectPassword(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }
    @Test public void diaryCannotBe_UnlockedWithA_WrongPassword(){
        diary.unlockDiary("Password");
        assertTrue(diary.isLocked());
    }
    @Test public void entryCanBeCreatedWhenDiaryIsUnlocked(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
        assertEquals(1, diary.countEntry());
    }
    @Test public void entryCanBeDeletedAfterCreated(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
        diary.createEntry("MySpeech", "MY Head");
        diary.deleteEntryByTitle("title");
        assertNotNull(diary.findEntryByTitle("MySpeech"));
        assertEquals(1,diary.sizeOfEntry());
    }
    @Test public void numberOfEntryCanBeGottenAfterCreatingMoreThanOneEntryAndDeletingOne(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "Interesting");
        diary.createEntry("OOP", "Java is boring");
        diary.createEntry("Python", "I am Tired");
        diary.deleteEntryByTitle("OOP");
        assertNull(diary.findEntryByTitle("OOP"));
        assertEquals(2, diary.sizeOfEntry());
    }
    @Test public void entryCanBeGottenViaIdAfterCreated(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("MyTitle", "body");
        Entry entry = diary.findEntryById(1);
        assertEquals("MyTitle", entry.getTitle());
    }
    @Test public void entryCanBeUpdatedWithUsingTheId(){
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("title", "body");
        diary.updateEntry(1, "MySpeech", "MyBook");
        Entry entry = diary.findEntryByTitle("MySpeech");
        assertEquals("MyBook", entry.getBody());
    }
    @Test public void diaryCanBeAddedToDiaries(){
        diaries.addDiary("username", "password");
        assertEquals(1, diaries.getSizeOfDiaries());
    }
    @Test public void moreThanOneDiaryCanBeAddedToDiaries(){
        diaries.addDiary("username", "password");
        diaries.addDiary("username", "password");
        assertEquals(2, diaries.getSizeOfDiaries());
    }
    @Test public void diaryCanBeCheckedIfExistInDiariesAfterAddingWithUserName(){
        diaries.addDiary("password", "username");
        Diary diary1 = diaries.findByUserName("username");
        assertEquals("username", diary1.getUserName());
    }
    @Test public void diaryCanNotBeAddedToDiariesWhenAWrongPasswordIsInputted(){
        diaries.addDiary("PassWord", "username");
        diary.unlockDiary("PassWord");
        assertTrue(diary.isLocked());
    }
    @Test public void diaryCanBeDeletedFromDiariesWithUserName(){
        diaries.addDiary("password", "username");
        diaries.addDiary("Dleex", "WhiteWizard");
        diaries.deleteByUserNameAndPassword("password", "username");
        assertEquals(1, diaries.getSizeOfDiaries());
    }
    @Test public void diaryCanBeDeletedFromDiariesAndConfirmIfItStillExistByCheckingViaUserName(){
        diaries.addDiary("Dleex", "WhiteWizard");
        diaries.deleteByUserNameAndPassword("dleex", "WhiteWizard");
        Diary anotherDiary = diaries.findByUserName("username");
        assertNull(anotherDiary);
        diaries.addDiary("password", "username");
        Diary diary1 = diaries.findByUserName("username");
        assertEquals("username", diary1.getUserName());
    }
}
