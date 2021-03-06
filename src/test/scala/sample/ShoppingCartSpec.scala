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

    ShoppingCart.checkout(data) should be(0.0)
  }

  "Shopping cart" should "return total sum of all oranges in the basket" in {

    ShoppingCart.checkout(List(Orange, Orange, Orange, Orange)) should be(1.0)

  }

  "Shopping cart" should "return total sum of all oranges  and apples in the basket" in {

    ShoppingCart.checkout(List(Apple, Orange, Orange, Apple)) should be(1.7)

  }

  "Shopping cart" should "return total sum of all oranges, apples and a random fruit in the basket" in {

    ShoppingCart.checkout(List(Apple, Orange, Orange, Apple, "banana", "guava")) should be(1.7)

  }

  "A Shopping Cart introduces offer for apples as buy one get one free then checkout method" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Apple, Apple, Apple , Apple), includeOffer = true) should be(1.2)

  }

  "A Shopping Cart introduces offer for oranges as buy 3 for the price of 2 thn checkout method" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Orange, Orange, Orange, Orange,Orange), includeOffer = true) should be(0.5)

  }

  "A Shopping Cart introduces offer for oranges  and apples the checkout method" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Apple, Apple, Apple, Apple, Orange, Orange,Orange, Orange, Orange,Orange), includeOffer = true) should be(2.2)
  }

  "A Shopping Cart introduces offer for oranges  and apples the checkout method1" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Apple, Apple, Apple, Orange, Orange), includeOffer = true) should be(0.60)
  }




  "A Shopping Cart with an Apple" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Apple), includeOffer = true) should be(0.60)
  }

  "A Shopping Cart with 3 Apples" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Apple, Apple, Apple ), includeOffer = true) should be(1.2)
  }


  "A Shopping Cart with an Orange" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Orange ), includeOffer = true) should be(0.25)
  }

  "A Shopping Cart with 2 Oranges" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Orange, Orange ), includeOffer = true) should be(0.50)
  }


  "A Shopping Cart with 3 Oranges" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Orange, Orange, Orange ), includeOffer = true) should be(0.50)
  }


  "A Shopping Cart with 4 Oranges" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Orange, Orange, Orange, Orange ), includeOffer = true) should be(0.75)
  }


  "A Shopping Cart with 2 Apples and 3 Oranges" should "return total price including the offer" in {
    ShoppingCart.checkout(List(Apple, Apple, Orange, Orange, Orange ), includeOffer = true) should be(1.7)
  }



}
