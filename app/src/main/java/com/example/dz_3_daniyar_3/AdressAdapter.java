package com.example.dz_3_daniyar_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class AddressAdapter extends RecyclerView.Adapter<AddressAdapter.ViewHolderAddress> {
    private ArrayList<String> list;
    public AddressAdapter(ArrayList<String> cont) {
        this.list= cont;
    }
    @NonNull
    @Override
    public ViewHolderAddress onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderAddress(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adress, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAddress holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class ViewHolderAddress extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolderAddress(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.adress_1);
        }

        public void bind(String s) {
            textView.setText(s);
        }
    }
}
