package com.example.inmobiliaria.ui.propiedades;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.inmobiliaria.ClienteFragment;
import com.example.inmobiliaria.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class PropiedadFragment extends Fragment implements ClienteFragment.OnFragmentInteractionListener {

    //private GalleryViewModel galleryViewModel;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //galleryViewModel =
        //        ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_propiedades, container, false);

        viewPager=root.findViewById(R.id.viewPager);
        appBarLayout = root.findViewById(R.id.appbar);
        tabLayout=new TabLayout(getContext());
        appBarLayout.addView(tabLayout);
        ViewPageAdapter vpa = new ViewPageAdapter(getChildFragmentManager());
        vpa.addFragment(new ClienteFragment(), "Cliente 1");
        vpa.addFragment(new ClienteFragment(), "Cliente 2");

        viewPager.setAdapter(vpa);
        tabLayout.setupWithViewPager(viewPager);

        /*final TextView textView = root.findViewById(R.id.text_gallery);
       galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
               textView.setText(s);
            }
        });*/
        return root;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public class ViewPageAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> titulosFragments = new ArrayList<>();

        public ViewPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titulosFragments.get(position);
        }

        public void addFragment(Fragment fragment, String titulo){
            fragmentList.add(fragment);
            titulosFragments.add(titulo);
        }
    }
}