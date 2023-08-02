package ProejctAkhir.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class consoleFragment extends Fragment {
    private GridView gridView;
    ArrayList<Game> allGames;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_console, container, false);
        ArrayList<Game> consoleGames = new ArrayList<>();

        gridView = view.findViewById(R.id.grid_view);
        allGames = new GlobalData().createGame();

        for (Game game : allGames) {
            if ("console".equalsIgnoreCase(game.getGameType())) {
                consoleGames.add(game);
            }
        }

        GridViewAdapter gridViewAdapter = new GridViewAdapter(view.getContext(), consoleGames);
        gridView.setAdapter(gridViewAdapter);
//        gridView.setOnItemClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }
}