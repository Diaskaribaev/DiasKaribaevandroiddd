package com.example.earthquakeapp;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class Informationadapter extends ArrayAdapter<Information> {

    public Informationadapter(Activity context, ArrayList<Information> informations ) {
        super(context,0,informations); }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listlayout, parent, false);
        }


        Information currentword = getItem(position);

        TextView TextView1 = (TextView) listItemView.findViewById(R.id.rate);
        TextView1.setText(currentword.getNumber());

        TextView TextView2 = (TextView) listItemView.findViewById(R.id.km);
        TextView2.setText(currentword.getKm());

        TextView TextView3 = (TextView) listItemView.findViewById(R.id.place);
        TextView3.setText(currentword.getPlace());

        TextView TextView4 = (TextView) listItemView.findViewById(R.id.date);
        TextView4.setText(currentword.getDate());

        TextView TextView5 = (TextView) listItemView.findViewById(R.id.time);
        TextView5.setText(currentword.getTime());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image111);
        imageView.setImageResource(currentword.getImageid());





        return listItemView;
    }




}
