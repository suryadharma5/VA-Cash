package ProejctAkhir.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Recycle_item extends RecyclerView.ViewHolder {

//    ImageView imageView;
    TextView gameName, itemName,price;
    ImageView imageView;

    public Recycle_item(@NonNull View itemView) {
        super(itemView);
        gameName = itemView.findViewById(R.id.game_name_profile);
        imageView = itemView.findViewById(R.id.game_picture);
        itemName = itemView.findViewById(R.id.game_items_profile);
        price = itemView.findViewById(R.id.price_profile);
    }
}