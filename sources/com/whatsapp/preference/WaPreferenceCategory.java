package com.whatsapp.preference;

import X.AnonymousClass8J3;
import X.C72463Mc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;

public class WaPreferenceCategory extends PreferenceCategory {
    public WaPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void A0G(AnonymousClass8J3 r5) {
        super.A0G(r5);
        View findViewById = r5.A0H.findViewById(16908310);
        if (findViewById != null && (findViewById instanceof TextView)) {
            C72463Mc.A0y(this.A05, (TextView) findViewById, 2130971203, 2131102539);
        }
    }

    public WaPreferenceCategory(Context context) {
        super(context, (AttributeSet) null);
    }

    public WaPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
