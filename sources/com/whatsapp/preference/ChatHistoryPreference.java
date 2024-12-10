package com.whatsapp.preference;

import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass4aX;
import X.AnonymousClass8J3;
import X.C17880vN;
import X.C28281Zt;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ChatHistoryPreference extends WaPreference {
    public int A00;
    public int A01;

    public ChatHistoryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = C28281Zt.A00(context, 2130971147, AnonymousClass1YL.A00(context, 2130971195, 2131102531));
        this.A01 = C28281Zt.A00(context, 2130971175, AnonymousClass1YL.A00(context, 2130971198, 2131102533));
    }

    public void A0G(AnonymousClass8J3 r4) {
        super.A0G(r4);
        View view = r4.A0H;
        AnonymousClass4aX.A0D(AnonymousClass3MW.A0H(view, 16908294), this.A00);
        C17880vN.A0E(view, 16908310).setTextColor(this.A01);
    }

    public ChatHistoryPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
