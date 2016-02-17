package checkout.demo

import checkout.demo.model.Item

class CheckoutSystem() {

  def computePrice(items: List[Item]): Int = items.map(_.priceInPence).sum

}
