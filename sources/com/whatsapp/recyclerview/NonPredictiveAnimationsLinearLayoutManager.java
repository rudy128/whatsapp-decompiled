package com.whatsapp.recyclerview;

import X.C108945cZ;
import X.C27621Wu;
import X.C30671eK;
import X.C37931qQ;
import X.C38021qZ;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.util.Log;

public final class NonPredictiveAnimationsLinearLayoutManager extends LinearLayoutManager {
    public boolean A1L() {
        return false;
    }

    public void A1D(C37931qQ r3, C38021qZ r4) {
        Object obj;
        try {
            super.A1D(r3, r4);
            obj = C27621Wu.A00;
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Throwable A00 = C30671eK.A00(obj);
        if (A00 != null) {
            Log.e("NonPredictiveAnimationsLinearLayoutManager/onLayoutChildren", A00);
        }
    }
}
