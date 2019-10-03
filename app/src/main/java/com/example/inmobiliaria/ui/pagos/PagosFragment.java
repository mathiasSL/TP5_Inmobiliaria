package com.example.inmobiliaria.ui.pagos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.inmobiliaria.R;

import java.util.ArrayList;

public class PagosFragment extends Fragment {

    //private ToolsViewModel toolsViewModel;
    private ArrayList<String> pagos;
    private ListView lv;
    private ArrayAdapter<String> adaptador1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //toolsViewModel =
        //        ViewModelProviders.of(this).get(ToolsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pagos, container, false);

        pagos=new ArrayList<String>();
        pagos.add("NroPago:"+"\r\n"+"1"+"\r\n"+"Fecha:"+"\r\n"+"2019-09-01"+"\r\n"+"Importe:"+"\r\n"+"15000");
        pagos.add("\r\n");
        pagos.add("NroPago:"+"\r\n"+"2"+"\r\n"+"Fecha:"+"\r\n"+"2019-08-21"+"\r\n"+"Importe:"+"\r\n"+"5000");
        adaptador1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,pagos);
        lv=root.findViewById(R.id.listView1);
        lv.setAdapter(adaptador1);

        /*final TextView textView = root.findViewById(R.id.text_tools);
        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}