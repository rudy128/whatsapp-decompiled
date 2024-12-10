package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9z8  reason: invalid class name and case insensitive filesystem */
public final class C198919z8 {
    public final Context A00;

    private final C26612D6f A00() {
        C26612D6f d6f = new C26612D6f(this.A00);
        if (d6f.isAvailableOnDevice()) {
            return d6f;
        }
        return null;
    }

    public final C22530BBn A01() {
        C26612D6f d6f;
        String string;
        if (Build.VERSION.SDK_INT < 34 || (d6f = A00()) == null) {
            d6f = null;
            Context context = this.A00;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
            ArrayList A13 = AnonymousClass000.A13();
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (!(serviceInfo.metaData == null || (string = serviceInfo.metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) == null)) {
                        A13.add(string);
                    }
                }
            }
            List A0t = C29431cG.A0t(A13);
            if (!A0t.isEmpty()) {
                Iterator it = A0t.iterator();
                C22530BBn bBn = null;
                while (it.hasNext()) {
                    try {
                        Object newInstance = Class.forName(C17880vN.A0v(it)).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                        C18070vi.A0z(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                        C22530BBn bBn2 = (C22530BBn) newInstance;
                        if (!bBn2.isAvailableOnDevice()) {
                            continue;
                        } else if (bBn != null) {
                            Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                            return null;
                        } else {
                            bBn = bBn2;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return bBn;
            }
        }
        return d6f;
    }

    public C198919z8(Context context) {
        this.A00 = context;
    }
}
