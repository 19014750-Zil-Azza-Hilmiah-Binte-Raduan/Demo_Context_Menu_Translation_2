package sg.edu.rp.c346.id19014750.democontextmenutranslation2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        //menu.add(0,0,0,"English")
        getMenuInflater().inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        //Handle action bar item clicks here
        int id = item.getItemId();

        if(id == R.id.EnglishSelection){
            tvTranslatedText.setText("Hello");
            return true;
        }
        else if(id == R.id.italianSelection){
            tvTranslatedText.setText("Ciao");
            return true;
        }
        else{
            tvTranslatedText.setText("Error translation");
        }

        return super.onContextItemSelected(item);
    }
}