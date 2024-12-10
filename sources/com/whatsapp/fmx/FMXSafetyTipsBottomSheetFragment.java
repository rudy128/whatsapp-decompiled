package com.whatsapp.fmx;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3UR;
import X.AnonymousClass4VE;
import X.C104215Nh;
import X.C18070vi;
import X.C18100vl;
import X.C22941Dw;
import X.C22971Dz;
import X.C36531o3;
import X.C37551pj;
import X.C89944dH;
import X.C90014dO;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.SettingsRowIconText;

public final class FMXSafetyTipsBottomSheetFragment extends Hilt_FMXSafetyTipsBottomSheetFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1M9 A01;
    public C36531o3 A02;
    public AnonymousClass4VE A03;
    public AnonymousClass00H A04;
    public final C18100vl A05 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104215Nh(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626603, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C18100vl r6 = this.A05;
        if (r6.getValue() == null) {
            A29();
            return;
        }
        View A052 = C18070vi.A05(view, 2131428214);
        AnonymousClass00H r0 = this.A04;
        if (r0 != null) {
            C37551pj A0V = AnonymousClass3MW.A0V(r0);
            C22941Dw r02 = UserJid.Companion;
            if (A0V.A0P(C22941Dw.A01(AnonymousClass3MW.A0h(r6)))) {
                A052.setVisibility(8);
            } else {
                A052.setVisibility(0);
            }
            AnonymousClass1FL A1B = A1B();
            if ((A1B instanceof AnonymousClass1FY) && A1B != null) {
                C89944dH.A00(AnonymousClass1HF.A06(view, 2131434778), this, 20);
                AnonymousClass4VE r03 = this.A03;
                if (r03 != null) {
                    if (r03.A04) {
                        AnonymousClass3MY.A1A(view, 2131430928, 8);
                        AnonymousClass3MY.A1A(view, 2131430933, 8);
                        AnonymousClass3MY.A1A(view, 2131430927, 8);
                        AnonymousClass3MY.A1A(view, 2131430932, 8);
                    }
                    C89944dH.A00(AnonymousClass1HF.A06(view, 2131434779), this, 21);
                    C90014dO.A00(C18070vi.A05(view, 2131428214), this, A1B, 29);
                    C90014dO.A00(C18070vi.A05(view, 2131434552), this, A1B, 30);
                    if (C22971Dz.A0S(C22941Dw.A01(AnonymousClass3MW.A0h(r6)))) {
                        AnonymousClass3MY.A1A(view, 2131430936, 8);
                        AnonymousClass3MY.A1A(view, 2131430935, 8);
                        AnonymousClass3MY.A1A(view, 2131430934, 0);
                        ((SettingsRowIconText) AnonymousClass1HF.A06(view, 2131430934)).A01((Drawable) null, false);
                        return;
                    }
                    return;
                }
                C18070vi.A11("fmxManager");
                throw null;
            }
            return;
        }
        C18070vi.A11("blockListManager");
        throw null;
    }

    public static final void A00(FMXSafetyTipsBottomSheetFragment fMXSafetyTipsBottomSheetFragment, int i) {
        AnonymousClass4VE r2 = fMXSafetyTipsBottomSheetFragment.A03;
        if (r2 != null) {
            r2.A02((AnonymousClass3UR) null, (Integer) null, i, 1);
        } else {
            C18070vi.A11("fmxManager");
            throw null;
        }
    }
}
