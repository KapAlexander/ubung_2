package com.example.ubung_2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CustomViewHolder> {

    private ItemData[]itemData;
     public MyAdapter(ItemData[]itemData)
     {
         this.itemData = itemData;
     }


     public  CustomViewHolder onCreateViewHolder(ViewGroup parent,
                                                    int viewType)
     {
         /*View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view,null);
         RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(view);
         return viewHolder;*/
         return new CustomViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view,null));
     }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
            holder.checkBox.setText(itemData[position].getTitel());
            holder.imageView.setImageResource(itemData[position].getImage());
    }

    @Override
    public int getItemCount() {
        return itemData.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

         public CheckBox checkBox;
         public ImageView imageView;

        public CustomViewHolder(View itemView) {
            super(itemView);
            checkBox = itemView.findViewById(R.id.checkBox0);
            imageView = itemView.findViewById(R.id.item_icon);

            checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), String.format(Locale.GERMAN, "Position: %d is checked %s",
                            getLayoutPosition(), checkBox.isChecked()), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
