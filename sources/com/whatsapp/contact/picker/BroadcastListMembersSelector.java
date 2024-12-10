package com.whatsapp.contact.picker;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1IX;
import X.AnonymousClass1K1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3qm;
import X.C000200d;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C25161Nd;
import X.C63082sT;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C91004ez;
import java.util.ArrayList;

public final class BroadcastListMembersSelector extends AnonymousClass3qm {
    public C19880zA A00;
    public C19880zA A01;
    public AnonymousClass00H A02;
    public boolean A03;
    public AnonymousClass1IX A04;
    public boolean A05;

    public BroadcastListMembersSelector() {
        this(0);
    }

    public void A55(ArrayList arrayList) {
        C18070vi.A0d(arrayList, 0);
        super.A55(arrayList);
        AnonymousClass1IX A0y = A0y(this);
        if (A0y != null) {
            arrayList.addAll(A0y);
        }
    }

    public static final AnonymousClass1IX A0y(BroadcastListMembersSelector broadcastListMembersSelector) {
        if (C18020vd.A00(C18040vf.A02, broadcastListMembersSelector.A0E, 10136) == 1) {
            broadcastListMembersSelector.A04 = C74803cp.A0Q(broadcastListMembersSelector.A04, broadcastListMembersSelector);
        }
        return broadcastListMembersSelector.A04;
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
            this.A03 = C000200d.A00(r2.A1D);
            this.A01 = AnonymousClass3MZ.A0h(r2);
            this.A02 = (C25161Nd) r2.A2v.get();
            C19890zB r12 = C19890zB.A00;
            this.A00 = r12;
            this.A02 = C000200d.A00(r2.A1C);
            this.A00 = r12;
            this.A01 = r12;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.A03) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                C63082sT.A01((C63082sT) r0.get(), 4, (long) this.A0i.size());
            } else {
                C18070vi.A11("broadcastAnalyticsManager");
                throw null;
            }
        }
    }

    public BroadcastListMembersSelector(int i) {
        this.A05 = false;
        C91004ez.A00(this, 20);
    }
}
