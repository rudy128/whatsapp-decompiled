package com.whatsapp.filter;

import X.BLn;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    public void A1G(RecyclerView recyclerView, int i) {
        BLn bLn = new BLn(recyclerView.getContext(), this, 2);
        bLn.A00 = i;
        A0e(bLn);
    }
}
