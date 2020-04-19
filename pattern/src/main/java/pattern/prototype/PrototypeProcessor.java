package pattern.prototype;

import com.google.gson.Gson;

/**
 * 原型处理
 * @param <T>
 */
public class PrototypeProcessor<T> implements JsonDeepClone<T>, IODeepClone<T> {


    /**
     * 使用json实现深克隆
     * @param o
     * @return
     */
    public T deepCloneByJson(T o) {
        if (o == null) return null;
        Gson gson = new Gson();
        String json = gson.toJson(o);
        return (T)gson.fromJson(json, o.getClass());
    }

    public T deepCloneByIO(T t) {
        return null;
    }
}
