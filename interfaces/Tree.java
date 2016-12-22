public class Tree implements ITree {
    public String type = "";
    public boolean drops_needles = true;

    Tree(String type, boolean drops) {
        this.type = type;
        this.drops_needles = drops;
    }

    String About() {
        String response = "This tree is a " + this.type + ". ";
        if (this.drops_needles) {
            response += "This tree will drop needles all over the floor. ";
        }
        return response;
    }
}