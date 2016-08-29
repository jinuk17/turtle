package io.jayden.turtle.common

/**
  * Created by jaydenuk on 2016. 8. 19..
  */
trait Logger {
  def log(log: String)
}

class ConsoleLogger extends Logger {
  override def log(log: String): Unit = println(log)
}
