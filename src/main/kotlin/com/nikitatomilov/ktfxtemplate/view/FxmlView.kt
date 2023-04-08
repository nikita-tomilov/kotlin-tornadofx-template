package com.nikitatomilov.ktfxtemplate.view

import javafx.event.ActionEvent
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.View

class FxmlView : View("FxmlViewTitle") {
  override val root: VBox by fxml("/fxml/fxmlview.fxml")

  private val welcomeText: Label by fxid()

  @Suppress("unused") // Button handler that is specified in fxml file
  fun onHelloButtonClick(event: ActionEvent?) {
    welcomeText.text = "Welcome to JavaFX Application!"
  }

  @Suppress("unused") // Button handler that is specified in fxml file
  fun onTornadoButtonClick(event: ActionEvent?) {
    find<TornadoFXView>().openWindow()
  }
}