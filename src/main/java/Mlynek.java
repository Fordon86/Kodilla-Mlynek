import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.control.Button;

public class Mlynek extends Application {
    private Image imageback = new Image ("file:src/main/resources/MAIN.jpg");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(1,1,true,false, true,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Button button1 = new Button();
        button1.setText("Exit");
        button1.setOnAction((e)->{
            System.exit(0);
        });

        Circle circle1 = new Circle();
        Button button2 = new Button();
        button2.setText("Put pawn");
        button2.setOnAction((e)->{
            circle1.setTranslateX(190.5);
            circle1.setTranslateY(180);
            circle1.setRadius(18);
            circle1.setFill(Color.RED);
            button2.setVisible(false);
        });

        Circle circle2 = new Circle();
        Button button3 = new Button();
        button3.setText("Put pawn");
        button3.setOnAction((e)->{
            circle2.setTranslateX(448);
            circle2.setTranslateY(189);
            circle2.setRadius(18);
            circle2.setFill(Color.RED);
            button3.setVisible(false);
        });

        Circle circle3 = new Circle();
        Button button4 = new Button();
        button4.setText("Put pawn");
        button4.setOnAction((e)->{
            circle3.setTranslateX(698);
            circle3.setTranslateY(189);
            circle3.setRadius(18);
            circle3.setFill(Color.RED);
            button4.setVisible(false);
        });

        GridPane grid = new GridPane();
        button1.setTranslateX(20);
        button1.setTranslateY(450);
        button2.setTranslateX(178);
        button2.setTranslateY(189);
        button3.setTranslateX(438);
        button3.setTranslateY(189);
        button4.setTranslateX(698);
        button4.setTranslateY(189);
        grid.getChildren().add(button1);
        grid.getChildren().add(button2);
        grid.getChildren().add(button3);
        grid.getChildren().add(button4);
        grid.getChildren().add(circle1);
        grid.getChildren().add(circle2);
        grid.getChildren().add(circle3);
        grid.setBackground(background);

        primaryStage.setTitle("Mlynek");
        primaryStage.setScene(new Scene(grid,900,900, Color.BLACK));
        primaryStage.show();

    }

}
