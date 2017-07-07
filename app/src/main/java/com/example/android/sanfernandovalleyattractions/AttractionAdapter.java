package com.example.android.sanfernandovalleyattractions;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter {

    private static final String TAG = AttractionAdapter.class.getSimpleName();

    public AttractionAdapter(@NonNull Context context, @NonNull ArrayList<Attraction> attractions) {
        super(context, 0, attractions);
        Log.d(TAG, " inside constructor -  attractions size " + attractions.size());
    }

    @NonNull @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = (Attraction) getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        assert currentAttraction != null;
        nameTextView.setText(currentAttraction.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentAttraction.getDescription());

        // Return the whole list item layout so that it can be shown in the ListView.
        return listItemView;
    }
}
