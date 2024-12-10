package com.whatsapp.registration.directmigration;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.C108955ca;
import X.C114965t2;
import X.C1423279a;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;

public final class RequestPermissionFromSisterAppActivity extends RequestPermissionActivity {
    public boolean A00;

    public void A3V(String str, Bundle bundle) {
        super.A3V(A3T(bundle, true), bundle);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            this.A01 = AnonymousClass1K1.A1X(A0K);
            AnonymousClass10E r1 = A0K.AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            AnonymousClass10G r0 = r1.A00;
            C114965t2.A00(r1, r0, r0, this);
        }
    }

    public RequestPermissionFromSisterAppActivity(int i) {
        this.A00 = false;
        C1423279a.A00(this, 36);
    }

    public RequestPermissionFromSisterAppActivity() {
        this(0);
    }
}
