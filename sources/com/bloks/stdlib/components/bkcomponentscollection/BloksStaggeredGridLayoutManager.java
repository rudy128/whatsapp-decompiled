package com.bloks.stdlib.components.bkcomponentscollection;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public final class BloksStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public boolean A00;

    public void A0i(RecyclerView recyclerView) {
        if (this.A00) {
            this.A00 = false;
        } else if (A06(recyclerView)) {
            recyclerView.requestLayout();
        }
    }

    private final boolean A06(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return true;
        }
        if (parent instanceof View) {
            return A06((View) parent);
        }
        return false;
    }
}
