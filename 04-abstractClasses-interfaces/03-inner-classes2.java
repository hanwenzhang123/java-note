//Button.java - once clicked, it will listen to us
public class Button {
    private String title;
    private OnClickListener onClickLister;  //OnClickListener

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickLister = onClickListener;
    }

    public void onClick() {
        this.onClickLister.onClick(this.title);
    }

    public interface OnClickListener {  //interface
        public void onClick(String title);
    }

}

//Main.java
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");   //title

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {   //in-class
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {   //override the method
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {  //anonymous class
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }
        }
    }
}
