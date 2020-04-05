package jgarciabt.renderingissues.nonoverdraw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import jgarciabt.renderingissues.R;
import jgarciabt.renderingissues.overdraw.ColorItem;
import jgarciabt.renderingissues.overdraw.OverdrawAdapter;

public class NonOverdrawFragment extends Fragment {


    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_non_overdraw, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.item_list);

        ArrayList<ColorItem> colorItemArrayList = new ArrayList<>();
        populateColorItemsArrayList(colorItemArrayList);

        NonOverdrawAdapter nonOverdrawAdapter = new NonOverdrawAdapter(getActivity(), colorItemArrayList);
        listView.setAdapter(nonOverdrawAdapter);

        return rootView;
    }

    private void populateColorItemsArrayList(ArrayList<ColorItem> arrayList) {

        ColorItem red = new ColorItem("Red", "#ff0000", R.drawable.red);
        ColorItem orange = new ColorItem("orange", "#fbaf5d",R.drawable.orange);
        ColorItem yellow = new ColorItem("Yellow", "#fff000",R.drawable.yellow);
        ColorItem green = new ColorItem("Green", "#00ff00",R.drawable.green);
        ColorItem purple = new ColorItem("Purple", "#ff00ff",R.drawable.purple);
        ColorItem blue = new ColorItem("Blue", "#0000ff",R.drawable.blue);

        arrayList.add(red);
        arrayList.add(orange);
        arrayList.add(yellow);
        arrayList.add(green);
        arrayList.add(purple);
        arrayList.add(blue);
    }
}
