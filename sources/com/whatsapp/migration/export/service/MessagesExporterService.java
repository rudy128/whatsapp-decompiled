package com.whatsapp.migration.export.service;

import X.A7R;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass118;
import X.AnonymousClass3MY;
import X.C000200d;
import X.C008203r;
import X.C008503u;
import X.C108945cZ;
import X.C120866Fy;
import X.C1403771e;
import X.C145037Jq;
import X.C17880vN;
import X.C25081Mu;
import X.C27301Vn;
import X.C31221fD;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class MessagesExporterService extends C120866Fy implements AnonymousClass009 {
    public A7R A00;
    public C1403771e A01;
    public AnonymousClass00H A02;
    public boolean A03 = false;
    public C145037Jq A04;
    public final Object A05 = C17880vN.A0p();
    public volatile C008203r A06;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void A00(Context context, A7R a7r) {
        Log.i("xpm-export-service-cancelExport()");
        if (!a7r.A09()) {
            Intent A0G = C108945cZ.A0G("ACTION_CANCEL_EXPORT");
            A0G.setClass(context, MessagesExporterService.class);
            A0G.putExtra("IS_FIRST_PARTY", false);
            C25081Mu.A00(context, A0G);
            return;
        }
        Log.i("xpm-export-service-cancelExport()/cancellation already in progress. No need to start the Service again");
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new C008203r(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onCreate() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A00 = AnonymousClass3MY.A0N(r1);
            this.A01 = AnonymousClass10E.AL1(r1);
            this.A00 = (A7R) r1.ALW.get();
            this.A02 = C000200d.A00(r1.AZe);
            this.A01 = new C1403771e((AnonymousClass118) r1.ABY.get(), (C27301Vn) r1.A9A.get(), AnonymousClass10E.A6R(r1));
        }
        super.onCreate();
        this.A04 = new C145037Jq(this);
        C17880vN.A0V(this.A02).registerObserver(this.A04);
    }

    public void onDestroy() {
        Log.i("xpm-export-service-onDestroy()");
        super.onDestroy();
        C17880vN.A0V(this.A02).unregisterObserver(this.A04);
        stopForeground(false);
    }
}
