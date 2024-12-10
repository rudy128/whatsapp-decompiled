package androidx.preference;

import X.AnonymousClass8BW;
import X.AnonymousClass8J3;
import X.AnonymousClass9UH;
import X.C20317AFz;
import X.C63882tq;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C20317AFz A02;

    public SwitchPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void A01(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.A01);
            switchR.setTextOff(this.A00);
            switchR.setOnCheckedChangeListener(this.A02);
        }
    }

    public void A0D(View view) {
        super.A0D(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A01(view.findViewById(16908352));
            A0R(view.findViewById(16908304));
        }
    }

    public void A0G(AnonymousClass8J3 r2) {
        super.A0G(r2);
        A01(r2.A0B(16908352));
        A0R(r2.A0B(16908304));
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = new C20317AFz(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A0B, i, i2);
        this.A01 = AnonymousClass8BW.A0b(obtainStyledAttributes, 7, 0);
        if (this.A02) {
            A05();
        }
        this.A00 = AnonymousClass8BW.A0b(obtainStyledAttributes, 6, 1);
        if (!this.A02) {
            A05();
        }
        this.A01 = AnonymousClass8BW.A0b(obtainStyledAttributes, 9, 3);
        A05();
        this.A00 = AnonymousClass8BW.A0b(obtainStyledAttributes, 8, 4);
        A05();
        this.A03 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C63882tq.A01(context, 2130971444, 16843629));
    }

    public SwitchPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
