package hr.ferit.kristinaopacak.ljetopokusaj100;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NameViewHolder extends ViewHolder implements View.OnClickListener {

    private TextView tvName;
    private NameClickListener clickListener;
    private Button btnRemove;

    public NameViewHolder(@NonNull View itemView, NameClickListener listener) {
        super(itemView);
        btnRemove = itemView.findViewById(R.id.btnRemove);
        this.clickListener = listener;
        tvName = itemView.findViewById(R.id.tvName);
        itemView.setOnClickListener(this);
        btnRemove.setOnClickListener(this);
    }

    public void setName(String name){
        tvName.setText(name);
    }

    @Override
    public void onClick(View view){
        clickListener.onNameClick(getAdapterPosition());
    }
}
