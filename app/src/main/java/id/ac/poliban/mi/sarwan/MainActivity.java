package id.ac.poliban.mi.sarwan;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buat toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        //pasang toolbar
        setSupportActionBar(toolbar);
        setSupportActionBar().setTitle("Sarwan Studio");
        toolbar.setSubtitle("https://github.com/sarwan123");
        toolbar.setLogo(android.R.drawable.ic_dialog_map);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mi_list_country:
                break;
            case R.id.mi_card_country;
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}