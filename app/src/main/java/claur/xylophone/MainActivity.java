package claur.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // The Constants
    private final int MAX_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int PRIORITY = 0;
    private final int LOOP = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // Member variables used for the sounds
    private SoundPool mSoundPool;
    private int mASoundID;
    private int mBSoundID;
    private int mCSoundID;
    private int mDSoundID;
    private int mESoundID;
    private int mFSoundID;
    private int mGSoundID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This is the SoundPool
        mSoundPool = new SoundPool(MAX_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);


        // Assigning the sounds to their respective IDs
        mASoundID = mSoundPool.load(this, R.raw.note1_a, 1);
        mBSoundID = mSoundPool.load(this, R.raw.note2_b, 1);
        mCSoundID = mSoundPool.load(this, R.raw.note3_c, 1);
        mDSoundID = mSoundPool.load(this, R.raw.note4_d, 1);
        mESoundID = mSoundPool.load(this, R.raw.note5_e, 1);
        mFSoundID = mSoundPool.load(this, R.raw.note6_f, 1);
        mGSoundID = mSoundPool.load(this, R.raw.note7_g, 1);
    }



    // The play methods triggered by the buttons
    public void PlayA(View view) {
        Log.d("Xylo Phone", "The Red button has been clicked");
        mSoundPool.play(mASoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayB(View view) {
        mSoundPool.play(mBSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayC(View view) {
        mSoundPool.play(mCSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayD(View view) {
        mSoundPool.play(mDSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayE(View view) {
        mSoundPool.play(mESoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayF(View view) {
        mSoundPool.play(mFSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }

    public void PlayG(View view) {
        mSoundPool.play(mGSoundID, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, LOOP, NORMAL_PLAY_RATE);
    }
}
