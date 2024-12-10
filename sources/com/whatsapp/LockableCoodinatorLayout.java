package com.whatsapp;

import X.AnonymousClass44S;
import X.C18070vi;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;

public final class LockableCoodinatorLayout extends AnonymousClass44S {
    public boolean A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockableCoodinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A0I();
    }

    public void invalidate() {
        if (!this.A01) {
            super.invalidate();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.A01) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void requestLayout() {
        if (!this.A01) {
            super.requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockableCoodinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
        A0I();
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        if (!this.A01) {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public LockableCoodinatorLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0I();
    }

    public void invalidate(Rect rect) {
        C18070vi.A0d(rect, 0);
        if (!this.A01) {
            super.invalidate(rect);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LockableCoodinatorLayout(Context context) {
        super(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
        A0I();
        A0I();
    }
}
