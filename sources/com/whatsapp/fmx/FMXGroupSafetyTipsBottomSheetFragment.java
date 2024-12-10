package com.whatsapp.fmx;

import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4VE;
import X.C18030ve;
import X.C18070vi;
import X.C21422Ajp;
import X.C36401np;
import X.C36531o3;
import X.C89944dH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.settings.SettingsRowIconText;

public final class FMXGroupSafetyTipsBottomSheetFragment extends Hilt_FMXGroupSafetyTipsBottomSheetFragment {
    public AnonymousClass1L9 A00;
    public C36531o3 A01;
    public C18030ve A02;
    public AnonymousClass4VE A03;
    public AnonymousClass1LU A04;
    public C36401np A05;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626602, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C89944dH.A00(AnonymousClass1HF.A06(view, 2131434778), this, 17);
        C89944dH.A00(AnonymousClass1HF.A06(view, 2131434779), this, 18);
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) AnonymousClass1HF.A06(view, 2131430929);
        C36401np r5 = this.A05;
        if (r5 != null) {
            settingsRowIconText.setSubText((CharSequence) AnonymousClass3MY.A0A(settingsRowIconText.getContext(), r5, new C21422Ajp(19), settingsRowIconText.getResources().getString(2131890462), "privacy-settings"));
            C89944dH.A00(settingsRowIconText, this, 19);
            return;
        }
        AnonymousClass3MW.A1E();
        throw null;
    }
}
