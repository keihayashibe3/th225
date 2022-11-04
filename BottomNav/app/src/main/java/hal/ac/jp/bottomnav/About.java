//package hal.ac.jp.bottomnav;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//public class About extends AppCompatActivity {
//
//    BottomNavigationView bottomNavigationView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about);
//
//        bottomNavigationView = findViewById(R.id.bottom_navigator);
//        bottomNavigationView.setSelectedItemId(R.id.about);
//
//        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
//            @Override
//            public void onNavigationItemReselected(@NonNull MenuItem item) {
//
//                switch (item.getItemId())
//                {
//                    case R.id.dashboard:
//                        startActivity(new Intent(getApplicationContext(),Dashboard.class));
//                        overridePendingTransition(0,0);
//                        return;
//                    case R.id.home:
//                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
//                        overridePendingTransition(0,0);
//                        return;
//
//                    case R.id.about:
//                        return;
//                }
//
//                return;
//            }
//        });
//    }
//}