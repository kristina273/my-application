package hr.ferit.kristinaopacak.ljetopokusaj100;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private List<String> dataList = new ArrayList<>();
    private NameClickListener clickListener;

    public RecyclerAdapter(NameClickListener listener) {
        this.clickListener = listener;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cellView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_name, parent, false);
        return new NameViewHolder(cellView, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder nameViewHolder, int position) {
        nameViewHolder.setName(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void addData(List<String> data) {
        this.dataList.clear();
        this.dataList.addAll(data);
        notifyDataSetChanged();
    }

    public void insertNewItem(String name, int position) {
        if (dataList.size() >= position && position >= 0) {
            dataList.add(position, name);
            notifyItemInserted(position);
        }
    }

    public void removeItem(int position){
        if (position >=0 && position < dataList.size()){
            dataList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public int getPosition() {
        return dataList.size();
    }
}