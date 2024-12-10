package com.whatsapp.preference;

import X.AnonymousClass8J3;
import X.C19740yt;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

public class WaPreference extends Preference {
    public WaPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void A00(View view) {
        View findViewById = view.findViewById(16908304);
        if (findViewById != null && (findViewById instanceof TextView)) {
            ((TextView) findViewById).setTextColor(C19740yt.A03(findViewById.getContext(), 2131102445));
        }
    }

    public static void A01(View view) {
        View findViewById = view.findViewById(16908310);
        if (findViewById instanceof TextView) {
            ((TextView) findViewById).setTextColor(C19740yt.A03(findViewById.getContext(), 2131102074));
        }
    }

    public void A0G(AnonymousClass8J3 r2) {
        super.A0G(r2);
        A01(r2.A0H);
    }

    public WaPreference(Context context) {
        super(context, (AttributeSet) null);
    }

    public WaPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
