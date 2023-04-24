package com.example.music_player

import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import com.example.music_player.adapter.adapterMusic
import com.example.music_player.model.modelMusic

class MainActivity : AppCompatActivity() {
        //var listeMusic= arrayListOf<modelMusic>()
        lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //var mediaPlayer= MediaPlayer.create(this, R.raw.stand)
        manageListView()
        manageItemListClick()
        musicPlay()
        musicPause()
    }
    fun manageListView(){
        val playlist=findViewById<ListView>(R.id.lvPlaylist)
        val adapter=adapterMusic(this,generateMusics())
        playlist.adapter=adapter
        //return playlist
    }
    fun manageItemListClick() {
       // mediaPlayer= new
        val imgMusic=findViewById<ImageView>(R.id.imgMusic)
        val playlist=findViewById<ListView>(R.id.lvPlaylist)
        //var isPlaying=false
        var imgNext=findViewById<ImageView>(R.id.imgSkipright)


        //var mediaPlayer= MediaPlayer.create(this, R.raw.stand)

        playlist.setOnItemClickListener{_,_,position,_ ->
        if (position==0){
            mediaPlayer= MediaPlayer.create(this, R.raw.stand)
            imgMusic.setImageResource(R.drawable.ffxv)

        }
            if (position==1){
                mediaPlayer= MediaPlayer.create(this, R.raw.formality)
                imgMusic.setImageResource(R.drawable.infected)


            }
            if (position==2){
                mediaPlayer= MediaPlayer.create(this, R.raw.godskin)
                imgMusic.setImageResource(R.drawable.elden)


            }
            if (position==3){
                mediaPlayer= MediaPlayer.create(this, R.raw.boom)
                imgMusic.setImageResource(R.drawable.amaranthe)


            }
            if (position==4){
                mediaPlayer= MediaPlayer.create(this, R.raw.ashes)
                imgMusic.setImageResource(R.drawable.dragon)


            }
            if (position==5){
                mediaPlayer= MediaPlayer.create(this, R.raw.world)
                imgMusic.setImageResource(R.drawable.falling)


            }
            if (position==6){
                mediaPlayer= MediaPlayer.create(this, R.raw.spark)
                imgMusic.setImageResource(R.drawable.zeri)


            }
            if (position==7){
                mediaPlayer= MediaPlayer.create(this, R.raw.healing)
                imgMusic.setImageResource(R.drawable.korn)


            }
            if (position==8){
                mediaPlayer= MediaPlayer.create(this, R.raw.skeleton)
                imgMusic.setImageResource(R.drawable.epica)


            }
            if (position==9){
                mediaPlayer= MediaPlayer.create(this, R.raw.beautiful)
                imgMusic.setImageResource(R.drawable.nier)

            }


        }
        /*
        if (  position==0 && imgNext.isPressed){
            mediaPlayer= MediaPlayer.create(this, R.raw.formality)
            imgMusic.setImageResource(R.drawable.infected)
        }*/

    }



    fun generateMusics():ArrayList<modelMusic>{

        return arrayListOf(
            modelMusic(
                "Stand Your Ground",
                "Yoko Shimomura",
                3.29f,
                R.drawable.ffxv,
               // R.raw.stand,

            ),
            modelMusic(
                "Change The Formality",
                "Infected Mushroom",
                7.44f,
                R.drawable.infected,
               // R.raw.formality,
            ),
            modelMusic(
                "Godskin Apostles",
                "Tai Tomisawa",
                4.43f,
                R.drawable.elden,
                //R.raw.godskin,
            ),
            modelMusic(
                "BOOM!",
                "Amaranthe",
                4.21f,
                R.drawable.amaranthe,
               // R.raw.boom,
            ),
            modelMusic(
                "Ashes of the Dawn",
                "DragonForce",
                4.43f,
                R.drawable.dragon,
               // R.raw.ashes,
            ),
            modelMusic(
                "Watch The World Burn",
                "Falling In Reverse",
                3.27f,
                R.drawable.falling,
               // R.raw.world,
            ),
            modelMusic(
                "Zeri, the Spark of Zaun",
                "League of Legends, Lauren Babic",
                3.33f,
                R.drawable.zeri,
                //R.raw.spark,
            ),
            modelMusic(
                "Start The Healing",
                "Korn",
                3.50f,
                R.drawable.korn,
                //R.raw.healing,
            ),
            modelMusic(
                "The Skeleton Key",
                "Epica",
                5.33f,
                R.drawable.epica,
                //R.raw.skeleton,
            ),
            modelMusic(
                "A Beautiful Song",
                "Keigo Hoashi",
                4.06f,
                R.drawable.nier,
                //R.raw.beautiful,
            ),
        )
    }
    fun  musicPause(){
        val btnPlay=findViewById<ImageView>(R.id.imgPause)
        btnPlay.setOnClickListener(){
            mediaPlayer.pause()
        }
    }
    fun musicPlay(){
        val btnPlay=findViewById<ImageView>(R.id.imgPlay)
        //var mediaPlayer= MediaPlayer.create(this, R.raw.stand)

        btnPlay.setOnClickListener(){
            //mediaPlayer=MediaPlayer.create(this,R.raw.boom)
            mediaPlayer.start()
        }
    }
}
/*Stand Your Ground - Yoko Shimomura
               Change The Formality - Infected Mushroom
               A Beautiful Song - Keigo Hoashi
               Godskin Apostles - Tai Tomisawa
               BOOM! - Amaranthe
               Ashes of the Dawn - DragonForce
               Watch The World Burn - Falling In Reverse
               Zeri, the Spark of Zaun - League of Legends, Lauren Babic
               Start The Healing - Korn
               The Skeleton Key - Epica
           */