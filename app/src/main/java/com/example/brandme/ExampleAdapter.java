package com.example.brandme;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> nExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView mImageView;
        public TextView mTextView1;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);

            mImageView.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            final Intent intent;

            switch (getAdapterPosition()) {
                case 0:
                    intent = new Intent(view.getContext(), Car.class);
                    view.getContext().startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(view.getContext(), MotorCycle.class);
                    view.getContext().startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(view.getContext(), Bicycle.class);
                    view.getContext().startActivity(intent);
                    break;
                case 3:
                    intent = new Intent(view.getContext(), Phone.class);
                    view.getContext().startActivity(intent);
                    break;
                case 4:
                    intent = new Intent(view.getContext(), Computer.class);
                    view.getContext().startActivity(intent);
                    break;
                case 5:
                    intent = new Intent(view.getContext(), Game.class);
                    view.getContext().startActivity(intent);
                    break;
                case 6:
                    intent = new Intent(view.getContext(), Bag.class);
                    view.getContext().startActivity(intent);
                    break;
                case 7:
                    intent = new Intent(view.getContext(), Jewel.class);
                    view.getContext().startActivity(intent);
                    break;
                case 8:
                    intent = new Intent(view.getContext(), Perfume.class);
                    view.getContext().startActivity(intent);
                    break;
                case 9:
                    intent = new Intent(view.getContext(), Makeup.class);
                    view.getContext().startActivity(intent);
                    break;
                case 10:
                    intent = new Intent(view.getContext(), Cream.class);
                    view.getContext().startActivity(intent);
                    break;
                case 11:
                    intent = new Intent(view.getContext(), Waist.class);
                    view.getContext().startActivity(intent);
                    break;
                case 12:
                    intent = new Intent(view.getContext(), Shoe.class);
                    view.getContext().startActivity(intent);
                    break;
                case 13:
                    intent = new Intent(view.getContext(), Cloth.class);
                    view.getContext().startActivity(intent);
                    break;
                case 14:
                    intent = new Intent(view.getContext(), Wig.class);
                    view.getContext().startActivity(intent);
                    break;
                case 15:
                    intent = new Intent(view.getContext(), Whiskey.class);
                    view.getContext().startActivity(intent);
                    break;
                case 16:
                    intent = new Intent(view.getContext(), Wine.class);
                    view.getContext().startActivity(intent);
                    break;
            }
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        nExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,
                parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        ExampleItem currentItem = nExampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());

    }

    @Override
    public int getItemCount() {
        return nExampleList.size();
    }

    public void filterList2(ArrayList<ExampleItem> filteredList) {
        nExampleList = filteredList;
        notifyDataSetChanged();

    }
}