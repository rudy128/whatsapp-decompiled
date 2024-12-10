package com.whatsapp.permissions;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.C108955ca;
import X.C114965t2;
import X.C1423279a;
import X.C27301Vn;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;

public final class RequestNotificationPermissionActivity extends RequestPermissionActivity {
    public C27301Vn A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            this.A01 = AnonymousClass1K1.A1X(A0K);
            AnonymousClass10E r1 = A0K.AAQ;
            this.A05 = AnonymousClass10E.AL1(r1);
            AnonymousClass10G r0 = r1.A00;
            C114965t2.A00(r1, r0, r0, this);
            this.A00 = (C27301Vn) r1.A9A.get();
        }
    }

    public RequestNotificationPermissionActivity(int i) {
        this.A01 = false;
        C1423279a.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass4aX.A0D(AnonymousClass3MX.A0I(this, 2131433768), AnonymousClass3Ma.A00(this, 2130972013, 2131103416));
    }

    public RequestNotificationPermissionActivity() {
        this(0);
    }
}
