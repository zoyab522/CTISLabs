package ctis210lab3;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CTIS210Lab3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();

        Scanner scan = new Scanner(System.in);

        String applicantName;
        System.out.print("Enter the applicant name: "); //prints a message for the user giving them instructions about what to enter
        applicantName = scan.nextLine();
        System.out.println("The applicant name is " + applicantName); //prints in output once user hits 'enter' after typing applicant name

        double introCompProg; //tested the formula for a shade of red with min value 0 and max value 100
        System.out.println("Enter the score for Intro to Computer Programming: ");
        introCompProg = scan.nextDouble();

        double advCompProg; //tested the formula for a shade of red with min value 0 and max value 100
        System.out.println("Enter the score for Advanced Computer Programming");
        advCompProg = scan.nextDouble();

        double OperatingSystems;
        System.out.println("Enter the score for Operating Systems");
        OperatingSystems = scan.nextDouble();

        double Networking;
        System.out.println("Enter the score for Networking");
        Networking = scan.nextDouble();

        double DatabaseSys;
        System.out.println("Enter score for Database Systems");
        DatabaseSys = scan.nextDouble();

        double Algorithms;
        System.out.println("Enter score for Algorithms");
        Algorithms = scan.nextDouble();

        double GPA;
        System.out.println("Enter Overall GPA");
        GPA = scan.nextDouble();

        double scoreAverage = introCompProg + advCompProg / 2; //prints score average of the two variables
        System.out.println(scoreAverage);

        int value1 = 15 / 5; //calculates 15 divided by 5
        int value2 = 15 % 5; //calculates the remainder of 15 divided by 5

        System.out.println(value1); //prints the value of the variable value1 (15 divided by 5)
        System.out.println(value2); //prints the value of the variable value2 (the remainder of 15 divided by 5)

        double redIntro = ((introCompProg * 2.3) / 1.7) + 16; //formula for shade of red for IntroCompProg
        double redAdv = ((advCompProg * 2.3) / 1.7) + 16; //formula for shade of red for Adv CompProg
        double redOp = ((OperatingSystems * 2.3) / 1.7) + 16; //formula for shade of red for Operating Systems
        double redNet = ((Networking * 2.3) / 1.7) + 16; //formula for shade of red for Networking
        double redDataSys = ((DatabaseSys * 2.3) / 1.7) + 16; //formula for shade of red for Database Systems
        double redAlg = ((Algorithms * 2.3) / 1.7) + 16; //formula for shade of red for Algorithms
        double redGPA = ((GPA * 2.3) / 1.7) + 16;

        Rectangle displayIntro = new Rectangle(25, 25, 100, 100); //IntroCompProg Rectangle
        displayIntro.setFill(Color.rgb((int) redIntro, 40, 73)); //modified the values for green and blue

        Rectangle displayAdv = new Rectangle(125, 25, 100, 100); //Advanced Comp Prog Rectangle
        displayAdv.setFill(Color.rgb((int) redAdv, 0, 0));

        Rectangle displayOp = new Rectangle(225, 25, 100, 100); //Operating Systems Rectangle
        displayOp.setFill(Color.rgb((int) redOp, 0, 0));

        Rectangle displayNet = new Rectangle(325, 25, 100, 100); //Networking Rectangle
        displayNet.setFill(Color.rgb((int) redNet, 0, 0));

        Rectangle displayDatabSys = new Rectangle(425, 25, 100, 100); //Database Systems Rectangle
        displayDatabSys.setFill(Color.rgb((int) redDataSys, 0, 0));

        Rectangle displayAlgorithms = new Rectangle(525, 25, 100, 100); //Algorithms Rectangle
        displayAlgorithms.setFill(Color.rgb((int) redAlg, 0, 0));

        Rectangle displayGPA = new Rectangle(625, 25, 100, 100); //Overall GPA Rectangle
        displayGPA.setFill(Color.rgb((int) redGPA, 0, 0));

        Text textIntro = new Text(34, 59, "Intro to Comp Prog"); //modified numeric literals
        textIntro.setWrappingWidth(60);
        textIntro.setFill(Color.rgb((int) 90, 163, 17)); //changed text color to green

        Text textAdv = new Text(130, 50, "Adv Comp Prog");
        textAdv.setWrappingWidth(60);
        textAdv.setFill(Color.rgb((int) 75, 127, 200)); //changed text color to blue

        Text textOp = new Text(230, 50, "Operating Systems");
        textOp.setWrappingWidth(60);
        textOp.setFill(Color.rgb((int) 180, 180, 180)); //gray text

        Text textNet = new Text(330, 50, "Networking");
        textNet.setWrappingWidth(65);
        textNet.setFill(Color.rgb((int) 180, 180, 180)); //gray text

        Text textDataBaseSys = new Text(430, 50, "Database Systems");
        textDataBaseSys.setWrappingWidth(60);
        textDataBaseSys.setFill(Color.rgb((int) 180, 180, 180)); //gray text

        Text textAlgorithms = new Text(530, 50, "Algorithms");
        textAlgorithms.setWrappingWidth(60);
        textAlgorithms.setFill(Color.rgb((int) 180, 180, 180)); //gray text  

        Text textGPA = new Text(630, 50, "Overall GPA");
        textGPA.setWrappingWidth(60);
        textGPA.setFill(Color.rgb((int) 180, 180, 180)); //gray text

        root.getChildren().addAll(displayIntro, textIntro, displayAdv, textAdv, displayOp, textOp, displayNet, textNet, displayDatabSys, textDataBaseSys, displayAlgorithms, textAlgorithms, displayGPA, textGPA);

        Scene scene = new Scene(root, 2000, 800);

        primaryStage.setTitle("Applicant" + applicantName);
        primaryStage.setScene(scene);
        primaryStage.show();

        //------------------------------------------------------------------Optional Items------------------------------------------------------------------//
        //GREEN SQUARES for Intro to Comp Prog and Advanced Comp Prog
        //Intro to Comp Prog
        int IntroCompProg = 92;
        int GreenIntro = ((IntroCompProg * 2) / 4) + 16;
        Rectangle displayIntroCompProg = new Rectangle(825, 25, 100, 100);
        displayIntroCompProg.setFill(Color.rgb((int) 0, GreenIntro, 0));
        Text textintrocompprog = new Text(830, 50, "Intro to Comp Prog");
        textintrocompprog.setWrappingWidth(60);
        textintrocompprog.setFill(Color.rgb((int) 255, 255, 255));

        //Advanced Comp Prog
        int AdvancedCompProg = 76;
        int GreenAdv = ((AdvancedCompProg * 2) / 4) + 16;
        Rectangle displayAdvCompProg = new Rectangle(925, 25, 100, 100);
        displayAdvCompProg.setFill(Color.rgb((int) 0, GreenAdv, 0));
        Text textadvcompprog = new Text(930, 50, "Advanced Comp Prog");
        textadvcompprog.setWrappingWidth(60);
        textadvcompprog.setFill(Color.rgb((int) 255, 255, 255));

        //BLUE SQUARES for Intro to Comp Prog and Advanced Comp Prog
        //Intro to Comp Prog
        int IntCompProg = 64;
        int BlueIntro = ((IntCompProg * 2) / 4) + 16;
        Rectangle displayIntCompProg = new Rectangle(1025, 25, 100, 100);
        displayIntCompProg.setFill(Color.rgb((int) 0, 0, BlueIntro));
        Text textintcompprog = new Text(1030, 50, "Intro to Comp Prog");
        textintcompprog.setWrappingWidth(60);
        textintcompprog.setFill(Color.rgb((int) 255, 255, 255));

        //Advanced Comp Prog 
        int AdvCP = 96;
        int BlueAdv = ((AdvCP * 2) / 4) + 16;
        Rectangle displayAdvCP = new Rectangle(1125, 25, 100, 100);
        displayAdvCP.setFill(Color.rgb((int) 0, 0, BlueAdv));
        Text textadvcp = new Text(1130, 50, "Advanced Comp Prog");
        textadvcp.setWrappingWidth(60);
        textadvcp.setFill(Color.rgb((int) 255, 255, 255));

        root.getChildren().addAll(displayIntroCompProg, textintrocompprog, displayAdvCompProg, textadvcompprog, displayIntCompProg, textintcompprog, displayAdvCP, textadvcp);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
