package com.whatsapp.documentpicker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C109005cf;
import X.C115015t8;
import X.C137106uv;
import X.C34511kb;

public final class DocumentPickerBottomSheetActivity extends DocumentPickerActivity {
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
            this.A05 = (C34511kb) A0A.A2L.get();
            this.A06 = AnonymousClass10E.A4z(A0A);
            C115015t8.A0y(A0A, r1, AnonymousClass3MZ.A0i(A0A), this);
            this.A07 = AnonymousClass3MZ.A0f(A0A);
            this.A08 = AnonymousClass3MZ.A0g(A0A);
            this.A0J = AnonymousClass3MY.A0Z(A0A);
            this.A0F = AnonymousClass3Ma.A0b(A0A);
        }
    }

    public DocumentPickerBottomSheetActivity(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 44);
    }

    public DocumentPickerBottomSheetActivity() {
        this(0);
    }
}
