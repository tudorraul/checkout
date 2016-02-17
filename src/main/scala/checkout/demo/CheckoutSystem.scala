package checkout.demo

import checkout.demo.model.{Apple, Item, Orange}

class CheckoutSystem() {

  def computePrice(items: List[Item]): Int = items.map(_.priceInPence).sum

  def computePriceWithOffer(items: List[Item]): Int =
    items.groupBy(i => i).map {
      case (itemType: Apple, apples) =>
        itemType.priceInPence * ((apples.size + 1) / 2)

      case (itemType: Orange, oranges) => ???
    }.sum

}
