package museum.siddesh.museumapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Siddesh on 5/3/2015.
 */
public class AppActivity extends Activity {

    private ImageButton b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        b1 = (ImageButton) findViewById(R.id.imageButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
