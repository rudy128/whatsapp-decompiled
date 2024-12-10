package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1CJ;
import X.AnonymousClass1EC;
import X.AnonymousClass1L9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Q0;
import X.AnonymousClass2TL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DG;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass4bA;
import X.AnonymousClass4bC;
import X.AnonymousClass8GM;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C203411t;
import X.C22621Co;
import X.C24921Me;
import X.C34511kb;
import X.C36401np;
import X.C51082Wx;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C88854aw;
import X.C98754rf;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CommunityExitDialogFragment extends Hilt_CommunityExitDialogFragment {
    public View A00;
    public AnonymousClass1L9 A01;
    public C51082Wx A02;
    public C34511kb A03;
    public C203411t A04;
    public C24921Me A05;
    public AnonymousClass11C A06;
    public C22621Co A07;
    public AnonymousClass1CJ A08;
    public AnonymousClass1MZ A09;
    public AnonymousClass1EC A0A;
    public AnonymousClass129 A0B;
    public C36401np A0C;
    public AnonymousClass10I A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public boolean A0G = false;

    public static CommunityExitDialogFragment A00(AnonymousClass1EC r4, Collection collection, boolean z) {
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass3MY.A15(A0D2, r4, "parent_jid");
        ArrayList A0z = C17880vN.A0z(collection.size());
        A0D2.putBoolean("exit_aciton_type", z);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C72463Mc.A1K(A0z, it);
        }
        AnonymousClass3MY.A17(A0D2, "subgroup_jids", A0z);
        CommunityExitDialogFragment communityExitDialogFragment = new CommunityExitDialogFragment();
        communityExitDialogFragment.A1R(A0D2);
        return communityExitDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        int i;
        int i2;
        int i3;
        AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(A15().getString("parent_jid"));
        C17960vV.A07(A022);
        this.A0A = A022;
        this.A0G = A15().getBoolean("exit_aciton_type");
        ArrayList A1A = AnonymousClass3MZ.A1A(A15(), AnonymousClass1EC.class, "subgroup_jids");
        C73203Rj A042 = AnonymousClass4a6.A04(this);
        if (this.A09.A0P(this.A0A)) {
            A042.setPositiveButton(2131886752, new AnonymousClass4aq(this, 49));
            if (this.A0G) {
                A042.A0S(A1H(2131890184));
                i2 = 2131889209;
                i3 = 0;
            } else {
                A042.A0S(A1H(2131890183));
                i2 = 2131898766;
                i3 = 1;
            }
            AnonymousClass4bA.A00(A042, this, i3, i2);
        } else {
            AnonymousClass8GM A002 = AnonymousClass8GM.A00(A1D(), this.A02, this.A0A);
            String A0Y = this.A05.A0Y(this.A0A);
            if (this.A0G) {
                i = 2131890175;
                if (A0Y == null) {
                    i = 2131890176;
                }
            } else {
                i = 2131890180;
                if (A0Y == null) {
                    i = 2131890181;
                }
            }
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = A0Y;
            String A16 = AnonymousClass3MX.A16(this, "learn-more", A1b, 1, i);
            View A082 = AnonymousClass3MX.A08(A1n(), 2131625091);
            this.A00 = A082;
            TextView A0J = AnonymousClass3MW.A0J(A082, 2131429984);
            A0J.setText(this.A0C.A05(A0J.getContext(), new C98754rf(this, 6), A16, "learn-more"));
            AnonymousClass3Ma.A1I(A0J, this.A02);
            AnonymousClass3MZ.A1Q(A0J, this.A06);
            A042.setView(this.A00);
            Resources A092 = AnonymousClass3MZ.A09(this);
            int size = A1A.size();
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, A1A.size(), 0);
            A042.setTitle(A092.getQuantityString(2131755137, size, objArr));
            AnonymousClass4bA.A00(A042, this, 2, 2131898766);
            int i4 = 2131890172;
            if (this.A0G) {
                i4 = 2131890173;
            }
            A042.setPositiveButton(i4, new C88854aw(A1A, this, A002, 2));
            if (!this.A0G && this.A0A != null) {
                if (C18020vd.A05(C18040vf.A02, this.A02, 12671)) {
                    C72453Mb.A0V(this.A00, 2131429985).setText(2131890177);
                    A042.A0Y(new C88854aw(A1A, this, A002, 1), 2131890173);
                    this.A06 = AnonymousClass4DG.DESTRUCTIVE;
                } else {
                    Pair A003 = AnonymousClass1Q0.A00(this.A08, AnonymousClass2TL.A00(this.A03.A0B(this.A0A)));
                    boolean A1Y = AnonymousClass000.A1Y(A003.first);
                    Object obj = A003.second;
                    if (!A1Y) {
                        A042.A0Y(new AnonymousClass4bC((Object) this, obj, 5), 2131886727);
                    }
                }
            }
        }
        return A042.create();
    }
}
