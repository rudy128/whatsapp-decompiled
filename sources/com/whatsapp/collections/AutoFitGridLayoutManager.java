package com.whatsapp.collections;

import X.AnonymousClass01C;
import X.C1425279u;
import X.C37931qQ;
import X.C38021qZ;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AutoFitGridLayoutManager extends GridLayoutManager {
    public int A00;
    public int A01;
    public boolean A02 = true;

    public AutoFitGridLayoutManager(AnonymousClass01C r3, int i) {
        super(r3, 1);
        this.A00 = i;
        r3.BBQ(new C1425279u(this, 0));
    }

    public void A0i(RecyclerView recyclerView) {
        this.A02 = true;
    }

    public void A1D(C37931qQ r5, C38021qZ r6) {
        int i;
        int i2;
        if (this.A02 && (i = this.A00) > 0 && (i2 = this.A03) > 0 && r6 != null && !r6.A09) {
            this.A01 = (i2 - A0N()) - A0M();
            int A0O = (this.A00 - A0O()) - A0L();
            if (this.A01 == 1) {
                A0O = this.A01;
            }
            A1g(Math.max(1, A0O / i));
            this.A02 = false;
        }
        super.A1D(r5, r6);
    }
}
