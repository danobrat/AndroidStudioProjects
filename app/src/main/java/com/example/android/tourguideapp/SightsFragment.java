package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A fragment subclass.
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of sights with information: an image, address, hours, and price
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.string.space_needle_address, R.string.space_needle_price, R.string.space_needle_hours, R.drawable.space_needle));
        tour.add(new Tour(R.string.columbia_tower_address, R.string.columbia_tower_price, R.string.columbia_tower_hours, R.drawable.columbia_tower));
        tour.add(new Tour(R.string.fremont_troll_address, R.string.fremont_troll_price, R.string.fremont_troll_hours, R.drawable.troll));

        // An adapter, whose data source is a list of addresses, images, prices, and hours.
        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), tour);

        // There is a ListView with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // The ListView "list" uses the TourGuideAdapter so that the
        // ListView will display list items for each activity in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
