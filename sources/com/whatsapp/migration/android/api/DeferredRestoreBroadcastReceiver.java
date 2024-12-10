package com.whatsapp.migration.android.api;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass2FK;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18180vt;
import X.C24621La;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class DeferredRestoreBroadcastReceiver extends BroadcastReceiver {
    public AnonymousClass11S A00;
    public C24621La A01;
    public C18030ve A02;
    public AnonymousClass18K A03;
    public final Object A04;
    public volatile boolean A05;

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context).AJU;
                    this.A02 = (C18030ve) r1.A04.get();
                    this.A00 = (AnonymousClass11S) r1.A63.get();
                    this.A03 = (AnonymousClass18K) r1.A9B.get();
                    this.A01 = (C24621La) r1.A8q.get();
                    this.A05 = true;
                }
            }
        }
        Log.i("DeferredRestoreBroadcastReceiver/on-receive");
        if (intent != null && C17890vO.A1S(intent, "com.google.android.apps.pixelmigrate.IOS_APP_DATA_AVAILABLE")) {
            if (!C18020vd.A05(C18040vf.A02, this.A02, 835)) {
                str = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/did not send data because ab prop is not enabled";
            } else {
                AnonymousClass2FK r4 = new AnonymousClass2FK();
                AnonymousClass11S r0 = this.A00;
                r0.A0I();
                r4.A01 = Boolean.valueOf(AnonymousClass000.A1W(r0.A00));
                try {
                    r4.A00 = Boolean.valueOf(AnonymousClass000.A1O(this.A01.A00("cross_platform_migration_completed", 0)));
                } catch (RuntimeException e) {
                    Log.e("DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/", e);
                    r4.A00 = false;
                }
                this.A03.CC0(r4, new C18180vt(1, 1), true);
                str = "DeferredRestoreBroadcastReceiver/sendWamEventIfApplicable/sent wam event";
            }
            Log.i(str);
        }
    }

    public DeferredRestoreBroadcastReceiver(int i) {
        this.A05 = false;
        this.A04 = C17880vN.A0p();
    }

    public DeferredRestoreBroadcastReceiver() {
        this(0);
    }
}
