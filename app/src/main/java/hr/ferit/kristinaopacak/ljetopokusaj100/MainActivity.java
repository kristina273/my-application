package hr.ferit.kristinaopacak.ljetopokusaj100;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentDanasnjiTroskovi(), "Današnji troškovi");
        adapter.AddFragment(new FragmentUkupniTroskovi(), "Ukupni troškovi");
        adapter.AddFragment(new FragmentKategorijeTroskova(), "Kategorije troškova");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_danas_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_ukupni_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_kat_24dp);
    }
}
