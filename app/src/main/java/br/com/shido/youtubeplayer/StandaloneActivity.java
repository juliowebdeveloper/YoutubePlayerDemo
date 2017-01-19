package br.com.shido.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by Teste2 on 19/01/2017.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Button playVideo = (Button) findViewById(R.id.btPlayVideo);
        Button playList = (Button) findViewById(R.id.btnPlayList);

        //playVideo.setOnClickListener(this);
        //playList.setOnClickListener(this);

        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Chamando uma intent que irá fazer o play do video de acordo com as chaves do google api key e o id do video
                    Intent intent = YouTubeStandalonePlayer.createVideoIntent(StandaloneActivity.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID);
                    intent = YouTubeStandalonePlayer.createVideoIntent(StandaloneActivity.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID, 0, true, true);
                    startActivity(intent);

            }
        });

        playList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = YouTubeStandalonePlayer.createPlaylistIntent(StandaloneActivity.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST);
                    startActivity(intent);
            }
        });


    }

    @Override
    public void onClick(View view) {

    }


}
