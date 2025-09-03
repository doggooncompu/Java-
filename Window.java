import javax.swing.JComponent;
import javax.swing.JFrame;

public class Window  {
    JFrame frame = new JFrame("hallo");
    int size;
    public Window(int size){
        this.size = size;
    }


    public void addwindow(JComponent component){
        frame.add(component);
    }
}
