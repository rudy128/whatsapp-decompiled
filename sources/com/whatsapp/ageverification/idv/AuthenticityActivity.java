package com.whatsapp.ageverification.idv;

import X.ADL;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass79Z;
import X.AnonymousClass7ON;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C114935sU;
import X.C131486lB;
import X.C133096oA;
import X.C17880vN;
import X.C18070vi;
import X.C28281Zt;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.lang.ref.WeakReference;

public final class AuthenticityActivity extends WaBloksActivity {
    public C131486lB A00;
    public AnonymousClass1LU A01;
    public AnonymousClass00H A02;
    public boolean A03;

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C114935sU.A03(A0K, A0A, r1, this);
            this.A02 = C000200d.A00(A0K.A05);
            this.A00 = (C131486lB) r1.AJ3.get();
            this.A01 = AnonymousClass3MY.A0Z(A0A);
        }
    }

    public void A4b(Intent intent, Bundle bundle) {
        String str;
        String stringExtra = intent.getStringExtra("screen_params");
        if (stringExtra == null) {
            stringExtra = "{}";
        }
        String stringExtra2 = intent.getStringExtra("screen_name");
        if (stringExtra2 != null) {
            AnonymousClass00H r0 = this.A02;
            if (r0 != null) {
                C133096oA r1 = (C133096oA) r0.get();
                WeakReference A0z = AnonymousClass3MW.A0z(this);
                boolean A0B = C28281Zt.A0B(this);
                C131486lB r02 = this.A00;
                if (r02 != null) {
                    r1.A00(new AnonymousClass7ON(this, 0), (ADL) null, stringExtra2, r02.A00(), stringExtra, A0z, A0B);
                    return;
                }
                str = "waBloksPreRegistrationUserHelper";
            } else {
                str = "asyncActionLauncherLazy";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17880vN.A0g();
    }

    public AuthenticityActivity(int i) {
        this.A03 = false;
        AnonymousClass79Z.A00(this, 10);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624237);
    }

    public AuthenticityActivity() {
        this(0);
    }
}
