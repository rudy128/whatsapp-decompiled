package com.facebook.rendercore;

import X.AnonymousClass0Ke;
import X.AnonymousClass0QP;
import X.AnonymousClass0YL;
import X.AnonymousClass0sV;
import X.AnonymousClass1Y1;
import X.C01930Bz;
import X.C02700Fa;
import X.C02740Fe;
import X.C05140Qp;
import X.C15890rN;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;

public class RootHostView extends C01930Bz implements AnonymousClass0sV {
    public static final int[] A01 = new int[2];
    public final AnonymousClass0YL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RootHostView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        this.A00 = new AnonymousClass0YL(this);
    }

    public void A0D(int i, int i2, int i3, int i4) {
        getRootHostDelegate().A01(i, i2, i3, i4);
        C02700Fa.A00(this);
    }

    public void BkX() {
        getRootHostDelegate().BkX();
    }

    public AnonymousClass0YL getRootHostDelegate() {
        return this.A00;
    }

    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        BkX();
    }

    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        BkX();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRootHostDelegate().A00().A0E();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getRootHostDelegate().A00().A0F();
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass0YL rootHostDelegate = getRootHostDelegate();
        long A002 = C02740Fe.A00(i, i2);
        int[] iArr = A01;
        if (rootHostDelegate.A04(iArr, A002)) {
            setMeasuredDimension(iArr[0], iArr[1]);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setRenderState(AnonymousClass0QP r2) {
        getRootHostDelegate().A02(r2);
    }

    public void setRenderTreeUpdateListener(C15890rN r4) {
        C05140Qp A002 = getRootHostDelegate().A00();
        AnonymousClass0Ke r1 = A002.A00;
        if (r1 == null) {
            r1 = new AnonymousClass0Ke(A002, A002.A06);
        }
        r1.A00 = r4;
        A002.A00 = r1;
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        BkX();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        BkX();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootHostView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RootHostView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
