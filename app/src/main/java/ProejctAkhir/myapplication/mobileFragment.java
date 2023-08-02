package ProejctAkhir.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;


public class mobileFragment extends Fragment {
    private GridView gridView;
    ArrayList<Game> allGames;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mobile, container, false);
        ArrayList<Game> mobileGames = new ArrayList<>();

        gridView = view.findViewById(R.id.grid_view);
        allGames = new GlobalData().createGame();

        for (Game game : allGames) {
            if ("mobile".equalsIgnoreCase(game.getGameType())) {
                mobileGames.add(game);
            }
        }

        GridViewAdapter gridViewAdapter = new GridViewAdapter(view.getContext(), mobileGames);
        gridView.setAdapter(gridViewAdapter);
//        gridView.setOnItemClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }
}