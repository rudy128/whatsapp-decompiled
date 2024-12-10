package com.whatsapp.appwidget;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass190;
import X.AnonymousClass1M9;
import X.AnonymousClass1XL;
import X.C000200d;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C217217d;
import X.C24921Me;
import X.C31221fD;
import X.C64792vL;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService implements AnonymousClass009 {
    public AnonymousClass190 A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public AnonymousClass11P A03;
    public C18000vb A04;
    public C18030ve A05;
    public C217217d A06;
    public AnonymousClass10I A07;
    public AnonymousClass00H A08;
    public boolean A09;
    public final Object A0A;
    public volatile C008203r A0B;

    public final Object generatedComponent() {
        if (this.A0B == null) {
            synchronized (this.A0A) {
                if (this.A0B == null) {
                    this.A0B = new C008203r(this);
                }
            }
        }
        return this.A0B.generatedComponent();
    }

    public void onCreate() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A03 = AnonymousClass10E.A6O(r1);
            this.A05 = AnonymousClass10E.A8r(r1);
            this.A00 = (AnonymousClass190) r1.A31.get();
            this.A07 = AnonymousClass10E.AL1(r1);
            this.A08 = C000200d.A00(r1.A0J);
            this.A01 = AnonymousClass10E.A4z(r1);
            this.A02 = (C24921Me) r1.ABX.get();
            this.A04 = AnonymousClass10E.A6Q(r1);
            this.A06 = (C217217d) r1.A7a.get();
        }
        super.onCreate();
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        AnonymousClass11P r6 = this.A03;
        C18030ve r8 = this.A05;
        return new C64792vL(getApplicationContext(), this.A00, (AnonymousClass1XL) this.A08.get(), this.A01, this.A02, r6, this.A04, r8, this.A06, this.A07);
    }

    public WidgetService(int i) {
        this.A0A = C17880vN.A0p();
        this.A09 = false;
    }

    public WidgetService() {
        this(0);
    }
}
