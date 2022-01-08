package com.nikitatomilov.ktfxtemplate

import com.nikitatomilov.ktfxtemplate.view.FxmlView
import tornadofx.App

class Application : App(FxmlView::class) {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      launch(Application::class.java, *args)
    }
  }
}