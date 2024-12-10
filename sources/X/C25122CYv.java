package X;

import android.util.Log;
import java.util.Locale;

/* renamed from: X.CYv  reason: case insensitive filesystem */
public class C25122CYv {
    public final int A00;
    public final String A01;
    public final String A02;
    public final C24430C3f A03;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.C3f] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[LOOP:0: B:9:0x002b->B:12:0x0036, LOOP_START, PHI: r1 
      PHI: (r1v4 int) = (r1v3 int), (r1v6 int) binds: [B:8:0x0028, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25122CYv(java.lang.String r6, java.lang.String... r7) {
        /*
            r5 = this;
            int r4 = r7.length
            if (r4 != 0) goto L_0x0039
            java.lang.String r0 = ""
        L_0x0005:
            r5.<init>()
            r5.A02 = r0
            r5.A01 = r6
            X.C3f r4 = new X.C3f
            r4.<init>()
            int r3 = r6.length()
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            r1 = 0
            r2[r1] = r6
            r0 = 23
            X.AnonymousClass000.A1M(r2, r0)
            if (r3 > r0) goto L_0x0024
            r1 = 1
        L_0x0024:
            java.lang.String r0 = "tag \"%s\" is longer than the %d character maximum"
            if (r1 == 0) goto L_0x005e
            r5.A03 = r4
            r1 = 2
        L_0x002b:
            java.lang.String r0 = r5.A01
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x005b
            int r1 = r1 + 1
            r0 = 7
            if (r1 > r0) goto L_0x005b
            goto L_0x002b
        L_0x0039:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            r0 = 91
            r3.append(r0)
            r2 = 0
        L_0x0043:
            r1 = r7[r2]
            int r0 = r3.length()
            r2 = 1
            if (r0 <= r2) goto L_0x004f
            X.BE6.A1K(r3)
        L_0x004f:
            r3.append(r1)
            if (r2 < r4) goto L_0x0043
            java.lang.String r0 = "] "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)
            goto L_0x0005
        L_0x005b:
            r5.A00 = r1
            return
        L_0x005e:
            java.lang.IllegalArgumentException r0 = X.BE8.A0X(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25122CYv.<init>(java.lang.String, java.lang.String[]):void");
    }

    public void A00(String str) {
        if (this.A00 <= 3) {
            Log.d(this.A01, this.A02.concat(str));
        }
    }

    public void A01(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.w("Auth", this.A02.concat(str));
    }
}
