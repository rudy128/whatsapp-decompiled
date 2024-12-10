package com.whatsapp.perf.profilo;

import X.AnonymousClass009;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass11W;
import X.AnonymousClass181;
import X.AnonymousClass190;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.AnonymousClass8EC;
import X.C008203r;
import X.C008503u;
import X.C108965cb;
import X.C17880vN;
import X.C19830z4;
import X.C220418j;
import X.C31221fD;

public class ProfiloUploadService extends AnonymousClass8EC implements AnonymousClass009 {
    public AnonymousClass190 A00;
    public AnonymousClass181 A01;
    public AnonymousClass11E A02;
    public C19830z4 A03;
    public C220418j A04;
    public AnonymousClass11W A05;
    public AnonymousClass10I A06;
    public boolean A07;
    public final Object A08;
    public volatile C008203r A09;

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new C008203r(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public void onCreate() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A05 = AnonymousClass8BU.A0e(r1);
            this.A00 = AnonymousClass3MY.A0N(r1);
            this.A06 = AnonymousClass10E.AL1(r1);
            this.A01 = C108965cb.A0H(r1);
            this.A04 = (C220418j) r1.A9d.get();
            this.A02 = AnonymousClass3MZ.A0d(r1);
            this.A03 = AnonymousClass3Ma.A0c(r1);
        }
        super.onCreate();
    }

    public ProfiloUploadService(int i) {
        this.A08 = C17880vN.A0p();
        this.A07 = false;
    }

    public ProfiloUploadService() {
        this(0);
    }
}
