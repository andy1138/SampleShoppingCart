package sample

import org.scalatest.{FlatSpec, Matchers}
import Constants._


class ShoppingCartSpec extends FlatSpec with Matchers {

  "ShoppingCart" should "return total price of apples in the basket" in {
    val data = List(Apple, Apple, Apple, Apple)
    
    ShoppingCart.checkout(data) should be(2.4)
  }

  "ShoppingCart" should "return total price as 0 when supplied empty basket" in {
    val data = List.empty

    ShoppingCart.checkout(data) should be(0)
  }

  "Shopping cart" should "return total sum of all oranges in the basket" in {

    ShoppingCart.checkout(List(Orange, Orange, Orange, Orange)) should be(1)

  }


}
