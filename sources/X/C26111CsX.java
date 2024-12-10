package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.CsX  reason: case insensitive filesystem */
public class C26111CsX {
    public static final Object A01 = C17880vN.A0p();
    public static volatile C26111CsX A02;
    public final ConcurrentHashMap A00 = AnonymousClass8BR.A17();

    public static C26111CsX A00() {
        if (A02 == null) {
            synchronized (A01) {
                if (A02 == null) {
                    A02 = new C26111CsX();
                }
            }
        }
        C26111CsX csX = A02;
        C18210vx.A00(csX);
        return csX;
    }

    public void A02(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof C28448E1o)) {
            ConcurrentHashMap concurrentHashMap = this.A00;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, C26111CsX csX, String str, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C41401wK.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof C28448E1o) {
            return context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = csX.A00;
        Object putIfAbsent = concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass8BS.A1B(serviceConnection, str, A1a);
            A1a[2] = intent.getAction();
            BE7.A1M("Duplicate binding with the same ServiceConnection: %s, %s, %s.", "ConnectionTracker", A1a);
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            if (!bindService) {
                return false;
            }
            return bindService;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
