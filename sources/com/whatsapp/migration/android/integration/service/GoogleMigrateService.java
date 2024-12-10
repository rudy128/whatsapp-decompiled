package com.whatsapp.migration.android.integration.service;

import X.A4W;
import X.AW3;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass6Fx;
import X.AnonymousClass7RM;
import X.AnonymousClass8BY;
import X.BDR;
import X.C000200d;
import X.C008503u;
import X.C17880vN;
import X.C17890vO;
import X.C20113A7w;
import X.C21458AkP;
import X.C31221fD;
import X.C70593Bs;
import android.content.Intent;
import android.os.IBinder;
import com.whatsapp.util.Log;

public class GoogleMigrateService extends AnonymousClass6Fx {
    public AnonymousClass190 A00;
    public AnonymousClass11C A01;
    public C20113A7w A02;
    public A4W A03;
    public AnonymousClass10I A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public boolean A07 = false;
    public final BDR A08 = new AW3(this, 0);

    public IBinder onBind(Intent intent) {
        return null;
    }

    public GoogleMigrateService() {
        super("GoogleMigrateService", true);
    }

    public void A04() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A01 = C000200d.A00(r1.ATS);
            this.A00 = AnonymousClass3MZ.A13(r1);
            this.A04 = AnonymousClass10E.AL1(r1);
            this.A00 = AnonymousClass3MY.A0N(r1);
            this.A05 = C000200d.A00(r1.A4U);
            this.A01 = AnonymousClass3Ma.A0a(r1);
            AnonymousClass10G r12 = r1.A00;
            this.A06 = C000200d.A00(r12.ABl);
            this.A02 = (C20113A7w) r12.ABj.get();
            this.A03 = (A4W) r12.ABk.get();
        }
    }

    public void onDestroy() {
        Log.i("GoogleMigrateService/onDestroy()");
        super.onDestroy();
        stopForeground(true);
        C17880vN.A0V(this.A06).unregisterObserver(this.A08);
    }

    public void onCreate() {
        A04();
        super.onCreate();
        C17880vN.A0V(this.A06).registerObserver(this.A08);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Object r5;
        int i3;
        String str;
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            str = "GoogleMigrateService/onStartCommand()/intent is null";
        } else if (!"com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT".equals(intent.getAction()) || !this.A02.A0H()) {
            if (C17890vO.A1S(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT")) {
                Log.i("GoogleMigrateService/onStartCommand()/action_cancel_import");
                A4W a4w = this.A03;
                AnonymousClass8BY.A0f(AnonymousClass3MW.A05(a4w.A00), A4W.A00(a4w, false), this, 2131890822, i2);
                i3 = 37;
            } else if (C17890vO.A1S(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_START_IMPORT")) {
                Log.i("GoogleMigrateService/onStartCommand()/action_start_import");
                A4W a4w2 = this.A03;
                AnonymousClass8BY.A0f(AnonymousClass3MW.A05(a4w2.A00), A4W.A00(a4w2, false), this, 2131890828, i2);
                i3 = 38;
            } else {
                if (C17890vO.A1S(intent, "com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_PREPARE_BEFORE_RETRY")) {
                    Log.i("GoogleMigrateService/onStartCommand()/prepare_before_retry");
                    int intExtra = intent.getIntExtra("migration_error_code", 1);
                    A4W a4w3 = this.A03;
                    AnonymousClass8BY.A0f(AnonymousClass3MW.A05(a4w3.A00), A4W.A00(a4w3, false), this, 2131895332, i2);
                    r5 = new AnonymousClass7RM((Object) this, intExtra, 22);
                    this.A04.CGF(new C21458AkP(this, r5, 2));
                    return 1;
                }
                return 1;
            }
            r5 = new C70593Bs(this, i3);
            this.A04.CGF(new C21458AkP(this, r5, 2));
            return 1;
        } else {
            str = "GoogleMigrateService/onStartCommand()/import in progress";
        }
        Log.i(str);
        return 1;
    }
}
