package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.CpE  reason: case insensitive filesystem */
public class C25946CpE {
    public int A00;
    public final E7V A01;
    public final ExecutorService A02 = Executors.newFixedThreadPool(3);

    public C25946CpE(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A01 = realtimeSinceBootClock;
        this.A00 = 30000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r5 >= 300) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.HttpURLConnection A00(android.net.Uri r7, X.C25946CpE r8, int r9) {
        /*
            android.net.Uri r0 = X.C20012A3c.A00
            if (r7 != 0) goto L_0x0021
            r1 = 0
        L_0x0005:
            java.net.URLConnection r2 = r1.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            int r0 = r8.A00
            r2.setConnectTimeout(r0)
            int r5 = r2.getResponseCode()
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 < r0) goto L_0x001d
            r1 = 300(0x12c, float:4.2E-43)
            r0 = 1
            if (r5 < r1) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x002b
            return r2
        L_0x0021:
            java.lang.String r0 = r7.toString()     // Catch:{ MalformedURLException -> 0x00a0 }
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a0 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x00a0 }
            goto L_0x0005
        L_0x002b:
            r0 = 307(0x133, float:4.3E-43)
            if (r5 == r0) goto L_0x0065
            r0 = 308(0x134, float:4.32E-43)
            if (r5 == r0) goto L_0x0065
            switch(r5) {
                case 300: goto L_0x0065;
                case 301: goto L_0x0065;
                case 302: goto L_0x0065;
                case 303: goto L_0x0065;
                default: goto L_0x0036;
            }     // Catch:{ MalformedURLException -> 0x00a0 }
        L_0x0036:
            r0 = 0
        L_0x0037:
            r6 = 2
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "Location"
            java.lang.String r0 = r2.getHeaderField(r0)
            r2.disconnect()
            if (r0 != 0) goto L_0x0060
            r2 = 0
        L_0x0048:
            java.lang.String r1 = r7.getScheme()
            if (r9 <= 0) goto L_0x0067
            if (r2 == 0) goto L_0x007d
            java.lang.String r0 = r2.getScheme()
            boolean r0 = X.C24545C8q.A00(r0, r1)
            if (r0 != 0) goto L_0x007d
            int r9 = r9 - r3
            java.net.HttpURLConnection r0 = A00(r2, r8, r9)
            return r0
        L_0x0060:
            android.net.Uri r2 = android.net.Uri.parse(r0)
            goto L_0x0048
        L_0x0065:
            r0 = 1
            goto L_0x0037
        L_0x0067:
            if (r9 != 0) goto L_0x007d
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.BE6.A1H(r7, r2, r4)
            java.lang.String r1 = "URL %s follows too many redirects"
        L_0x0070:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x007d:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r0 = r7.toString()
            X.BE8.A1A(r0, r2, r4, r5, r3)
            java.lang.String r1 = "URL %s returned %d without a valid redirect"
            goto L_0x0070
        L_0x0089:
            r2.disconnect()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r7.toString()
            X.BE8.A1A(r0, r1, r4, r5, r3)
            java.lang.String r0 = "Image URL %s returned HTTP code %d"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00a0:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25946CpE.A00(android.net.Uri, X.CpE, int):java.net.HttpURLConnection");
    }

    public C25946CpE() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A01 = realtimeSinceBootClock;
    }
}
