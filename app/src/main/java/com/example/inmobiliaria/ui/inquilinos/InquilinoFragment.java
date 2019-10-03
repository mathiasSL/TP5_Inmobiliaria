package com.example.inmobiliaria.ui.inquilinos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.inmobiliaria.R;

import java.util.ArrayList;

public class InquilinoFragment extends Fragment {

   // private SlideshowViewModel slideshowViewModel;
    private ArrayList<String> inquilinos;
    private ListView lv;
    private ArrayAdapter<String> adaptador1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //slideshowViewModel =
         //       ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_inquilino, container, false);


        inquilinos=new ArrayList<String>();
        inquilinos.add("Nombre:"+"\r\n"+"Marcos"+"\r\n"+"Apellido:"+"\r\n"+"Amieva"+"\r\n"+"Telefono:"+"\r\n"+"2665454556");
        inquilinos.add("\r\n");
        inquilinos.add("Nombre:"+"\r\n"+"Matias"+"\r\n"+"Apellido:"+"\r\n"+"Lucero"+"\r\n"+"Telefono:"+"\r\n"+"2665466578");
        adaptador1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,inquilinos);
        lv=root.findViewById(R.id.listView);
        lv.setAdapter(adaptador1);

        /*final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}