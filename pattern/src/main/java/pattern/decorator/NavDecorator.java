package pattern.decorator;

import java.util.List;

/**
 * 导航栏装饰器
 */
public class NavDecorator extends Nav {

    private Nav nav;

    public NavDecorator(Nav nav) {
        this.nav = nav;
    }

    List<String> loadNav() {
        return nav.loadNav();
    }
}
