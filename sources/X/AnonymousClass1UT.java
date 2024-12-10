package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1UT  reason: invalid class name */
public class AnonymousClass1UT {
    public C62592re A00 = null;
    public Map A01;
    public Set A02;
    public final C26861Tt A03;

    public synchronized void A01() {
        this.A02 = new HashSet();
        this.A01 = new HashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1UT r5) {
        /*
            X.2re r0 = r5.A00     // Catch:{ JSONException -> 0x0042 }
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A03()     // Catch:{ JSONException -> 0x0042 }
            if (r0 == 0) goto L_0x0024
            X.1Tt r4 = r5.A03     // Catch:{ JSONException -> 0x0042 }
            X.2re r0 = r5.A00     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r2 = r0.A01()     // Catch:{ JSONException -> 0x0042 }
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)     // Catch:{ JSONException -> 0x0042 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r0 = "current_running_sync"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ JSONException -> 0x0042 }
            r0.apply()     // Catch:{ JSONException -> 0x0042 }
            goto L_0x005f
        L_0x0024:
            X.1Tt r4 = r5.A03     // Catch:{ JSONException -> 0x0042 }
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r1 = "current_running_sync"
            boolean r0 = r0.contains(r1)     // Catch:{ JSONException -> 0x0042 }
            if (r0 == 0) goto L_0x005f
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)     // Catch:{ JSONException -> 0x0042 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ JSONException -> 0x0042 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch:{ JSONException -> 0x0042 }
            r0.apply()     // Catch:{ JSONException -> 0x0042 }
            goto L_0x005f
        L_0x0042:
            X.1Tt r4 = r5.A03
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)
            java.lang.String r1 = "current_running_sync"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005f
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
        L_0x005f:
            java.util.Set r0 = r5.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a6
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            monitor-enter(r5)
            java.util.Set r0 = r5.A02     // Catch:{ all -> 0x00a3 }
            monitor-exit(r5)
            java.util.Iterator r2 = r0.iterator()
        L_0x0074:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r1 = r2.next()
            X.2re r1 = (X.C62592re) r1
            boolean r0 = r1.A03()     // Catch:{ JSONException -> 0x0074 }
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r1.A01()     // Catch:{ JSONException -> 0x0074 }
            r3.add(r0)     // Catch:{ JSONException -> 0x0074 }
            goto L_0x0074
        L_0x008e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00a6
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "queued_running_sync_set"
            android.content.SharedPreferences$Editor r0 = r1.putStringSet(r0, r3)
            goto L_0x00b4
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00a6:
            android.content.SharedPreferences r0 = X.C26861Tt.A00(r4)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "queued_running_sync_set"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
        L_0x00b4:
            r0.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UT.A00(X.1UT):void");
    }

    public AnonymousClass1UT(C26861Tt r2) {
        this.A03 = r2;
        A01();
    }
}
