package ProejctAkhir.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<Recycle_item> {

    Context context;
    List<Transaction> transactions;
    private final ProfileInterface profileInterface;
    NumberFormat numberFormat = NumberFormat.getNumberInstance();

    public RecycleAdapter(Context context, List<Transaction> transactions, ProfileInterface profileInterface) {
        this.context = context;
        this.transactions = transactions;
        this.profileInterface = profileInterface;
    }

    @NonNull
    @Override
    public Recycle_item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Recycle_item(LayoutInflater.from(context).inflate(R.layout.activity_recycle_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Recycle_item holder, int position) {
        holder.gameName.setText(transactions.get(position).getName());
        holder.imageView.setImageResource(R.drawable.game_image);
        holder.itemName.setText(transactions.get(position).getItem() + "-" +transactions.get(position).getQuantity() + " pcs");
        holder.price.setText("IDR " + numberFormat.format(Integer.parseInt(transactions.get(position).getPrice())));
    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView gameName;
        TextView itemName;
        TextView price;

        public ViewHolder(@NonNull View itemView, ProfileInterface profileInterface) {
            super(itemView);
            imageView = itemView.findViewById(R.id.game_picture);
            gameName = itemView.findViewById(R.id.game_name_profile);
            itemName = itemView.findViewById(R.id.game_items_profile);
            price = itemView.findViewById(R.id.price_profile);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(profileInterface != null){
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION){
                            profileInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
