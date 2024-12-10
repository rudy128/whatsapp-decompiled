package com.whatsapp.accountsync;

import X.AnonymousClass009;
import X.AnonymousClass8BZ;
import X.C008203r;
import X.C17880vN;
import X.C17890vO;
import X.C29651cd;
import android.content.Intent;
import android.os.IBinder;

public class AccountAuthenticatorService extends C29651cd implements AnonymousClass009 {
    public static AnonymousClass8BZ A03;
    public boolean A00;
    public final Object A01;
    public volatile C008203r A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C008203r(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        if (!C17890vO.A1S(intent, "android.accounts.AccountAuthenticator")) {
            return null;
        }
        AnonymousClass8BZ r0 = A03;
        if (r0 == null) {
            r0 = new AnonymousClass8BZ(this);
            A03 = r0;
        }
        return r0.getIBinder();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
        super.onCreate();
    }

    public AccountAuthenticatorService(int i) {
        this.A01 = C17880vN.A0p();
        this.A00 = false;
    }

    public AccountAuthenticatorService() {
        this(0);
    }
}
