module XO {
    requires javafx.fxml;
    requires javafx.controls;
    opens md.JulianNSH.XO to javafx.fxml;
    exports md.JulianNSH.XO;
}