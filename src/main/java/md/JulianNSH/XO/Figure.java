package md.JulianNSH.XO;
import javafx.scene.shape.Rectangle;

public class Figure extends Rectangle {
    private boolean markX = false;
    private boolean markO = false;

    public Figure() {this(false);
    }

    public Figure(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public void take(boolean markX) {
        this.markX = markX;
        this.markO = !markX;
    }

    public boolean hasMarkX() {
        return this.markX;
    }

    public boolean hasMarkO() {
        return this.markO;
    }
}