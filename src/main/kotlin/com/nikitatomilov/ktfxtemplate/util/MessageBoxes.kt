package com.nikitatomilov.ktfxtemplate.util

import com.nikitatomilov.ktfxtemplate.view.FontFixStyle.Companion.shallApplyFontFix
import javafx.application.Platform
import javafx.scene.control.Alert

object MessageBoxes {

  fun showAlert(prompt: String, title: String) {
    Platform.runLater {
      val msgbox = Alert(Alert.AlertType.INFORMATION)
      msgbox.title = title
      msgbox.contentText = prompt
      if (shallApplyFontFix()) {
        msgbox.dialogPane.stylesheets.add(
            javaClass.getResource("/css/font-fix.css")!!.toExternalForm())
        msgbox.dialogPane.styleClass.add("messagebox")
      }
      msgbox.showAndWait()
    }
  }
}