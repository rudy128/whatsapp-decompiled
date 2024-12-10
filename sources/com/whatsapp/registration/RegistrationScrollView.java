package com.whatsapp.registration;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C20301AFj;
import X.C28891bE;
import X.C90444e5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;

public class RegistrationScrollView extends ScrollView implements AnonymousClass009 {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public LinearLayout A01;
    public WaTextView A02;
    public AnonymousClass031 A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final ViewTreeObserver.OnScrollChangedListener A07;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A03;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setTopAndBottomScrollingElevation(LinearLayout linearLayout, WaTextView waTextView) {
        this.A01 = linearLayout;
        this.A02 = waTextView;
        this.A00 = new C90444e5(this, waTextView, linearLayout, 3);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = C28891bE.A00(getContext());
        this.A07 = new C20301AFj(this, 1);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = C28891bE.A00(getContext());
        this.A07 = new C20301AFj(this, 1);
    }

    public RegistrationScrollView(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = C28891bE.A00(getContext());
        this.A07 = new C20301AFj(this, 1);
    }
}
