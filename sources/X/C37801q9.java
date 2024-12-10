package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.1q9  reason: invalid class name and case insensitive filesystem */
public class C37801q9 implements AnonymousClass1FC, AnonymousClass1FD, AnonymousClass1FE {
    public C23391Fw A00 = null;
    public AnonymousClass1GA A01 = null;
    public C24051Ir A02;
    public final Fragment A03;
    public final C24081Iu A04;
    public final Runnable A05;

    public void A00() {
        if (this.A00 == null) {
            this.A00 = new C23391Fw(this);
            AnonymousClass1GA r0 = new AnonymousClass1GA(this);
            this.A01 = r0;
            r0.A01();
            this.A05.run();
        }
    }

    public C24091Iv BQQ() {
        Fragment fragment = this.A03;
        Context applicationContext = fragment.A14().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                applicationContext = null;
                break;
            }
        }
        C24101Iw r2 = new C24101Iw();
        if (applicationContext != null) {
            r2.A01(C24131Iz.A02, applicationContext);
        }
        r2.A01(AnonymousClass1GG.A01, fragment);
        r2.A01(AnonymousClass1GG.A02, this);
        Bundle bundle = fragment.A06;
        if (bundle != null) {
            r2.A01(AnonymousClass1GG.A00, bundle);
        }
        return r2;
    }

    public C24051Ir BQR() {
        Application application;
        Fragment fragment = this.A03;
        C24051Ir BQR = fragment.BQR();
        if (!BQR.equals(fragment.A0N)) {
            this.A02 = BQR;
            return BQR;
        }
        C24051Ir r2 = this.A02;
        if (r2 != null) {
            return r2;
        }
        Context applicationContext = fragment.A14().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        C37341pM r22 = new C37341pM(application, fragment.A06, fragment);
        this.A02 = r22;
        return r22;
    }

    public C37801q9(Fragment fragment, C24081Iu r3, Runnable runnable) {
        this.A03 = fragment;
        this.A04 = r3;
        this.A05 = runnable;
    }

    public AnonymousClass1GB BYX() {
        A00();
        return this.A01.A01;
    }

    public C24081Iu Bba() {
        A00();
        return this.A04;
    }

    public C23381Fv getLifecycle() {
        A00();
        return this.A00;
    }
}
