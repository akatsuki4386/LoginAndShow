package com.example.loginandshow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private  List<Contact> infoList;
    private  LayoutInflater mInflater;

    public MyAdapter(List<Contact> infoList, Context context) {
        this.infoList = infoList;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new MyViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Contact info = infoList.get(position);
        holder.nameView.setText(info.getName());
        holder.emailView.setText(info.getEmail());
        holder.cityView.setText(info.getAddress().getCity());
        holder.zipcodeView.setText(info.getAddress().getZipcode());
        holder.phoneView.setText(info.getPhone());
        holder.websiteView.setText(info.getWebsite());
        holder.companyView.setText(info.getCompany().getName());
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        final TextView nameView;
        final TextView emailView;
        final TextView cityView;
        final TextView zipcodeView;
        final TextView phoneView;
        final TextView websiteView;
        final TextView companyView;
        final MyAdapter mAdapter;
        public MyViewHolder(@NonNull View itemView, MyAdapter adapter) {
            super(itemView);
            this.nameView = itemView.findViewById(R.id.name);
            this.emailView = itemView.findViewById(R.id.email);
            this.cityView = itemView.findViewById(R.id.city);
            this.zipcodeView = itemView.findViewById(R.id.zipcode);
            this.phoneView = itemView.findViewById(R.id.phone);
            this.websiteView = itemView.findViewById(R.id.website);
            this.companyView = itemView.findViewById(R.id.company_name);
            mAdapter = adapter;
        }
    }
}
