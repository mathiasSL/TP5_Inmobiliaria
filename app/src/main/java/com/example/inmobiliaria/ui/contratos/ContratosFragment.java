package com.example.inmobiliaria.ui.contratos;

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

public class ContratosFragment extends Fragment {

    //private ShareViewModel shareViewModel;
    private ArrayList<String> contratos;
    private ListView lv;
    private ArrayAdapter<String> adaptador1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //shareViewModel =
        //        ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contrato, container, false);

        contratos=new ArrayList<String>();
        contratos.add("Fecha Inicio:"+"\r\n"+"2018-05-01"+"\r\n"+"Fecha Finalizacion:"+"\r\n"+"2020-05-01"+"\r\n"+"Precio:"+"\r\n"+"$10000");

        adaptador1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,contratos);
        lv=root.findViewById(R.id.listView2);
        lv.setAdapter(adaptador1);

        /*final TextView textView = root.findViewById(R.id.text_share);
        shareViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}