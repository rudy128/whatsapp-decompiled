package X;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class A4G {
    public List A00 = Collections.synchronizedList(AnonymousClass000.A13());
    public final AnonymousClass190 A01;
    public final AnonymousClass118 A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;
    public final ReadWriteLock A05 = new ReentrantReadWriteLock();
    public final AnonymousClass11P A06;
    public final Map A07;

    public A4G(AnonymousClass190 r8, AnonymousClass11P r9, AnonymousClass118 r10, C18030ve r11, AnonymousClass10I r12) {
        int A0G = C72453Mb.A0G(r11, r9, 1);
        C72473Md.A1M(r8, r10, r12, 3);
        this.A03 = r11;
        this.A06 = r9;
        this.A01 = r8;
        this.A02 = r10;
        this.A04 = r12;
        AnonymousClass1D6[] r6 = new AnonymousClass1D6[A0G];
        AnonymousClass1D6.A03(0, new C21728Are(AnonymousClass8lH.A02, 20), r6, 0);
        AnonymousClass1D6.A03(1, new C21728Are(AnonymousClass8lG.A01, 21), r6, 1);
        this.A07 = AnonymousClass1D7.A0B(r6);
    }

    public static final File A00(A4G a4g) {
        File A0e = C17880vN.A0e(AnonymousClass8BR.A0t(a4g.A02), "business_search");
        AnonymousClass8BV.A1H(A0e);
        return C17880vN.A0e(A0e, "business_search_history");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        com.whatsapp.util.Log.e("BusinessSearchRecentSearchManager/getRecentSearches/Failed!", r0);
        r8.A01.A0G("BusinessSearchRecentSearchManager/getRecentSearches/Failed!", r0.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.A4G r8) {
        /*
            java.io.File r0 = A00(r8)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x009b
            java.util.concurrent.locks.ReadWriteLock r3 = r8.A05
            java.util.concurrent.locks.Lock r0 = r3.readLock()
            r0.lock()
            java.io.File r0 = A00(r8)
            java.io.BufferedReader r2 = X.AnonymousClass8BW.A0V(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
        L_0x001f:
            java.lang.String r0 = r2.readLine()
            if (r0 == 0) goto L_0x002e
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            goto L_0x001f
        L_0x002e:
            r2.close()
            java.util.concurrent.locks.Lock r0 = r3.readLock()
            r0.unlock()
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x009b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x009b
            java.util.List r7 = r8.A00     // Catch:{ Exception -> 0x008b }
            X.C18070vi.A0W(r7)     // Catch:{ Exception -> 0x008b }
            monitor-enter(r7)     // Catch:{ Exception -> 0x008b }
            r7.clear()     // Catch:{ all -> 0x0088 }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ all -> 0x0088 }
            r6.<init>(r1)     // Catch:{ all -> 0x0088 }
            int r5 = r6.length()     // Catch:{ all -> 0x0088 }
            r4 = 0
        L_0x0057:
            if (r4 >= r5) goto L_0x0086
            org.json.JSONObject r3 = r6.getJSONObject(r4)     // Catch:{ all -> 0x0088 }
            java.lang.String r1 = "type"
            r0 = -1
            int r2 = r3.optInt(r1, r0)     // Catch:{ all -> 0x0088 }
            java.util.Map r1 = r8.A07     // Catch:{ all -> 0x0088 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0088 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = X.AnonymousClass000.A0w(r1, r2)     // Catch:{ all -> 0x0088 }
            X.1Di r0 = (X.C22821Di) r0     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r0.invoke(r3)     // Catch:{ all -> 0x0088 }
            X.9N2 r0 = (X.AnonymousClass9N2) r0     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0083
            r7.add(r0)     // Catch:{ all -> 0x0088 }
        L_0x0083:
            int r4 = r4 + 1
            goto L_0x0057
        L_0x0086:
            monitor-exit(r7)     // Catch:{ Exception -> 0x008b }
            return
        L_0x0088:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x008b }
            throw r0     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            r0 = move-exception
            java.lang.String r3 = "BusinessSearchRecentSearchManager/getRecentSearches/Failed!"
            com.whatsapp.util.Log.e(r3, r0)
            X.190 r2 = r8.A01
            java.lang.String r1 = r0.getMessage()
            r0 = 1
            r2.A0G(r3, r1, r0)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4G.A01(X.A4G):void");
    }
}
