package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_weather);
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.main, firstFragment).commit();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart called");
        // Activity is becoming visible to the user
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume called");
        // Activity has become visible (it is now "resumed")
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause called");
        // Another activity is taking focus (this activity is about to be "paused")
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop called");
        // The activity is no longer visible (it is now "stopped")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // The activity is about to be destroyed
    }
}

