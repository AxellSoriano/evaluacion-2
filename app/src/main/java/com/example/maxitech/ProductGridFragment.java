package com.example.maxitech;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ProductGridFragment extends Fragment {
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState
            ) {
        return inflater.inflate(R.layout.product_grid_fragment, container,false);
    }
}
