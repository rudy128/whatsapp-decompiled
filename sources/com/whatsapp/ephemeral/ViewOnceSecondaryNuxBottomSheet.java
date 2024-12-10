package com.whatsapp.ephemeral;

import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C25241Nl;
import X.C72453Mb;
import X.C81483zJ;
import X.C88414Zp;
import X.C89934dG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class ViewOnceSecondaryNuxBottomSheet extends Hilt_ViewOnceSecondaryNuxBottomSheet implements AnonymousClass86E {
    public AnonymousClass1L9 A00;
    public C19830z4 A01;
    public AnonymousClass18K A02;
    public C25241Nl A03;
    public AnonymousClass129 A04;
    public final C18100vl A05 = C88414Zp.A02(this, "CHAT_JID");
    public final C18100vl A06 = C88414Zp.A00(this, "IN_GROUP");
    public final C18100vl A07 = C88414Zp.A03(this, "MESSAGE_TYPE", -1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131627371, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A052 = C18070vi.A05(view, 2131436853);
        View A053 = C18070vi.A05(view, 2131436854);
        View A054 = C18070vi.A05(view, 2131436852);
        ImageView A0C = AnonymousClass3Ma.A0C(view, 2131436856);
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131436859);
        TextView A0E2 = AnonymousClass3Ma.A0E(view, 2131436858);
        AnonymousClass3MX.A1B(A14(), A0C, 2131233572);
        A0E2.setText(2131897922);
        A0E.setText(2131897921);
        C89934dG.A00(A052, this, 29);
        C89934dG.A00(A053, this, 30);
        C89934dG.A00(A054, this, 31);
        A00(this, false);
    }

    public static final void A00(ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet, boolean z) {
        String str;
        C81483zJ r3 = new C81483zJ();
        C18100vl r2 = viewOnceSecondaryNuxBottomSheet.A05;
        if (!C18070vi.A18(r2.getValue(), "-1")) {
            r3.A00 = (Boolean) viewOnceSecondaryNuxBottomSheet.A06.getValue();
            C25241Nl r1 = viewOnceSecondaryNuxBottomSheet.A03;
            if (r1 != null) {
                r3.A03 = r1.A05(AnonymousClass3MW.A0y(r2));
                int i = 2;
                if (C72453Mb.A0I(viewOnceSecondaryNuxBottomSheet.A07) == 42) {
                    i = 1;
                }
                r3.A01 = Integer.valueOf(i);
                int i2 = 3;
                if (z) {
                    i2 = 8;
                }
                r3.A02 = Integer.valueOf(i2);
                AnonymousClass18K r0 = viewOnceSecondaryNuxBottomSheet.A02;
                if (r0 != null) {
                    r0.CC7(r3);
                    return;
                }
                str = "wamRuntime";
            } else {
                str = "wamThreadIdManager";
            }
            C18070vi.A11(str);
            throw null;
        }
    }
}
