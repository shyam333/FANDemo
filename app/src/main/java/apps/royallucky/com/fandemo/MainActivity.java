package apps.royallucky.com.fandemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFbAds();


    }

    private void loadFbAds() {

        adView = new AdView(this,"2117118155171752_2117119698504931", AdSize.BANNER_HEIGHT_50);

        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        adContainer.addView(adView);

        adView.loadAd();
    }

//    @Override
//    protected void onDestroy() {
//
//        if(adView != null)
//        {
//            adView.destroy();
//        }
//        super.onDestroy();
//    }
}
