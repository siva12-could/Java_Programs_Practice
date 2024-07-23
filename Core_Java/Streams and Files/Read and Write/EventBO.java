import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class EventBO {
    public List<Event> readFromFile(BufferedReader br) throws IOException {
        List<Event> eventList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                Event event = new Event(parts[0], Integer.parseInt(parts[1]), parts[2]);
                eventList.add(event);
            }
        }
        return eventList;
    }

    public void writeFile(List<Event> eventList, FileWriter fr) throws IOException {
        Set<String> ownerSet = new HashSet<>();
        for (Event event : eventList) {
            if (!ownerSet.contains(event.getOwnerName())) {
                ownerSet.add(event.getOwnerName());
                fr.write(event.getEventName() + "," + event.getAttendeesCount() + "," + event.getOwnerName() + "\n");
            }
        }
    }
}
