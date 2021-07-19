using "import" to import package
   a way to group related classes and interfaces together
  like import.util.scanner
  
Reasons to use packages
- programmers can easily determine thaat the classes are related
- it is easy to know where to find the classes and interfaces that can provide the functions provided by the package
- because the package creates a new namespace, class and interface name conflicts are avoided
- classes within the package can have unrestricted acccess to one another while still restricting access for classes outside of package
  
  
//MyWindow.java
import java.awt.*;  //all the classes and interfaces * like the Frame
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
  
public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
	    MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
