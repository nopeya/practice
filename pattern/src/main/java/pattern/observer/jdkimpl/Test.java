package pattern.observer.jdkimpl;

public class Test {

    public static void main(String[] args) {

        Platform platform = new Platform();

        Teacher teacher1 = new Teacher("mic").subscribe(platform);
        Teacher teacher2 = new Teacher("jane").subscribe(platform);

        new User("user1").ask(platform, new Question("什么是观察者模式?"));

    }
}
