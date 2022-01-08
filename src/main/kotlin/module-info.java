module com.programmer74.ktfxtemplate {
  requires javafx.controls;
  requires javafx.fxml;
  requires kotlin.stdlib;

  opens com.programmer74.ktfxtemplate to javafx.fxml;
  exports com.programmer74.ktfxtemplate;
}