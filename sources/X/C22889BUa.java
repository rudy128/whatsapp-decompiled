package X;

import android.os.Handler;
import android.util.Pair;
import java.util.HashMap;

/* renamed from: X.BUa  reason: case insensitive filesystem */
public class C22889BUa extends DEE implements EDI {
    public static volatile C25102CXv A01;
    public final Handler A00;

    public static C25102CXv A00() {
        C25102CXv cXv;
        if (A01 != null) {
            return A01;
        }
        synchronized (C25102CXv.class) {
            if (A01 == null) {
                A01 = new C25102CXv();
            }
            cXv = A01;
        }
        return cXv;
    }

    public C9Z BTh() {
        return EDI.A00;
    }

    public C22889BUa(C28592E9h e9h) {
        this.A00 = e9h;
        this.A00 = C17890vO.A0D();
    }

    public Handler BSH(String str) {
        Pair pair;
        HashMap hashMap = A00().A00;
        synchronized (hashMap) {
            pair = (Pair) hashMap.get(str);
        }
        if (pair != null) {
            return (Handler) pair.second;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Handler not found: ");
        throw AnonymousClass001.A12(str, A10);
    }

    public boolean Bfg() {
        return AnonymousClass000.A1Z(Thread.currentThread(), BE8.A0k());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CDF(java.lang.String r5) {
        /*
            r4 = this;
            X.CXv r3 = A00()
            monitor-enter(r3)
            java.util.HashMap r1 = r3.A00     // Catch:{ all -> 0x0026 }
            monitor-enter(r1)     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r1.remove(r5)     // Catch:{ all -> 0x0023 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x0026 }
            android.os.HandlerThread r2 = (android.os.HandlerThread) r2     // Catch:{ all -> 0x0026 }
            r2.quitSafely()     // Catch:{ all -> 0x0026 }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.join(r0)     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0021
        L_0x001e:
            X.AnonymousClass8BS.A0x()     // Catch:{ all -> 0x0026 }
        L_0x0021:
            monitor-exit(r3)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22889BUa.CDF(java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.E9h, java.lang.Object] */
    public C22889BUa() {
        this(new Object());
    }
}
