package sample;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ExampleFX extends Application
{

    public void start(Stage primaryStage) throws Exception
    {

        //create instance of type Person
        Person person1 = new Person();
        //instantiate field variable name, same thing as "setting the Name"
        person1.Name = "Jenny";
        //instantiate field variable Age
        person1.Age = 36;

        //create second instance of type Person
        Person person2 = new Person();
        person2.Name = "Tom";
        person2.Age = 56;
        Person person3 = new Person();
        person3.Name = "Dipan";
        person3.Age = 17;
        Person person4 = new Person();
        person4.Name = "Rozina";
        person4.Age = 78;

        final String[] selectedPerson = new String[1];

        //three buttons on our primary stage
        Button mainButton1 = new Button();
        mainButton1.setText("Open GridView");

        Button mainButton2 = new Button();
        mainButton2.setText("Open ListView");

        Button mainButton3 = new Button();
        mainButton3.setText("Open a Dialog Box");

        //give "actors" (=buttons) a script so they know what to do

        //setOnAction(new EventHandler<ActionEvent>() makes button work
        //when using EventHandler, must Override handle()

        mainButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                stage.setTitle("List Window");

                StackPane root = new StackPane();
                Scene scene = new Scene(root, 800, 600);




                //creating a listview to display the items on the UI
                ListView<String> list = new ListView<String>();
                ObservableList<String> items = FXCollections.observableArrayList(
                        person1.Name + " " + person1.Age,
                        person2.Name + " " + person2.Age,
                        person3.Name + " " + person3.Age,
                        person4.Name + " " + person4.Age
                );

                //keep track of which car is selected
                list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                        selectedPerson[0] = newValue;
                        System.out.println("Selection changed from: " + oldValue+ " to: " + newValue);
                    }
                });

                //add ths items to the list
                list.setItems(items);

                //add the list control to the root
                root.getChildren().add(list);

                //set the stage
                stage.setScene(scene);
                stage.show();

            }
        });



        mainButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = new Stage();
                stage.setTitle("Grid Window");

                //organize UI elements inside a StackPane
                StackPane root = new StackPane();
                Scene scene = new Scene(root, 800, 600);

                /*Person person1 = new Person();
                person1.Name = "Otto";
                person1.Age = 27;
                Person person2 = new Person();
                person2.Name = "Mary";
                person2.Age = 45;*/

                //put all instances of Person into an array
                Person[] people = new Person[2];
                people[0] = person1;
                people[1] = person2;
                people[3] = person3;
                people[4] = person4;

                int numberOfPeople = people.length;

                //vertical Box to display the cars as a grid
                VBox vBox = new VBox(8); //spacing = 8


                //loop over all instances of Person

                for(int i = 0; i < numberOfPeople; i++)
                {
                    //each car has a HBox , which has 2 labels
                    HBox hBox = new HBox(2);
                    hBox.getChildren().add(new Label(people[i].Name));
                    hBox.getChildren().add(new Label(Integer.toString(people[i].Age)));

                    vBox.getChildren().add(hBox);
                }

                root.getChildren().add(vBox);
                stage.setScene(scene);
                stage.show();
            }
        });

//dialog box
        mainButton3.setOnAction(e -> {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);

                    //alert.setAlertType(Alert.AlertType.ERROR);

                    alert.setTitle("Information Dialog");
                    alert.setHeaderText("Look, an Information Dialog");  //removing this will set back to default "Message"
                    alert.setContentText("I have a great message for you!");

                    alert.showAndWait();


//        //Makes the blank show up with Walter already entered
//            TextInputDialog dialog = new TextInputDialog("walter");
//            dialog.setTitle("Text Input Dialog");
//            dialog.setHeaderText("Look, a Text Input Dialog");
//            dialog.setContentText("Please enter your name:");
//
//// Traditional way to get the response value.
//            Optional<String> result = dialog.showAndWait();
//            if (result.isPresent()){
//                System.out.println("Your name: " + result.get());
//                person1.Name= result.get();
//            }
//
//// The Java 8 way to get the response value (with lambda expression).
//            result.ifPresent(name -> System.out.println("Your name: " + name));
        });




        //adding the buttons to a vertical box so they know where on the scene they should be
        VBox root = new VBox();
        root.getChildren().add(mainButton1);
        root.getChildren().add(mainButton2);
        root.getChildren().add(mainButton3);




        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Start Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }




    /*
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    */


    public static void main(String[] args) {
        launch(args);
    }
}

//should be in it's own file but the Prof was lazy
class Person
{
    public String Name;
    public int Age;
}