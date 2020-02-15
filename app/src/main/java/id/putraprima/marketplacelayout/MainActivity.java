package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickUser(View view){
        Intent intent = new Intent(this,login_main.class);
        startActivity(intent);
        finish();
    }

    public void clickService(View view){
        Intent intent =  new Intent(this,profil.class);
        startActivity(intent);
        finish();
    }

}
