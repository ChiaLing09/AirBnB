package com.example.airbnb.entities;

/**
 * AirBnBProperty
 */
public class AirBnBProperty {
  boolean plus = true;
  boolean verified = true;
  String name;
  int price;
  String currency;
  int stars;
  int numRating;

  public AirBnBProperty(boolean plus, boolean verified, String name, int price, String currency, int stars,
      int numRating) {
    super();
    this.plus = plus;
    this.verified = verified;
    this.name = name;
    this.price = price;
    this.currency = currency;
    this.stars = stars;
    this.numRating = numRating;
  }

  public boolean isPlus() {
    return this.plus;
  }

  public boolean getPlus() {
    return this.plus;
  }

  public void setPlus(boolean plus) {
    this.plus = plus;
  }

  public boolean isVerified() {
    return this.verified;
  }

  public boolean getVerified() {
    return this.verified;
  }

  public void setVerified(boolean verified) {
    this.verified = verified;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public int getStars() {
    return this.stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public int getNumRating() {
    return this.numRating;
  }

  public void setNumRating(int numRating) {
    this.numRating = numRating;
  }
}