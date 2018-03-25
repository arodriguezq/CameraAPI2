package iam48032574.escoladeltreball.org.cameraapi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CameraActivity extends AppCompatActivity {

    private static String FRAGMENT_BOOL_KEY = "onVideoKey";
    private boolean onVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        setTitle("Aitor CameraAPI2");
        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, PhotoFragment.newInstance())
                    .commit();
        }
        if (savedInstanceState != null){
            onVideo = savedInstanceState.getBoolean(FRAGMENT_BOOL_KEY);
            if (savedInstanceState.getBoolean(FRAGMENT_BOOL_KEY)) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, VideoFragment.newInstance())
                        .commit();
            } else {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, PhotoFragment.newInstance())
                        .commit();
            }
        }
        Log.v("XVP", "OnCreate: "+onVideo);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        //mTextView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
        onVideo = savedInstanceState.getBoolean(FRAGMENT_BOOL_KEY);
        Log.v("XVP", "onRestore: "+onVideo);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(FRAGMENT_BOOL_KEY, onVideo);
        Log.v("XVP", "onSave: "+onVideo);

        super.onSaveInstanceState(outState);
    }


    public boolean isOnVideo() {
        return onVideo;
    }

    public void setOnVideo(boolean onVideo) {
        this.onVideo = onVideo;
    }
}
