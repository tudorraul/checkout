package checkout.demo

import checkout.demo.model.{Item, Orange, Apple}
import org.specs2.mutable.Specification

class CheckoutSystemSpec extends Specification{

  "Checkout system must" >> {
    "exist" >> {
      new CheckoutSystem() must haveClass[CheckoutSystem]
    }

    "compute the price of a list of items" >> {
      val items: List[Item with Product with Serializable] = List(Apple(), Apple(), Orange(), Apple())
      new CheckoutSystem().computePrice(items) mustEqual 205
    }
  }

}
