package com.clairvoyant.app

import com.clairvoyant.restonomer.core.app.RestonomerContext

object MyTestApp extends App {

  private val restonomerContextDirectoryPath = "./restonomer_context"

  private val restonomerContext = RestonomerContext(
    restonomerContextDirectoryPath = restonomerContextDirectoryPath
  )

  restonomerContext.runAllCheckpoints()

}
