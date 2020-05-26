package com.goodman.moneytracker;

class Record {
    private final String mTitle;
    private final int mPrice;

    public Record(String title, int price) {
        mTitle = title;
        mPrice = price;
    }

    public String getmTitle() {
        return mTitle;
    }

    public int getmPrice() {
        return mPrice;
    }
}
