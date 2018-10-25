package sample

import Constants._

object ShoppingCart {

  val fruitPrice = Map(Apple -> 0.60, Orange -> 0.25)

  private def getAppleCount(fruits: List[String], includeOffer: Boolean):BigDecimal = {
    val totalAppleCount = fruits.count(_ == Apple)
    if(includeOffer){
      totalAppleCount/2
    } else {
      totalAppleCount
    }
  }

  private def getOrangeCount(fruits: List[String], includeOffer: Boolean): BigDecimal = {
    val count = fruits.count(_ == Orange)
    if (includeOffer) {
      (count/3)* 2
    } else  {
      count
    }
  }

  def checkout(fruits: List[String], includeOffer:Boolean = false):BigDecimal = {

    val aTotalPrice = getAppleCount(fruits, includeOffer) * fruitPrice(Apple)
    val oTotalPrice = getOrangeCount(fruits, includeOffer) * fruitPrice(Orange)

    aTotalPrice + oTotalPrice

  }

}
