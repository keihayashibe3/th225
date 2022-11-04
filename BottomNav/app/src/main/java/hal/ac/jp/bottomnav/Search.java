package hal.ac.jp.bottomnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Search extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        bottomNavigationView = findViewById(R.id.bottom_navigator);
        bottomNavigationView.setSelectedItemId(R.id.search);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
//                    case R.id.dashboard:
//                        startActivity(new Intent(getApplicationContext(),Dashboard.class));
//                        overridePendingTransition(0,0);
//                        return;

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return;

//                    case R.id.about:
//                        startActivity(new Intent(getApplicationContext(),About.class));
//                        overridePendingTransition(0,0);
//                        return;

                    case R.id.search:
                        return;

                    case R.id.bar:
                        startActivity(new Intent(getApplicationContext(),Bar.class));
                        overridePendingTransition(0,0);
                        return;

                    case R.id.favorite:
                        startActivity(new Intent(getApplicationContext(),Favorite.class));
                        overridePendingTransition(0,0);
                        return;
                }

                return;
            }
        });
    }
}