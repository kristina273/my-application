package hr.ferit.kristinaopacak.ljetopokusaj100;

import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentUkupniTroskovi extends Fragment {

    View v;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.ukupni_troskovi_fragment, container, false);


        Bundle bundle = getArguments();
        if(bundle !=null) {
            String et = bundle.getString("Iznos");

            TextView firstText = (TextView) v.findViewById(R.id.iznos);

            firstText.setText(et);

        }
        return v;
    }


}