package com.whatsapp.perf;

import X.AnonymousClass4RA;
import X.AnonymousClass8Dr;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class MeasuringRelativeLayout extends AnonymousClass8Dr {
    public AnonymousClass4RA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasuringRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C18070vi.A0d(context, 1);
        A0A();
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C18070vi.A0d(view, 0);
        super.addView(view, layoutParams);
        getInflationTimeTracker().A00(view, this);
    }

    public final void setInflationTimeTracker(AnonymousClass4RA r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final AnonymousClass4RA getInflationTimeTracker() {
        AnonymousClass4RA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inflationTimeTracker");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasuringRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A0A();
    }

    public void addView(View view) {
        C18070vi.A0d(view, 0);
        super.addView(view);
        getInflationTimeTracker().A00(view, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasuringRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        C18070vi.A0d(context, 1);
        A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasuringRelativeLayout(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        C18070vi.A0d(context, 1);
        A0A();
    }
}
