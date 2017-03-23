package arksoft.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstApp extends AppCompatActivity {
    Button button ;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_uygulama);
        Log.d("FirstApp","Ben FirstAppın içindeyim");



       button =(Button) findViewById(R.id.login);
       editText = (EditText) findViewById(R.id.edit);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //Butona tıklandığında EditText'te yazdığımız metin Toast mesajında gözükecek.

              Toast.makeText(getApplicationContext(),editText.getText(), Toast.LENGTH_SHORT).show();

          }
      });

    }
}
