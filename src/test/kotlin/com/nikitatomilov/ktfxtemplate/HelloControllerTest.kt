package com.nikitatomilov.ktfxtemplate

import mu.KLogging
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloControllerTest {
  @Test
  fun `foo bar baz`() {
    //given
    val i = 1
    //when
    val j = 1
    //then
    assertThat(i).isEqualTo(j)
    logger.warn { "all ok" }
  }

  companion object : KLogging()
}