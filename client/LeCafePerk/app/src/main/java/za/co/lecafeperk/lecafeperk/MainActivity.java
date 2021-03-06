package za.co.lecafeperk.lecafeperk;

import android.Manifest;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.dialOut).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                makePhoneCall("0793838557");
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchMenu(View view) {
        Intent intent = new Intent(MainActivity.this, MenuItems.class);
        startActivity(intent);
    }

    public void launchOrder(View view) {
        Intent intent = new Intent(MainActivity.this, Order_History.class);
        startActivity(intent);
    }

    public void launchProfile(View view) {
        Intent intent = new Intent(MainActivity.this, Profile.class);
        startActivity(intent);
    }

<<<<<<< HEAD
=======
    public void makePhoneCall(final String phoneNumber) {
      startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
>>>>>>> 5cfab182878854d21d8498e14b7b2b19d1711a4e
}
