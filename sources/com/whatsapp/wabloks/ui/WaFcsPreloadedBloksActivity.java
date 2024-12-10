package com.whatsapp.wabloks.ui;

import X.A2X;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass6NY;
import X.AnonymousClass7NT;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C109295d9;
import X.C114935sU;
import X.C1423379b;
import X.C19620yd;
import X.C29831cw;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;

public class WaFcsPreloadedBloksActivity extends AnonymousClass6NY {
    public C29831cw A00;
    public boolean A01;
    public final BroadcastReceiver A02;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00.A00(this, this.A02, new IntentFilter("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result"), C19620yd.A0B, (Handler) null, true);
    }

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
            this.A01 = C000200d.A00(A0K.A5R);
            this.A02 = C000200d.A00(A0A.AB2);
            this.A00 = (C29831cw) A0A.A9c.get();
        }
    }

    public WaFcsPreloadedBloksActivity(int i) {
        this.A01 = false;
        C1423379b.A00(this, 19);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            A2X a2x = this.A00;
            if (a2x != null) {
                a2x.A02(new AnonymousClass7NT(i2, bundle));
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A02(this.A02, this);
    }

    public WaFcsPreloadedBloksActivity() {
        this(0);
        this.A02 = new C109295d9(this);
    }
}
