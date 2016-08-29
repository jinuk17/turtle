package io.jayden.turtle.oo

import io.jayden.turtle.common.Logger

class Turtle(log: Logger) {

  var currentPosition: Position = Helper.initialPosition
  var currentAngle: Angle = Helper.initialAngle
  var currentColor: PenColor = Helper.initialColor
  var currentPenState: PenState = Helper.initialPenState


  def move(distance: Distance) = ???
  def turn(angle: Angle) = ???
  def penUp() = ???
  def penDown() = ???
  def setColor(color:PenColor) = ???

}

object Main extends App {

}

