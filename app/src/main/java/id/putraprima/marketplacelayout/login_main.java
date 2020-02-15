package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
    }

    public void clickArrow(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void clickRegister(View view){
        Intent intent = new Intent(this,register.class);
        startActivity(intent);
        finish();
    }

    public void clickLogin(View view){
        Intent intent = new Intent(this,profil.class);
        startActivity(intent);
        finish();
    }
}
