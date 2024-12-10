package com.whatsapp.location;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass3Ma;
import X.AnonymousClass689;
import X.AnonymousClass736;
import X.AnonymousClass8BV;
import X.BE7;
import X.BE9;
import X.BEB;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C109015cg;
import X.C23799Bpj;
import X.C33251iW;
import X.C91044f3;

public final class LocationPicker2BottomSheet extends LocationPicker2 {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            BEB.A10(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            BEB.A0x(A0A, r1, this);
            C109015cg.A03(A0A, r1, this, r1.A5A);
            this.A0Q = (AnonymousClass736) A0A.AUc.get();
            this.A0L = BE9.A0Z(A0A);
            this.A0S = BE9.A0a(A0A);
            this.A0N = AnonymousClass8BV.A0C(A0A);
            this.A08 = (AnonymousClass181) A0A.AA9.get();
            this.A0P = AnonymousClass3Ma.A0g(A0A);
            this.A09 = (C33251iW) BE7.A0c(A0A);
            this.A0R = (AnonymousClass1D9) A0A.A0n.get();
            this.A0O = C108985cd.A0T(A0A);
            this.A0G = BE9.A0Y(A0A);
            this.A0X = (AnonymousClass689) A0A.A5q.get();
            this.A0A = BE9.A0W(A0A);
            this.A0B = AnonymousClass10E.A50(A0A);
            this.A0a = C108975cc.A0O(A0A);
            C23799Bpj.A0Q(A0A, r1, this, C23799Bpj.A03(A0A, r1, C108985cd.A0R(A0A), this));
        }
    }

    public LocationPicker2BottomSheet(int i) {
        this.A00 = false;
        C91044f3.A00(this, 6);
    }

    public LocationPicker2BottomSheet() {
        this(0);
    }
}
