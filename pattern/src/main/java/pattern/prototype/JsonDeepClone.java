package pattern.prototype;

/**
 * 使用json实现的深克隆接口
 */
public interface JsonDeepClone<T> extends IDeepClone {

    T deepCloneByJson(T t);
}
