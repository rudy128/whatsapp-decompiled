package com.whatsapp.contact.sync;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.C000200d;
import X.C008203r;
import X.C008503u;
import X.C17880vN;
import X.C18070vi;
import X.C29651cd;
import X.C31221fD;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

public final class ContactsSyncAdapterService extends C29651cd implements AnonymousClass009 {
    public AnonymousClass00H A00;
    public boolean A01;
    public final Object A02;
    public volatile C008203r A03;

    public final Object generatedComponent() {
        if (this.A03 == null) {
            synchronized (this.A02) {
                if (this.A03 == null) {
                    this.A03 = new C008203r(this);
                }
            }
        }
        return this.A03.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            return ((AbstractThreadedSyncAdapter) r0.get()).getSyncAdapterBinder();
        }
        C18070vi.A11("contactSyncAdapter");
        throw null;
    }

    public void onCreate() {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = C000200d.A00(((C31221fD) ((C008503u) generatedComponent())).A07.A00.A13);
        }
        super.onCreate();
    }

    public ContactsSyncAdapterService(int i) {
        this.A02 = C17880vN.A0p();
        this.A01 = false;
    }

    public ContactsSyncAdapterService() {
        this(0);
    }
}
