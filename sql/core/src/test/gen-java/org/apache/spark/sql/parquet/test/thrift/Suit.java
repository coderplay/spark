/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.spark.sql.parquet.test.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Suit implements org.apache.thrift.TEnum {
  SPADES(0),
  HEARTS(1),
  DIAMONDS(2),
  CLUBS(3);

  private final int value;

  private Suit(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static Suit findByValue(int value) { 
    switch (value) {
      case 0:
        return SPADES;
      case 1:
        return HEARTS;
      case 2:
        return DIAMONDS;
      case 3:
        return CLUBS;
      default:
        return null;
    }
  }
}
