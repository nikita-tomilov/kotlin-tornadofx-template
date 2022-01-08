package com.nikitatomilov.ktfxtemplate

import com.nikitatomilov.ktfxtemplate.view.FxmlView
import tornadofx.App

class LaunchableApp : App(FxmlView::class) {
  companion object {
    @JvmStatic
    fun start(args: Array<String>) {
      launch(LaunchableApp::class.java, *args)
    }
  }
}

//https://stackoverflow.com/questions/52653836/maven-shade-javafx-runtime-components-are-missing/52654791#52654791
class Application {
  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      LaunchableApp.start(args)
    }
  }
}