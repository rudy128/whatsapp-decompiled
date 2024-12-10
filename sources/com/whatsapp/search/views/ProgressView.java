package com.whatsapp.search.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.C62762rw;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.CircularProgressBar;

public class ProgressView extends FrameLayout implements AnonymousClass009 {
    public AnimatorSet A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final int A03;
    public final CircularProgressBar A04;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, 2131626827, this);
        this.A04 = (CircularProgressBar) AnonymousClass1HF.A06(this, 2131434181);
        this.A03 = C62762rw.A01(getContext(), 40.0f);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProgressView(Context context) {
        this(context, (AttributeSet) null);
    }
}
