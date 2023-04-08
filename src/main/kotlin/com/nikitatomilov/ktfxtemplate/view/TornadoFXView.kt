package com.nikitatomilov.ktfxtemplate.view

import com.nikitatomilov.ktfxtemplate.controller.TornadoFXController
import com.nikitatomilov.ktfxtemplate.util.MessageBoxes
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class TornadoFXView : View("TornadoFXViewTitle") {
  private val controller: TornadoFXController by inject()
  private val input = SimpleStringProperty()

  override val root = form {
    fieldset {
      field("Input") {
        textfield(input)
      }

      button("Commit") {
        action {
          if (input.value != null) {
            controller.writeToDb(input.value)
            MessageBoxes.showAlert("Written '${input.value}' to DB", "Success")
            input.value = ""
          }
        }
      }
    }
  }
}