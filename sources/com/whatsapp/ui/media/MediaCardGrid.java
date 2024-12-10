package com.whatsapp.ui.media;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass48V;
import X.C18070vi;
import X.C72453Mb;
import X.C72953Ok;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.GridView;
import java.util.ArrayList;

public final class MediaCardGrid extends AnonymousClass48V {
    public GridView A00;
    public C72953Ok A01;
    public ArrayList A02;
    public boolean A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public int getThumbnailPixelSize() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        AnonymousClass11C.A01(getContext()).getDefaultDisplay().getMetrics(displayMetrics);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165785) * 2;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165786) * 2;
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2) {
            i = i2;
        }
        return ((i - dimensionPixelSize) - dimensionPixelSize2) / 3;
    }

    public void A03() {
        super.A03();
        C72453Mb.A1D(this.A00);
    }

    public void A04() {
        super.A04();
        C72453Mb.A1C(this.A00);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        View A0G = AnonymousClass3MY.A0G((ViewStub) C18070vi.A05(this, 2131432373), 2131625952);
        C18070vi.A0z(A0G, "null cannot be cast to non-null type android.widget.GridView");
        this.A00 = (GridView) A0G;
    }

    public String getError() {
        return super.getError();
    }

    public void setError(String str) {
        super.setError(str);
        C72453Mb.A1D(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        A06(attributeSet);
        this.A00 = 2131231213;
        A01();
        this.A02 = AnonymousClass000.A13();
    }

    public /* synthetic */ MediaCardGrid(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaCardGrid(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
