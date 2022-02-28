package ctis210lab5;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class CTIS210Lab5 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Circle myCircle = new Circle(175, 100, 25); //coordinates and radius
        Circle myCircle1 = new Circle(250, 300, 40);
        Circle myCircle2 = new Circle(100, 150, 15);
        //Circle myCircle3 = new Circle(150, -30, 20); //not displayed in window because of negative coordinates 
        //Circle myCircle4 = new Circle(200, 200, -40); //not displayed in window because of negative coordinates
        Circle myCircle3 = new Circle(150, 30, 20); //circle 3 with no negative coordinates for proper display
        Circle myCircle4 = new Circle(200, 200, 40); //circle 4 with no negative coordinates for proper display

        Rectangle darkeroutline1 = new Rectangle(765, 315, 192, 8); 
        Rectangle darkeroutline2 = new Rectangle(765, 323, 192, 8); 
        Rectangle darkeroutline3 = new Rectangle(765, 299, 192, 8);
        Rectangle outline1 = new Rectangle(761, 243, 200, 200);
        Rectangle outline2 = new Rectangle(761, 307, 200, 8);
        Rectangle chestlock = new Rectangle(846, 286, 30, 50);
        Rectangle lockshadow = new Rectangle(834, 274, 53, 73);
        Rectangle sideshadow = new Rectangle(949, 315, 8, 124);
        Rectangle bottomshadow = new Rectangle(765, 431, 192, 8);
        Rectangle handle = new Rectangle(1031, 440, 5, 30);
        Rectangle handle1 = new Rectangle(1040, 440, 7, 7);
        Rectangle textbox = new Rectangle(1090, 450, 140, 60);

        Line stick = new Line(1030, 460, 1065, 410);
        Line string = new Line(1065, 410, 1075, 440);

        Ellipse dropshadow = new Ellipse(1030, 475, 40, 20);

        Circle stringend = new Circle(1075, 440, 3);

        Font font1 = Font.font("Times", FontWeight.BOLD, FontPosture.ITALIC, 15);
        Font font2 = Font.font("Lucida Sans Typewriter", FontWeight.BOLD, 15);
        Font font3 = Font.font("Times", FontWeight.BOLD, FontPosture.ITALIC, 25);

        Text myText = new Text(275, 300, "This Java \napplication \ndraws objects");
        myText.setFill(Color.LEMONCHIFFON);

        Text myText1 = new Text(300, 410, "This is\n a waterfall.\n It is upside\ndown");
        myText1.setFill(Color.WHITE);
        myText1.setFont(font1);

        Text myText2 = new Text(795, 375, "  This is a \ntreasure chest");
        myText2.setFill(Color.WHITE);
        myText2.setFont(font2);

        Text myText3 = new Text(1093, 465, "Item dropped\nfrom chest:\nFishing Pole");
        myText3.setFill(Color.WHITE);
        myText3.setFont(font2);

        Text myText4 = new Text(505, 120, "MINECRAFT WOODEN BACKDROP\nTREASURE CHEST WITH ITEM DROPPED");
        myText4.setFill(Color.WHITE);
        myText4.setFont(font3);

        myCircle.setFill(null);
        myCircle.setStroke(Color.RED);
        myCircle.setStrokeWidth(4);
        myCircle1.setFill(Color.DARKGREEN);
        myCircle2.setFill(Color.AZURE);
        myCircle2.setStroke(Color.PURPLE);
        myCircle3.setFill(Color.GREEN);
        myCircle4.setFill(Color.LIGHTGREEN);

        Color darkgoldenrod = Color.rgb(195, 147, 0, .90);

        outline1.setFill(darkgoldenrod);
        outline1.setStroke(Color.BLACK);
        outline1.setStrokeWidth(8);
        outline2.setFill(Color.BLACK);

        Color lightgray = Color.rgb(200, 200, 200, 0.90);

        chestlock.setFill(lightgray);
        chestlock.setStroke(Color.BLACK);
        chestlock.setStrokeWidth(8);

        Color brownshade = Color.rgb(128, 70, 0, .80);
        Color brownshade2 = Color.rgb(128, 70, 0, 0.50);

        darkeroutline1.setFill(brownshade);
        darkeroutline2.setFill(brownshade2);
        darkeroutline3.setFill(brownshade);

        handle.setFill(Color.LIGHTGRAY);
        handle1.setStroke(Color.BLACK);
        handle1.setFill(Color.DARKGRAY);

        Color shadow = Color.rgb(128, 80, 0, 0.50);

        lockshadow.setFill(shadow);

        sideshadow.setFill(brownshade);

        bottomshadow.setFill(brownshade);

        Color darkbrown = Color.rgb(47, 0, 0);

        stick.setFill(Color.BLACK);
        stick.setStroke(darkbrown);
        stick.setStrokeWidth(5);

        string.setStroke(Color.WHITE);
        string.setStrokeWidth(2);

        Color gray = Color.rgb(135, 135, 135, 0.65);
        dropshadow.setFill(gray);

        textbox.setFill(Color.GRAY);
        textbox.setStroke(Color.DARKGRAY);
        textbox.setStrokeWidth(2);

        stringend.setFill(Color.RED);

        Group root = new Group();

        Image myImage = new Image("file:425x640.jpg");
        Image secondImage = new Image("file:woodenback.jpg");

        ImageView myView = new ImageView(myImage);
        ImageView myView1 = new ImageView(secondImage);

        myView.setX(100);
        myView.setY(100);
        myView.setRotate(180);
        myView.setPreserveRatio(true);
        myView.setFitWidth(280);
        handle.setRotate(36);

        myView1.setX(500);
        myView1.setY(100);

        System.out.println("The width of the image is " + myImage.getWidth() + " pixels.");
        System.out.println("The height of the image is " + myImage.getHeight() + " pixels.");

        System.out.println("The height of the second image is " + secondImage.getHeight() + " pixels.");
        System.out.println("The width of the second image is " + secondImage.getWidth() + " pixels.");

        root.getChildren().addAll(myView, myView1, myCircle, myCircle1, myCircle2, myCircle3, myCircle4, myText, myText1,
                outline1, darkeroutline1, darkeroutline2, darkeroutline3, lockshadow, outline2, chestlock,
                sideshadow, bottomshadow, dropshadow, stick, myText2, textbox, myText3, string, stringend,
                handle, handle1, myText4);

        //Scene scene = new Scene(root, myImage.getWidth(), myImage.getHeight());
        Scene scene = new Scene(root, 1500, 700);

        primaryStage.setTitle("CTIS 210 Lab 5");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
