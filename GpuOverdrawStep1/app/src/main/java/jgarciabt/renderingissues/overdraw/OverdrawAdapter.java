package jgarciabt.renderingissues.overdraw;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import jgarciabt.renderingissues.R;

public class OverdrawAdapter extends ArrayAdapter<ColorItem> {

    public OverdrawAdapter(Context context, ArrayList<ColorItem> colorItemArrayList) {

        super(context, 0, colorItemArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ColorItem colorItem = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_overdraw, parent, false);
        }

        // Find the UI widgets for a color item.
        ImageView colorImageView = (ImageView) convertView.findViewById(R.id.color_sample_image);
        TextView colorName = (TextView) convertView.findViewById(R.id.color_name);
        //TextView colorHexCode = (TextView) convertView.findViewById(R.id.color_hex_code);

        colorName.setText(colorItem.getName());
        //colorHexCode.setText(colorItem.getHexCode());

        colorImageView.setImageResource(colorItem.getResourceId());

        return convertView;
    }
}
