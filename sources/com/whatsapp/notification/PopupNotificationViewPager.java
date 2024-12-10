package com.whatsapp.notification;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1b8;
import X.AnonymousClass291;
import X.AnonymousClass3MW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class PopupNotificationViewPager extends ViewPager implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;

    public void onAttachedToWindow() {
        this.A02 = true;
        super.onAttachedToWindow();
    }

    public void setAdapter(AnonymousClass1b8 r2) {
        this.A02 = true;
        super.setAdapter(r2);
    }

    public void setCurrentItem(int i) {
        A0J(i, false);
    }

    public void A0J(int i, boolean z) {
        A0O(i, z, !z);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public PopupNotificationViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    private int getCurrentOffsetBlocks() {
        if (getAdapter().A0E() <= 0) {
            return 0;
        }
        AnonymousClass1b8 adapter = getAdapter();
        if (adapter instanceof AnonymousClass291) {
            return this.A02 / ((AnonymousClass291) adapter).A00.A0E();
        }
        return 0;
    }

    private int getDefaultOffsetBlocks() {
        if (getAdapter().A0E() <= 0 || !(getAdapter() instanceof AnonymousClass291)) {
            return 0;
        }
        return 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if ((Integer.MAX_VALUE - r6) > (r2 * r4)) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0O(int r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            X.1b8 r0 = r5.getAdapter()
            int r0 = r0.A0E()
            if (r0 <= 0) goto L_0x0039
            X.1b8 r1 = r5.getAdapter()
            boolean r0 = r1 instanceof X.AnonymousClass291
            if (r0 == 0) goto L_0x0039
            X.291 r1 = (X.AnonymousClass291) r1
            X.1b8 r0 = r1.A00
            int r4 = r0.A0E()
            if (r6 >= 0) goto L_0x0021
            r0 = -1
        L_0x001d:
            if (r6 >= 0) goto L_0x0025
            int r6 = r6 + r4
            goto L_0x001d
        L_0x0021:
            boolean r0 = X.C108975cc.A1C(r6, r4)
        L_0x0025:
            int r6 = r6 % r4
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L_0x003d
            int r3 = r3 - r6
            int r0 = r5.getDefaultOffsetBlocks()
            int r0 = r0 * r4
            if (r3 <= r0) goto L_0x0039
            int r2 = r5.getDefaultOffsetBlocks()
        L_0x0037:
            int r2 = r2 * r4
            int r6 = r6 + r2
        L_0x0039:
            super.A0J(r6, r7)
            return
        L_0x003d:
            int r2 = r5.getCurrentOffsetBlocks()
            int r2 = r2 + r0
            X.1b8 r0 = r5.getAdapter()
            int r1 = r0.A0E()
            X.1b8 r0 = r5.getAdapter()
            X.291 r0 = (X.AnonymousClass291) r0
            X.1b8 r0 = r0.A00
            int r0 = r0.A0E()
            int r1 = r1 / r0
            if (r2 < 0) goto L_0x005b
            if (r2 < r1) goto L_0x0060
        L_0x005b:
            int r2 = r5.getDefaultOffsetBlocks()
            r7 = 0
        L_0x0060:
            int r3 = r3 - r6
            int r0 = r2 * r4
            if (r3 <= r0) goto L_0x0039
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotificationViewPager.A0O(int, boolean, boolean):void");
    }

    public int getCurrentItem() {
        if (getAdapter().A0E() > 0) {
            AnonymousClass1b8 adapter = getAdapter();
            if (adapter instanceof AnonymousClass291) {
                return this.A02 % ((AnonymousClass291) adapter).A00.A0E();
            }
        }
        return this.A02;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AnonymousClass1b8 adapter = getAdapter();
        if (!(adapter instanceof AnonymousClass291) || ((AnonymousClass291) adapter).A00.A0E() > 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02 = false;
        Integer num = this.A01;
        if (num != null) {
            A0J(num.intValue(), true);
            this.A01 = null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass1b8 adapter = getAdapter();
        if (!(adapter instanceof AnonymousClass291) || ((AnonymousClass291) adapter).A00.A0E() > 1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public PopupNotificationViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A02 = true;
        this.A01 = null;
    }

    public PopupNotificationViewPager(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A02 = true;
        this.A01 = null;
    }
}
