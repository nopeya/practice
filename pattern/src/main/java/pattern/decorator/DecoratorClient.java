package pattern.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        Nav baseNav = new BaseNav();
        System.out.println("游客：");
        System.out.println(baseNav.loadNav());
        Nav loginNav = new LoginNav(baseNav);
        System.out.println("登录用户：");
        System.out.println(loginNav.loadNav());
    }
}
