//Name: Ashammeet Gill Id:3147996
interface Visitor {
    void visitEnter(Composite composite);

    void visitExit(Composite composite);

    void visitEnter(Leaf leaf);

    void visitExit(Leaf leaf);
}