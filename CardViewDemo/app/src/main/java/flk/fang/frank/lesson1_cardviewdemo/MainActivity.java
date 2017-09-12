package flk.fang.frank.lesson1_cardviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Wonders[] = {"Chichen Itza","Christ the Redeemer","Great Wall of China","Machu Picchu","Petra","Taj Mahal","Colosseum"};
        int  Images[] = {R.drawable.chichen_itza,R.drawable.christ_the_redeemer,R.drawable.great_wall_of_china,R.drawable.machu_picchu,R.drawable.petra,R.drawable.taj_mahal,R.drawable.colosseum};


        View view = findViewById(R.id.CardView);
        ImageView imageView = (ImageView) view.findViewById(R.id.coverImageView);
        TextView textView = (TextView) view.findViewById(R.id.titleTextView);

        imageView.setImageResource(Images[1]);
        textView.setText(Wonders[1]);
    }
}
