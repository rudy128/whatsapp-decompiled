package X;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: X.Cjn  reason: case insensitive filesystem */
public final class C25657Cjn {
    public static C25657Cjn A02;
    public final Context A00;
    public final ContentObserver A01;

    public C25657Cjn() {
        this.A00 = null;
        this.A01 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r2 = r7.query(X.C25469CgO.A02, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (r2 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (r2.moveToFirst() != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        if (r3 != X.C25469CgO.A00) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        X.C25469CgO.A01.put(r14, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        if (r1.equals((java.lang.Object) null) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        if (r3 != X.C25469CgO.A00) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        X.C25469CgO.A01.put(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        if (r1 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b8, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.String A00(java.lang.String r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.A00
            android.content.ContentResolver r7 = r0.getContentResolver()
            r9 = 0
            java.lang.Class<X.CgO> r6 = X.C25469CgO.class
            monitor-enter(r6)
            java.util.HashMap r0 = X.C25469CgO.A01     // Catch:{ all -> 0x00bd }
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            r4 = 0
            if (r0 != 0) goto L_0x0042
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C25469CgO.A08     // Catch:{ all -> 0x00bd }
            r0.set(r2)     // Catch:{ all -> 0x00bd }
            r3 = 16
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00bd }
            r0.<init>(r3, r5)     // Catch:{ all -> 0x00bd }
            X.C25469CgO.A01 = r0     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = X.C17880vN.A0p()     // Catch:{ all -> 0x00bd }
            X.C25469CgO.A00 = r0     // Catch:{ all -> 0x00bd }
            android.net.Uri r3 = X.C25469CgO.A02     // Catch:{ all -> 0x00bd }
            X.BEk r0 = new X.BEk     // Catch:{ all -> 0x00bd }
            r0.<init>(r9)     // Catch:{ all -> 0x00bd }
            r7.registerContentObserver(r3, r1, r0)     // Catch:{ all -> 0x00bd }
        L_0x0031:
            java.lang.Object r3 = X.C25469CgO.A00     // Catch:{ all -> 0x00bd }
            java.util.HashMap r0 = X.C25469CgO.A01     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.containsKey(r14)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x006f
            java.util.HashMap r0 = X.C25469CgO.A01     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = X.C108945cZ.A1G(r14, r0)     // Catch:{ all -> 0x00bd }
            goto L_0x006a
        L_0x0042:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C25469CgO.A08     // Catch:{ all -> 0x00bd }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0031
            java.util.HashMap r0 = X.C25469CgO.A01     // Catch:{ all -> 0x00bd }
            r0.clear()     // Catch:{ all -> 0x00bd }
            java.util.HashMap r0 = X.C25469CgO.A04     // Catch:{ all -> 0x00bd }
            r0.clear()     // Catch:{ all -> 0x00bd }
            java.util.HashMap r0 = X.C25469CgO.A05     // Catch:{ all -> 0x00bd }
            r0.clear()     // Catch:{ all -> 0x00bd }
            java.util.HashMap r0 = X.C25469CgO.A06     // Catch:{ all -> 0x00bd }
            r0.clear()     // Catch:{ all -> 0x00bd }
            java.util.HashMap r0 = X.C25469CgO.A07     // Catch:{ all -> 0x00bd }
            r0.clear()     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = X.C17880vN.A0p()     // Catch:{ all -> 0x00bd }
            X.C25469CgO.A00 = r0     // Catch:{ all -> 0x00bd }
            goto L_0x0031
        L_0x006a:
            if (r0 == 0) goto L_0x006d
            r4 = r0
        L_0x006d:
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            return r4
        L_0x006f:
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            android.net.Uri r8 = X.C25469CgO.A02
            java.lang.String[] r11 = new java.lang.String[r1]
            r11[r2] = r14
            r12 = r9
            r10 = r9
            android.database.Cursor r2 = r7.query(r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x00bc
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0096
            monitor-enter(r6)     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = X.C25469CgO.A00     // Catch:{ all -> 0x0093 }
            if (r3 != r0) goto L_0x008e
            java.util.HashMap r0 = X.C25469CgO.A01     // Catch:{ all -> 0x0093 }
            r0.put(r14, r9)     // Catch:{ all -> 0x0093 }
        L_0x008e:
            monitor-exit(r6)     // Catch:{ all -> 0x0093 }
            r2.close()
            return r4
        L_0x0093:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x0096:
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x00b7 }
            r2.close()
            if (r1 == 0) goto L_0x00a6
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x00a6
            r1 = r9
        L_0x00a6:
            monitor-enter(r6)
            java.lang.Object r0 = X.C25469CgO.A00     // Catch:{ all -> 0x00b4 }
            if (r3 != r0) goto L_0x00b0
            java.util.HashMap r0 = X.C25469CgO.A01     // Catch:{ all -> 0x00b4 }
            r0.put(r14, r1)     // Catch:{ all -> 0x00b4 }
        L_0x00b0:
            monitor-exit(r6)     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x00bc
            return r1
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b4 }
            throw r0
        L_0x00b7:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x00bc:
            return r4
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00bd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25657Cjn.A00(java.lang.String):java.lang.String");
    }

    public C25657Cjn(Context context) {
        this.A00 = context;
        ContentObserver contentObserver = new ContentObserver((Handler) null);
        this.A01 = contentObserver;
        context.getContentResolver().registerContentObserver(C25469CgO.A02, true, contentObserver);
    }
}
