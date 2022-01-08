package com.nikitatomilov.ktfxtemplate.controller

import mu.KLogging
import tornadofx.Controller

class TornadoFXController: Controller() {
  fun writeToDb(inputValue: String) {
    logger.warn { "Writing $inputValue to database!" }
  }

  companion object : KLogging()
}