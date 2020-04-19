package pattern.observer.jdkimpl;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
@AllArgsConstructor
public class Teacher implements Observer {

    private String name;

    public Teacher subscribe(Observable o) {
        o.addObserver(this);
        return this;
    }

    public void update(Observable o, Object arg) {
        if (o instanceof Platform) {
            Event event = (Event) arg;
            switch (event.getEventType()) {
                case QUESTION:
                    System.out.println(name + "老师你好，有用户发起了一个新的问题. " + event.getEventDesc());
                    break;
            }
        }
    }


}
