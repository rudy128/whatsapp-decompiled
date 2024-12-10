package androidx.preference;

import X.AnonymousClass8BW;
import X.AnonymousClass8J3;
import X.AnonymousClass9UH;
import X.C20316AFy;
import X.C63882tq;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

public class CheckBoxPreference extends TwoStatePreference {
    public final C20316AFy A00;

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private void A00(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }

    public void A0D(View view) {
        super.A0D(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(16908289));
            A0R(view.findViewById(16908304));
        }
    }

    public void A0G(AnonymousClass8J3 r2) {
        super.A0G(r2);
        A00(r2.A0B(16908289));
        A0R(r2.A0B(16908304));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = new C20316AFy(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A01, i, i2);
        this.A01 = AnonymousClass8BW.A0b(obtainStyledAttributes, 5, 0);
        if (this.A02) {
            A05();
        }
        this.A00 = AnonymousClass8BW.A0b(obtainStyledAttributes, 4, 1);
        if (!this.A02) {
            A05();
        }
        this.A03 = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C63882tq.A01(context, 2130969024, 16842895));
    }

    public CheckBoxPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
