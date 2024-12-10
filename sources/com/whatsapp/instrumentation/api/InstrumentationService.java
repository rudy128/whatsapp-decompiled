package com.whatsapp.instrumentation.api;

import X.AnonymousClass009;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass19T;
import X.AnonymousClass8CW;
import X.AnonymousClass9i5;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C186799em;
import X.C31221fD;
import X.C37011op;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicInteger;

public class InstrumentationService extends Service implements AnonymousClass009 {
    public static final AtomicInteger A08 = new AtomicInteger(0);
    public AnonymousClass9i5 A00;
    public C186799em A01;
    public C37011op A02;
    public AnonymousClass19T A03;
    public boolean A04;
    public final Object A05;
    public final AnonymousClass8CW A06;
    public volatile C008203r A07;

    public final Object generatedComponent() {
        if (this.A07 == null) {
            synchronized (this.A05) {
                if (this.A07 == null) {
                    this.A07 = new C008203r(this);
                }
            }
        }
        return this.A07.generatedComponent();
    }

    public void onCreate() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E r2 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            AnonymousClass10G r1 = r2.A00;
            this.A01 = (C186799em) r1.AGY.get();
            this.A03 = (AnonymousClass19T) r2.A9I.get();
            this.A00 = (AnonymousClass9i5) r1.AGI.get();
            this.A02 = (C37011op) r2.A5N.get();
        }
        super.onCreate();
    }

    public InstrumentationService(int i) {
        this.A05 = C17880vN.A0p();
        this.A04 = false;
    }

    public IBinder onBind(Intent intent) {
        return this.A06;
    }

    public InstrumentationService() {
        this(0);
        this.A06 = new AnonymousClass8CW(this);
    }
}
