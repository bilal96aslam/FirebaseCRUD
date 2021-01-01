package com.example.firebasecrud.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.firebasecrud.R;
import com.example.firebasecrud.model.Artist;
import com.example.firebasecrud.model.Track;

import java.util.List;

public class TrackList extends ArrayAdapter<Track> {

    private Activity context;
    List<Track> tracks;

    public TrackList(Activity context, List<Track> tracks) {
        super(context, R.layout.track_list_layout, tracks);
        this.context = context;
        this.tracks = tracks;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.track_list_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewTrackName2);
        TextView textViewRating = (TextView) listViewItem.findViewById(R.id.textViewRating);

        Track track = tracks.get(position);
        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getRating()));

        return listViewItem;
    }
}
