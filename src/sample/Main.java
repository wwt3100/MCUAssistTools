package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class Main extends Application {
    String btl;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("编程辅助工具");
        primaryStage.setScene(new Scene(root, 600, 400));
        ComboBox bt_btl = (ComboBox)root.lookup("#bt_btl");
        ObservableList<String> options = FXCollections.observableArrayList(
                "9600",
                "19200",
                "38400",
                "57600",
                "115200"
        );
        bt_btl.setItems(options);
        bt_btl.setValue("115200");
        bt_btl.setEditable(true);
        bt_btl.valueProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                bt_btl.setValue(newValue.toString());
                CalUsedtime();
            }
        });
        primaryStage.show();
    }
    public void CalUsedtime()
    {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
