//Name: Ashammeet Gill Id:3147996
class Leaf implements Component {
    private String name;

    Leaf(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visitEnter(this);
        visitor.visitExit(this);
    }

    String getName() {
        return name;
    }
}