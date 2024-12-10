package com.whatsapp.areffects.button;

import X.AnonymousClass00R;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C106515Wd;
import X.C18070vi;
import X.C18100vl;
import X.C90934es;
import X.C99144sL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class ArEffectsStrengthSlider extends RelativeLayout {
    public C106515Wd A00;
    public final C18100vl A01;
    public final C18100vl A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsStrengthSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    /* access modifiers changed from: private */
    public final VerticalSeekBar getSeekBar() {
        return (VerticalSeekBar) this.A01.getValue();
    }

    /* access modifiers changed from: private */
    public final TextView getStrengthValue() {
        return (TextView) this.A02.getValue();
    }

    public final int getSeekBarWidth() {
        if (getSeekBar().getMeasuredWidth() <= 0) {
            getSeekBar().measure(0, 0);
        }
        return getSeekBar().getMeasuredWidth();
    }

    public void setEnabled(boolean z) {
        getSeekBar().setEnabled(z);
    }

    public final void setListener(C106515Wd r1) {
        this.A00 = r1;
    }

    public final void setStrength(int i) {
        getSeekBar().setProgress(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsStrengthSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        Integer num = AnonymousClass00R.A0C;
        this.A01 = C99144sL.A00(num, this, 4);
        this.A02 = C99144sL.A00(num, this, 5);
        LayoutInflater.from(context).inflate(2131624209, this, true);
        setEnabled(false);
        getSeekBar().setMin(1);
        getSeekBar().setMax(100);
        getSeekBar().A00 = new C90934es(this);
    }

    public /* synthetic */ ArEffectsStrengthSlider(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsStrengthSlider(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
