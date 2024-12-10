package com.whatsapp.storage;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18K;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.C000200d;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C83974Hj;
import X.C91034f2;
import android.content.Intent;
import android.os.Bundle;

public final class StorageUsageManageSpaceActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;

    public StorageUsageManageSpaceActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = AnonymousClass3MW.A0s(A0L);
            this.A01 = C000200d.A00(A0L.A9B);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        Intent A0A;
        super.onCreate(bundle);
        if (this.A07.A04()) {
            AnonymousClass00H r0 = this.A01;
            if (r0 != null) {
                AnonymousClass18K r1 = (AnonymousClass18K) C18070vi.A0E(r0);
                C18070vi.A0d(r1, 1);
                String A002 = C83974Hj.A00(r1, 11);
                AnonymousClass00H r02 = this.A00;
                if (r02 != null) {
                    r02.get();
                    A0A = AnonymousClass1LU.A1U(this, A002, (String) null, 11);
                }
                str = "waIntents";
                C18070vi.A11(str);
                throw null;
            }
            str = "wamRuntime";
            C18070vi.A11(str);
            throw null;
        }
        AnonymousClass00H r03 = this.A00;
        if (r03 != null) {
            r03.get();
            A0A = AnonymousClass1LU.A0A(this);
        }
        str = "waIntents";
        C18070vi.A11(str);
        throw null;
        startActivity(A0A);
        finish();
    }

    public StorageUsageManageSpaceActivity(int i) {
        this.A02 = false;
        C91034f2.A00(this, 45);
    }
}
