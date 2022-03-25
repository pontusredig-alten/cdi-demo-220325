package event;

import jakarta.enterprise.event.Observes;

public class ExampleEventObserver {

    public void onExampleEvent(@Observes ExampleEvent event) {
        System.out.println(event.getEventMessage() + " || Best wishes, the Example Event Observer");
    }

}
