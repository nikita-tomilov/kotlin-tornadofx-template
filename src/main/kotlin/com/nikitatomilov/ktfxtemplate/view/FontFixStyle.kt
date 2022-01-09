package com.nikitatomilov.ktfxtemplate.view

import mu.KLogging
import tornadofx.*

class FontFixStyle : Stylesheet() {

  init {
    star {
      if (shallApplyFontFix()) {
        logger.warn { "Fixing JavaFX font issue on JDK11 on MacOS" }
        fontFamily = "Arial"
      }
    }
  }

  companion object : KLogging() {
    fun shallApplyFontFix(): Boolean {
      return System.getProperty("os.name").contains("mac", true)
    }
  }
}