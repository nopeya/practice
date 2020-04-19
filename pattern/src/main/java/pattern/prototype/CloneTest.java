package pattern.prototype;

import java.util.ArrayList;

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeProcessor<Pojo> processor = new PrototypeProcessor();
        ArrayList<String> tags = new ArrayList<String>();
        tags.add("tag1");
        tags.add("tag2");
        Pojo pojo = new Pojo("李二", "546888", tags);
        Pojo deepClonePojo = processor.deepCloneByJson(pojo);   // 自定义json深克隆
        Pojo clonePojo = pojo.clone();                          // jdk浅克隆cloneable
        pojo.getTags().add("tag3");

        System.out.println(pojo.toString());
        System.out.println(deepClonePojo.toString());
        System.out.println(clonePojo.toString());

        System.out.println(pojo == deepClonePojo);
        System.out.println(pojo == clonePojo);
    }
}
