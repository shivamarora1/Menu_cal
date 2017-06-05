package info.smartlife360.menu_click;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText Ftext;
    private EditText Stext;
    public String first;
    public String Second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ftext=(EditText)findViewById(R.id.Ftext);
        Stext=(EditText)findViewById(R.id.Stext);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemThatSelected=item.getItemId();
        first=Ftext.getText().toString();
        Second=Stext.getText().toString();
        int fi=Integer.parseInt(first);
        int se=Integer.parseInt(Second);
        int re=0;
        if(itemThatSelected==R.id.add)
        {
            re=fi+se;
Context context= MainActivity.this;
            Toast.makeText(context,"Addition is "+re,Toast.LENGTH_SHORT).show();
return true;
        }

        if(itemThatSelected==R.id.sub)
        {
re=fi-se;
            Context context= MainActivity.this;
            Toast.makeText(context,"Substraction is "+re,Toast.LENGTH_SHORT).show();
            return true;
        }

        if(itemThatSelected==R.id.mul)
        {
re=fi*se;
            Context context= MainActivity.this;
            Toast.makeText(context,"Multiplication is "+re,Toast.LENGTH_SHORT).show();
            return true;
        }

        if(itemThatSelected==R.id.div)
        {
            re=fi/se;

            Context context= MainActivity.this;
            Toast.makeText(context,"Division is "+re,Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
