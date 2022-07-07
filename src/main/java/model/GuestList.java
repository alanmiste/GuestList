package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.nio.file.*;

public class GuestList {
    List<String> guestList = new ArrayList<>();

    public static final Path PATH = Path.of("guest.txt");

    public boolean checkFileExists(){
        return Files.exists(PATH);
    }

    public void setGuests(String guest) {
        guestList.add(guest);
        try {
            Files.writeString(PATH,guestList.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setGuests(List<String> guest) {
        guestList = guest;
    }

    public void setGuests() {

    }

    public List<String> getGuests() {
        return guestList;
    }
}
