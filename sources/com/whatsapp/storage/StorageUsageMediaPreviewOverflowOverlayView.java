package com.whatsapp.storage;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class StorageUsageMediaPreviewOverflowOverlayView extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public Drawable A02;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A02 = drawable;
        invalidate();
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        AnonymousClass3MX.A1A(context, this, AnonymousClass1YL.A00(context, 2130968808, 2131099885));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.A02.draw(canvas);
        }
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StorageUsageMediaPreviewOverflowOverlayView(Context context) {
        this(context, (AttributeSet) null);
    }
}
