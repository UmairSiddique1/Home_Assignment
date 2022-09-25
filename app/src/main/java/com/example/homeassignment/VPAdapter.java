package com.example.homeassignment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VPAdapter extends FragmentStateAdapter {
    String[] title=new String[]{"My Board","Team Board","School Board"};

    public VPAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new MyBoard();
            case 1:
                return new TeamBoard();
            case 2:
                return new SchoolBoard();
        }

        return new MyBoard();
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}
