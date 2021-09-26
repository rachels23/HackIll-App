package com.example.hackillinoisstaffappproj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import org.w3c.dom.Text;

public class MentorsRVAdapter extends RecyclerView.Adapter<MentorsRVAdapter.Viewholder {

    private ArrayList<Mentor> mentors = new ArrayList<>();

    public MentorsRVAdapter() {
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

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
