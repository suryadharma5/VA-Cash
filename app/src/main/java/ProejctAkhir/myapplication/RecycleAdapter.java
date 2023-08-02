package ProejctAkhir.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<Recycle_item> {

    Context context;
    List<Transaction> transactions;

    public RecycleAdapter(Context context, List<Transaction> transactions) {
        this.context = context;
        this.transactions = transactions;
    }

    @NonNull
    @Override
    public Recycle_item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Recycle_item(LayoutInflater.from(context).inflate(R.layout.activity_recycle_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Recycle_item holder, int position) {
        holder.gameName.setText(transactions.get(position).getName());
//        holder.imageView.setImageResource(R.drawable.game_image);
        holder.itemName.setText(transactions.get(position).getItem() + "-" +transactions.get(position).getQuantity() + " pcs");
        holder.price.setText("Rp " + transactions.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }
}
