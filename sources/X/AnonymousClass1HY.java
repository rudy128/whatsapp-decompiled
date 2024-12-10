package X;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1HY  reason: invalid class name */
public class AnonymousClass1HY {
    public SharedPreferences A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass10I A02;
    public final C18010vc A03;

    public static synchronized SharedPreferences A00(AnonymousClass1HY r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A03.A05("instrumentation");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("/package/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        r2 = r1.substring(9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet A02(X.AnonymousClass1HY r5) {
        /*
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            android.content.SharedPreferences r0 = A00(r5)
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0015:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "/package/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0015
            r0 = 9
            java.lang.String r2 = r1.substring(r0)
            java.lang.String r0 = "/"
            int r1 = r2.indexOf(r0)
            if (r1 < 0) goto L_0x0015
            r0 = 0
            java.lang.String r0 = r2.substring(r0, r1)
            if (r0 == 0) goto L_0x0015
            r4.add(r0)
            goto L_0x0015
        L_0x0042:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HY.A02(X.1HY):java.util.HashSet");
    }

    @Deprecated
    public HashSet A03() {
        HashSet hashSet = new HashSet();
        Iterator it = A02(this).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (A00(this).getString(A01(str, "auth/token"), (String) null) != null) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public void A04(AnonymousClass3L9 r4) {
        if (this.A00 != null) {
            r4.BKo(A03());
        } else {
            this.A02.CGF(new C146507Pj(this, r4, 24));
        }
    }

    public void A05(String str) {
        String A012 = A01(str, "auth/token");
        String A013 = A01(str, "auth/token_ts");
        String A014 = A01(str, "auth/encryption_key");
        String A015 = A01(str, "metadata/last_active_time");
        String A016 = A01(str, "metadata/delayed_notification_shown");
        String A017 = A01(str, "metadata/last_call_ranking_time");
        A00(this).edit().remove(A012).remove(A013).remove(A014).remove(A015).remove(A016).remove(A017).remove(A01(str, "metadata/last_message_ranking_time")).apply();
    }

    public AnonymousClass1HY(AnonymousClass11P r1, C18010vc r2, AnonymousClass10I r3) {
        this.A01 = r1;
        this.A02 = r3;
        this.A03 = r2;
    }
}
