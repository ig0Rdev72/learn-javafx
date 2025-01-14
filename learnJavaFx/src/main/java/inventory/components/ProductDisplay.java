package inventory.components;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.paint.Color;


public class ProductDisplay {

    List<String> products = initalizeProducts();
    
        public Scene getScene() {
            ListView<String> root = new ListView<>();
            ObservableList<String> prodList = FXCollections.observableList(products);
            root.setItems(prodList);
            return new Scene(root, 600, 600, Color.WHITESMOKE);
        }
    
        private static List<String> initalizeProducts() {
            List<String> products = new ArrayList<>();
            for (int i = 0; i  <= 10; i++) {
                products.add(String.format("Product #%d", i));
            }
            return products;
        }


}