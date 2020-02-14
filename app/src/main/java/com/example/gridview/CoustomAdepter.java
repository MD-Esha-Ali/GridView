package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdepter extends BaseAdapter {
    Context context;
    int[] flags;
    String[] countryNames;
    private LayoutInflater layoutInflater;
    CustomAdepter(Context context,String[] countryNames,int[] flags){
        this.context =context;
        this.countryNames=countryNames;
        this.flags=flags;
    }
    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView =layoutInflater.inflate(R.layout.simple_view,parent,false);
        }

        ImageView imageView=(ImageView) convertView.findViewById(R.id.imageViewId);
        TextView textView=(TextView) convertView.findViewById(R.id.textViewId);

        imageView.setImageResource(flags[position]);
        textView.setText(countryNames[position]);
        return null;
    }
}
