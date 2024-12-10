package com.whatsapp.wearos;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass10G;
import X.BZ1;
import X.C000200d;
import X.C000500i;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C22581BEf;
import X.C31221fD;

public final class WearOsListenerService extends C22581BEf implements AnonymousClass009 {
    public BZ1 A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final Object A03;
    public volatile C008203r A04;

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C008203r(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }

    public void onCreate() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10G r1 = ((C31221fD) ((C008503u) generatedComponent())).A07.A00;
            this.A00 = AnonymousClass10G.A03(C000500i.A00(r1.AJU.Ao9));
            this.A01 = C000200d.A00(r1.A4L);
        }
        super.onCreate();
    }

    public WearOsListenerService(int i) {
        this.A03 = C17880vN.A0p();
        this.A02 = false;
    }

    public WearOsListenerService() {
        this(0);
    }
}
