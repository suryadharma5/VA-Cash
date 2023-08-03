package ProejctAkhir.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class GridViewAdapter extends ArrayAdapter<Game>  {
    private  ArrayList<Game> games;

    public GridViewAdapter(@NonNull Context context, ArrayList<Game> games) {
        super(context, 0, games);
        this.games = games;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        HolderView holderView;

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.gride_view_items, parent, false);
            holderView = new HolderView(convertView);
            convertView.setTag(holderView);
        }else{
            holderView = (HolderView) convertView.getTag();
        }

        Game game = getItem(position);
        holderView.image.setImageResource(game.getGame());
        holderView.tv.setText(game.getName());

        holderView.card_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ItemActivity.class);
                intent.putExtra("gameName", game.getName());
                intent.putExtra("gameType", game.getGameType());
                intent.putExtra("items", game.getItems());
                intent.putExtra("image", game.getGame());
                v.getContext().startActivity(intent);
            }
        });




        return convertView;
    }

    private static class HolderView{
        private final ImageView image;
        private final TextView tv;
        LinearLayout card_item;

        public HolderView(View view ){
            image = view.findViewById(R.id.game_image);
            tv = view.findViewById(R.id.game_name);
            card_item = view.findViewById(R.id.card_item);
        }
    }


}
