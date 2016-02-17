package checkout.demo

import checkout.demo.model.{Item, Orange, Apple}
import org.specs2.mutable.Specification

class CheckoutSystemSpec extends Specification{

  "Checkout system must" >> {
    "exist" >> {
      new CheckoutSystem() must haveClass[CheckoutSystem]
    }

    "compute the price of a list of items" >> {
      val items = List(Apple(), Apple(), Orange(), Apple())
      new CheckoutSystem().computePrice(items) mustEqual 205
    }
  }

  "Checkout system must compute the price of items on offer" >> {

    "Apples offers" >> {

      "one Apple for the price of one" >> {
        val items = List.fill(1)(Apple())
        new CheckoutSystem().computePriceWithOffer(items) mustEqual 60
      }

      "two Apples for the price of one" >> {
        val items = List.fill(2)(Apple())
        new CheckoutSystem().computePriceWithOffer(items) mustEqual 60
      }

      "three Apples for the price of two" >> {
        val items = List.fill(3)(Apple())
        new CheckoutSystem().computePriceWithOffer(items) mustEqual 120
      }
    }
  }

}
