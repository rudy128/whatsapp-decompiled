package com.whatsapp.interopui.setting;

import X.AnonymousClass000;
import X.AnonymousClass118;
import X.AnonymousClass11E;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4AC;
import X.AnonymousClass4W6;
import X.AnonymousClass4XT;
import X.AnonymousClass4a6;
import X.AnonymousClass787;
import X.C137246v9;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C28931bI;
import X.C33971jg;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C825148g;
import X.C96584o5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.banners.WDSBanner;

public final class InteropSettingsMainFragment extends Hilt_InteropSettingsMainFragment {
    public AnonymousClass11E A00;
    public AnonymousClass118 A01;
    public C18030ve A02;
    public AnonymousClass1LU A03;
    public C33971jg A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625376, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        C28931bI A0s = C72453Mb.A0s(view, 2131434324);
        C33971jg r0 = this.A04;
        if (r0 != null) {
            if (AnonymousClass000.A1a(C137246v9.A01(r0))) {
                C18030ve r3 = this.A02;
                if (r3 == null) {
                    str = "abProps";
                } else if (C18020vd.A05(C18040vf.A02, r3, 11518)) {
                    View A0I = AnonymousClass3MY.A0I(A0s, 0);
                    C18070vi.A0X(A0I);
                    WDSBanner wDSBanner = (WDSBanner) A0I;
                    AnonymousClass4XT r5 = new AnonymousClass4XT();
                    Context A042 = AnonymousClass3MY.A04(view);
                    AnonymousClass118 r1 = this.A01;
                    if (r1 != null) {
                        C33971jg r02 = this.A04;
                        if (r02 != null) {
                            r5.A03 = AnonymousClass4W6.A01(A042, C137246v9.A00(r1, r02), AnonymousClass3MY.A0n(this, 2131894887));
                            r5.A05 = true;
                            AnonymousClass4AC.A00(r5, 2131232143);
                            wDSBanner.setState(r5.A01());
                            AnonymousClass3MZ.A1O(wDSBanner, this, view, 2);
                            wDSBanner.setOnDismissListener((View.OnClickListener) new AnonymousClass787(A0s, this, 3));
                            C825148g.A00(AnonymousClass3MX.A0C(view, 2131431775), this, 40);
                            C825148g.A00(AnonymousClass3MX.A0C(view, 2131433202), this, 41);
                            return;
                        }
                    } else {
                        str = "waContext";
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            if (A0s.A00 != null) {
                A0s.A04(8);
            }
            C825148g.A00(AnonymousClass3MX.A0C(view, 2131431775), this, 40);
            C825148g.A00(AnonymousClass3MX.A0C(view, 2131433202), this, 41);
            return;
        }
        str = "uiCache";
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(Context context, InteropSettingsMainFragment interopSettingsMainFragment) {
        String str;
        AnonymousClass11E r0 = interopSettingsMainFragment.A00;
        if (r0 == null) {
            str = "connectivityStateProvider";
        } else if (!r0.A09()) {
            C96584o5 r4 = new C96584o5(context, interopSettingsMainFragment);
            C18070vi.A0d(context, 0);
            C73203Rj A002 = AnonymousClass4a6.A00(context);
            A002.A0D(2131894895);
            C73203Rj.A0A(A002, r4, 18, 2131894896);
            A002.A0E(2131894893);
            C73203Rj.A07(A002, 25, 2131898766);
            AnonymousClass3MY.A1G(A002);
            return;
        } else if (interopSettingsMainFragment.A03 != null) {
            Intent A0G = C72463Mc.A0G(context);
            A0G.setClassName(context.getPackageName(), "com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity");
            context.startActivity(A0G);
            return;
        } else {
            str = "waIntents";
        }
        C18070vi.A11(str);
        throw null;
    }
}
