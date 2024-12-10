package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1G4;
import X.AnonymousClass1K1;
import X.AnonymousClass1MZ;
import X.AnonymousClass1ZT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3rC;
import X.AnonymousClass3rD;
import X.AnonymousClass4Y8;
import X.AnonymousClass4a6;
import X.AnonymousClass5EZ;
import X.C003401n;
import X.C101805Ea;
import X.C103955Mh;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C22941Dw;
import X.C27354DcQ;
import X.C29431cG;
import X.C30391dr;
import X.C32111gf;
import X.C40371ub;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C74803cp;
import X.C76953ot;
import X.C77053p5;
import X.C77653r7;
import X.C84264Iu;
import X.C90994ey;
import X.C91074f6;
import X.C91574fu;
import X.C99274sY;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class CommunityAdminPickerActivity extends C77053p5 {
    public AnonymousClass02n A00;
    public C32111gf A01;
    public C40371ub A02;
    public AnonymousClass1CJ A03;
    public AnonymousClass1MZ A04;
    public boolean A05;
    public final C18100vl A06;

    public CommunityAdminPickerActivity() {
        this(0);
        this.A06 = C99274sY.A00(new C101805Ea(this), new AnonymousClass5EZ(this), new C103955Mh(this), AnonymousClass3MW.A15(CommunityAdminPickerViewModel.class));
    }

    public void A59(List list) {
        C18070vi.A0d(list, 0);
        AnonymousClass3rC r5 = new AnonymousClass3rC(C18070vi.A0F(this, 2131888809), false);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (next instanceof C77653r7) {
                A13.add(next);
            }
        }
        LinkedHashMap A132 = C17880vN.A13();
        for (Object next2 : A13) {
            C22941Dw r0 = UserJid.Companion;
            AnonymousClass3rC r02 = null;
            if (AnonymousClass3MZ.A0w(((AnonymousClass3rD) next2).A00) != null) {
                r02 = r5;
            }
            ((List) C72473Md.A0h(r02, A132)).add(next2);
        }
        C27354DcQ A012 = AnonymousClass1ZT.A01();
        List list2 = (List) A132.get(r5);
        if (list2 != null && AnonymousClass000.A1a(list2)) {
            A012.add(r5);
            A012.addAll(list2);
        }
        super.A59(AnonymousClass1ZT.A02(A012));
    }

    public void BEb(AnonymousClass1E7 r7) {
        AnonymousClass1BI r0;
        String str;
        C18070vi.A0d(r7, 0);
        super.BEb(r7);
        List list = this.A0i;
        C18070vi.A0W(list);
        AnonymousClass1E7 r2 = (AnonymousClass1E7) C29431cG.A0c(list);
        C22941Dw r02 = UserJid.Companion;
        if (r2 != null) {
            r0 = r2.A0J;
        } else {
            r0 = null;
        }
        UserJid A012 = C22941Dw.A01(r0);
        if (A012 == null || AnonymousClass3MW.A1Y(this)) {
            CommunityAdminPickerViewModel communityAdminPickerViewModel = (CommunityAdminPickerViewModel) this.A06.getValue();
            if (r2 != null) {
                str = communityAdminPickerViewModel.A00.A0I(r2);
            } else {
                str = null;
            }
            AnonymousClass1G4 r3 = communityAdminPickerViewModel.A01;
            do {
            } while (!r3.BFK(r3.getValue(), new C76953ot(new AnonymousClass4Y8(A012, str))));
            return;
        }
        A0y(this, getString(C72473Md.A03(this)));
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A01 = AnonymousClass3MZ.A0b(r2);
            this.A02 = AnonymousClass10E.A46(r2);
            this.A00 = (C84264Iu) A0K.A1S.get();
            this.A03 = AnonymousClass3Ma.A0d(r2);
            this.A01 = (C32111gf) r2.A2M.get();
            this.A02 = (C40371ub) r2.A2P.get();
            this.A04 = AnonymousClass3MY.A0V(r2);
        }
    }

    public final void A5D() {
        AnonymousClass1G4 r3 = ((CommunityAdminPickerViewModel) this.A06.getValue()).A01;
        do {
        } while (!r3.BFK(r3.getValue(), new C76953ot(new AnonymousClass4Y8((UserJid) null, (String) null))));
        List list = this.A0i;
        C18070vi.A0W(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17880vN.A0O(it).A0y = false;
        }
        list.clear();
    }

    public static final void A0y(CommunityAdminPickerActivity communityAdminPickerActivity, String str) {
        C73203Rj A002 = AnonymousClass4a6.A00(communityAdminPickerActivity);
        if (str == null) {
            str = C18070vi.A0F(communityAdminPickerActivity, 2131896261);
        }
        A002.A0S(str);
        A002.A0g(communityAdminPickerActivity, new C91574fu(communityAdminPickerActivity, 42), 2131899286);
        A002.A0e(communityAdminPickerActivity, new C91574fu(communityAdminPickerActivity, 43), 2131898766);
        A002.A0C();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C003401n supportActionBar2 = getSupportActionBar();
            if (supportActionBar2 != null) {
                supportActionBar2.A0S(getString(2131895610));
            }
            supportActionBar.A0W(true);
        }
        this.A00 = C91074f6.A00(this, new Object(), 1);
        AnonymousClass3MX.A1Q(new CommunityAdminPickerActivity$collectViewModelEvents$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public CommunityAdminPickerActivity(int i) {
        this.A05 = false;
        C90994ey.A00(this, 44);
    }
}
