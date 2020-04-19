package pattern.observer.jdkimpl;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Event {

    private EventType eventType;

    private String eventDesc;
}
