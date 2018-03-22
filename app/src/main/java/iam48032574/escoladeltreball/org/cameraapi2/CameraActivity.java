package iam48032574.escoladeltreball.org.cameraapi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CameraActivity extends AppCompatActivity {

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
    }

    public boolean isOnVideo() {
        return onVideo;
    }

    public void setOnVideo(boolean onVideo) {
        this.onVideo = onVideo;
    }
}
