package com.whatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public final class ShapeItemView extends AppCompatImageView implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public String A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public ShapeItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShapeItemView(Context context) {
        super(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
