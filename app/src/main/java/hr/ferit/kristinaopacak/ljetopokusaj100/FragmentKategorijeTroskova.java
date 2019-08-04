package hr.ferit.kristinaopacak.ljetopokusaj100;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentKategorijeTroskova extends Fragment {

    View v;


    private RecyclerAdapter adapter;
private RecyclerView myrecyclerview;
private List<Kategorija> lstKategorija;



    public FragmentKategorijeTroskova() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       v= inflater.inflate(R.layout.kategorije_troskova_fragment,container,false);

       myrecyclerview=(RecyclerView) v.findViewById(R.id.kategorije_recyclerview);

       RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstKategorija);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);


       return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstKategorija = new ArrayList<>();
        lstKategorija.add(new Kategorija("Stanarina", R.drawable.stanarina));
        lstKategorija.add(new Kategorija("Pokloni", R.drawable.pokloni));
        lstKategorija.add(new Kategorija("Prijevoz", R.drawable.prijevoz));
        lstKategorija.add(new Kategorija("Lijekovi", R.drawable.lijekovi));
        lstKategorija.add(new Kategorija("Djeca", R.drawable.djeca));
        lstKategorija.add(new Kategorija("Hobi", R.drawable.hobi));
        lstKategorija.add(new Kategorija("Kozmetika", R.drawable.kozmetika));
        lstKategorija.add(new Kategorija("Kupovina", R.drawable.kupovina));
        lstKategorija.add(new Kategorija("Odjeća", R.drawable.odjeca));
        lstKategorija.add(new Kategorija("Putovanja", R.drawable.putovanja));
        lstKategorija.add(new Kategorija("Restoran", R.drawable.restoran));
        lstKategorija.add(new Kategorija("Zabava", R.drawable.zabava));



    }





}
