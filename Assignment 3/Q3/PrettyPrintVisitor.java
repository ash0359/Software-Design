//Name: Ashammeet Gill Id:3147996
class PrettyPrintVisitor implements Visitor {
    private int indentation = 0;

    public void visitEnter(Composite composite) {
        System.out.println(" ".repeat(indentation) + composite.getName());
        indentation += 2;
    }

    public void visitExit(Composite composite) {
        indentation -= 2;
    }

    public void visitEnter(Leaf leaf) {
        System.out.println(" ".repeat(indentation) + leaf.getName());
    }

    public void visitExit(Leaf leaf) {

    }
}