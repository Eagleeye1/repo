package com.thenewboston;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{

	MediaPlayer ourSong;
	@Override
	protected void onCreate(Bundle TravisLoveBacon) {
		// TODO Auto-generated method stub
		super.onCreate(TravisLoveBacon);
		setContentView(R.layout.nature);
		ourSong= MediaPlayer.create(Splash.this,R.raw.theme);
		ourSong.start();
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
					System.out.println("Welcome Kalidass");
				}catch (Exception e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.thenewboston.MENU");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}

}
