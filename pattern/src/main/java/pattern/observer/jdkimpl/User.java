package pattern.observer.jdkimpl;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String name;

    public void ask(Platform platform, Question question) {
        platform.postQuestion(this, question);
    }

}
