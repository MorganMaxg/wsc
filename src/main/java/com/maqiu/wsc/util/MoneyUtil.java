package com.maqiu.wsc.util;

import org.apache.commons.lang3.StringUtils;

public class MoneyUtil {

  /**
   *
   * @param price
   * @return
   */
  public static String formatMoney(double price){
    String result = null;
    String priceStr = StringUtils.split(String.valueOf(price), ".")[0];//去除小数
    if (priceStr.length() > 2){
      result = priceStr.substring(0, priceStr.length() -2) + "." + priceStr.substring(priceStr.length() -2);
    } else {
      if (priceStr.length() == 2){
        result = "0." + priceStr;
      }
      if (priceStr.length() == 1){
        result = "0.0" + priceStr;
      }

    }
    return result;
  }

}
