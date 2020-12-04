import javafx.fxml.FXML;

import javafx.scene.control.ListView;
import javafx.scene.input.KeyEvent;



public class Controller {

    @FXML
    private ListView inventory;


    @FXML
    void keyPressed(KeyEvent key) {
        switch (key.getCode().toString()) {
            case "W":
                Game.getPlayer().setY(Game.getPlayer().getY() - 1);
                break;
            case "S":
                Game.getPlayer().setY(Game.getPlayer().getY() + 1);
                break;
            case "A":
                Game.getPlayer().setX(Game.getPlayer().getX() - 1);
                break;
            case "D":
                Game.getPlayer().setX(Game.getPlayer().getX() + 1);
                break;
            case "F":
                if (Game.getPlayer().getInventoryList().size() < 5)
                    inventory.getItems().add(Game.getPlayer().pickUp());
                break;
            case "G":
                //skraldet bliver ved med at være der
                ListView listView = Game.getPlayer().dropItem(inventory);
                if (listView != null) {
                    inventory = listView;
                }
                break;
        }
        System.out.println(Game.getPlayer().getX() + ", " + Game.getPlayer().getY());
    }
}

