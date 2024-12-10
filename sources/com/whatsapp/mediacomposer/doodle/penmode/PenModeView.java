package com.whatsapp.mediacomposer.doodle.penmode;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MZ;
import X.AnonymousClass7JA;
import X.AnonymousClass85H;
import X.AnonymousClass85I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

public class PenModeView extends FrameLayout {
    public AnonymousClass85I A00;
    public final List A01 = AnonymousClass000.A13();

    public PenModeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        View.inflate(getContext(), 2131626447, this);
        A01(new AnonymousClass7JA(0), 2131433743);
        A01(new AnonymousClass7JA(1), 2131433741);
        A01(new AnonymousClass7JA(2), 2131433742);
        A01(new AnonymousClass7JA(3), 2131433739);
    }

    private void A01(AnonymousClass85H r3, int i) {
        View A06 = AnonymousClass1HF.A06(this, i);
        this.A01.add(A06);
        AnonymousClass3MZ.A1O(A06, this, r3, 9);
    }

    public void setOnSelectedListener(AnonymousClass85I r1) {
        this.A00 = r1;
    }

    public PenModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PenModeView(Context context) {
        super(context);
        A00();
    }
}
