import event.ExampleEvent;
import jakarta.enterprise.event.Observes;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WeldContainer weldContainer = new Weld().initialize();

        weldContainer.getBeanManager().fireEvent(new ExampleEvent("Hello JU20 dec"));
        weldContainer.select(TextApplication.class).get().run();
        weldContainer.shutdown();
    }

    public void containerObserver(@Observes ContainerInitialized event) {
        System.out.println("I think that a CDI container is initialized...");
    }

}
