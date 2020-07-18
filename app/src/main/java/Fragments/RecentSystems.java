package Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import net.finalattempt.sai.mobilewebreplicator.R;
import net.finalattempt.sai.mobilewebreplicator.R.layout;

import static Data.NotificationDetailsDatabase.pizzaMenu;

/**
 * Created by Sai sreenivas on 5/9/2017.
 */

public class RecentSystems extends Fragment {

    ArrayAdapter<String> itemsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, pizzaMenu);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, parent, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
