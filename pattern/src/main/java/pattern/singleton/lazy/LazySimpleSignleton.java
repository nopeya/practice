package pattern.singleton.lazy;

/**
 * 简单懒汉式单例
 * 优点：节省内存
 */
public class LazySimpleSignleton {

    private static LazySimpleSignleton instance;

    private LazySimpleSignleton() {}

    public static LazySimpleSignleton getInstance() {
        if (instance == null) {
            instance = new LazySimpleSignleton();
        }
        return instance;
    }

}
