package com.whatsapp.gallery.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C111635k2;
import X.C1602587t;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C38391rD;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class MediaPickerRecyclerView extends RecyclerView implements AnonymousClass009, C1602587t {
    public int A00;
    public C18000vb A01;
    public C18030ve A02;
    public AnonymousClass031 A03;
    public boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, getAbProps(), 9196) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaPickerRecyclerView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            r4 = 1
            X.C18070vi.A0d(r8, r4)
            r7.<init>(r8, r9, r10)
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x0021
            r7.A04 = r4
            java.lang.Object r0 = r7.generatedComponent()
            X.10E r1 = X.AnonymousClass3MW.A0O(r0)
            X.0ve r0 = X.AnonymousClass10E.A8r(r1)
            r7.A02 = r0
            X.0vb r0 = X.AnonymousClass10E.A6Q(r1)
            r7.A01 = r0
        L_0x0021:
            int[] r0 = X.C124446Yj.A00
            X.C18070vi.A0Z(r0)
            r6 = 0
            android.content.res.TypedArray r5 = r8.obtainStyledAttributes(r9, r0, r10, r6)
            r0 = -1
            int r3 = r5.getDimensionPixelSize(r4, r0)
            if (r3 <= r0) goto L_0x005d
            X.0ve r2 = r7.getAbProps()
            r1 = 9196(0x23ec, float:1.2886E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x005d
        L_0x0040:
            r7.A00 = r3
            r0 = 2
            int r2 = r5.getDimensionPixelSize(r0, r6)
            r5.recycle()
            int r0 = r7.A00
            if (r0 <= 0) goto L_0x005a
            X.0vb r1 = r7.getWhatsAppLocale()
            X.28M r0 = new X.28M
            r0.<init>(r1, r2)
            r7.A0r(r0)
        L_0x005a:
            r7.A0R = r4
            return
        L_0x005d:
            int r0 = r7.A00
            int r3 = r5.getDimensionPixelSize(r6, r0)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.views.MediaPickerRecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int BQE(int i) {
        return i;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    private final int getAppropriateColumnCount() {
        int measuredWidth = getMeasuredWidth();
        int i = this.A00;
        return Math.max(1, (measuredWidth + (i / 2)) / i);
    }

    public void onMeasure(int i, int i2) {
        GridLayoutManager gridLayoutManager;
        super.onMeasure(i, i2);
        if (this.A00 > 0 && (gridLayoutManager = (GridLayoutManager) getLayoutManager()) != null) {
            gridLayoutManager.A1g(getAppropriateColumnCount());
        }
    }

    public void setAdapter(C38391rD r5) {
        GridLayoutManager gridLayoutManager;
        super.setAdapter(r5);
        if (this.A00 > 0) {
            GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), getAppropriateColumnCount());
            gridLayoutManager2.A01 = new C111635k2(r5, gridLayoutManager2, 7);
            gridLayoutManager = gridLayoutManager2;
        } else {
            gridLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        }
        setLayoutManager(gridLayoutManager);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ MediaPickerRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaPickerRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
