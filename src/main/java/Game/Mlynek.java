import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.*;

class Player {
    Integer counter = 0;
}

public class Mlynek extends Application {

    private Image imageback = new Image ("file:src/main/resources/MAIN.jpg");

    Button button1 = new Button();
    Button button2 = new Button();
    Button button3 = new Button();
    Button button4 = new Button();
    Button button5 = new Button();
    Button button6 = new Button();
    Button button7 = new Button();
    Button button8 = new Button();
    Button button9 = new Button();
    Button button10 = new Button();
    Button button11 = new Button();
    Button button12 = new Button();
    Button button13 = new Button();
    Button button14 = new Button();
    Button button15 = new Button();
    Button button16 = new Button();
    Button button17 = new Button();
    Button button18 = new Button();
    Button button19 = new Button();
    Button button20 = new Button();
    Button button21 = new Button();
    Button button22 = new Button();
    Button button23 = new Button();
    Button button24 = new Button();

    List<Button> buttons = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        creatScene(primaryStage);
        Integer yourMove = 9;
        Player player = new Player();

        button1.setText("1");
        button1.setOnAction((e)->{
            button1.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button1.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button2.setText("2");
        button2.setOnAction((e)->{
            button2.setStyle(
                "-fx-background-radius: 50em; " +
                        "-fx-min-width: 30px; " +
                        "-fx-min-height: 30px; " +
                        "-fx-max-width: 30px; " +
                        "-fx-max-height: 30px;" +
                        "-fx-background-color: #ff0000;"
        );
            button2.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button3.setText("3");
        button3.setOnAction((e)->{
            button3.setStyle(
            "-fx-background-radius: 50em; " +
                    "-fx-min-width: 30px; " +
                    "-fx-min-height: 30px; " +
                    "-fx-max-width: 30px; " +
                    "-fx-max-height: 30px;" +
                    "-fx-background-color: #ff0000;"
            );
            button3.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button4.setText("4");
        button4.setOnAction((e)->{
            button4.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button4.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button5.setText("5");
        button5.setOnAction((e)->{
            button5.setStyle(
                "-fx-background-radius: 50em; " +
                        "-fx-min-width: 30px; " +
                        "-fx-min-height: 30px; " +
                        "-fx-max-width: 30px; " +
                        "-fx-max-height: 30px;" +
                        "-fx-background-color: #ff0000;"
        );
            button5.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button6.setText("6");
        button6.setOnAction((e)->{
            button6.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button6.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button7.setText("7");
        button7.setOnAction((e)->{
            button7.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button7.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button8.setText("8");
        button8.setOnAction((e)->{
            button8.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button8.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button9.setText("9");
        button9.setOnAction((e)->{
            button9.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button9.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button10.setText("10");
        button10.setOnAction((e)->{
            button10.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button10.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button11.setText("11");
        button11.setOnAction((e)->{
            button11.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button11.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button12.setText("12");
        button12.setOnAction((e)->{
            button12.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button12.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button13.setText("13");
        button13.setOnAction((e)->{
            button13.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button13.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button14.setText("14");
        button14.setOnAction((e)->{
            button14.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button14.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button15.setText("15");
        button15.setOnAction((e)->{
            button15.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button15.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button16.setText("16");
        button16.setOnAction((e)->{
            button16.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button16.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button17.setText("17");
        button17.setOnAction((e)->{
            button17.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button17.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button18.setText("18");
        button18.setOnAction((e)->{
            button18.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button18.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button19.setText("19");
        button19.setOnAction((e)->{
            button19.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button19.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button20.setText("20");
        button20.setOnAction((e)->{
            button20.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button20.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

        button21.setText("21");
        button21.setOnAction((e)->{
            button21.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button21.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button22.setText("22");
        button22.setOnAction((e)->{
            button22.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button22.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button23.setText("23");
        button23.setOnAction((e)->{
            button23.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button23.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
            lineScore();
        });

        button24.setText("24");
        button24.setOnAction((e)->{
            button24.setStyle(
                    "-fx-background-radius: 50em; " +
                            "-fx-min-width: 30px; " +
                            "-fx-min-height: 30px; " +
                            "-fx-max-width: 30px; " +
                            "-fx-max-height: 30px;" +
                            "-fx-background-color: #ff0000;"
            );
            button24.setDisable(true);
            computerMove();
            if (++player.counter>=yourMove){
                disableAllButtons();
            }
        });

    }

    private void creatScene (Stage primaryStage) {

        BackgroundSize backgroundSize = new BackgroundSize(1,1,true,false, true,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Button buttonExit = new Button();
        buttonExit.setText("Exit");
        buttonExit.setOnAction((e)-> System.exit(0));

        Button newGame = new Button();
        newGame.setText("New game");
        newGame.setOnAction( (event -> {

            Platform.runLater(()->new Mlynek().start(new Stage()));
            primaryStage.close();
        } ) );

        Button youWonGame = new Button();
        youWonGame.setText("YOU WON! ! !");
        youWonGame.setVisible(false);
       /* if (point == 1) {
            youWonGame.isVisible();
        }*/

        primaryStage.setScene( new Scene( new BorderPane( newGame ) ) );
        primaryStage.show();

        GridPane grid = new GridPane();

        newGame.setTranslateX(20);
        newGame.setTranslateY(300);
        buttonExit.setTranslateX(20);
        buttonExit.setTranslateY(450);
        youWonGame.setAlignment(Pos.CENTER);

        button1.setTranslateX(190.5);
        button1.setTranslateY(180);
        button1.setShape(new Circle(18));
        button2.setTranslateX(448);
        button2.setTranslateY(189);
        button2.setShape(new Circle(18));
        button3.setTranslateX(698);
        button3.setTranslateY(189);
        button3.setShape(new Circle(18));
        button4.setTranslateX(270);
        button4.setTranslateY(275);
        button4.setShape(new Circle(18));
        button5.setTranslateX(450);
        button5.setTranslateY(275);
        button5.setShape(new Circle(18));
        button6.setTranslateX(630);
        button6.setTranslateY(275);
        button6.setShape(new Circle(18));
        button7.setTranslateX(375);
        button7.setTranslateY(375);
        button7.setShape(new Circle(18));
        button8.setTranslateX(450);
        button8.setTranslateY(375);
        button8.setShape(new Circle(18));
        button9.setTranslateX(525);
        button9.setTranslateY(375);
        button9.setShape(new Circle(18));
        button10.setTranslateX(190.5);
        button10.setTranslateY(450);
        button10.setShape(new Circle(18));
        button11.setTranslateX(270);
        button11.setTranslateY(450);
        button11.setShape(new Circle(18));
        button12.setTranslateX(375);
        button12.setTranslateY(450);
        button12.setShape(new Circle(18));
        button13.setTranslateX(525);
        button13.setTranslateY(450);
        button13.setShape(new Circle(18));
        button14.setTranslateX(630);
        button14.setTranslateY(450);
        button14.setShape(new Circle(18));
        button15.setTranslateX(698);
        button15.setTranslateY(450);
        button15.setShape(new Circle(18));
        button16.setTranslateX(375);
        button16.setTranslateY(525);
        button16.setShape(new Circle(18));
        button17.setTranslateX(450);
        button17.setTranslateY(525);
        button17.setShape(new Circle(18));
        button18.setTranslateX(525);
        button18.setTranslateY(525);
        button18.setShape(new Circle(18));
        button19.setTranslateX(270);
        button19.setTranslateY(620);
        button19.setShape(new Circle(18));
        button20.setTranslateX(448);
        button20.setTranslateY(620);
        button20.setShape(new Circle(18));
        button21.setTranslateX(630);
        button21.setTranslateY(620);
        button21.setShape(new Circle(18));
        button22.setTranslateX(190.5);
        button22.setTranslateY(700);
        button22.setShape(new Circle(18));
        button23.setTranslateX(448);
        button23.setTranslateY(700);
        button23.setShape(new Circle(18));
        button24.setTranslateX(698);
        button24.setTranslateY(700);
        button24.setShape(new Circle(18));

        grid.getChildren().add(buttonExit);
        grid.getChildren().add(youWonGame);
        grid.getChildren().add(button1);
        grid.getChildren().add(button2);
        grid.getChildren().add(button3);
        grid.getChildren().add(button4);
        grid.getChildren().add(button5);
        grid.getChildren().add(button6);
        grid.getChildren().add(button7);
        grid.getChildren().add(button8);
        grid.getChildren().add(button9);
        grid.getChildren().add(button10);
        grid.getChildren().add(button11);
        grid.getChildren().add(button12);
        grid.getChildren().add(button13);
        grid.getChildren().add(button14);
        grid.getChildren().add(button15);
        grid.getChildren().add(button16);
        grid.getChildren().add(button17);
        grid.getChildren().add(button18);
        grid.getChildren().add(button19);
        grid.getChildren().add(button20);
        grid.getChildren().add(button21);
        grid.getChildren().add(button22);
        grid.getChildren().add(button23);
        grid.getChildren().add(button24);
        grid.getChildren().add(newGame);

        grid.setBackground(background);

        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);
        buttons.add(button5);
        buttons.add(button6);
        buttons.add(button7);
        buttons.add(button8);
        buttons.add(button9);
        buttons.add(button10);
        buttons.add(button11);
        buttons.add(button12);
        buttons.add(button13);
        buttons.add(button14);
        buttons.add(button15);
        buttons.add(button16);
        buttons.add(button17);
        buttons.add(button18);
        buttons.add(button19);
        buttons.add(button20);
        buttons.add(button21);
        buttons.add(button22);
        buttons.add(button23);
        buttons.add(button24);

        primaryStage.setTitle("Mlynek");
        primaryStage.setScene(new Scene(grid,900,900, Color.BLACK));
        primaryStage.show();
    }

    private void disableAllButtons (){

        for (int i = 0; i < buttons.size();i++){
            if (!buttons.get(i).isDisable()){
                buttons.get(i).setVisible(false);
            }
        }
    }

    private void computerMove (){
        Random random = new Random();

        for (int rand = random.nextInt((23) + 1); rand<buttons.size();rand++ ) {

            if (!buttons.get(rand).isDisable()) {
                buttons.get(rand).setDisable(true);
                buttons.get(rand).setStyle(
                        "-fx-background-radius: 50em; " +
                                "-fx-min-width: 30px; " +
                                "-fx-min-height: 30px; " +
                                "-fx-max-width: 30px; " +
                                "-fx-max-height: 30px;" +
                                "-fx-background-color: #51df6b;");
                break;
            }
        }
    }

    private void lineScore () {

        List<Button> horizontal1 = new ArrayList();
        horizontal1.add(button1);
        horizontal1.add(button2);
        horizontal1.add(button3);

        List<Button> horizontal2 = new ArrayList();
        horizontal2.add(button4);
        horizontal2.add(button5);
        horizontal2.add(button6);

        List<Button> horizontal3 = new ArrayList();
        horizontal3.add(button7);
        horizontal3.add(button8);
        horizontal3.add(button9);

        List<Button> horizontal4 = new ArrayList();
        horizontal4.add(button10);
        horizontal4.add(button11);
        horizontal4.add(button12);

        List<Button> horizontal5 = new ArrayList();
        horizontal5.add(button13);
        horizontal5.add(button14);
        horizontal5.add(button15);

        List<Button> horizontal6 = new ArrayList();
        horizontal6.add(button16);
        horizontal6.add(button17);
        horizontal6.add(button18);

        List<Button> horizontal7 = new ArrayList();
        horizontal7.add(button19);
        horizontal7.add(button20);
        horizontal7.add(button21);

        List<Button> horizontal8 = new ArrayList();
        horizontal8.add(button22);
        horizontal8.add(button23);
        horizontal8.add(button24);

        Deque<Button> vertical1 = new ArrayDeque<>();
        vertical1.push(button1);
        vertical1.push(button10);
        vertical1.push(button22);

        List<Button> vertical2 = new ArrayList();
        vertical2.add(button4);
        vertical2.add(button11);
        vertical2.add(button19);

        List<Button> vertical3 = new ArrayList();
        vertical3.add(button7);
        vertical3.add(button12);
        vertical3.add(button16);

        List<Button> vertical4 = new ArrayList();
        vertical4.add(button2);
        vertical4.add(button5);
        vertical4.add(button8);

        List<Button> vertical5 = new ArrayList();
        vertical5.add(button17);
        vertical5.add(button20);
        vertical5.add(button23);

        List<Button> vertical6 = new ArrayList();
        vertical6.add(button9);
        vertical6.add(button13);
        vertical6.add(button18);

        List<Button> vertical7 = new ArrayList();
        vertical7.add(button6);
        vertical7.add(button14);
        vertical7.add(button21);

        List<Button> vertical8 = new ArrayList();
        vertical8.add(button3);
        vertical8.add(button15);
        vertical8.add(button24);

        int point = 0;

        for (int i=0; i <vertical1.size(); i++) {

            if (vertical1.getFirst().getStyle().contains("-fx-background-color: #ff0000;")) {

                vertical1.pop();

                if (vertical1.getFirst().getStyle().contains("-fx-background-color: #ff0000;")) {

                    vertical1.pop();

                    if (vertical1.getFirst().getStyle().contains("-fx-background-color: #ff0000;")){

                        point++;

                        System.out.println("You win!" );

                    }
                }
            }
        }

        if (vertical2.get(0).getStyle().contains("-fx-background-color: #ff0000;"))

        for (int i=0; i <vertical2.size(); i++) {



        }
    }

}
