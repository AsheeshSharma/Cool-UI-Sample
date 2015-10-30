package animelabs.uisample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    ListView list;
    boolean b1=false,b2=false,b3=false,b4=false,b5=false,b6=false,b7=false;
    private Toolbar toolbar;
    String[] web = {
            "Apples",
            "Bananas",
            "Juice",
            "Bread",
            "Cheese",
            "Milk",
            "Yogurt"
    } ;
      Integer[] imageId = {
            R.drawable.dndg,
            R.drawable.dndg,
            R.drawable.dndg,
            R.drawable.dndg,
            R.drawable.dndg,
            R.drawable.dndg,
            R.drawable.dndg

    };
    ImageView iv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView)findViewById(R.id.imageView2);
        tv=(TextView)findViewById(R.id.textView2);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.lrw));
        setSupportActionBar(toolbar);
        FloatingActionButton floatingActionButton=(FloatingActionButton)findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
            }
        });
        final CustomAdap adapter = new
                CustomAdap(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    if(!b1)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img2));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Apples");
                        b1=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b1=false;
                    }


                }
                if (position == 1) {
                    if(!b2)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img1));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Bananas");
                        b2=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b2=false;
                    }

                }
                if (position == 2) {
                    if(!b3)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img6));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Juice");
                        b3=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b3=false;
                    }

                }
                if (position == 3) {
                    if(!b4)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img8));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Bread");
                        b4=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b4=false;
                    }

                }
                if (position == 4) {
                    if(!b5)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img4));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Cheese");
                        b5=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b5=false;
                    }

                }
                if (position == 5) {
                    if(!b6)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img5));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Milk");
                        b6=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b6=false;
                    }

                }
                if (position == 6) {
                    if(!b7)
                    {
                        view.setBackgroundResource(R.drawable.listcutom);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img7));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dng));
                        tv.setText("Yogurt");
                        b7=true;

                    }
                    else
                    {
                        view.setBackgroundResource(Color.TRANSPARENT);
                        iv.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.img3));
                        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
                        imageView.setBackgroundDrawable(getApplicationContext().getResources().getDrawable(R.drawable.dndg));
                        tv.setText("Food");
                        b7=false;
                    }


                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_sett) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
