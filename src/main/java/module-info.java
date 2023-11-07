module com.clode.soft.shopkeeper {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.clode.soft.shopkeeper to javafx.fxml;
    exports com.clode.soft.shopkeeper;
}