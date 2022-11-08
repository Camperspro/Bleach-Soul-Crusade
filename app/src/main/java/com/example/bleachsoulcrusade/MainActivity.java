package com.example.bleachsoulcrusade;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Main Menu - Contains Play which will open to page listing different game modes.
    // - FOS which acts as the games PVP and ranking mode
    // - Help, Account Notifications, Summoning, and deck customizing!

    Image seasonBackground = null;
    Image favoritecardLarge = null;
    Image userIcon = null;

    String userName = null;
    String userRank = null;
    String userTitle = "Let's Go!";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView pname = findViewById(R.id.userName);
        TextView prank = findViewById(R.id.userRank);
        TextView ptitle = findViewById(R.id.userTitle);
        Button play = findViewById(R.id.playButton);
        Button flowofsouls = findViewById(R.id.fosButton);
        ImageButton profileIcon = findViewById(R.id.usericonButton);
        ImageButton managedeck = findViewById(R.id.deckButton);
        ImageButton summon = findViewById(R.id.summonButton);
        ImageButton settings = findViewById(R.id.settingsButton);
        ImageButton notif = findViewById(R.id.updatesButton);

        //Update to User Settings
        pname.setText(userName);
        prank.setText(userRank);


        //Retrieve Online Update Logs


    }
}