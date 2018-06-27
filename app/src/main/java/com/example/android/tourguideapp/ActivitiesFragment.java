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
public class ActivitiesFragment extends Fragment {

    public ActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of sights with information: an image, address, hours, and price
        final ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.string.monorail_address, R.string.monorail_price, R.string.monorail_hours, R.drawable.monorail));
        tour.add(new Tour(R.string.rtd_address, R.string.rtd_price, R.string.rtd_hours, R.drawable.rtd));
        tour.add(new Tour(R.string.ferry_address, R.string.ferry_price, R.string.ferry_hours, R.drawable.ferry));

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


