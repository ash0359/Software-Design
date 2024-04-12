//Name: Ashammeet Gill Id:3147996
import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }
    
    public void accept(Visitor visitor) {
        visitor.visitEnter(this);
        for (Component child : children) {
            child.accept(visitor);
        }
        visitor.visitExit(this);
    }

    public String getName() {
        return name;
    }
}