package com.whatsapp.collections.observablelistview;

import X.AnonymousClass1DC;
import X.AnonymousClass273;
import X.C23551Gs;
import X.C38571rV;
import X.C40051u5;
import X.C40061u6;
import X.C64782vK;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;

public class ObservableListView extends C38571rV {
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;
    public AbsListView.OnScrollListener A06;
    public C23551Gs A07;
    public C40051u5 A08;
    public C40061u6 A09;
    public AnonymousClass1DC A0A;
    public boolean A0B;
    public boolean A0C;
    public MotionEvent A0D;
    public boolean A0E;
    public boolean A0F = true;
    public final AbsListView.OnScrollListener A0G = new C64782vK(this, 5);

    private void A00() {
        this.A05 = new SparseIntArray();
        this.A08 = new C40051u5();
        this.A09 = new C40061u6();
        super.setOnScrollListener(this.A0G);
    }

    public void draw(Canvas canvas) {
        this.A09.A00();
        super.draw(canvas);
        this.A09.A01();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A0F) {
            this.A0E = false;
            this.A0B = false;
            return false;
        }
        if (this.A07 != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A0B = true;
                this.A0C = true;
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.A0B = false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A08.A01();
        super.onLayout(z, i, i2, i3, i4);
        this.A08.A00();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof AnonymousClass273) {
            AnonymousClass273 r2 = (AnonymousClass273) parcelable;
            this.A01 = r2.A01;
            this.A00 = r2.A00;
            this.A03 = r2.A03;
            this.A02 = r2.A02;
            this.A04 = r2.A04;
            this.A05 = r2.A05;
            parcelable = r2.getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r1 != 3) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0F
            r6 = 1
            r5 = 0
            if (r0 != 0) goto L_0x000b
            r8.A0E = r5
            r8.A0B = r5
            return r6
        L_0x000b:
            X.1Gs r0 = r8.A07
            if (r0 == 0) goto L_0x001b
            int r1 = r9.getActionMasked()
            if (r1 == r6) goto L_0x008a
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 3
            if (r1 == r0) goto L_0x008a
        L_0x001b:
            boolean r0 = super.onTouchEvent(r9)
            return r0
        L_0x0020:
            android.view.MotionEvent r0 = r8.A0D
            if (r0 != 0) goto L_0x0026
            r8.A0D = r9
        L_0x0026:
            float r1 = r9.getY()
            android.view.MotionEvent r0 = r8.A0D
            float r0 = r0.getY()
            float r1 = r1 - r0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r9)
            r8.A0D = r0
            int r0 = r8.A04
            float r0 = (float) r0
            float r0 = r0 - r1
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x001b
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x008f
            android.view.ViewParent r4 = r8.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3 = 0
            r0 = r8
        L_0x004c:
            if (r0 == r4) goto L_0x006d
            int r2 = r0.getLeft()
            int r1 = r0.getScrollX()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r7 = r7 + r1
            int r2 = r0.getTop()
            int r1 = r0.getScrollY()
            int r2 = r2 - r1
            float r1 = (float) r2
            float r3 = r3 + r1
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x006d
            goto L_0x004c
        L_0x006d:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtainNoHistory(r9)
            r2.offsetLocation(r7, r3)
            boolean r0 = r4.onInterceptTouchEvent(r2)
            if (r0 == 0) goto L_0x001b
            r8.A0E = r6
            r2.setAction(r5)
            r1 = 39
            X.7RL r0 = new X.7RL
            r0.<init>(r4, r2, r1)
            r8.post(r0)
            return r5
        L_0x008a:
            r8.A0E = r5
            r8.A0B = r5
            goto L_0x001b
        L_0x008f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.collections.observablelistview.ObservableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setScrollable(boolean z) {
        View childAt;
        if (this.A0F != z) {
            this.A0F = z;
            if (!z && (childAt = getChildAt(0)) != null) {
                setSelection(0 / childAt.getHeight());
            }
        }
    }

    public ObservableListView(Context context) {
        super(context);
        A01();
        A00();
    }

    public int getCurrentScrollY() {
        return this.A04;
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return super.onInterceptHoverEvent(motionEvent);
    }

    public Parcelable onSaveInstanceState() {
        return new AnonymousClass273(super.onSaveInstanceState(), this.A05, this.A01, this.A00, this.A03, this.A02, this.A04);
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.A06 = onScrollListener;
    }

    public void setScrollViewCallbacks(C23551Gs r1) {
        this.A07 = r1;
    }

    public ObservableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00();
    }

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
