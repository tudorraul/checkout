package checkout.demo

package object model {

  sealed trait Item {
    val priceInPence: Int
  }

  case class Apple(priceInPence: Int = 60) extends Item

  case class Orange(priceInPence: Int = 25) extends Item

}
