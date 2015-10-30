package animelabs.uisample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Asheesh on 10/30/2015.
 */
public class CustomAdap extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;

    public CustomAdap(Activity context,
                         String[] web,Integer[] imageId) {
        super(context, R.layout.template, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.template, null, true);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView);
        final ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        txtTitle2.setText(web[position]);
        imageView.setImageResource(imageId[position]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.dng);
            }
        });
        return rowView;
    }
}