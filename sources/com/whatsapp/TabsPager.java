package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1XQ;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public final class TabsPager extends AnonymousClass1XQ implements AnonymousClass009 {
    public C18030ve A00;
    public AnonymousClass031 A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabsPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C18030ve) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A04.get();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        if (!C18020vd.A05(C18040vf.A02, getAbProps(), 4460) || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        if (!C18020vd.A05(C18040vf.A02, getAbProps(), 4460) || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r4 = (com.whatsapp.HomeActivity) X.AnonymousClass1L9.A01(getContext(), com.whatsapp.HomeActivity.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentItem(int r6) {
        /*
            r5 = this;
            int r0 = r5.getCurrentItem()
            if (r6 != r0) goto L_0x0042
            android.content.Context r1 = r5.getContext()
            java.lang.Class<com.whatsapp.HomeActivity> r0 = com.whatsapp.HomeActivity.class
            android.app.Activity r4 = X.AnonymousClass1L9.A01(r1, r0)
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.1jl r1 = r4.A4m(r6)
            if (r1 == 0) goto L_0x0042
            androidx.recyclerview.widget.RecyclerView r0 = r1.BY0()
            r3 = 0
            if (r0 == 0) goto L_0x0023
            r0.A0f(r3)
            return
        L_0x0023:
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            android.view.View r1 = r1.A0B
            if (r1 == 0) goto L_0x0042
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r2 = r1.findViewById(r0)
            android.widget.AbsListView r2 = (android.widget.AbsListView) r2
            if (r2 == 0) goto L_0x0042
            int r1 = r2.getFirstVisiblePosition()
            r0 = 8
            if (r1 >= r0) goto L_0x0046
            r2.smoothScrollToPosition(r3)
        L_0x003f:
            r4.A4p()
        L_0x0042:
            super.setCurrentItem(r6)
            return
        L_0x0046:
            r2.setSelection(r3)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TabsPager.setCurrentItem(int):void");
    }

    public TabsPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (C18030ve) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A04.get();
        }
    }
}
