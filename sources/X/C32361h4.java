package X;

import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1h4  reason: invalid class name and case insensitive filesystem */
public final class C32361h4 {
    public final AnonymousClass1TJ A00 = new AnonymousClass1TJ();
    public final C18010vc A01;
    public final AnonymousClass00H A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final C18100vl A04 = new C18110vm(new C32371h5(this));
    public final AnonymousClass11P A05;

    public C32361h4(AnonymousClass11P r3, C18010vc r4, AnonymousClass00H r5) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r5, 3);
        this.A05 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C54892es A02(X.C49432Ql r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            X.00H r0 = r4.A02     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0079 }
            X.2iD r0 = (X.C56902iD) r0     // Catch:{ all -> 0x0079 }
            boolean r0 = r0.A00(r5)     // Catch:{ all -> 0x0079 }
            r2 = 0
            if (r0 != 0) goto L_0x002a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "delayHandlers/getDownloadHandlerFor "
            r1.append(r0)     // Catch:{ all -> 0x0079 }
            r1.append(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = " disabled"
            r1.append(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0079 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0079 }
            goto L_0x0052
        L_0x002a:
            X.11P r3 = r4.A05     // Catch:{ all -> 0x0079 }
            int r1 = r5.ordinal()     // Catch:{ all -> 0x0079 }
            r0 = 0
            if (r1 == r0) goto L_0x005a
            r0 = 1
            if (r1 == r0) goto L_0x0054
            r0 = 4
            if (r1 == r0) goto L_0x0060
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0079 }
            r1.<init>()     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "delayHandlers/getDownloadHandlerFor "
            r1.append(r0)     // Catch:{ all -> 0x0079 }
            r1.append(r5)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = " not supported"
            r1.append(r0)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0079 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0079 }
        L_0x0052:
            monitor-exit(r4)
            return r2
        L_0x0054:
            X.2KE r2 = new X.2KE     // Catch:{ all -> 0x0079 }
            r2.<init>(r3)     // Catch:{ all -> 0x0079 }
            goto L_0x0065
        L_0x005a:
            X.2KD r2 = new X.2KD     // Catch:{ all -> 0x0079 }
            r2.<init>(r3)     // Catch:{ all -> 0x0079 }
            goto L_0x0065
        L_0x0060:
            X.2KC r2 = new X.2KC     // Catch:{ all -> 0x0079 }
            r2.<init>(r3)     // Catch:{ all -> 0x0079 }
        L_0x0065:
            java.util.concurrent.ConcurrentHashMap r1 = r4.A03     // Catch:{ all -> 0x0079 }
            java.lang.Object r0 = r1.get(r5)     // Catch:{ all -> 0x0079 }
            if (r0 != 0) goto L_0x0075
            java.lang.Object r0 = r1.putIfAbsent(r5, r2)     // Catch:{ all -> 0x0079 }
            if (r0 == 0) goto L_0x0074
            r2 = r0
        L_0x0074:
            r0 = r2
        L_0x0075:
            X.2es r0 = (X.C54892es) r0     // Catch:{ all -> 0x0079 }
            monitor-exit(r4)
            return r0
        L_0x0079:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32361h4.A02(X.2Ql):X.2es");
    }

    public static final String A00(C49432Ql r2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final long A01(String str) {
        if (str == null) {
            return 0;
        }
        long j = 0;
        for (C49432Ql r4 : C49432Ql.values()) {
            if (((C56902iD) this.A02.get()).A00(r4)) {
                j += ((SharedPreferences) this.A04.getValue()).getLong(A00(r4, str), 0);
            }
        }
        return j;
    }
}
