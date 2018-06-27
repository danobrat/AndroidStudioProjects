package com.example.android.tourguideapp;

public class Tour {

    /**
     * String address ID for the activity/restaurant/park/sight
     */
    private int mAddressId;

    /**
     * String price ID for the activity/restaurant/park/sight
     */
    private int mPriceId;

    /**
     * String hours ID for the activity/restaurant/park/sight
     */
    private int mHoursId;

    /**
     * Image ID for the activity/restaurant/park/sight
     */
    private int mImageId;

    /**
     * Create a new object called Tour.
     */
    public Tour(int addressId, int priceId, int hoursId, int imageId) {
        mAddressId = addressId;
        mPriceId = priceId;
        mHoursId = hoursId;
        mImageId = imageId;
    }

    /**
     * Get the string address ID for the activity/restaurant/park/sight.
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Get the string price ID for the activity/restaurant/park/sight.
     */
    public int getPriceId() {
        return mPriceId;
    }

    /**
     * Get the String hours ID for the activity/restaurant/park/sight.
     */
    public int getHoursId() {
        return mHoursId;
    }

    /**
     * Get the image ID for the activity/restaurant/park/sight.
     */
    public int getmImageId() {
        return mImageId;
    }

}
