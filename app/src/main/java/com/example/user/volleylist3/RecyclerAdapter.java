package com.example.user.volleylist3;

import android.support.v7.widget.RecyclerView;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by User on 13/04/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    ArrayList<Scoreboard_Item> arrayList = new ArrayList<>();

    public RecyclerAdapter(ArrayList<Scoreboard_Item> arrayList){
        this.arrayList = arrayList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Username.setText(arrayList.get(position).getUsername());
        holder.Team1.setText(arrayList.get(position).getTeam1());
        holder.Team2.setText(arrayList.get(position).getTeam2());
        holder.Sport.setText(arrayList.get(position).getSport());
        holder.Status.setText(arrayList.get(position).getStatus());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView Username, Team1, Team2, Sport, Status;
        //ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);
           //imageView =(ImageView) itemView.findViewById(R.id.imageView);
            Username = (TextView)itemView.findViewById(R.id.Username);
            Team1 = (TextView)itemView.findViewById(R.id.Team1);
            Team2 = (TextView)itemView.findViewById(R.id.Team2);
            Sport = (TextView)itemView.findViewById(R.id.Sport);
            Status = (TextView)itemView.findViewById(R.id.Status);
        }
    }
}
