package ir.apio.androidtransition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Amir on 5/28/2016 AD
 * Project : Android Transition
 * GitHub  : @AmirHadifar
 * Twitter : @AmirHadifar
 */
public class DetailsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.slide_in_from_bottom, R.anim.fade_out);
        setContentView(R.layout.activity_details);


    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_in, R.anim.slide_out_back_to_bottom);
    }
}
