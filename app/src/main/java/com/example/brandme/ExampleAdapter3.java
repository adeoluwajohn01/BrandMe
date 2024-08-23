package com.example.brandme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter3 extends RecyclerView.Adapter<ExampleAdapter3.ExampleViewHolder> {
    private ArrayList<ExampleItem3> nExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public TextView mTextView4;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView3);
            mTextView1 = itemView.findViewById(R.id.textView7);
            mTextView2 = itemView.findViewById(R.id.textView8);
            mTextView3 = itemView.findViewById(R.id.textView9);
            mTextView4 = itemView.findViewById(R.id.textView10);
        }

    }

    public ExampleAdapter3(ArrayList<ExampleItem3> exampleList) {
        nExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item3,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem3 currentItem = nExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        holder.mTextView3.setText(currentItem.getText3());
        holder.mTextView4.setText(currentItem.getText4());
    }

    @Override
    public int getItemCount() {
        return nExampleList.size();
    }

    public void filterList2(ArrayList<ExampleItem3> filteredList) {
        nExampleList = filteredList;
        notifyDataSetChanged();

    }
}