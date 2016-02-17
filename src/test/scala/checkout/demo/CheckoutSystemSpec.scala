package checkout.demo

import org.specs2.mutable.Specification

class CheckoutSystemSpec extends Specification{

  "Checkout system must" >> {
    "exist" >> {
      new CheckoutSystem() must haveClass[CheckoutSystem]
    }
  }

}
