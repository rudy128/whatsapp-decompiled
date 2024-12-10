package com.whatsapp.search;

import X.C111635k2;
import X.C18070vi;
import X.C37931qQ;
import X.C38021qZ;
import X.C38391rD;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.util.Log;

public final class SearchGridLayoutManager extends GridLayoutManager {
    public final C38391rD A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchGridLayoutManager(Context context, C38391rD r4) {
        super(context, 24);
        C18070vi.A0d(r4, 2);
        this.A00 = r4;
        this.A01 = new C111635k2(context, this, 8);
    }

    public void A1D(C37931qQ r2, C38021qZ r3) {
        C18070vi.A0h(r2, r3);
        try {
            super.A1D(r2, r3);
        } catch (IndexOutOfBoundsException e) {
            Log.e((Throwable) e);
        }
    }
}
