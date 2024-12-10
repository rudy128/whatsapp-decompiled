package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass18O;
import X.AnonymousClass1BI;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1NM;
import X.AnonymousClass3MX;
import X.AnonymousClass8I7;
import X.C166668dO;
import X.C17960vV;
import X.C18030ve;
import X.C25161Nd;
import X.C33251iW;
import X.C36741oO;
import X.C87884Xl;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsChatHistoryFragment extends Hilt_SettingsChatHistoryFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public AnonymousClass18O A02;
    public C33251iW A03;
    public AnonymousClass1M9 A04;
    public C25161Nd A05;
    public C87884Xl A06;
    public AnonymousClass1NM A07;
    public C18030ve A08;
    public AnonymousClass1LU A09;
    public AnonymousClass1BI A0A;
    public C36741oO A0B;
    public AnonymousClass10I A0C;
    public AnonymousClass00H A0D;

    public void A1w(int i, int i2, Intent intent) {
        if (i == 10 && i2 == -1) {
            AnonymousClass1BI A0l = AnonymousClass3MX.A0l(intent.getStringExtra("contact"));
            C17960vV.A08(A0l, intent.getStringExtra("contact"));
            this.A0A = A0l;
            C166668dO r1 = this.A00;
            if (r1 != null) {
                this.A06.A02(r1, r1, A0l);
            }
        }
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        AnonymousClass8I7 r2 = this.A06;
        r2.A00 = colorDrawable.getIntrinsicHeight();
        r2.A01 = colorDrawable;
        PreferenceFragmentCompat preferenceFragmentCompat = r2.A03;
        preferenceFragmentCompat.A02.A0Y();
        r2.A00 = 0;
        preferenceFragmentCompat.A02.A0Y();
    }
}
