package com.goodman.moneytracker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Record> mData = new ArrayList<>();
    private ItemListAdapter mAdapter ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        mRecyclerView = findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        setData();
        mAdapter = new ItemListAdapter();
        mRecyclerView.setAdapter(mAdapter);


    }

    private void setData() {
        mData.add(new Record("Milk", 35));
        mData.add(new Record("Bread", 135));
        mData.add(new Record("Internet", 335));
        mData.add(new Record("Lunch", 235));
        mData.add(new Record("Flat", 3500));
        mData.add(new Record("Board", 395));
        mData.add(new Record("Mobile", 42435));
        mData.add(new Record("Travel is a very important thing in our lives. Everybody wants to see other countries. It's very amuse", 4980));
        mData.add(new Record("Tablet", 37899));
        mData.add(new Record("Drinks", 305));
        mData.add(new Record("Chicken", 496));
        mData.add(new Record("Chair", 350));
        mData.add(new Record("Door", 35876));
    }

    private class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.RecordViewHolder>{

        @NonNull
        @Override
        public RecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            RecordViewHolder viewHolder = new RecordViewHolder(
                    LayoutInflater.from(parent.getContext()).
                            inflate(R.layout.item_record_list, parent, false));

            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull RecordViewHolder holder, int position) {
            Record record = mData.get(position);
            holder.applyData(record);
        }


        @Override
        public int getItemCount() {
            return mData.size();
        }

        private class RecordViewHolder extends RecyclerView.ViewHolder{
            private TextView tvTitle;
            private TextView tvPrice;

            public RecordViewHolder(@NonNull View itemView) {
                super(itemView);
                tvTitle = itemView.findViewById(R.id.title);
                tvPrice = itemView.findViewById(R.id.price);
            }

            public void applyData(Record record) {
                if (record != null) {
                    tvTitle.setText(record.getmTitle());
<<<<<<< HEAD
                    tvPrice.setText(String.format("%1s ₴", String.valueOf(record.getmPrice())));
=======
                    tvPrice.setText(String.valueOf(record.getmPrice()));
>>>>>>> Home_work_2
                }
            }
        }

    }



}
