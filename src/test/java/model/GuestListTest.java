package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GuestListTest {
    @Test
    @DisplayName("EmptyInitially")
    void shouldBeEmptyInitially(){
        //Given
        GuestList guestList = new GuestList();
        guestList.setGuests();
        List<String> getName = guestList.getGuests();
        //When
        boolean actual= getName.isEmpty();
        //Then
        Assertions.assertEquals(true, actual);
    }

    @Test
    @DisplayName("ReadSameGuest")
    void shouldReadSameGuestsAsWrittenBefore(){
        //Given
        GuestList guestList = new GuestList();
        guestList.setGuests("Karl");
        guestList.setGuests("Ute");

        List<String> actual = guestList.getGuests();

        //When
        List<String> expected = new ArrayList<>();
        expected.add("Karl");
        expected.add("Ute");

        //Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("isFileExist")
    void isFileExist(){
        //Given
        GuestList guestList = new GuestList();
        guestList.setGuests("Theodor");
        guestList.setGuests("Anette");

        //When
        boolean actual = guestList.checkFileExists();

        //Then
        Assertions.assertEquals(true,actual);

    }

    @Test
    @DisplayName("WriteToFile")
    void shouldWriteToFileSystem(){
        //Given
        GuestList guestList = new GuestList();
        guestList.setGuests("Theodor");
        guestList.setGuests("Anette");

        //When


        //Then


    }
}
