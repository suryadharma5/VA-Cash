package ProejctAkhir.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ProejctAkhir.myapplication.Item;
import ProejctAkhir.myapplication.R;

import java.util.ArrayList;
import java.util.Vector;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    ArrayList<Item> itemVector;
    private final ItemInterface itemInterface;

    public ItemAdapter(ArrayList<Item> itemVector, ItemInterface itemInterface) {
        this.itemInterface = itemInterface;
        this.itemVector = itemVector;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view, itemInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item item = itemVector.get(position);

        holder.image.setImageResource(item.getImage());
        holder.name.setText(item.getName());
        holder.shop.setText(item.getShop());
        holder.price.setText(String.valueOf(item.getPrice()));
    }

    @Override
    public int getItemCount() {
        return itemVector.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name;
        TextView shop;
        TextView price;

        public ViewHolder(@NonNull View itemView, ItemInterface itemInterface) {
            super(itemView);
            image = itemView.findViewById(R.id.itemImage);
            name = itemView.findViewById(R.id.itemName);
            shop = itemView.findViewById(R.id.itemShop);
            price = itemView.findViewById(R.id.itemPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(itemInterface != null){
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION){
                            itemInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}


