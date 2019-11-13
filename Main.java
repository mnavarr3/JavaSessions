package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {
    //let's create an array list variable to hold our items
    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        //here is your place to put code
        //let's create some UI elements
        Button addButton = new Button();
        addButton.setText("Add Item");

        Button openBox = new Button("Show description");

        //create a label
        Label mylabel = new Label("hello");

        //make addButton to do something when clicked
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //here we put our code - actions or things that should happen when the button has been pressed
                //use the constructor for class item with 3 variables
                Item myitem = new Item(456789, 678.0, "this is a beloved item");

                //now lets add this item to our array list (this becomes handy if we need to access our items at another place
                items.add(myitem);
                // create another Item object use the constructor for class item with one String variable (or in other words "the String constructor"
                Item mySecondItem = new Item("this is a very special item");
                //let's add this one also to our items array list
                items.add(mySecondItem);
                //print value of item on the console
                System.out.println(myitem.getValue());

                // ... or using the ArrayList object
                System.out.println(items.get(0).getValue());

            }
        });

        //another way of writing code to make button to do some action (works exactly the same!!!)
        openBox.setOnAction(e-> {
            //create dialog box which shows the description of the first item
            Alert alertBox = new Alert(Alert.AlertType.INFORMATION);
            //add the description using out items array list object
            alertBox.setContentText(items.get(0).getDescription());
            // show the dialog
            alertBox.show();
        });

        HBox HBox1 = new HBox(10);
        HBox1.getChildren().addAll(addButton, openBox, mylabel);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(HBox1, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}







