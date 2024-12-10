package org.npci.upi.security.pinactivitycomponent;

import X.A8J;
import X.AnonymousClass01E;
import X.AnonymousClass8BR;
import X.AnonymousClass8CX;
import X.C161458Dx;
import X.C192349oE;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class CLRemoteServiceImpl extends Service {
    public C161458Dx A00 = null;
    public AnonymousClass8CX A01 = null;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.01E, X.8Dx] */
    public IBinder onBind(Intent intent) {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass8CX(getBaseContext(), this);
        }
        try {
            Context baseContext = getBaseContext();
            ? r1 = new AnonymousClass01E();
            r1.A01 = "";
            r1.A00 = baseContext;
            r1.A04 = new C192349oE(baseContext);
            r1.A03 = new A8J();
            this.A00 = r1;
            return this.A01;
        } catch (Exception unused) {
            throw AnonymousClass8BR.A0w("Could not initialize service provider");
        }
    }
}
