package com.whatsapp.migration.transfer.ui;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.QrImageView;

public final class ExpandingQrCodeView extends QrImageView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandingQrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
    }

    public void onMeasure(int i, int i2) {
        int min = Math.min((int) (320.0f * AnonymousClass3Ma.A09(this).density), Math.min(View.MeasureSpec.getSize(i) - ((int) (80.0f * AnonymousClass3Ma.A09(this).density)), View.MeasureSpec.getSize(i2)));
        setMeasuredDimension(min, min);
        float f = (float) min;
        this.A06.set(0.0f, 0.0f, f, f);
    }

    public /* synthetic */ ExpandingQrCodeView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandingQrCodeView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
