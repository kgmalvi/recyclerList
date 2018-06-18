package example.com.listviewapplication.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import example.com.listviewapplication.Model.RecylerListModel;
import example.com.listviewapplication.R;

public class RecyclerViewCustomAdapter extends RecyclerView.Adapter<RecyclerViewCustomAdapter.MyViewHolder> {

    public Context context;
    public List<RecylerListModel> list;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView txtName, txtAge, txtDate;

        public MyViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            txtName = itemView.findViewById(R.id.txt_name);
            txtAge = itemView.findViewById(R.id.txt_age);
            txtDate = itemView.findViewById(R.id.txt_date);
        }
    }

    public RecyclerViewCustomAdapter(Context context, List<RecylerListModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recler_list_desing, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        RecylerListModel recylerListModel = list.get(position);
        holder.txtName.setText(recylerListModel.getName());
        holder.txtAge.setText(recylerListModel.getAge());
        holder.txtDate.setText(recylerListModel.getDate());
        //holder.img.setImageResource(recylerListModel.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
