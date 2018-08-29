package com.maqiu.wsc.util;

public class MoneyUtil {

  public static String formatMoney(double price){
    return String.valueOf(price / 100) +
           "." + price % 100;
  }

}
