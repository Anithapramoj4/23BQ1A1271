import java.util.*;
import java.time.LocalDateTime;


class Notification {
    String id;
    String type;
    String message;
    String timestamp;
    Notification(String id, String type, String message, String timestamp) {
        this.id = id;
        this.type = type;
        this.message = message;
        this.timestamp = timestamp;
    }
}
public class PriorityInbox {

    static int getWeight(String type) {
        if(type.equals("Placement"))
            return 3;
        else if(type.equals("Result"))
            return 2;
        else
            return 1;
    }
static LocalDateTime getDateTime(String timestamp) {
    return LocalDateTime.parse(timestamp.replace(" ", "T"));
}
    public static void main(String[] args) {
        List<Notification> notifications = new ArrayList<>();
     notifications.add(new Notification(
    "042c82f3-83f1-411f-987f-c11c7afce7c2",
    "Placement",
    "Meta Platforms Inc. hiring",
    "2026-06-05 00:10:46"));

notifications.add(new Notification(
    "dca0c302-f2e7-4f4e-b547-afc46f5a7495",
    "Result",
    "internal",
    "2026-06-05 00:40:31"));

notifications.add(new Notification(
    "e0744e87-a21d-424e-abc3-98a90a800181",
    "Placement",
    "Meta Platforms Inc. hiring",
    "2026-06-04 21:10:16"));

notifications.add(new Notification(
    "dbad51a3-f5dd-4f0e-a1fb-31e9fe7c75e6",
    "Result",
    "external",
    "2026-06-05 04:10:01"));

notifications.add(new Notification(
    "fd812169-747d-4c74-8669-659e1c98ee38",
    "Result",
    "project-review",
    "2026-06-04 07:09:46"));

notifications.add(new Notification(
    "c4d3a80b-c127-4b67-a89d-8e48095f3ebb",
    "Placement",
    "Eli Lilly and Company hiring",
    "2026-06-04 22:09:31"));

notifications.add(new Notification(
    "f4b1f900-9546-43a2-85fd-598be77a6b8f",
    "Event",
    "traditional-day",
    "2026-06-04 20:09:16"));

notifications.add(new Notification(
    "4c548fd2-4a6d-43c9-a0e9-d4031a1eae9e",
    "Placement",
    "PayPal Holdings Inc. hiring",
    "2026-06-04 16:09:01"));

notifications.add(new Notification(
    "ce9aa239-04bf-452c-99fe-fd5cc810ce2e",
    "Result",
    "end-sem",
    "2026-06-04 19:08:46"));

notifications.add(new Notification(
    "44b5c42a-5f0a-4652-a31a-84b8502ed489",
    "Placement",
    "Tesla Inc. hiring",
    "2026-06-04 22:38:31"));

notifications.add(new Notification(
    "94387e95-618e-4a74-adff-3eedac1ea409",
    "Placement",
    "Marriott International Inc. hiring",
    "2026-06-05 03:38:16"));

notifications.add(new Notification(
    "d1b88d57-0ead-4e69-be06-4ab350a729ef",
    "Placement",
    "Marvell Technology Inc. hiring",
    "2026-06-05 01:38:01"));

notifications.add(new Notification(
    "e92d823a-74d0-4feb-9185-8629ee32a4bf",
    "Placement",
    "Broadcom Inc. hiring",
    "2026-06-04 08:37:46"));

notifications.add(new Notification(
    "565db048-6168-4a3f-b47c-069322b21bad",
    "Placement",
    "Alphabet Inc. Class C hiring",
    "2026-06-04 18:07:31"));

notifications.add(new Notification(
    "1f4c0837-c552-402a-9320-9fe2bcebcbb8",
    "Placement",
    "Tesla Inc. hiring",
    "2026-06-04 21:37:16"));

notifications.add(new Notification(
    "836cd442-af52-4ee9-982b-265585f20ad1",
    "Result",
    "mid-sem",
    "2026-06-04 22:07:01"));

notifications.add(new Notification(
    "cad33ea8-bc58-4436-97a2-6284c5086db3",
    "Event",
    "farewell",
    "2026-06-04 16:06:46"));

notifications.add(new Notification(
    "9fee7b7a-3be1-4763-96b1-f9752cd0b88a",
    "Event",
    "induction",
    "2026-06-04 22:36:31"));

notifications.add(new Notification(
    "36595303-72f9-4d8f-b440-4c4de6a4ee74",
    "Result",
    "end-sem",
    "2026-06-04 22:36:16"));

notifications.add(new Notification(
    "e2a6d338-e98b-4ad7-b7c0-c66165dab944",
    "Event",
    "traditional-day",
    "2026-06-04 21:06:01"));




      notifications.sort((a, b) -> {

    int weightCompare =
            Integer.compare(
                    getWeight(b.type),
                    getWeight(a.type));

    if(weightCompare != 0)
        return weightCompare;

    return getDateTime(b.timestamp)
            .compareTo(getDateTime(a.timestamp));
});
        System.out.println("Priority Notifications:");
        for(int i = 0; i < Math.min(10, notifications.size()); i++) {
    Notification n = notifications.get(i);
            System.out.println(
                    n.type + " | " +
                    n.message + " | " +
                    n.timestamp);
        }
    }
}