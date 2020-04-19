package pattern.decorator;

import java.util.List;

/**
 * 登录导航栏
 */
public class LoginNav extends NavDecorator {

    public LoginNav(Nav nav) {
        super(nav);
    }

    @Override
    List<String> loadNav() {
        List<String> list = super.loadNav();
        list.add("作业");
        list.add("个人信息");
        return list;
    }
}
