package com.whatsapp.payments.ui.widget;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;

public class MultiExclusionChip extends Chip implements AnonymousClass009 {
    public CompoundButton.OnCheckedChangeListener A00;
    public AnonymousClass031 A01;
    public boolean A02;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public MultiExclusionChip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.A00;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00 = onCheckedChangeListener;
    }

    public MultiExclusionChip(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }
}
