package com.whatsapp.perf;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass4RA;
import X.C18070vi;
import X.C27691Xc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MeasuringLinearLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass4RA A00;
    public AnonymousClass031 A01;
    public boolean A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MeasuringLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        C18070vi.A0d(context, 1);
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

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4RA getInflationTimeTracker() {
        AnonymousClass4RA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("inflationTimeTracker");
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MeasuringLinearLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        C18070vi.A0d(context, 1);
    }

    public void addView(View view) {
        C18070vi.A0d(view, 0);
        super.addView(view);
        getInflationTimeTracker().A00(view, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeasuringLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C27691Xc.A0Z((C27691Xc) ((AnonymousClass033) generatedComponent()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MeasuringLinearLayout(Context context) {
        this(context, (AttributeSet) null, 0, 0);
        C18070vi.A0d(context, 1);
    }
}
