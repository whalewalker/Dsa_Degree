package com.algo.spinner;

public enum RewardType {
        FREE_CASHOUT(50, 20),
        FREE_AIRTIME(25, 10),
        PURSE_CREDIT(10, 6),
        FREE_FUNDS_TRANSFER(5, 8),
        FREE_TRANSACTION(3, 2),
        FREE_DATA(2, 15),
        FIVE_FREE_TRANSACTION(2, 3),
        NEXT_25_TRANSACTION_FREE(2, 1);

    private int giftCount;
    private final double weight;

    RewardType(int giftCount, double weight) {
        this.giftCount = giftCount;
        this.weight = weight;
    }

    public int getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(int giftCount) {
        this.giftCount = giftCount;
    }

    public double getWeight() {
        return weight;
    }
}
