//Name: Ashammeet Gill Id:3147996
public class Driver {
    public static void main(String[] args) {
        Composite root = new Composite("UW");
        Composite science = new Composite("Science");
        Composite acs = new Composite("ACS");
        Leaf java = new Leaf("Java");
        Leaf python = new Leaf("Python");
        Composite phys = new Composite("Phys");
        Leaf python2 = new Leaf("Python");
        Composite education = new Composite("Education");
        Composite curriculum = new Composite("Curriculum");
        Leaf earlyYears = new Leaf("Early Years");
        Composite arts = new Composite("Arts");
        Composite eng = new Composite("Eng");
        Leaf victorian = new Leaf("Victorian");
        Leaf romanticism = new Leaf("Romanticism");
        Composite anth = new Composite("Anth");
        Leaf magic = new Leaf("Magic");

        root.add(science);
        science.add(acs);
        acs.add(java);
        acs.add(python);
        science.add(phys);
        phys.add(python2);
        root.add(education);
        education.add(curriculum);
        curriculum.add(earlyYears);
        root.add(arts);
        arts.add(eng);
        eng.add(victorian);
        eng.add(romanticism);
        arts.add(anth);
        anth.add(magic);

        root.accept(new PrettyPrintVisitor());
    }
}
