package jgarciabt.renderingissues.overdraw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import jgarciabt.renderingissues.R;

public class OverdrawFragment extends Fragment {


    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_overdraw, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.item_list);

        ArrayList<ColorItem> colorItemArrayList = new ArrayList<>();
        populateColorItemsArrayList(colorItemArrayList);

        OverdrawAdapter overdrawAdapter = new OverdrawAdapter(getActivity(), colorItemArrayList);
        listView.setAdapter(overdrawAdapter);

        return rootView;
    }

    private void populateColorItemsArrayList(ArrayList<ColorItem> arrayList) {

        ColorItem red = new ColorItem("Red", R.drawable.red);
        ColorItem orange = new ColorItem("Orange", R.drawable.orange);
        ColorItem yellow = new ColorItem("Yellow", R.drawable.yellow);
        ColorItem green = new ColorItem("Green", R.drawable.green);
        ColorItem purple = new ColorItem("Purple", R.drawable.purple);
        ColorItem blue = new ColorItem("Blue", R.drawable.blue);

        arrayList.add(red);
        arrayList.add(orange);
        arrayList.add(yellow);
        arrayList.add(green);
        arrayList.add(purple);
        arrayList.add(blue);
    }
}
