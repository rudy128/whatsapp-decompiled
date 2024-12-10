package com.whatsapp.contact.picker;

import X.AnonymousClass02B;
import X.AnonymousClass02H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C109005cf;
import X.C114775ry;

public final class AudienceSelectionContactPicker extends ContactPicker {
    public boolean A00;

    public AnonymousClass02B COJ(AnonymousClass02H r2) {
        return null;
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114775ry.A03(A0A, r1, this, A0A.ABd);
            C114775ry.A0Q(r1, this);
        }
    }

    public AudienceSelectionContactPicker(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 36);
    }

    public AudienceSelectionContactPicker() {
        this(0);
    }
}
