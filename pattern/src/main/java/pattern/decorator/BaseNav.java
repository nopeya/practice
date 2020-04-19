package pattern.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * 通用导航
 */
public class BaseNav extends Nav {

    List<String> loadNav() {
        List<String> baseList = new ArrayList<String>();
        baseList.add("问答");
        baseList.add("文章");
        baseList.add("精品课");
        return baseList;
    }
}
