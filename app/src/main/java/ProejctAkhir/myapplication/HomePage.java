package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class HomePage extends AppCompatActivity {

    int [] carouselImages = {R.drawable.bg_1, R.drawable.bg_valo, R.drawable.bg_ml};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        ViewPager imageSlider = findViewById(R.id.slider);

        CarouselAdapter carouselAdapter = new CarouselAdapter(this, carouselImages);
        imageSlider.setAdapter(carouselAdapter);


    }
}