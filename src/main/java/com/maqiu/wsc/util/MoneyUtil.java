package com.maqiu.wsc.util;

import java.math.BigDecimal;

public class MoneyUtil {

  /**
   *
   * @param price
   * @return
   */
  public static String formatMoney(double price){
    if (price < 1) {
      return "0.00";
    }
    if (price >=1 && price < 10){
      return "0.0" + (long) price;
    }
    if (price >= 10 && price < 100){
      return "0." + (long) price;
    }
    if (price >= 100) {
      long realPrice = (long) price;
      return (new BigDecimal(realPrice)).divide(new BigDecimal(100), 2, 6).toPlainString();
    }
    return "0.00";
  }

}
