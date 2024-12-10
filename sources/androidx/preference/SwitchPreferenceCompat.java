package androidx.preference;

import X.AG0;
import X.AnonymousClass8BW;
import X.AnonymousClass8J3;
import X.AnonymousClass9UH;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final AG0 A02 = new AG0(this);

    private void A00(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130971443, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A0C, 2130971443, 0);
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

    public void A0D(View view) {
        super.A0D(view);
        if (((AccessibilityManager) this.A05.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(2131435954));
            A0R(view.findViewById(16908304));
        }
    }

    public void A0G(AnonymousClass8J3 r2) {
        super.A0G(r2);
        A00(r2.A0B(2131435954));
        A0R(r2.A0B(16908304));
    }
}
