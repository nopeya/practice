package pattern.prototype;

/**
 * 使用io流进行序列化 * @param <T>
 */
public interface IODeepClone<T> extends IDeepClone {

    T deepCloneByIO(T t);
}
