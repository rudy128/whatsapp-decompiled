package com.whatsapp.contact.picker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass79Z;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C115005t7;
import X.C137106uv;
import X.C19890zB;
import X.C36271nc;
import X.C72453Mb;

public final class PhoneContactsSelectorBottomSheet extends PhoneContactsSelector {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C137106uv.A00(A0K, this);
            this.A0L = AnonymousClass3MZ.A0l(A0A);
            this.A04 = C19890zB.A00;
            this.A06 = (C36271nc) r1.A4x.get();
            this.A0D = AnonymousClass3MZ.A0i(A0A);
            this.A08 = AnonymousClass3MZ.A0e(A0A);
            this.A09 = AnonymousClass10E.A4z(A0A);
            this.A0A = AnonymousClass3MZ.A0g(A0A);
            this.A0N = AnonymousClass10E.A6Q(A0A);
            this.A05 = C72453Mb.A0b(A0A);
            this.A0Q = C000200d.A00(A0A.A2b);
            C115005t7.A0y(A0K, A0A, r1, this, AnonymousClass3Ma.A0b(A0A));
        }
    }

    public PhoneContactsSelectorBottomSheet(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 39);
    }

    public PhoneContactsSelectorBottomSheet() {
        this(0);
    }
}
