package cj.com.designmaterial.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import cj.com.designmaterial.R;
import cj.com.designmaterial.enity.RVItem;


/**
 * Created by chenjun on 17-4-6.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {
    private ArrayList<RVItem>  datas;
    private LayoutInflater layoutInflater;
    public RVAdapter(ArrayList<RVItem> datas, Context context){
        this.datas = datas;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.rv_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RVItem item = datas.get(position);
        holder.cardView.setCardBackgroundColor(item.getColor());
        holder.tv.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

     class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView tv;
        public CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            tv = (TextView)itemView.findViewById(R.id.tv);
        }
    }
}

