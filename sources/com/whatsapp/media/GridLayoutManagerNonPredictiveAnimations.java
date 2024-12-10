package com.whatsapp.media;

import X.C37931qQ;
import X.C38021qZ;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public final class GridLayoutManagerNonPredictiveAnimations extends GridLayoutManager {
    public boolean A1L() {
        return false;
    }

    public void A1D(C37931qQ r3, C38021qZ r4) {
        try {
            super.A1D(r3, r4);
        } catch (IndexOutOfBoundsException e) {
            Log.e("GridLayoutManagerNonPredictiveAnimations/onLayoutChildren/exception", e);
        }
    }
}
