package com.example.hackillinoisstaffappproj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MentorsRVAdapter extends RecyclerView.Adapter<MentorsRVAdapter.Viewholder> {

    private ArrayList<Mentor> mentors = new ArrayList<>();

    public MentorsRVAdapter() {
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mentors_list_item, parent, false);
        Viewholder holder = new Viewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.txtName.setText(mentors.get(position).getFirstName());
    }

    @Override
    public int getItemCount() {
        return mentors.size();
    }

    public void setMentors(ArrayList<Mentor> mentors) {
        this.mentors = mentors;
        notifyDataSetChanged();
    }

    public class Viewholder extends RecyclerView.ViewHolder{

        private TextView txtName;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
