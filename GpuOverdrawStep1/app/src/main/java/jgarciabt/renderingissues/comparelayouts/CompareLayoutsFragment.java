package jgarciabt.renderingissues.comparelayouts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import jgarciabt.renderingissues.R;
import jgarciabt.renderingissues.nonoverdraw.NonOverdrawAdapter;
import jgarciabt.renderingissues.overdraw.ColorItem;

public class CompareLayoutsFragment extends Fragment {

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_compare_layouts, container, false);

        return rootView;
    }

}
