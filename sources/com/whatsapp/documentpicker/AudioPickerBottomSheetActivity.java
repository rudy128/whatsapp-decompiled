package com.whatsapp.documentpicker;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MZ;
import X.AnonymousClass79Z;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C114995t6;
import X.C137106uv;
import com.whatsapp.audiopicker.AudioPickerActivity;

public final class AudioPickerBottomSheetActivity extends AudioPickerActivity {
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
            this.A04 = C108965cb.A0K(A0A);
            this.A0F = C000200d.A00(A0A.AYQ);
            this.A08 = AnonymousClass3MZ.A0i(A0A);
            this.A05 = AnonymousClass10E.A4z(A0A);
            C114995t6.A0y(A0A, r1, this, AnonymousClass3MZ.A0g(A0A));
        }
    }

    public AudioPickerBottomSheetActivity(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 42);
    }

    public AudioPickerBottomSheetActivity() {
        this(0);
    }
}
