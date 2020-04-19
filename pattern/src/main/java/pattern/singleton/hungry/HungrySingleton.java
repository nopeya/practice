package pattern.singleton.hungry;

/**
 * 简单饿汉式单例
 * 优点：执行效率高，无需用锁
 * 缺点：某些情况下可能造成内存浪费
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return instance;
    }


}
