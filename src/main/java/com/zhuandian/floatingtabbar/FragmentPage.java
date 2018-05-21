package com.zhuandian.floatingtabbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * desc :
 * author：xiedong
 * data：2018/5/18
 */

public class FragmentPage extends Fragment {

    public FragmentPage getInstance(int color) {
        FragmentPage fragmentPage = new FragmentPage();
        Bundle bundle = new Bundle();
        bundle.putInt("color", color);
        fragmentPage.setArguments(bundle);
        return fragmentPage;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.page_fragment, container, false);
        LinearLayout rootView = (LinearLayout) inflate.findViewById(R.id.root_view);
        int color = (int) getArguments().get("color");
        rootView.setBackgroundColor(color);
        return inflate;
    }


}
