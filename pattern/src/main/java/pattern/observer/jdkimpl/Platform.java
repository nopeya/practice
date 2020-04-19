package pattern.observer.jdkimpl;

import lombok.Data;

import java.util.Observable;

@Data
public class Platform extends Observable {

    public void postQuestion(User user, Question question) {
        System.out.println("用户 " + user.getName() + " 发起了一个问题贴:" + question.getContent());
        setChanged();
        Event event = new Event(EventType.QUESTION,
                "用户：" + user.getName() + " 主题：" + question);
        notifyObservers(event);
    }

}
