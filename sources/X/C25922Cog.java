package X;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.Cog  reason: case insensitive filesystem */
public abstract class C25922Cog {
    public static volatile boolean A00;
    public static volatile boolean A01;

    public static void A01(String str, String str2, Object... objArr) {
        if (A00) {
            BE7.A1M(str2, str, objArr);
        } else if (!A01) {
            BE7.A1L(str2, str, objArr);
        }
    }

    public static String A00(Uri uri, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String lastPathSegment;
        StringBuilder A10 = AnonymousClass000.A10();
        if (!z2 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (uri != null && "127.0.0.1".equals(uri.getHost())) {
                uri = Uri.parse(uri.getQueryParameter("remote-uri"));
            }
            if (str == null && z) {
                str = Integer.toHexString(uri.hashCode());
            }
            A10.append(str2);
            if (z3 && !z5) {
                A10.append("_t");
            }
            A10.append(".");
            A10.append(str);
            A10.append(".");
            if (!z4 || uri.getLastPathSegment() == null) {
                lastPathSegment = uri.getLastPathSegment();
            } else {
                lastPathSegment = BE6.A0p(uri.getLastPathSegment().lastIndexOf(47), uri.getLastPathSegment());
            }
            A10.append(lastPathSegment);
        } else {
            A10.append(str2);
            if (z3 && !z5) {
                A10.append("_t");
            }
            A10.append(".");
            A10.append(str);
        }
        return A10.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0023 A[LOOP:0: B:5:0x0023->B:8:0x002d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.util.TreeMap r4, int r5, long r6, long r8) {
        /*
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object r0 = r4.floorKey(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0012
            int r0 = X.BE9.A0D(r0, r4)
            if (r0 < r5) goto L_0x0012
        L_0x0011:
            return
        L_0x0012:
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0 = 0
            java.util.NavigableMap r0 = r4.subMap(r3, r0, r1, r2)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0023:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0011
            int r0 = X.C72453Mb.A0H(r1)
            if (r0 < r5) goto L_0x0023
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25922Cog.A02(java.util.TreeMap, int, long, long):void");
    }
}
