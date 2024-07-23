import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Event {
    private String eventName;
    private Integer attendeesCount;
    private String ownerName;

    public Event(String eventName, Integer attendeesCount, String ownerName) {
        this.eventName = eventName;
        this.attendeesCount = attendeesCount;
        this.ownerName = ownerName;
    }

    public String getEventName() {
        return eventName;
    }

    public Integer getAttendeesCount() {
        return attendeesCount;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
