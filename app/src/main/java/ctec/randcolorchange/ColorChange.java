package ctec.randcolorchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;


public class ColorChange extends AppCompatActivity
{
    private Button colorChangeButton;
    private RelativeLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_change);

        colorChangeButton = (Button) findViewById(R.id.changeButton);
        background = (RelativeLayout) findViewById(R.id.currentBackground);

        setUpListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color_change, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeColors()
    {
        int redColor;
        int blueColor;
        int greenColor;

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor,blueColor,greenColor));

        redColor = (int) (Math.random() * 256);
        blueColor= (int) (Math.random() * 256);
        greenColor= (int) (Math.random() * 256);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor,blueColor,greenColor));
    }

    private void setUpListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonClick)
            {
                //Where you put code that happens when you click button.
                changeColors();
            }
        });
    }
}
