package com.bloks.foa.components.bottomsheet;

import X.AnonymousClass000;
import X.BNC;
import X.C22646BHi;
import X.C26247Cvl;
import X.C28483E3n;
import X.E7I;
import android.view.View;
import java.util.Collections;
import java.util.List;

public abstract class ViewDragHelper$Callback {
    public void A00(View view) {
        C22646BHi bHi = ((BNC) this).A00;
        List<E7I> list = bHi.A0H;
        if (!list.isEmpty()) {
            for (E7I C0x : list) {
                C0x.C0x(view, bHi.getHeight());
            }
        }
    }

    public void A01(View view, float f) {
        BNC bnc = (BNC) this;
        if (view != null) {
            C22646BHi bHi = bnc.A00;
            int height = bHi.getHeight();
            C26247Cvl cvl = bHi.A05;
            cvl.A09.abortAnimation();
            cvl.A09.fling(0, 0, 0, (int) f, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            int finalY = cvl.A09.getFinalY();
            cvl.A09.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List list = bHi.A06;
            if (list == null) {
                list = Collections.emptyList();
            }
            C28483E3n A00 = C22646BHi.A00(view, bHi, list, top, height);
            if (A00 != null) {
                bHi.A04 = A00;
                int BXI = height - A00.BXI(view, height);
                try {
                    int i = bHi.A00;
                    if (cvl.A0A) {
                        cvl.A07.getXVelocity(cvl.A02);
                        C26247Cvl.A05(cvl, BXI, (int) cvl.A07.getYVelocity(cvl.A02), i);
                        bHi.postInvalidateOnAnimation();
                        return;
                    }
                    throw AnonymousClass000.A0n("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                } catch (NullPointerException unused) {
                }
            }
        }
    }
}
