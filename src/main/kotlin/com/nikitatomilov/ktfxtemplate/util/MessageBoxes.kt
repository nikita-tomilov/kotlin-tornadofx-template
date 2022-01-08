package com.nikitatomilov.ktfxtemplate.util

import javafx.application.Platform
import javafx.scene.control.Alert

object MessageBoxes {

  fun showAlert(prompt: String, title: String) {
    Platform.runLater {
      val msgbox = Alert(Alert.AlertType.INFORMATION)
      msgbox.title = title
      msgbox.contentText = prompt
      msgbox.showAndWait()
    }
  }
}