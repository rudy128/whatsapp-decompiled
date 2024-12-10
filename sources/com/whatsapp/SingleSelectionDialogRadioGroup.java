package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;

public final class SingleSelectionDialogRadioGroup extends RadioGroup implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleSelectionDialogRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        int A012 = AnonymousClass3MW.A01(getResources(), 2131168774);
        int A013 = AnonymousClass3MW.A01(getResources(), 2131168778);
        int A014 = AnonymousClass3MW.A01(getResources(), 2131168774);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        layoutParams.setMargins(A013, A012, A014, 0);
        setLayoutParams(layoutParams);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public SingleSelectionDialogRadioGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public /* synthetic */ SingleSelectionDialogRadioGroup(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SingleSelectionDialogRadioGroup(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
