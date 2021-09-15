package com.mfundoza.keyboard.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.mfundoza.keyboard.DatePickerFragment;
import com.mfundoza.keyboard.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AdvancedUiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AdvancedUiFragment extends Fragment {

    public AdvancedUiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AdvancedUiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AdvancedUiFragment newInstance() {
        AdvancedUiFragment fragment = new AdvancedUiFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_advanced_ui, container, false);
    }
}