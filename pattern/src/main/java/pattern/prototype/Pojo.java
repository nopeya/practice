package pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Pojo implements Cloneable {

    private String name;

    private String code;

    private List<String> tags;

    @Override
    protected Pojo clone() throws CloneNotSupportedException {
        return (Pojo)super.clone();
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", tags=" + tags +
                '}';
    }
}