package mo.masu.couchbasedemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.couchbase.lite.Database;
import com.couchbase.lite.Document;

import java.util.ArrayList;
import java.util.List;

import mo.masu.couchbasedemo.model.Business;

/**
 * Created by WilayahDua on 10/08/2016.
 */
public class BusinessAdapter extends RecyclerView.Adapter<BusinessAdapter.ViewHolder>{

    Context context;
    List<Business> dataSet;
    Database database;

    public BusinessAdapter(Context context, List<Business> dataSet, Database database) {
        this.context = context;
        this.dataSet = dataSet;
        this.database = database;
    }

    @Override
    public BusinessAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_business, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BusinessAdapter.ViewHolder holder, int position) {
        Business bs = dataSet.get(position);

        holder.kbliText.setText(bs.getName());
        holder.nameText.setText(bs.getKBLI());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameText;
        public TextView kbliText;

        public ViewHolder(View itemView) {
            super(itemView);
            kbliText = (TextView) itemView.findViewById(R.id.kbli);
            nameText = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
