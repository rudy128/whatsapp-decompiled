package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;

public final class EnhancedConstraintLayoutGroup extends Group implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EnhancedConstraintLayoutGroup(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }

    public void A08(ConstraintLayout constraintLayout) {
        C18070vi.A0d(constraintLayout, 0);
        super.A08(constraintLayout);
        int[] referencedIds = getReferencedIds();
        C18070vi.A0X(referencedIds);
        for (int findViewById : referencedIds) {
            constraintLayout.findViewById(findViewById).setAlpha(getAlpha());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        A05();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}
