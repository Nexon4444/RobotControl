package RobotControl5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class View extends Application{

    StackPane root = new StackPane();
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");


        StackPane root = new StackPane();

        primaryStage.setScene(new Scene(root, 1000, 1000));
        primaryStage.show();
    }

    public void addRobot(double posX, double posY, double angle)
    {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                posX, posY+10,
                20.0, 10.0,
                10.0, 20.0 });

    }
}
