package checkout.demo.model

import org.specs2.mutable.Specification

class ModelSpec extends Specification {

  "An apple must cost 60p" >> {
    Apple().priceInPence mustEqual 60
  }

  "An orange must cost 25p each" >> {
    Orange().priceInPence mustEqual 25
  }

  "Apples and Oranges are considered Items" >> {
    Orange() must haveInterface[Item]
    Apple() must haveInterface[Item]
  }

}
