package pattern.singleton.hungry;

/**
 * 静态方法块生成，与简单饿汉差不多
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance;

    static {
        instance = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {}

    public static HungryStaticSingleton getInstance() {
        return instance;
    }

}
