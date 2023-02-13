package com.techno_tackle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.ViewHolder> {
    Context context;
    List<Items> items;

    public LayoutAdapter(Context context, List<Items> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public LayoutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LayoutAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(items.get(position).image).into(holder.roundedImageView);
        holder.textView2.setText(items.get(position).getName());
        holder.textView3.setText(items.get(position).getDescription());
        holder.textView8.setText(items.get(position).getQuotes());
        holder.textView7.setText(items.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView roundedImageView;
        TextView textView2;
        ImageView imageView8;
        TextView textView3, textView7, textView8;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.roundedImageView);
            textView2 = itemView.findViewById(R.id.textView2);
            imageView8 = itemView.findViewById(R.id.imageView8);
            textView3 = itemView.findViewById(R.id.textView3);
            textView7 = itemView.findViewById(R.id.textView7);
            textView8 = itemView.findViewById(R.id.textView8);
        }
    }
}
