package sample

import org.scalatest.{FlatSpec, Matchers}
import Constants._


class ShoppingCartSpec extends FlatSpec with Matchers {

  "ShoppingCart" should "return total price of apples in the troly" in {
    val data = List(Apple, Apple, Apple, Apple)
    
    ShoppingCart.checkout(data) should be(2.4)
  }


}
