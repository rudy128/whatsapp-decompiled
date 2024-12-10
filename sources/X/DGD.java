package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class DGD implements E50, E52, C28513E4x, C28558E7j, E51, C28515E4z {
    public Executor A00;
    public Executor A01;
    public Executor A02;
    public final Context A03;
    public final SharedPreferences A04;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.concurrent.Executor BRR(java.lang.Integer r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r1 = r3.intValue()     // Catch:{ all -> 0x002f }
            r0 = 0
            if (r1 == r0) goto L_0x0023
            r0 = 1
            if (r1 == r0) goto L_0x0017
            java.util.concurrent.Executor r0 = r2.A01     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0015
            java.util.concurrent.ExecutorService r0 = A00(r3)     // Catch:{ all -> 0x002f }
            r2.A01 = r0     // Catch:{ all -> 0x002f }
        L_0x0015:
            monitor-exit(r2)
            return r0
        L_0x0017:
            java.util.concurrent.Executor r0 = r2.A02     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.ExecutorService r0 = A00(r3)     // Catch:{ all -> 0x002f }
            r2.A02 = r0     // Catch:{ all -> 0x002f }
        L_0x0021:
            monitor-exit(r2)
            return r0
        L_0x0023:
            java.util.concurrent.Executor r0 = r2.A00     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            java.util.concurrent.ExecutorService r0 = A00(r3)     // Catch:{ all -> 0x002f }
            r2.A00 = r0     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r2)
            return r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGD.BRR(java.lang.Integer):java.util.concurrent.Executor");
    }

    public DGD(Context context) {
        this.A03 = context.getApplicationContext();
        this.A04 = context.getSharedPreferences("default-cask-metadata", 0);
    }

    public static ExecutorService A00(Integer num) {
        ExecutorService newCachedThreadPool;
        DW5 dw5 = new DW5(num);
        int intValue = num.intValue();
        if (intValue == 0 || intValue != 1) {
            newCachedThreadPool = Executors.newCachedThreadPool(dw5);
        } else {
            newCachedThreadPool = Executors.newSingleThreadExecutor(dw5);
        }
        newCachedThreadPool.getClass();
        return newCachedThreadPool;
    }

    public A53 BN4() {
        A53 a53;
        Context context = this.A03;
        synchronized (A53.class) {
            a53 = A53.A03;
            if (a53 == null) {
                a53 = new A53(context);
                A53.A03 = a53;
            }
        }
        return a53;
    }

    public Context BN5() {
        return this.A03;
    }

    public C25160CaB BZj(String str) {
        return new C25160CaB(this.A04, str);
    }

    public boolean BIM(File file) {
        return C24543C8o.A00(file);
    }

    public boolean BfP() {
        return C108975cc.A19((C26192CuK.A01().A03(AnonymousClass00R.A00) > 419430400 ? 1 : (C26192CuK.A01().A03(AnonymousClass00R.A00) == 419430400 ? 0 : -1)));
    }

    public boolean Bh3() {
        return C108975cc.A19((C26192CuK.A01().A03(AnonymousClass00R.A00) > 104857600 ? 1 : (C26192CuK.A01().A03(AnonymousClass00R.A00) == 104857600 ? 0 : -1)));
    }
}
