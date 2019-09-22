import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Hej extends Application implements EventHandler<ActionEvent> {

    Button buttonAdd;
    Group root;
    Scene mainScene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        buttonAdd = new Button("Add");
        // buttonAdd.setText(jeff);

        buttonAdd.setOnAction(this);

        root = new Group(buttonAdd);

        mainScene = new Scene(root);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        // TODO Auto-generated method stub
        if (event.getSource() == buttonAdd)
            ;
        {
            System.out.println("Du tryckte");
        }
    }
}