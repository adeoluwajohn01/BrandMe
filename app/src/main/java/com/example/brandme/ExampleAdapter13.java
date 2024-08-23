package com.example.brandme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter13 extends RecyclerView.Adapter<ExampleAdapter13.ExampleViewHolder> {
    private ArrayList<ExampleItem13> nExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView13);
            mTextView1 = itemView.findViewById(R.id.textView37);
            mTextView2 = itemView.findViewById(R.id.textView38);
            mTextView3 = itemView.findViewById(R.id.textView39);
        }

    }

    public ExampleAdapter13(ArrayList<ExampleItem13> exampleList) {
        nExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item13,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem13 currentItem = nExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        holder.mTextView3.setText(currentItem.getText3());
    }

    @Override
    public int getItemCount() {
        return nExampleList.size();
    }

    public void filterList2(ArrayList<ExampleItem13> filteredList) {
        nExampleList = filteredList;
        notifyDataSetChanged();

    }
}