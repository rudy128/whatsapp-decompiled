package com.whatsapp.wabloks.ui;

import X.ADL;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1FB;
import X.AnonymousClass1GP;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass7A4;
import X.AnonymousClass7OM;
import X.C108955ca;
import X.C109005cf;
import X.C114935sU;
import X.C133096oA;
import X.C1423379b;
import X.C17960vV;
import X.C18070vi;
import X.C28281Zt;
import X.C72463Mc;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public final class WaBloksGenericBottomSheetActivity extends WaBloksActivity {
    public C133096oA A00;
    public boolean A01;

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114935sU.A03(A0K, A0A, r1, this);
            this.A00 = (C133096oA) A0K.A05.get();
        }
    }

    public WaBloksGenericBottomSheetActivity(int i) {
        this.A01 = false;
        C1423379b.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72463Mc.A19(this, 2131436959);
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Z.add(new AnonymousClass7A4(this, 3));
        WeakReference A0z = AnonymousClass3MW.A0z(this);
        C133096oA r2 = this.A00;
        if (r2 != null) {
            String stringExtra = getIntent().getStringExtra("extra_app_id");
            C17960vV.A07(stringExtra);
            C18070vi.A0X(stringExtra);
            boolean A0B = C28281Zt.A0B(this);
            r2.A00(new AnonymousClass7OM(4), (ADL) null, stringExtra, AnonymousClass11S.A01(this.A02).getRawString(), (String) null, A0z, A0B);
            return;
        }
        C18070vi.A11("asyncActionLauncher");
        throw null;
    }

    public WaBloksGenericBottomSheetActivity() {
        this(0);
    }
}
