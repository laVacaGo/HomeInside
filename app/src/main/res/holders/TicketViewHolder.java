package com.example.dabasra.examplerecicleview.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dabasra.examplerecicleview.ImageViewFromUrl;
import com.example.dabasra.examplerecicleview.R;

/**
 * Created by dabasra .
 */
public class TicketViewHolder extends RecyclerView.ViewHolder {

    private ImageView ticketView;
    private TextView dayTextView;
    private TextView nameTextView;

    public TicketViewHolder(View itemView) {
        super(itemView);
        this.ticketView = (ImageView) itemView.findViewById(R.id.cardTicketImage);
        this.dayTextView = (TextView) itemView.findViewById(R.id.cardTextViewDay);
        this.nameTextView = (TextView)itemView.findViewById(R.id.cardTicketName);
    }

    public void updateUI(Ticket ticket){
        //get from internet drawable
        ImageViewFromUrl imageViewFromUrl = new ImageViewFromUrl(ticketView,ticket.getUrl());
        imageViewFromUrl.execute();
        dayTextView.setText(ticket.getDay());
        nameTextView.setText(ticket.getTitle());

    }







}
