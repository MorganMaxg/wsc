package com.maqiu.wsc.util;

import org.apache.commons.lang3.StringUtils;

public class MoneyUtil {

  /**
   *
   * @param price
   * @return
   */
  public static String formatMoney(double price){
    String priceStr = StringUtils.split(String.valueOf(price), ".")[0];//去除整数
    return priceStr.substring(0, priceStr.length() -2) + "." + priceStr.substring(priceStr.length() -2);
  }

}
