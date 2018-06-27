package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourGuideAdapter extends ArrayAdapter<Tour> {

    public TourGuideAdapter(Context context, ArrayList<Tour> tour) {
        super(context, 0, tour);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }
        // Get the Tour object located at this position in the list
        Tour currentTour = getItem(position);

        // Find the address text in the activity_list.xml layout with the ID address_text.
        TextView addressText = (TextView) listItemView.findViewById(R.id.address_text);
        // Get the address from the currentTour object and set this text on
        // the addressText TextView.
        addressText.setText(currentTour.getAddressId());

        // Find the price text in the activity_list.xml layout with the ID price_text.
        TextView priceText = (TextView) listItemView.findViewById(R.id.price_text);
        // Get the price from the currentTour object and set this text on
        // the priceText TextView.
        priceText.setText(currentTour.getPriceId());

        // Find the hours text in the activity_list.xml layout with the ID hours_text.
        TextView hoursText = (TextView) listItemView.findViewById(R.id.hours_text);
        // Get the hours from the currentTour object and set this text on
        // the hoursText TextView.
        hoursText.setText(currentTour.getHoursId());

        // Find the ImageView in the activity_list.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the currentTour object and set this image on
        // the imageView.
        imageView.setImageResource(currentTour.getmImageId());

        // Return the whole activity list layout (containing 3 TextViews and an image) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
