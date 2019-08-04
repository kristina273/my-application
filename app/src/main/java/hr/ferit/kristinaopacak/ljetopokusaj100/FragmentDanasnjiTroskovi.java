package hr.ferit.kristinaopacak.ljetopokusaj100;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDanasnjiTroskovi extends Fragment{

    DataBaseHelper db;
    EditText et;
    Button bt;
    ListView lv;
    View v;


    ArrayList<String> listItem;


    Spinner sp;
    String record = "";
    String names[]={"Stanarina", "Pokloni", "Prijevoz", "Lijekovi", "Djeca", "Hobi", "Kozmetika", "Kupovina", "Odjeća", "Putovanja", "Restoran", "Zabava"};
    ArrayAdapter<String> adapter22;

    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;
    AdapterView adapterView;

    public FragmentDanasnjiTroskovi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_danasnji_troskovi, container, false);

        sp = (Spinner)v.findViewById(R.id.spinner);
        adapter22=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, names);
        sp.setAdapter(adapter22);
        lv = (ListView) v.findViewById(R.id.listView_lv);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        record="Stanarina";
                        break;
                    case 1:
                        record="Pokloni";
                        break;
                    case 2:
                        record="Prijevoz";
                        break;
                    case 3:
                        record="Lijekovi";
                        break;
                    case 4:
                        record="Djeca";
                        break;
                    case 5:
                        record="Hobi";
                        break;
                    case 6:
                        record="Kozmetika";
                        break;
                    case 7:
                        record="Kupovina";
                        break;
                    case 8:
                        record="Odjeća";
                        break;
                    case 9:
                        record="Putovanja";
                        break;
                    case 10:
                        record="Restoran";
                        break;
                    case 11:
                        record="Zabava";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

db= new DataBaseHelper(getActivity());
listItem= new ArrayList<>();


        et=(EditText) v.findViewById(R.id.etAdd);
        bt=(Button) v.findViewById(R.id.btn_novi_trosak);
        lv = (ListView) v.findViewById(R.id.listView_lv);


        arrayList= new ArrayList<String>();
        adapter=new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, arrayList);
        lv.setAdapter(adapter);
        onAddClicked();
        return v;
    }




    public void onAddClicked(){
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = et.getText().toString() + " kn     " + sp.getSelectedItem().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();

                if (!result.equals("")){
                    Toast.makeText(getActivity(), "Trošak unesen", Toast.LENGTH_SHORT).show();
                    et.setText("");
                } else {
                    Toast.makeText(getActivity(), "Trošak nije unesen", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
