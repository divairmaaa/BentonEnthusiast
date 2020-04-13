package com.example.bentonenthusiast;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class CustomListAdapter extends ArrayAdapter<RowItem> {
    Context context;

    public CustomListAdapter(Context context, int resourceId, List<RowItem> items){
        super(context,resourceId,items);
        this.context = context;
    }
    private class ViewHolder {
        ImageView imageView;
        TextView txtNama, txtHarga;
    }

    public View getView(int position, View concertView, ViewGroup parent){
        ViewHolder holder=null;
        RowItem rowItem=getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(concertView == null){
            concertView = mInflater.inflate(R.layout.item_row_product,null);
            holder = new ViewHolder();
            holder.txtNama=(TextView) concertView.findViewById(R.id.name);
            holder.txtHarga=(TextView) concertView.findViewById(R.id.price);
            holder.imageView=(ImageView) concertView.findViewById(R.id.photo);
            concertView.setTag(holder);

        }else
            holder = (ViewHolder) concertView.getTag();
            holder.txtNama.setText(rowItem.getNama());
            holder.txtHarga.setText(rowItem.getHarga());
            holder.imageView.setImageResource(rowItem.getImageid());

            return concertView;
    }
}
