package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;

/* renamed from: X.6z6  reason: invalid class name */
public abstract class AnonymousClass6z6 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final LinearLayoutManager A03;
    public final C25272CcK A04;
    public final RecyclerView A05;
    public final ShapePickerRecyclerView A06;
    public final C112315lH A07;
    public final C39711tW A08;
    public final C126126cE A09;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A07.A02.size() <= 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass6z6 r4) {
        /*
            androidx.recyclerview.widget.RecyclerView r3 = r4.A05
            int r2 = r3.getVisibility()
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0015
            X.5lH r0 = r4.A07
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 0
            if (r1 > 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            if (r2 == r0) goto L_0x0033
            X.6cE r1 = r4.A09
            int r0 = r3.getVisibility()
            boolean r2 = X.AnonymousClass000.A1P(r0)
            X.72m r0 = r1.A00
            com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView r1 = r0.A0P
            X.1vp r0 = r0.A0X
            boolean r0 = X.C72463Mc.A1O(r0)
            r1.A14(r0, r2)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6z6.A00(X.6z6):void");
    }

    public void A01(C113105mY r5, boolean z) {
        View view = r5.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources A0Y = AnonymousClass000.A0Y(this.A05);
        int i = 2131168712;
        if (z) {
            i = 2131168711;
        }
        C108955ca.A1I(view, A0Y.getDimensionPixelSize(i), layoutParams);
    }

    public void A02(boolean z) {
        RecyclerView recyclerView = this.A05;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Resources A0Y = AnonymousClass000.A0Y(recyclerView);
        int i = 2131168710;
        if (z) {
            i = 2131168709;
        }
        layoutParams.height = A0Y.getDimensionPixelSize(i);
        recyclerView.setLayoutParams(layoutParams);
        for (int i2 = 0; i2 < this.A07.A02.size(); i2++) {
            C113105mY r0 = (C113105mY) recyclerView.A0O(i2);
            if (r0 != null) {
                A01(r0, z);
            }
        }
        this.A00 = z;
    }

    public AnonymousClass6z6(RecyclerView recyclerView, C126126cE r7, ShapePickerRecyclerView shapePickerRecyclerView, boolean z) {
        C112735lx r1 = new C112735lx(this, 6);
        this.A08 = r1;
        C112315lH r4 = new C112315lH(this);
        this.A07 = r4;
        r4.A0K(z);
        recyclerView.setItemAnimator((C37961qT) null);
        this.A06 = shapePickerRecyclerView;
        this.A09 = r7;
        shapePickerRecyclerView.A0t(r1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        this.A03 = linearLayoutManager;
        this.A04 = new C111685kG(recyclerView.getContext(), this, 2);
        this.A05 = recyclerView;
        recyclerView.setAdapter(r4);
        recyclerView.setLayoutManager(linearLayoutManager);
        C1420978d.A00(recyclerView, this, 11);
    }
}
