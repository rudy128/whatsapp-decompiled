package com.whatsapp.preference;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MZ;
import X.AnonymousClass8J3;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.ListPreference;

public final class WaListPreference extends ListPreference {
    public void A0G(AnonymousClass8J3 r3) {
        C18070vi.A0d(r3, 0);
        super.A0G(r3);
        this.A04 = this.A05.getString(2131898766);
        View view = r3.A0H;
        WaPreference.A01(view);
        WaPreference.A00(view);
    }

    public WaListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public /* synthetic */ WaListPreference(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        super(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    public WaListPreference(Context context) {
        super(context, (AttributeSet) null);
    }
}
