package com.example.music_player.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.music_player.R
import com.example.music_player.model.modelMusic

class adapterMusic (var context: Context, var musique:ArrayList<modelMusic>): BaseAdapter()
{
    override fun getCount(): Int {
        return musique.size
    }

    override fun getItem(position: Int): modelMusic {
        return musique[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    //@SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater: LayoutInflater =context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView =inflater.inflate(R.layout.list_item,parent,false)

         val imgView=rowView.findViewById<ImageView>(R.id.imgMusic)
        val titleView=rowView.findViewById<TextView>(R.id.tvTitle)
        val artistView=rowView.findViewById<TextView>(R.id.tvArtist)
        val durationView=rowView.findViewById<TextView>(R.id.tvDuration)

        val music_pos=getItem(position)

        imgView.setImageResource(music_pos.image)
        //imgView.setImageResource(music_pos.image)
        titleView.text=music_pos.title
        artistView.text=music_pos.artiste
        durationView.text=music_pos.duration.toString()
        return rowView
    }

}