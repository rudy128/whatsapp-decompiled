package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NA;
import X.AnonymousClass4IN;
import X.C18070vi;
import X.C75343h6;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class AvailabilityStateTextView extends C75343h6 {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    private final void A0F() {
        int A02;
        if (!this.A00 || !isSelected()) {
            boolean z = this.A00;
            Context context = getContext();
            Context context2 = getContext();
            int i = 2130968729;
            int i2 = 2131099809;
            if (z) {
                i = 2130968728;
                i2 = 2131099808;
            }
            A02 = AnonymousClass3MZ.A02(context2, context, i, i2);
        } else {
            A02 = -1;
        }
        setTextColor(A02);
    }

    public final void A0M(AnonymousClass3NA r3) {
        boolean z = this.A00;
        if (r3.A00 != z) {
            r3.A00 = z;
            AnonymousClass3NA.A02(r3);
            r3.invalidateSelf();
        }
        boolean A1T = AnonymousClass000.A1T(getResources().getConfiguration().uiMode & 48, 32);
        if (r3.A01 != A1T) {
            r3.A01 = A1T;
            AnonymousClass3NA.A02(r3);
            r3.invalidateSelf();
        }
        super.setBackground(r3);
    }

    public final void setAvailable(boolean z) {
        this.A00 = z;
        AnonymousClass3NA backgroundDrawable = getBackgroundDrawable();
        if (!(backgroundDrawable == null || backgroundDrawable.A00 == z)) {
            backgroundDrawable.A00 = z;
            AnonymousClass3NA.A02(backgroundDrawable);
            backgroundDrawable.invalidateSelf();
        }
        int i = 2131886210;
        if (this.A00) {
            i = 2131886209;
        }
        AnonymousClass1HF.A0o(this, AnonymousClass3MY.A0m(getResources(), i));
        A0F();
    }

    private final AnonymousClass3NA getBackgroundDrawable() {
        Drawable background = getBackground();
        if (background instanceof AnonymousClass3NA) {
            return (AnonymousClass3NA) background;
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean A1T;
        super.onConfigurationChanged(configuration);
        AnonymousClass3NA backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null && backgroundDrawable.A01 != (A1T = AnonymousClass000.A1T(getResources().getConfiguration().uiMode & 48, 32))) {
            backgroundDrawable.A01 = A1T;
            AnonymousClass3NA.A02(backgroundDrawable);
            backgroundDrawable.invalidateSelf();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        A0F();
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A0I();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IN.A01, i, 0);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            setAvailable(obtainStyledAttributes.getBoolean(0, this.A00));
            obtainStyledAttributes.recycle();
            super.setGravity(17);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ AvailabilityStateTextView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
