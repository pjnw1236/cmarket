package com.example.cmarket.Order;

public class Order {

    private Long userId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long userId, String itemName, int itemPrice, int discountPrice) {
        this.userId = userId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int discountedPrices() { return itemPrice - discountPrice; }

    // userId
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    // itemName
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    // itemPrice
    public int getItemPrice() { return itemPrice; }
    public void setItemPrice(int itemPrice) { this.itemPrice = itemPrice; }

    // dicountPrice
    public int getDiscountPrice() { return discountPrice; }
    public void setDiscountPrice(int discountPrice) { this.discountPrice = discountPrice; }

    @Override
    public String toString() {
        return "Order{" +
                "userId = " + userId +
                ", itemName = " + itemName +
                ", itemPrice = " + itemPrice +
                ", discountPrice = " + discountPrice +
                "}";
    }
}
