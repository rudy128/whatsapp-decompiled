package com.whatsapp.location;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass181;
import X.AnonymousClass1D9;
import X.AnonymousClass3Ma;
import X.AnonymousClass689;
import X.AnonymousClass8BV;
import X.BE7;
import X.BE9;
import X.BEB;
import X.C000200d;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C109015cg;
import X.C23798Bph;
import X.C25491Ok;
import X.C33251iW;
import X.C91044f3;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public final class LocationPickerBottomSheet extends LocationPicker {
    public boolean A00;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            BEB.A10(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            BEB.A0x(A0A, r1, this);
            C109015cg.A03(A0A, r1, this, r1.A5A);
            this.A0G = BE9.A0Z(A0A);
            this.A0M = BE9.A0a(A0A);
            this.A0I = AnonymousClass8BV.A0C(A0A);
            this.A09 = (AnonymousClass181) A0A.AA9.get();
            this.A0K = AnonymousClass3Ma.A0g(A0A);
            this.A0A = (C33251iW) BE7.A0c(A0A);
            this.A0L = (AnonymousClass1D9) A0A.A0n.get();
            this.A0J = C108985cd.A0T(A0A);
            this.A0Q = (AnonymousClass689) A0A.A5q.get();
            this.A0B = BE9.A0W(A0A);
            this.A0T = C108975cc.A0O(A0A);
            this.A0W = C000200d.A00(A0A.A3w);
            this.A0D = (C25491Ok) A0A.A1F.get();
            C23798Bph.A03(A0A, r1, this, (WhatsAppLibLoader) A0A.ABy.get());
        }
    }

    public LocationPickerBottomSheet(int i) {
        this.A00 = false;
        C91044f3.A00(this, 7);
    }

    public LocationPickerBottomSheet() {
        this(0);
    }
}
